public class Que9 {
    public static void main(String args[]) {
        Bike.Engine obj = new Bike.Engine();
        obj.EngineCheck();
        obj.Start();
    }
}
class Bike {
    static class Engine {
        void EngineCheck()
        {
            System.out.println("Engine Status Ok!");
        }
        void Start()
        {
            System.out.println("Bike Started.....Ready To Go!");
        }
    }
}
