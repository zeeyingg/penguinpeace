import java.util.Scanner;

void setup(){
 size(700, 700);
 parseFile("LevelSample");
 int scale = 30;
 for(int i = 0; i < 10; i++){
   for(int j = 0; j < 10; j++){
     if(i == 0 || i == 9 || j == 0 || j == 9){
       Wall test = new Wall(i*scale, j*scale, scale);
       test.draw();
     }
   }
  }
}

String[][] parseFile(String fileLocation) {
  Scanner in = new Scanner(fileLocation);
  try{
    String[][] parsed; =
    return parsed;
  } catch { 
    throw new FileNotFoundException();
  }

} 
