//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner userInput=new Scanner(System.in);
    ArrayList<Integer> randomNums=generateRandomNums(100);
    System.out.println("Hello, write down a num, what do you want to find out:");
    int usersNum=userInput.nextInt();
    for(int i=0;i<randomNums.size();i++){
        System.out.println("index - "+i+") - "+randomNums.get(i));
    }
    findUsersNum(usersNum,randomNums);

}
    ArrayList<Integer> generateRandomNums(int count){
        ArrayList<Integer> rndNums=new ArrayList<>();
        for(int i=0;i<count;i++){
            rndNums.add((int)Math.round(Math.random()*100));
            //rndNums.add(ThreadLocalRandom.current().nextInt(0,101));
        }
        return rndNums;
    }
    void findUsersNum(int x,ArrayList<Integer> rndNms){
    int positionOfWartownik=rndNms.size();
    int indexOfX=rndNms.indexOf(x);
        if (indexOfX == positionOfWartownik){
            System.out.println("Number wasn't in the original list");
        } else {
            System.out.println("Found at index: " + indexOfX);
        }

    }
