/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.jos;

/**
 *
 * @author Jose Garcia
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CalculadoraJos extends JFrame implements ActionListener{
    private JPanel pnlTitulo;
    private JPanel pnlOperacion;
    private JPanel pnlBotones;
    private JLabel lblTitulo;
    private JLabel lblValor1;
    private JLabel lblValor2;
    private JTextField txtValor1;
    private JTextField txtValor2;
    private JLabel lblResultado;
    private JTextField txtResultado;
    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnMultiplicacion;
    private JButton btnDivision;
    private JButton btnRaizcuadr;
    private JButton btnRaizcuad;
    private JButton btnPotenciau;
    private JButton btnPotenciad;
    private JButton btnMod;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private Container contenedor;
    public CalculadoraJos() {
        //definicion objetos panel del titulo
        this.pnlTitulo = new JPanel();
        this.lblTitulo = new JLabel("Proyecto Calculadora");
        pnlTitulo.add(lblTitulo);
        //definicion panel de objetos de las operaciones
        this.pnlOperacion = new JPanel();
        this.pnlOperacion.setLayout(new GridLayout(3,2));
        this.lblValor1 = new JLabel("Numero 1 ");
        this.txtValor1 = new JTextField(10);
        this.lblValor2 = new JLabel("Numero 2 ");
        this.txtValor2 = new JTextField(10);
        this.lblResultado = new JLabel("Resultado");
        this.txtResultado = new JTextField(10);
        //adicionar objetos al panel transaccion
        pnlOperacion.add(lblValor1);
        pnlOperacion.add(txtValor1);
        pnlOperacion.add(lblValor2);
        pnlOperacion.add(txtValor2);
        pnlOperacion.add(lblResultado);
        pnlOperacion.add(txtResultado);

        //definicion panel de los botones
        this.pnlBotones = new JPanel();
        pnlBotones.setLayout(new GridLayout(4,3));
        this.btnSuma = new JButton("+");
        this.btnResta = new JButton("-");
        this.btnMultiplicacion = new JButton("*");
        this.btnDivision = new JButton("/");
        this.btnRaizcuadr = new JButton("sqrtn1");
        this.btnRaizcuad = new JButton("sqrtn2");
        this.btnPotenciau=new JButton ("n1^n2");
        this.btnPotenciad=new JButton ("n2^n1");
        this.btnMod = new JButton("n1%n2");
        this.btnLimpiar = new JButton("Limpiar");
        this.btnSalir = new JButton("Salir");
        //adicionar objetos al panel botones
        pnlBotones.add(btnSuma);
        pnlBotones.add(btnResta);
        pnlBotones.add(btnMultiplicacion);
        pnlBotones.add(btnDivision);
        pnlBotones.add(btnRaizcuadr);
        pnlBotones.add(btnRaizcuad);
        pnlBotones.add(btnPotenciau);
        pnlBotones.add(btnPotenciad);
        pnlBotones.add(btnMod);
        pnlBotones.add(btnLimpiar);
        pnlBotones.add(btnSalir);

        
        btnSuma.addActionListener(this);
        btnResta.addActionListener(this);
        btnMultiplicacion.addActionListener(this);
        btnDivision.addActionListener(this);// suscribimos los botones a la accion que java considera más importante para ese componente
        btnRaizcuadr.addActionListener(this);
        btnRaizcuad.addActionListener(this);
        btnPotenciau.addActionListener(this);
        btnPotenciad.addActionListener(this);
        btnMod.addActionListener(this);
        btnSalir.addActionListener(this);
        btnLimpiar.addActionListener(this);

        
        
        
        // el contenedor obtiene el frame donde ubica los objetos graficos
        this.contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(pnlTitulo, BorderLayout.NORTH);
        contenedor.add(pnlOperacion,BorderLayout.NORTH);
        contenedor.add(pnlBotones,BorderLayout.CENTER);

        //sentencias menejo de la ventana
        setTitle("OPERADORES ARIMETICOS");
        setSize(400,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

    }

     public void actionPerformed(ActionEvent evento) {
        if(evento.getSource()==btnSuma){
            Suma();
            
             }else if(evento.getSource()==btnResta){
          Resta();
          
        }
                else if(evento.getSource()==btnMultiplicacion){
          Multiplicacion();
          
        }     
                   else if(evento.getSource()==btnDivision){
          Division();
          
        }    else if(evento.getSource()==btnRaizcuadr){
          Raizu();
          
        }   else if(evento.getSource()==btnRaizcuad){
          Raizd();
          
        }   else if(evento.getSource()==btnPotenciau){
          Potenciau();
          
        }   else if(evento.getSource()==btnPotenciad){
          Potenciad();
          
        }  else if(evento.getSource()==btnMod){
          Mod();
          
        }
        else	if(evento.getSource()==btnLimpiar){
            limpiar();
        } else if(evento.getSource()==btnSalir){
            System.exit(0);
        }

    }

    private void Suma() {
        int x=0;
        int y=0;
        int s=0;
        x=Integer.parseInt(txtValor1.getText());
        y=Integer.parseInt(txtValor2.getText());
        s=x+y;
        //Si el total lo quisieras poner en otro jTextField de tu pantalla, tendrías que convertirlo a String antes:
        String valorTotal = Integer.toString(s);
        txtResultado.setText(valorTotal);
        
    }
    private void Resta() {
        int x=0;
        int y=0;
        int s=0;
        x=Integer.parseInt(txtValor1.getText());
        y=Integer.parseInt(txtValor2.getText());
        s=x-y;
        //Si el total lo quisieras poner en otro jTextField de tu pantalla, tendrías que convertirlo a String antes:
        String valorTotal = Integer.toString(s);
        txtResultado.setText(valorTotal);
        
    }
     private void Multiplicacion() {
        int x=0;
        int y=0;
        int s=0;
        x=Integer.parseInt(txtValor1.getText());
        y=Integer.parseInt(txtValor2.getText());
        s=x*y;
        //Si el total lo quisieras poner en otro jTextField de tu pantalla, tendrías que convertirlo a String antes:
        String valorTotal = Integer.toString(s);
        txtResultado.setText(valorTotal);
        
    } private void Division() {
        int x=0;
        int y=0;
        int s=0;
        x=Integer.parseInt(txtValor1.getText());
        y=Integer.parseInt(txtValor2.getText());
        s=x/y;
        //Si el total lo quisieras poner en otro jTextField de tu pantalla, tendrías que convertirlo a String antes:
        String valorTotal = Integer.toString(s);
        txtResultado.setText(valorTotal);
        
    } private void Raizu() {
        double x=0;
        double s=0;
        x=Double.parseDouble(txtValor1.getText());
       
        s=Math.sqrt(x);
        //Si el total lo quisieras poner en otro jTextField de tu pantalla, tendrías que convertirlo a String antes:
        String valorTotal = Double.toString(s);
        txtResultado.setText(valorTotal);
        
    } private void Raizd() {
        
        double y=0;
        double s=0;
       
        y=Double.parseDouble(txtValor2.getText());
        s=Math.sqrt(y);
        //Si el total lo quisieras poner en otro jTextField de tu pantalla, tendrías que convertirlo a String antes:
        String valorTotal = Double.toString(s);
        txtResultado.setText(valorTotal);
        
    } private void  Potenciau() {
        int x=0;
        int y=0;
        int s=0;
        x=Integer.parseInt(txtValor1.getText());
        y=Integer.parseInt(txtValor2.getText());
        s=(int) Math.pow(x,y);
        //Si el total lo quisieras poner en otro jTextField de tu pantalla, tendrías que convertirlo a String antes:
        String valorTotal = Integer.toString(s);
        txtResultado.setText(valorTotal);
        
    } private void Potenciad() {
        int x=0;
        int y=0;
        int s=0;
        x=Integer.parseInt(txtValor1.getText());
        y=Integer.parseInt(txtValor2.getText());
        s=(int) Math.pow(y,x);
        //Si el total lo quisieras poner en otro jTextField de tu pantalla, tendrías que convertirlo a String antes:
        String valorTotal = Integer.toString(s);
        txtResultado.setText(valorTotal);
        
    } private void Mod() {
        int x=0;
        int y=0;
        int s=0;
        x=Integer.parseInt(txtValor1.getText());
        y=Integer.parseInt(txtValor2.getText());
        s=x%y;
        //Si el total lo quisieras poner en otro jTextField de tu pantalla, tendrías que convertirlo a String antes:
        String valorTotal = Integer.toString(s);
        txtResultado.setText(valorTotal);
        
    }

    private void limpiar() {
        txtValor1.setText("");
        txtValor2.setText("");
        txtResultado.setText("");
        txtValor1.requestFocus();
       
    }
}

    

        
