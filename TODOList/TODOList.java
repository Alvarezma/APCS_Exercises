import java.util.ArrayList;

class TODOList  {

    private ArrayList<TODO> list;


    TODOList()  {
        list = new ArrayList<TODO>();
    }

    public String display() {
        String printout = "";
        for(int i = 0; i < list.size(); i++)    {
            printout += (list.get(i).getDesc() + " \nPriority: " + list.get(i).getPriority() + " \nStatus: " + list.get(i).getComplete() + "\n-------------------------\n");
        }
        return printout;
    }

    public void add(String desc, int priority)  {
        list.add(new TODO(desc, priority));
    }

    public void remove(int target)  {
        if (target >= list.size() || target < 0)    {
            return;
        }
        list.remove(target);
    }

    public void setStatus(int target, boolean status)    {
        if (target >= list.size() || target < 0)    {
            return;
        }
        list.get(target).setStatus(status);
    }




}