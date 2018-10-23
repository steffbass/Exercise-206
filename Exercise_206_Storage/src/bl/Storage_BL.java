/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author stefan
 */
public class Storage_BL extends AbstractTableModel{
 
   private ArrayList<StorageItem> item = new ArrayList<>();
    private static String[] colNames = {"ID","Description","Place","Amount"};

    @Override
    public int getRowCount() {
     return  item.size();
    }

    @Override
    public int getColumnCount() {
       return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      StorageItem si = (StorageItem) item.get(rowIndex);
      return si;
    }
    
      @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
    
    public void add (StorageItem si)
    {
     item.add(si);
       this.fireTableRowsInserted(item.size()-1, item.size()-1);
    }
    
    public void remove(StorageItem si)
    {
     item.remove(si);
     this.fireTableRowsDeleted(item.size()-1, item.size()-1);
    }
    
    public void sell(StorageItem si,int anz)
    {
   int help = si.getAmount();
   int neu = help-anz;
   si.setAmount(neu);
    }
    
    public void buy(StorageItem si, int anz)
    {
     int help = si.getAmount();
     int neu = help + anz;
     si.setAmount(neu);
    }
    
    public void edit(StorageItem si, int id, String desc, int amount, int place)
    {
     si.setAmount(amount);
     si.setDesc(desc);
     si.setId(id);
     si.setPlace(place);
    }
}
