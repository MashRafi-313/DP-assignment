public class Client {
    public static void main(String[] args) {
        File file1 = new File(100);
        File file2= new File(75);
        File file3 = new File(150);

        Folder  folder1 = new Folder();
        Folder  folder2 = new Folder();
        Folder  folder3 = new Folder();
        Folder  folder4 = new Folder();
        
        
        
        folder1.add(folder2);
        folder2.add(folder3);
        folder2.add(file1);
        folder2.add(folder4);
        folder3.add(file2);
        folder3.add(file3);
        

        System.out.println(folder1.getFileSize());

    }
}
