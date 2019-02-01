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
            TODO object = list.get(i);
            for(int j = i; j < list.size(); j++)    {
                if (object.getPriority() > list.get(j).getPriority())  {
                    list.set(i, list.get(j));
                    list.set(j, object);
                    object = list.get(i);
                }
            }
        }
    }

    public void bubbleSort()  {
        int swaps = 1;
        while(swaps > 0)    {
            swaps = 0;
            for(int i = 0; i < list.size() - 1; i++)    {
                TODO object = list.get(i);
                if(object.getPriority() > list.get(i + 1).getPriority())   {
                    list.set(i, list.get(i + 1));
                    list.set((i + 1), object);
                    swaps++;
                }
            }
        }
    }

    public void insertionSort()  {
        for(int i = 1; i < list.size(); i++)    {
            TODO object = list.get(i);
            for(int j = i - 1; j >= 0; j--)    {
                if (object.getPriority() < list.get(j).getPriority())  {
                    list.set((j + 1), list.get(j));
                    list.set(j, object);
                }
            }
        }
    }

    public void combSort()  {
        int gap = list.size()/2;
        while(gap > 0)    {
            for(int i = 0; i < list.size() - gap; i++)    {
                TODO object = list.get(i);
                if(object.getPriority() > list.get(i + gap).getPriority())   {
                    list.set(i, list.get(i + gap));
                    list.set((i + gap), object);
                }
            }
            gap = (int)(gap / 1.3);
        }
    }

    public boolean sortCheck()  {
        for(int i = 0; i < list.size() - 1; i++)    {
            if(list.get(i).getPriority() > list.get(i + 1).getPriority())   {
                return false;
            }
        }
        return true;
    }

    public boolean priorityExists(int target) {
        for (int i = 0; i < list.size(); i++)   {
            if(list.get(i).getPriority() == target) {
                return true;
            }
        }
        return false;
    }

    public boolean priorityExistsPairs(int target, int target2) {
        if (priorityExists(target) && priorityExists(target2))  {
            return true;
        }
        return false;
    }

    public boolean binarySearch(int target) {
        int left = 0;
        int right = list.size() - 1;
        int place = list.size()/2;
        while   (1 == 1) {
            place = ((right - left) / 2) + left;

            if (list.get(place).getPriority() == target || list.get(left).getPriority() == target || list.get(right).getPriority() == target)    {
                return true;
            } else if (list.get(place).getPriority() < target)  {
                left = place;
            } else  {
                right = place;
            }
            if (right - left < 2)   {
                return false;
            }
        }
    }




}