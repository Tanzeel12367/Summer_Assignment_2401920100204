abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice(){ return "First Class - Reserved for premium passengers only."; }
}

class Ladies extends Compartment {
    public String notice(){ return "Ladies Compartment - Only women passengers allowed."; }
}

class General extends Compartment {
    public String notice(){ return "General Compartment - Open for all passengers."; }
}

class Luggage extends Compartment {
    public String notice(){ return "Luggage Compartment - No passengers allowed."; }
}

class TestCompartment {
    public static void main(String[] args){
        Compartment[] arr = new Compartment[10];
        for(int i=0;i<10;i++){
            int r = (int)(Math.random()*4)+1;
            if(r==1) arr[i]=new FirstClass();
            else if(r==2) arr[i]=new Ladies();
            else if(r==3) arr[i]=new General();
            else arr[i]=new Luggage();
        }
        for(Compartment c : arr)
            System.out.println(c.notice());
    }
}
