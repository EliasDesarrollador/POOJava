// package dado; 

// Importaciones necesarias 
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class RelojTiempoReal {

    // Variables Globales 
    private JFrame ventana;
    private JLabel etiquetaHora;
    private JLabel etiquetaFecha;
    private Timer temporizador;
    private boolean ejecutando;

    // Constructor
    public RelojTiempoReal() {
        crearInterfaz();
        configurarTemporizador();
        configurarCierre();
    }

    // Metodo para crear interfaz grafica 
    private void crearInterfaz() {
        // Crear la ventana principal
        ventana = new JFrame("Reloj en tiempo Real");

        // Configurar etiqueta para la hora 
        etiquetaHora = new JLabel("", SwingConstants.CENTER);
        etiquetaHora.setFont(new Font("Arial", Font.BOLD, 32));
        etiquetaHora.setForeground(Color.BLUE);

        // Configurar etiqueta para la fecha 
        etiquetaFecha = new JLabel("", SwingConstants.CENTER);
        etiquetaFecha.setFont(new Font("Arial", Font.PLAIN, 18));
        etiquetaFecha.setForeground(Color.DARK_GRAY);

        // Crear panel para organizar componentes 
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(etiquetaHora, BorderLayout.CENTER);
        panel.add(etiquetaFecha, BorderLayout.SOUTH);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Configurar la ventana 
        ventana.add(panel);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);
        ventana.setLocationRelativeTo(null); // Centrar en pantalla
        ventana.setResizable(false);
    }

    // Metodo para configurar el temporizador que actualiza cada segundo
    private void configurarTemporizador() {
        // Crear Temporizador que se ejecuta cada 1000 milisegundos (1 segundo)
        temporizador = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTiempo();
            }
        });
        ejecutando = true;
        temporizador.start(); // Iniciar temporizador 
    }

    // Metodo para actualizar la hora y la fecha 
    private void actualizarTiempo() {
        // Obtener la fecha y hora actual 
        Date ahora = new Date();

        // Formatear la hora : HH (24h), mm (minutos), ss (segundos)
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String horaActual = formatoHora.format(ahora);

        // Formatear la fecha: dd/MM/yyyy
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = formatoFecha.format(ahora);

        // Actualizar las etiquetas 
        etiquetaHora.setText(horaActual);
        etiquetaFecha.setText(fechaActual);
    }

    // Metodo para configurar el cierre con la tecla de escape 
    private void configurarCierre() {
        // Configurar el KeyListener para detectar la tecla Escape 
        ventana.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    cerrarPrograma();
                }
            }
        });

        // Hacer que la ventana sea focusable para recibir eventos de teclado 
        ventana.setFocusable(true);
        ventana.requestFocusInWindow();
    }

    // Metodo para cerrar el programa correctamente  
    private void cerrarPrograma() {
        ejecutando = false;
        if (temporizador != null) {
            temporizador.stop(); // Detener el temporizador 
        }
        ventana.dispose(); // Cerrar la ventana 
        System.exit(0); // Salir del programa 
    }

    // Metodo para mostrar la ventana 
    public void mostrar() {
        ventana.setVisible(true);
    }

    // Metodo Principal 
    public static void main(String[] args) {
        // Crear y mostrar la interfaz en el Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RelojTiempoReal().mostrar();
            }
        });
    }
}

