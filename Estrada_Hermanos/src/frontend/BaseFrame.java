package frontend;

import backend.Zapateria;

public class BaseFrame extends javax.swing.JFrame {

    private BaseFrame padre;
    private Zapateria zapateria;

    public BaseFrame(BaseFrame parent) {
        this.padre = parent;
        this.zapateria = parent.getZapateria();

        initComponents();
    }

    public BaseFrame(Zapateria zapateria) {
        this.zapateria = zapateria;
        initComponents();
    }

    protected BaseFrame getPadre() {
        return padre;
    }

    protected Zapateria getZapateria() {
        return zapateria;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
