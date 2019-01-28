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

    public void selectionSort()  {
        for(int i = 0; i < list.size(); i++)    {
            TODO object1 = list.get(i);
            for(int j = i; j < list.size(); j++)    {
                TODO object2 = list.get(j);
                if (object1.getPriority() > object2.getPriority())  {
                    list.set(i, object2);
                    list.set(j, object1);
                    object1 = object2;
                }
            }
        }
    }

    public void bubbleSort()  {
        int swaps = 1;
        while(swaps > 0)    {
            swaps = 0;
            for(int i = 0; i < list.size() - 1; i++)    {
                TODO object1 = list.get(i);
                TODO object2 = list.get(i + 1);
                if(object1.getPriority() > object2.getPriority())   {
                    list.set(i, object2);
                    list.set((i + 1), object1);
                    swaps++;
                }
            }
        }
    }

    public void insertionSort()  {
        for(int i = 1; i < list.size(); i++)    {
            TODO object1 = list.get(i);
            for(int j = (i - 1); j >= 0; j--)    {
                TODO object2 = list.get(j);
                if (object1.getPriority() < object2.getPriority())  {
                    list.set((j + 1), object2);
                    list.set(j, object1);
                }
            }
        }
    }




}