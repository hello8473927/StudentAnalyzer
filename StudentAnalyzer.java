import java.util.ArrayList;

public class StudentAnalyzer{
  private ArrayList<Student> studentList;

  public StudentAnalyzer(ArrayList<Student> list){
    studentList = list;
  }

  public int countAbove(int threshold){
    int count = 0;
    for(int i = 0; i < studentList.size(); i++){
      if(studentList.get(i).getMarks() > threshold){
        count++;
      }
    }
    return count;
  }

  public void removeFailing(int passMark){
    for(int i = 0; i < studentList.size(); i++){
      if(studentList.get(i).getMarks() < passMark){
        studentList.remove(i);
        i--;
      }
    }
  }

  public Student findTopStudent(){
    Student max = studentList.get(0);
    for(int i = 0; i < studentList.size(); i++){
      if(studentList.get(i).getMarks() > max.getMarks()){
        max = studentList.get(i);
      }
    }
    return max;
  }

  public ArrayList<Student> getTopStudents(int threshold){
    ArrayList<Student> topStudents = new ArrayList<>();
    for(int i = 0; i < studentList.size(); i++){
      if(studentList.get(i).getMarks() >= threshold){
        topStudents.add(studentList.get(i));
      }
    }
    return topStudents;
  }

  public boolean hasDuplicateNames(){
    for(int i = 0; i < studentList.size(); i++){
      for(int x = i + 1; x < studentList.size(); x++){
        if(studentList.get(i).getName().equals(studentList.get(x).getName())){
          return true;
        }
      }
    }
    return false;
  }

  public boolean isSorted(){
    for(int i = 0; i < studentList.size() - 1; i++){
      if (studentList.get(i).getMarks() > studentList.get(i + 1).getMarks()){
        return false;
      }
    }
    return true;
  }
}
