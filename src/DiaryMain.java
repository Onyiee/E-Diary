import javax.swing.*;

public class DiaryMain {
    public static void main(String[] args) {
        Diary diary = new Diary(2);
        Entries entries1 = new Entries("Entry1");
        entries1.setEntryBody(JOptionPane.showInputDialog("Enter the entry body for entry 1"));
        Entries entries2= new Entries("Entry2");
        entries2.setEntryBody(JOptionPane.showInputDialog("Enter the entry body for entry 2"));
        diary.addEntries(entries1);
        diary.addEntries(entries2);
        JOptionPane.showMessageDialog(null,diary.getEntry()[0]);
        JOptionPane.showMessageDialog(null,diary.getEntry()[1]);
        diary.deleteEntries(entries1);
        JOptionPane.showMessageDialog(null,diary.getEntry()[0]);
        entries2.updateEntryBody(JOptionPane.showInputDialog("Enter entry 2 update"));
        JOptionPane.showMessageDialog(null,diary.getEntry()[1]);
        JOptionPane.showMessageDialog(null,diary.getNumberOfEntry());
    }
}
