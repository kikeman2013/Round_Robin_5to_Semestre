package Frames;

import Clases.Cola;
import Clases.Proceso;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * una rafaga de cpu menor que el quantum es el proceso que termina antes del
 * quantum y se termina antes del cuantum y se planifica como un nuevo proceso
 * `un proceso tiene una rafaga de la cpu mayor que el quantum acab el quantum
 * se le exxplusa de la cpu dando paso a otro proceso contexto y el proceso se
 * colocara al final de la cola  *
 * tp +tproceso [(tproceso_tproceso)-(tprocesoultimo-tprocesoproximo)]+tprocesp
 *
 */
/**
 *
 * @author keki
 */
public class Round_Robin extends javax.swing.JFrame {

    int contador;//Total de procesos que se va ejecutar
    char numerosProceso;//Número de proceso que se va a ejecutar
    int tiempoEjecucion = 0;//Tiempo de ejecucón del proceso
    int tiempollegada = 0; //Tiempo de llegada
    int quantum = 0;
    int residuoejec = 0;//Tiempo restante de ejecucion del proceso
    int tiempoProceso = 0;//Tiempo total de ejecucion del proceso
    int valorBarra;//Valor de la Barra
    int cantidadProcesos;//Número de procesos terminados
    int matarProceso;
    char idb = '0';
    boolean ejec, bloc, inter,escritura,lectura; // se declararo las variables booleanas para el true o false
    Random azar;
    Random rex;
    int i = 0;
    Cola ProcesosEspera;
    Cola ProcesosOrdenados;
    Cola ProcesosTerminados;
    Thread t;
    int modo;
    
    //ARREGLO DE NOMBRES DE OPERACIONES
    String operacion[] = {"Leyendo archivos", "Copiando datos", "Buscando archivos", "Leyendo datos", "Conectando con el server",
        "Desconectando server", "Descargando recursos"};

    DefaultTableModel modelocalculos;//Modelo de la tabla de calculos
    /**
     * Creates new form Procesar
     */
    Paginacion_Frame pf;
    Arbolito a;
    
    
    //CONSTRUCTOR QUE INICIALIZA TODAS LAS VARIABLES

    public Round_Robin() {
        initComponents();
        JtableDatos.setBackground(Color.CYAN);
        JtableDatos.setForeground(Color.black);
        jTableFin.setBackground(Color.GREEN);
        jlblbloqueado.setVisible(false);
        rex = new Random();
        azar = new Random();
        setLocationRelativeTo(null);
        setResizable(true);
        ProcesosEspera = new Cola();
        ProcesosOrdenados = new Cola();
        ProcesosTerminados = new Cola();
        pf = new Paginacion_Frame();
        modelocalculos = (DefaultTableModel) Tablecalculos.getModel();
        jspQuantum.grabFocus();
        t = new Thread(new Hilo());//Crea un nuevo hilo
        jspQuantum.setVisible(false);
        jtxfTiempoEjecucion.setVisible(false);
        jtxfTiempoLlegada.setVisible(false);
        jbtnAgregar.setVisible(false);
        jlblQuantum.setVisible(false);
        jlblTiempoDeEjecucion.setVisible(false);
        jlblTiempollegada.setVisible(false);
        System.out.println("modo RR = " + modo);
    }

    //METODO PARA AGREGAR PROCESOS DE MANERA ALEATORIA
    private void random(java.awt.event.ActionEvent evt) {
        Random r = new Random();
        this.jtxfTiempoEjecucion.setText((1 + r.nextInt(10)) + "");
        this.jtxfTiempoLlegada.setText((1 + r.nextInt(10)) + "");
        this.jbtnAgregarActionPerformed(evt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtblAccess = new javax.swing.JTable();
        jspQuantum = new javax.swing.JSpinner();
        jlblQuantum = new javax.swing.JLabel();
        jlblTiempollegada = new javax.swing.JLabel();
        jtxfTiempoLlegada = new javax.swing.JTextField();
        jtxfTiempoEjecucion = new javax.swing.JTextField();
        jlblTiempoDeEjecucion = new javax.swing.JLabel();
        jbtnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtableDatos = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tablecalculos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jbtnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Labelrespuesta = new javax.swing.JLabel();
        Labelpenal = new javax.swing.JLabel();
        Labelespera = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableFin = new javax.swing.JTable();
        jLCantidadTiempo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabelPorcentajeProceso = new javax.swing.JTextField();
        jtxfNumerosProcesos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jlblbloqueado = new javax.swing.JLabel();
        jBarEstado = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jbtnMemoria = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jbtnParar = new javax.swing.JButton();
        jbtnReiniciar = new javax.swing.JButton();
        jbtnArbol = new javax.swing.JButton();
        jlblinter = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tableoperacion = new javax.swing.JTable();
        jbtnIniciar = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtblAcceso = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador Round Robin");

        jPanel3.setDoubleBuffered(false);
        jPanel3.setEnabled(false);

        jtblAccess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "bloqueo", "Interupccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jtblAccess);

        jspQuantum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jlblQuantum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblQuantum.setText("Quantum");

        jlblTiempollegada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTiempollegada.setText("Tiempo LLegada");

        jtxfTiempoLlegada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxfTiempoLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfTiempoLlegadaActionPerformed(evt);
            }
        });

        jtxfTiempoEjecucion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxfTiempoEjecucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfTiempoEjecucionActionPerformed(evt);
            }
        });

        jlblTiempoDeEjecucion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTiempoDeEjecucion.setText("Tiempo de Ejecucion");

        jbtnAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("LISTA DE PROCESOS");

        JtableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Llegada", "Tiempo Ejec.", "Quantum", "Residuo Ejec.", "Estado"
            }
        ));
        jScrollPane3.setViewportView(JtableDatos);
        if (JtableDatos.getColumnModel().getColumnCount() > 0) {
            JtableDatos.getColumnModel().getColumn(2).setHeaderValue("Tiempo Ejec.");
            JtableDatos.getColumnModel().getColumn(3).setHeaderValue("Quantum");
            JtableDatos.getColumnModel().getColumn(4).setHeaderValue("Residuo Ejec.");
        }

        Tablecalculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Llegada", "Ejecucion", "Finalizacion", "Respuesta", "Espera", "Penalizacion"
            }
        ));
        jScrollPane6.setViewportView(Tablecalculos);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("TABLA DE CALCULOS");

        jbtnCalcular.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnCalcular.setText("Calcular");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("PROMEDIOS");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel2.setBackground(new java.awt.Color(0, 102, 0));
        jLabel2.setFont(new java.awt.Font("NSimSun", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RESPUESTA");
        jLabel2.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(0, 102, 0));
        jLabel5.setFont(new java.awt.Font("NSimSun", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PENALIZACION");
        jLabel5.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(0, 102, 0));
        jLabel8.setFont(new java.awt.Font("NSimSun", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ESPERA");
        jLabel8.setOpaque(true);

        Labelrespuesta.setBackground(new java.awt.Color(204, 255, 204));
        Labelrespuesta.setFont(new java.awt.Font("NSimSun", 1, 20)); // NOI18N
        Labelrespuesta.setForeground(new java.awt.Color(153, 0, 0));
        Labelrespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Labelrespuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Labelrespuesta.setOpaque(true);

        Labelpenal.setBackground(new java.awt.Color(204, 255, 204));
        Labelpenal.setFont(new java.awt.Font("NSimSun", 1, 20)); // NOI18N
        Labelpenal.setForeground(new java.awt.Color(153, 0, 0));
        Labelpenal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Labelpenal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Labelpenal.setOpaque(true);

        Labelespera.setBackground(new java.awt.Color(204, 255, 204));
        Labelespera.setFont(new java.awt.Font("NSimSun", 1, 20)); // NOI18N
        Labelespera.setForeground(new java.awt.Color(153, 0, 0));
        Labelespera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Labelespera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Labelespera.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Labelrespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Labelespera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addGap(54, 54, 54)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Labelpenal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Labelrespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(Labelpenal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Labelespera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        jTableFin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Tiempo Ejec.", "Quantum", "Tiempo Final"
            }
        ));
        jScrollPane4.setViewportView(jTableFin);

        jLCantidadTiempo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("TIEMPO TOTAL");

        jLabelPorcentajeProceso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxfNumerosProcesos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Proceso");

        jlblbloqueado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblbloqueado.setText("Bloqueado");

        jBarEstado.setBackground(java.awt.SystemColor.textHighlight);
        jBarEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBarEstado.setForeground(new java.awt.Color(0, 51, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Mas Opciones"));

        jbtnMemoria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnMemoria.setText("Memoria");
        jbtnMemoria.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnMemoria.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jbtnMemoria.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jbtnMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMemoriaActionPerformed(evt);
            }
        });

        jbtnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jbtnParar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnParar.setText("Parar");
        jbtnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPararActionPerformed(evt);
            }
        });

        jbtnReiniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbtnReiniciar.setText("Reiniciar");
        jbtnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReiniciarActionPerformed(evt);
            }
        });

        jbtnArbol.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnArbol.setText("Arbol");
        jbtnArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnArbolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbtnArbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnParar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnReiniciar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnSalir)
                        .addComponent(jbtnParar))
                    .addComponent(jbtnMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jlblinter.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Tableoperacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Operacion"
            }
        ));
        jScrollPane7.setViewportView(Tableoperacion);

        jbtnIniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnIniciar.setText("Iniciar");
        jbtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarActionPerformed(evt);
            }
        });

        jtblAcceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Ejecucion", "Lectura", "Escritura"
            }
        ));
        jScrollPane8.setViewportView(jtblAcceso);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Procesos Terminados");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Interrupciones y Bloqueos");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Biblioteca de Interrupciones");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Permisos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jspQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblTiempollegada)
                            .addComponent(jtxfTiempoLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jtxfTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlblTiempoDeEjecucion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblbloqueado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCalcular)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxfNumerosProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(36, 36, 36)
                                .addComponent(jlblinter, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel11))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(0, 99, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblQuantum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblTiempollegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblTiempoDeEjecucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jspQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxfTiempoLlegada)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxfTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxfNumerosProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblbloqueado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jbtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jlblinter, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void recmodo (int mod){
    
        modo = mod;
        System.out.println("modo RR = " + modo);
    }
    
    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        //VALIDA QUE LOS TEXTFIELD NO ESTEN VACIOS
        try {
            if (!jtxfTiempoLlegada.getText().trim().equalsIgnoreCase("") && !jtxfTiempoEjecucion.getText().trim().equalsIgnoreCase("")) {
                //Integer.parseInt(jtxfTiempoEjecucion.getText()))<=100
                if (Integer.parseInt(jspQuantum.getValue().toString()) > 0) {
                    int n = rex.nextInt(50) + 64;
            for (int j = 0; j < ProcesosEspera.Length(); j++) {
                 if( ProcesosEspera.getProceso(j).getNumProceso()==n){
                 n = rex.nextInt(40) + 64;
                 }; 
                   }
                    
                    Ingresar(n);
                    jspQuantum.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Ingresar un Quantum valido mayor a 0");
                }
            } else {
                random(evt);
            }
        } catch (Exception e) {
            //EN CASO DE ERROR, ENVIA UN MENSAJE
            JOptionPane.showMessageDialog(this, "Ingrese datos validos");
            //System.out.println("" + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    //Metodos de Asignación/Obtencion para el JSpinner
    public Integer getJspQuantum() {
        return Integer.parseInt(jspQuantum.getValue().toString());
    } 
    public void setJspQuantum(Integer xd) {
        this.jspQuantum.setValue(xd);
    }

    private void jbtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarActionPerformed
        //CONDICION PARA VERIFICAR QUE HAYA PROCESOS EXISTENTES
        if (ProcesosEspera.Length() > 0) {
            OrdenarProcesos();
            Operacion();
            tiempoEjecucion = ProcesosOrdenados.getProceso(0).getTiempoLlegada();
            Iniciar();

            t.start();//SE MANDA A LLAMAR EL METODO RUN DEL HILO

            jbtnIniciar.setVisible(false);//SE ESCONDE EL BOTON DE INICAR
            jbtnParar.setVisible(true);//SE HACE VISIBLE EL BOTON PARAR
        }
    }//GEN-LAST:event_jbtnIniciarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        if (t.isAlive()) {
            t.stop();
        }
        System.exit(0);
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPararActionPerformed
        t.stop();
        jbtnParar.setVisible(false);
        jbtnIniciar.setVisible(true);
    }//GEN-LAST:event_jbtnPararActionPerformed

    private void jtxfTiempoEjecucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfTiempoEjecucionActionPerformed
        jbtnAgregarActionPerformed(evt);
    }//GEN-LAST:event_jtxfTiempoEjecucionActionPerformed

    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed

        //BOTON QUE REALIZA LOS CALCULOS DE LOS PROCESOS
        int fin = 0, resp = 0, espera = 0;
        double penal = 0, promresp = 0, promespera = 0, prompenal = 0;
        //FOR PARA RECORRER LA TABLA DE CALCULOS
        for (int j = 0; j < modelocalculos.getRowCount(); j++) {

            //VERIFICA QUE LOS PROCESOS COINCIDAN
            if (Tablecalculos.getValueAt(j, 0) == Tablecalculos.getValueAt(j, 0)) {
                fin = Integer.parseInt(jTableFin.getValueAt(j, 3).toString());//SE ASIGNA EL TIEMPO DE FINALIZACION A LA VARIABLE

                Tablecalculos.setValueAt(fin, j, 3);//SETEA EL VALOR
                //SE CALUCLA EL TIEMPO DE RESPUESTA
                resp = Integer.parseInt(Tablecalculos.getValueAt(j, 3).toString()) - (Integer.parseInt(Tablecalculos.getValueAt(j, 1).toString()));

                Tablecalculos.setValueAt(resp, j, 4);

                //SE CALCULA EL TIEMPO DE ESPERA
                espera = Integer.parseInt(Tablecalculos.getValueAt(j, 4).toString()) - (Integer.parseInt(Tablecalculos.getValueAt(j, 2).toString()));

                Tablecalculos.setValueAt(espera, j, 5);

                //SE CALCULA EL TIEMPO DE PENALIZACION
                penal = Double.parseDouble(Tablecalculos.getValueAt(j, 4).toString()) / (Double.parseDouble(Tablecalculos.getValueAt(j, 2).toString()));

                Tablecalculos.setValueAt(penal, j, 6);

                //SE CALCULAN LOS PROMEDIOS DE CADA CALCULO
                promresp += resp;
                promespera += espera;
                prompenal += penal;
            }
        }

        //SE ASIGNAN LOS VALORES A LAS LABELS CORRESPONDIENTES
        Labelrespuesta.setText((promresp / Tablecalculos.getRowCount()) + "");
        Labelespera.setText((promespera / Tablecalculos.getRowCount()) + "");
        Labelpenal.setText((prompenal / Tablecalculos.getRowCount()) + "");

    }//GEN-LAST:event_jbtnCalcularActionPerformed

    private void jbtnMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMemoriaActionPerformed
        //SE POSICIONA EL FRAME PRINCIPAL EN EL EXTREMO IZQUIERDO DE LA PANTALLA
        setLocation(0, 0);
        //SE HACE VISIBLE EL FRAME DE LA MEMORIA
        pf.setLocation(1100, i);
        pf.setVisible(true);
    }//GEN-LAST:event_jbtnMemoriaActionPerformed

    private void jbtnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReiniciarActionPerformed
        Arbolito r = new Arbolito();
        r.setVisible(true);
        this.dispose();
        pf.dispose();
        a.dispose();
    }//GEN-LAST:event_jbtnReiniciarActionPerformed

    private void jtxfTiempoLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfTiempoLlegadaActionPerformed
        jbtnAgregarActionPerformed(evt);
    }//GEN-LAST:event_jtxfTiempoLlegadaActionPerformed

    private void jbtnArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnArbolActionPerformed
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnArbolActionPerformed

    public Cola getProcesosEspera() {
        return ProcesosEspera;
    }

    public void setProcesosEspera(Cola ProcesosEspera) {
        this.ProcesosEspera = ProcesosEspera;
    }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception ex) {
                System.out.println("Error : " + ex);
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Round_Robin().setVisible(true);
                }
            });
        }

        //SE CREA UNA CLASE HILO PARA CORRER EL PROGRAMA
        private class Hilo implements Runnable {

            @Override
            //METODO QUE EJECUTA TODO EL PROGRAMA
            public void run() {
                int estado = 1; //Variable para saber si se va a seguir ejecutando
                int i = 0;
                //CONDICION PARA SABER SI EL PROGRAMA VA A SEGUIR EJECUTANDOSE
                while (estado != 0) {
                    PararProceso();
                    while (i < contador) {

                        CargarCola(i); //Metodo para cargar los datos del proceso a ejecutar
                        pf.ActualizarMemoriaVirtual(ProcesosOrdenados, i, t);
                        if (residuoejec != 0 && residuoejec > quantum)//VERIFICA QUE QUE AUN TENGA TIEMPO DE EJECUCION RESTANTE
                        {
                            PararProceso();
                            if (ejec) { //verifica que sea true y para que ejecute 
                                for (int c = 1; c <= quantum; c++) {//se ejecutara hasta que se c sea menor al Quantum 
                                    azar = new Random();//VARIABLE PARA SABER SI SE BLOQUEA O NO
                                    jLCantidadTiempo.setText(String.valueOf(tiempoProceso + " Segundos"));

                                    JtableDatos.setValueAt("Procesando", i, 5);//Cambia el estado del proceso a: "Procesando"

                                    residuoejec--;//Decrementa el tiempo de ejecucion restante del proceso
                                    Barra(tiempoEjecucion, residuoejec);// Metodo que calucla el avance de la barra de progreso
                                    actualizarBarra();//Metodo que rellena visualmente la barra de progreso
                                    ProcesosOrdenados.getProceso(i).setResiduo(residuoejec);
                                    JtableDatos.setValueAt(String.valueOf(residuoejec), i, 4); //Asigna el tiempo de ejecucion restante al proceso 

                                    tiempoProceso++;//Incrementa el tiempo de ejecución restante 
                                    PararProceso(); //Duerme el hilo  
                                    if (bloc || inter) {

                                        //ENVIA UN VALOR PARA SABER CUANTO TIEMPO SE VA A BLOQUEAR
                                        int a = rex.nextInt(5);
                                        bloqueado(a, i);
                                        break;
                                        // tiempoProceso++;
                                    }
                                    if(!lectura||!escritura)  {
                                        Permisos(i);
                                        break; 
                                    }
                                }
                            } else //hace lo mismo checa que sea true la variable ejec que fue global
                            {
                                jlblinter.setText("no tienes permiso de ejecucion");
                                jlblinter.setVisible(true);
                                try {
                                    t.sleep(1000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Round_Robin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                jlblinter.setVisible(false);
                                jlblinter.setText(" ");                                
//                                ejec = true;                                
//                                jtblAcceso.setValueAt("True", i, 1);
                            }

                            JtableDatos.setValueAt("Espera", i, 5);// Cambia el estado del proceso a: "Espera"
                            if (residuoejec == 0) {//Verifica que ya no haya tiempo restante de ejecucion
                                JtableDatos.setValueAt("Terminado", i, 5);
                                actualizarBarra();
                                TablaTerminados(i);//Metodo que ingresa los procesos terminados a la tabla de Procesos terminados
                                Borrar(i);//Borra los datos del proceso que se ejecutó
                                jBarEstado.setValue(0);//Asigna el valor de la barra a 0
                            }
                        } else {

                            if (residuoejec > 0 && quantum != 0) {
                                while (residuoejec > 0) {//Verifica que el tiempo restante de ejecucion sea mayor que 0
                                    PararProceso();
                                    if (ejec) { //checa si el permiso de ejecucion es true  
                                        azar = new Random();// checa que se repita el true
                                        JtableDatos.setValueAt("Procesando", i, 5); //Cambia el estado del proceso a: "Procesando"
                                        residuoejec--; //SE RESTA 1 AL TIEMPO DE EJECUCION DEL PROCESO
                                        Barra(tiempoEjecucion, residuoejec); //SE ACUTAULIZA EL PORCENTAJE DE LA BARRA
                                        actualizarBarra();
                                        ProcesosOrdenados.getProceso(i).setResiduo(residuoejec);//ASIGNA EL NUEVO VALOR DE RESIDUO AL PROCESO
                                        JtableDatos.setValueAt(String.valueOf(residuoejec), i, 4);
                                        tiempoProceso++; //SE AUMENTA 1 AL TIEMPO DE PROCESO DEL PROCESO
                                        jLCantidadTiempo.setText(String.valueOf(tiempoProceso + " Segundos"));
                                        PararProceso();
                                        if (bloc || inter) {// si el proceso de azar a y b no entnces lo que hace sera interrumpir el proceso 
                                            // Es el numero random que se genera para saber cuanto tiempo se va a bloquear
                                            int a = rex.nextInt(5) + 2;
                                            bloqueado(a, i);
                                            break;
                                            

                                        }
                                    } else { //si no esta en true actualiza la tabla y lo pone en true 
                                        ejec = true;
                                        jtblAcceso.setValueAt("True", i, 1);
                                        JtableDatos.setValueAt("Espera", i, 5);
                                    if(!lectura||!escritura||!ejec)  {
                                        Permisos(i);
                                        break;
                                    }
                                    
                             }

                                }
                                JtableDatos.setValueAt("Espera", i, 5);
                                //VERIFICA QUE EL PROCESO YA TERMINO DE EJECUTARSE
                                if (residuoejec == 0 && quantum != 0) {
                                    JtableDatos.setValueAt("Terminado", i, 5);
                                    actualizarBarra();
                                    TablaTerminados(i);
                                    Borrar(i);
                                    jBarEstado.setValue(0);
                                }
                            }
                        }
                        //SE ASIGNAN LOS VALORES DE 0 A LAS LABELS
                        jtxfNumerosProcesos.setText(String.valueOf(""));
                        jLabelPorcentajeProceso.setText(String.valueOf(""));
                        i++;
                    }
                    i = 0;
                    jtxfNumerosProcesos.setText(String.valueOf(""));
                    jLabelPorcentajeProceso.setText(String.valueOf(""));

                }
                t.stop();
            }

        }

        public void Operacion() //Método para la asignación de la operación al proceso
        {

            for (int j = 0; j < ProcesosOrdenados.Length(); j++) {

                DefaultTableModel modelo = (DefaultTableModel) Tableoperacion.getModel(); //Se obtiene el modelo de la tabla
                Object[] tabla = new Object[2];
                char c = ProcesosOrdenados.getProceso(j).getNumProceso(); //Se obtiene el proceso a asignar
                tabla[0] = c;
                String r = operacion[azar.nextInt(operacion.length)]; //se le asigna la operación al proceso
                tabla[1] = r;

                modelo.addRow(tabla);
                Tableoperacion.setModel(modelo); //Se asigna el modelo a la tabla
            }
        }

//METODO QUE CARGA LOS VALORES DESDE LA TABLA
        public void Cargartabla(int i) {
            numerosProceso = (char) JtableDatos.getValueAt(i, 0);//TOMA EL NUMERO DEL PROCESO A EJECUTAR
            tiempollegada = Integer.parseInt(JtableDatos.getValueAt(i, 1).toString());//TOMA EL VALOR DEL TIEMPO DE LLEGADA DEL PROCEOS
            tiempoEjecucion = Integer.parseInt(JtableDatos.getValueAt(i, 2).toString());//TOMA EL VALOR DEL TIEMPO DE EJECUCION DEL PROCESO
            quantum = Integer.parseInt((JtableDatos.getValueAt(i, 3).toString()));//TOMA EL VALOR DEL QUANTUM
            residuoejec = Integer.parseInt(JtableDatos.getValueAt(i, 4).toString()); //TOMA EL VALOR DEL RESIDUO DEL PROCESO
            if (numerosProceso > 0) {
                jtxfNumerosProcesos.setText(String.valueOf((char) numerosProceso));//Asigna el numero del proceso ejecutandose a un TextField
            }
            inter = jtblAccess.getValueAt(i, 2).toString().equals("True");
            ejec = jtblAcceso.getValueAt(i, 1).toString().equals("True");
            bloc = jtblAccess.getValueAt(i, 1).toString().equals("True");
            escritura = jtblAcceso.getValueAt(i, 3).toString().equals("True");
            lectura = jtblAcceso.getValueAt(i, 2).toString().equals("True");
        }

//CARGA LOS DATOS DEL PROCESO DESDE LA COLA
        public void CargarCola(int i) {
//            if(i>=ProcesosOrdenados.Length())
//                i=0;
            numerosProceso = ProcesosOrdenados.getProceso(i).getNumProceso();
            tiempollegada = ProcesosOrdenados.getProceso(i).getTiempoLlegada();
            tiempoEjecucion = (int) ProcesosOrdenados.getProceso(i).getTiempoEjecucion();
            quantum = ProcesosOrdenados.getProceso(i).getQuantum();
            residuoejec = ProcesosOrdenados.getProceso(i).getResiduo();
            if (numerosProceso > 0) {
                jtxfNumerosProcesos.setText("" + (char) (numerosProceso));
                idb = numerosProceso;
            }
            inter = jtblAccess.getValueAt(i, 2).toString().equals("True");
            ejec = jtblAcceso.getValueAt(i, 1).toString().equals("True");
            bloc = jtblAccess.getValueAt(i, 1).toString().equals("True");
            escritura = jtblAcceso.getValueAt(i, 3).toString().equals("True");
            lectura = jtblAcceso.getValueAt(i, 2).toString().equals("True");
        }

//METODO PARA AGREGAR PROCESOS A LA TABLA
        public void Ingresar(int nProceso) {
            DefaultTableModel modelo = (DefaultTableModel) JtableDatos.getModel();//MODELO DE LA TABLA DE PROCESOS
            DefaultTableModel modelo2 = (DefaultTableModel) jtblAccess.getModel();
            contador++;//SE AUMENTA EL CANTADOR
            //SE INSERTA EL PROCESO CUANDO TERMINA SU QUANTUM Y SE AGREGA A UNA COLA DE PROCESOS EN ESPERA
            ProcesosEspera.Insert(new Proceso((char)nProceso, Integer.parseInt(jtxfTiempoLlegada.getText()), Integer.parseInt(jtxfTiempoEjecucion.getText()), Integer.parseInt(jspQuantum.getValue().toString()), Integer.parseInt(jtxfTiempoEjecucion.getText())));
            Object[] Table = new Object[6]; //se declara un arreglo de tipo oobjeto con el valor de las comlumnas
            Table[0] = (char) (nProceso);//SE CONVIERTE EL NUMERO DE PROCESO A SU RESPECTIVA LETRA  
            Table[1] = Integer.parseInt(jtxfTiempoLlegada.getText());
            Table[2] = jtxfTiempoEjecucion.getText();
            Table[3] = Integer.parseInt(jspQuantum.getValue().toString());
            Table[4] = jtxfTiempoEjecucion.getText();
            Table[5] = "Listo";
            modelo.addRow(Table); //Agrega el renglon donde esta la informacion del proceso
            JtableDatos.setModel(modelo); //Actualiza la tabla atraves del modelo
            jtxfTiempoEjecucion.setText("");
            jtxfTiempoLlegada.setText("");
            jtxfTiempoLlegada.grabFocus();

            Object[] tabla2 = new Object[3];
            tabla2[0] = (char) (nProceso);
            tabla2[1] = rex.nextInt(2) == 0 ? "True" : "False";
            tabla2[2] = rex.nextInt(2) == 0 ? "True" : "False";
//            tabla2[3] = rex.nextInt(2) == 0 ? "True" : "False";
            modelo2.addRow(tabla2);
            
             Object [] tablaac = new Object[4];
        DefaultTableModel modeloac = (DefaultTableModel) jtblAcceso.getModel();
        
        //for (int j = 0; j < jtblAccess.getRowCount(); j++) {
            char c =(char)(nProceso);
            //System.out.println("Tamaño" + ProcesosOrdenados.Length());
            tablaac[0] = c;
            
            tablaac[1] = modo==0 ? "True" : modo==1? "True":"True";
            tablaac[2] = modo==0 ? "True" : modo==1? "True":"False";
            tablaac[3] = modo==0 ? "True" : modo==1? "False":"True";
            
            modeloac.addRow(tablaac);
            
        
        
        jtblAcceso.setModel(modeloac);
            
            
        }

//METODO QUE AGREGA LOS PROCESOS TERMINADOS A LA TABLA DE PROCESOS TERMINADOS
        public void TablaTerminados(int c) {
            //SE SACA EL MODELO DE LA TABLA DE FINALIZACION
            DefaultTableModel modelo2 = (DefaultTableModel) jTableFin.getModel();
            //SE CREAN VARIABLES AUXILIARES
            int tiempollegada = 0;
            int numproceso = 0;
            //RRECORRE LA COLA DE LOS PROCESOS YA ORDENADOS
            for (int j = 0; j < ProcesosOrdenados.Length(); j++) {
                numproceso = ProcesosOrdenados.getProceso(j).getNumProceso();
                //COMPRUEBA QUE LOS PROCESOS COINCIDAN
                if (numproceso == c) {

                    tiempollegada = ProcesosOrdenados.getProceso(j).getTiempoLlegada();
                }
            }
            int TiempoRespuesta = tiempollegada - tiempoProceso;

            Object[] Table = new Object[7];//SE CREA UN NUEVO OBJETO PARA AGEGAR UN RENGLON A LA TABLA DE FINALIZACION 
            Table[0] = (idb);
            Table[1] = tiempoEjecucion;  //TIEMPO DE EJECUCION
            Table[2] = quantum;//VALOR DEL QUANTUM
            Table[3] = tiempoProceso;//+" Segundos";
            Table[4] = TiempoRespuesta; //VALOR DEL TIEMPO DE RESPUESTA
            Table[5] = TiempoRespuesta - tiempoEjecucion;//VALOR DEL TIEMPO DE ESPERA
            Table[6] = TiempoRespuesta / tiempoEjecucion;//VALOR DEL TIEMPO DE PENALIZACION
            modelo2.addRow(Table);//SE AGREGA EL RENGLON A LA TABLA DE FINALIZACION
            jTableFin.setModel(modelo2);
            //CantidadProcesos++; 
            jLCantidadTiempo.setText(String.valueOf(tiempoProceso + " Segundos"));//se le asigna al label pero solo captura el tiempo de los procesos pero eso esta un poco incomprendible?
        }

//METODO PARA ELIMINIAR LOS REGISTROS DEL PROCESO EJECUTADO
        public void Borrar(int c) {
            //PONE TODOS LOS VALORES EN 0
            JtableDatos.setValueAt(0, c, 0);
            JtableDatos.setValueAt("0", c, 1);
            JtableDatos.setValueAt("0", c, 2);
            JtableDatos.setValueAt("0", c, 3);
            JtableDatos.setValueAt("0", c, 4);
            JtableDatos.setValueAt("******", c, 5);
        }

//METODO QUE CALCULA EL PORCENTAJE DE LA BARRA, RECIBE EL TIEMPO DE EJECUCION Y EL RESIDUO
        public void Barra(int rafaga, int residuo) {
            int valor = 100 / rafaga;
            int porcentaje = 100 - (valor * residuo);
            valorBarra = porcentaje;
            //ASIGNA EL VALOR AL LABEL DE PROGRESO
            jLabelPorcentajeProceso.setText(String.valueOf(valorBarra + "%"));

        }

        //METODO QUE RELLENA LA BARRA DE PROGRESO VISUALMENTE
        public void actualizarBarra() {
            jBarEstado.setValue(valorBarra);
            jBarEstado.repaint();
        }

        //METODO QUE OCULTA LOS LABEL Y TEXFIELD PARA QUE SEA MAS AGRADABLE VISUALMENTE
        public void Iniciar() {
            jlblQuantum.setVisible(false);
            jlblTiempoDeEjecucion.setVisible(false);
            jlblTiempollegada.setVisible(false);
            jtxfTiempoEjecucion.setVisible(false);
            jtxfTiempoLlegada.setVisible(false);
            jspQuantum.setVisible(false);
            jbtnAgregar.setVisible(false);
            jtxfTiempoLlegada.setVisible(false);

        }
        //DETIENE EL PROCESO

        public void PararProceso() {
            try {
                Thread.sleep(1000); //Dormir  
            } catch (InterruptedException ex) {
                Logger.getLogger(Round_Robin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        //METODO QUE BLOQUEA ALEATORIAMENTE LOS PROCESOS
        public void bloqueado(int a, int n) {
            tiempoProceso += a; //Se le añade el tiempo de bloqueo al tiempo total de ejecución
            pf.bloqueado(idb); //Se llama al método correspondiente al bloqueo de procesos del Frame Secundario
            Random block = new Random();
            int tiempo = 180 * (5 + block.nextInt(7));//ASIGNA UN TIEMPO ALEATORIO PARA BLOQUEAR AL PROCESO
            try {
                Random sd = new Random();
                Random inte = new Random();
                int rd = sd.nextInt(2);
                System.out.println("" + rd);
                if (bloc || rd == 0) { //compruebo si el proceso va a ser bloqueado
                    bloc = false;
                    ejec = false;
                    jlblbloqueado.setVisible(true);
                    jtblAcceso.setValueAt("False", n, 1); //se le ordena al numero de proceso "n" que se dejara de ejecutar
                    jtblAccess.setValueAt("True", n, 1);  //se le ordena al numero de proceso "n que se bloqueara
                    t.sleep(tiempo);                      //se detiene el hilo por el tiempo aleatorio
                    jtblAcceso.setValueAt("True", n, 1);  //se le ordena al proceso "n" que se ejecutra
                    jtblAccess.setValueAt("False", n, 1); //se le ordena al proceso "n" que no se bloqueara
                    jlblbloqueado.setVisible(false);
                    ejec = true;
                    //System.out.println("bloqueado");
                }
                
                if (inter) {                              //Se revisa si se va a interrumpir
                    jlblbloqueado.setText("Interrupido"); //Se anuncia que se interrumpitra
                    jlblbloqueado.setVisible(true);       
                    inter = true;                         
                    ejec = false;
                    jtblAcceso.setValueAt("False", n, 1); //se le ordena al proceso "n" que dejara de ejecutarse
                    jtblAccess.setValueAt("True", n, 2);  //se le ordena al proceso "n" que se interrumpira 
                    
                    //SE SELECCIONA EL TIPO DE INTERRUPCION ALEATORIAMENTE
                    int z = inte.nextInt(5);
                    if (inter || rd == 1) {
                        switch (z) {

                            case 0:
                                jlblinter.setText(Tableoperacion.getValueAt(n, 1) + "");
                                JOptionPane.showMessageDialog(this, "interrupcion por entrada", "Interrupcion", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 1:
                                jlblinter.setText(Tableoperacion.getValueAt(n, 1) + "");
                                JOptionPane.showMessageDialog(this, "interrupcion por salida", "Interrupcion", JOptionPane.INFORMATION_MESSAGE);

                                break;
                            case 2:
                                jlblinter.setText(Tableoperacion.getValueAt(n, 1) + "");
                                JOptionPane.showMessageDialog(this, "interrupcion por entrada", "Interrupcion", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 3:
                                jlblinter.setText(Tableoperacion.getValueAt(n, 1) + "");
                                JOptionPane.showMessageDialog(this, "interrupcion por entrada/salida", "Interrupcion", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 4:
                                jlblinter.setText(Tableoperacion.getValueAt(n, 1) + "");
                                JOptionPane.showMessageDialog(this, "interrupcion por salida", "Interrupcion", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            default:
                                jlblinter.setText("interrupcion ");
                                JOptionPane.showMessageDialog(this, "interrupcion por entrada/salida", "Interrupcion", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                    t.sleep(tiempo);                      //Se duerme el hilo
                    jtblAcceso.setValueAt("True", n, 1);  //se ordena la continuacion de la ejecucion del proceso "n"
                    inter = false;
                    ejec = true;
                    jtblAccess.setValueAt("False", n, 2); //se dice al proceso que ya no se interrumpira
                    jlblbloqueado.setText("Bloqueado");
                    jlblinter.setText(" ");
                    jlblbloqueado.setVisible(false);
                    
                }

                //DUERME EL HILO
            } catch (InterruptedException ex) {
                Logger.getLogger(Round_Robin.class.getName()).log(Level.SEVERE, null, ex);
            }
            jlblbloqueado.setText("Bloqueado");
            jlblbloqueado.setVisible(false);
//        }
           
        }

        //METODO QUE ORDENA LOS PROCESOS POR TIEMPO DE LLEGADA
        public void OrdenarProcesos() {
            if (ProcesosOrdenados.Empty()) {
                try {
                    int n = 0;
                    //RECORRE LA COLA DE LOS PROCESOS Y COMPARA LOS TIEMPOS DE LLEGADA PARA ORDENARLOS
                    for (int h = 0; h < 100; h++) {
                        for (int j = 0; j < ProcesosEspera.Length(); j++) {
                            if (ProcesosEspera.getProceso(j).getTiempoLlegada() == n) {
                                ProcesosOrdenados.Insert(ProcesosEspera.getProceso(j));
                                //ProcesosEspera.RemoveSelect(j);
                            }
                        }
                        n++;
                    }
                } catch (Exception e) {
                    t.stop();
                }

                //ACTUALIZA LA TABLA DE LOS PROCESOS PARA MOSTRARLOS ORDENADOS POR TIEMPO DE LLEGADA
                DefaultTableModel modelo = (DefaultTableModel) JtableDatos.getModel();
                modelo.setRowCount(0);
                for (int j = 0; j < ProcesosOrdenados.Length(); j++) {
                    Object[] Table = new Object[6];
                    Table[0] = ProcesosOrdenados.getProceso(j).getNumProceso();
                    Table[1] = ProcesosOrdenados.getProceso(j).getTiempoLlegada();
                    Table[2] = ProcesosOrdenados.getProceso(j).getTiempoEjecucion();
                    Table[3] = ProcesosOrdenados.getProceso(j).getQuantum();
                    Table[4] = ProcesosOrdenados.getProceso(j).getResiduo();
                    Table[5] = "Listo";
                    modelo.addRow(Table);
                    JtableDatos.setModel(modelo);
                    jtblAccess.setValueAt(ProcesosOrdenados.getProceso(j).getNumProceso(), j, 0);
                }

                // SE ASIGNAN LOS VALORES INICIALES A LA TABLA DE CALUCLOS
                for (int k = 0; k < ProcesosOrdenados.Length(); k++) {

                    Object[] Table = new Object[7];
                    Table[0] = ProcesosOrdenados.getProceso(k).getNumProceso();
                    Table[1] = ProcesosOrdenados.getProceso(k).getTiempoLlegada();
                    Table[2] = ProcesosOrdenados.getProceso(k).getTiempoEjecucion();
                    Table[3] = "****";
                    Table[4] = "****";
                    Table[5] = "****";
                    Table[6] = "****";
                    modelocalculos.addRow(Table);
                    Tablecalculos.setModel(modelocalculos);
                }
            }
        }
        
        //Metodo de validación de Permisos
        public void Permisos(int i){
        pf.bloqueado(idb);  //se bloquea el proceso
        if(!escritura){     //se verifica si no tiene permiso de escritura
            jlblinter.setText("No tienes permiso De Escritura"); //Se avisa que no tiene permiso
            jlblinter.setVisible(true); //Se visualiza el aviso
//            jtblAcceso.setValueAt(rex.nextInt(2)==0 ? "True" : "False", i, 3); //se le asigna un permiso de escritura
            try {
                t.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Round_Robin.class.getName()).log(Level.SEVERE, null, ex);
            }
            jlblinter.setText("");
            jlblinter.setVisible(false);  //se oculta el aviso previo
        }
        if(!lectura){   //se verifica si no tiene permiso de escritura
         jlblinter.setText("No tienes permiso De Lectura"); //se avisa que no tiene permiso
            jlblinter.setVisible(true); //se visualiza el aviso
           // jtblAcceso.setValueAt(rex.nextInt(2)==0 ? "True" : "False", i, 2); //se le asigna un permiso de escritura
            try {
                t.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Round_Robin.class.getName()).log(Level.SEVERE, null, ex);
            }
            jlblinter.setText("");
            jlblinter.setVisible(false);          
        }
        
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable JtableDatos;
    private javax.swing.JLabel Labelespera;
    private javax.swing.JLabel Labelpenal;
    private javax.swing.JLabel Labelrespuesta;
    private javax.swing.JTable Tablecalculos;
    private javax.swing.JTable Tableoperacion;
    private javax.swing.JProgressBar jBarEstado;
    private javax.swing.JTextField jLCantidadTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLabelPorcentajeProceso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTableFin;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnArbol;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JButton jbtnIniciar;
    private javax.swing.JButton jbtnMemoria;
    private javax.swing.JButton jbtnParar;
    private javax.swing.JButton jbtnReiniciar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlblQuantum;
    private javax.swing.JLabel jlblTiempoDeEjecucion;
    private javax.swing.JLabel jlblTiempollegada;
    private javax.swing.JLabel jlblbloqueado;
    private javax.swing.JLabel jlblinter;
    public javax.swing.JSpinner jspQuantum;
    private javax.swing.JTable jtblAcceso;
    public javax.swing.JTable jtblAccess;
    private javax.swing.JTextField jtxfNumerosProcesos;
    public javax.swing.JTextField jtxfTiempoEjecucion;
    public javax.swing.JTextField jtxfTiempoLlegada;
    // End of variables declaration//GEN-END:variables
}
