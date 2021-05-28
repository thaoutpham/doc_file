import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

 class ReadFile {
public void readFile(String filePath){
    try {
        File file =new File(filePath);
        if(!file.exists()){
            throw new FileNotFoundException();
        }
        BufferedReader br=new BufferedReader(new FileReader(file));
        String line="";
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    } catch (Exception e) {
        System.out.println("File không tồn tại");
    }
}
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFile readfileEx = new ReadFile();
        readfileEx.readFile(path);
    }
}
