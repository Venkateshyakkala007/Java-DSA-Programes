package sorting3;


import java.util.*;


// the time compleixity - O(nlogn) sc:O(n)


public class ActivitySelect {

  // Driver code
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer> start = new ArrayList<>();
      ArrayList<Integer> end= new ArrayList<>();
      ArrayList<Integer> result = new ArrayList<>();

      for(int i = 0; i < n; i++)
      {
        start.add(sc.nextInt());

      }

      for(int i = 0; i < n; i++)
      {
        end.add(sc.nextInt());
        
      }

      ArrayList<Meeting> meet = new ArrayList<Meeting>();

      for(int i = 0; i < n; i++)
      {
        meet.add(new Meeting(start.get(i), end.get(i), i+1));
      }

      

     int ans = sortingFun(meet);


  }
}

static int sortingFun(ArrayList<Meeting> meet) {

  Collections.sort(meet, new Comparator<Meeting>() {
        
    @Override
    public int compare(Meeting o1, Meeting o2) {
      return o1.end - o2.end;
    }
  });

 
  int count = 1;
  int limit = meet.get(0).end;

  int n = meet.size();

  for(int i = 1; i <n; i++)
  {
    if(meet.get(i).start >= limit){
      limit = meet.get(i).end;
      count++;
    }
  }

  return count;
}

public class Meeting {
  int start;
  int end;
  int position;
  Meeting(int s,int e,int p)
  {
    start=s;
    end=e;
    position=p;
  }
}

