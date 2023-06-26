import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        Person[] supoja = new Person[3];
        int[] type1 = {1, 2, 3, 4, 5};
        int[] type2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] type3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        supoja[0] = new Person(1, 0, type1);
        supoja[1] = new Person(2, 0, type2);
        supoja[2] = new Person(3, 0, type3);
        //점수세기
        for(int i=0; i<answers.length; i++){
            for(Person p: supoja){
                if(p.type[i%(p.type.length)]==answers[i]) p.score++;
            }
        }
        //DESC 정렬
        Arrays.sort(supoja, (p1, p2) -> {return p2.score-p1.score;});
        for(Person p: supoja) System.out.println(p.name+" "+p.score);
        //몇명인지 세기
        int ans = 0;
        int high = Integer.MIN_VALUE;
        for(Person p: supoja) if(p.score>=high) { ans++; high=p.score;}
        int[] answer= new int[ans];
        ans=0;
        for(Person p: supoja) if(p.score>=high) answer[ans++]=p.name;
        return answer;
    }
}

class Person{
    int name;
    int score;
    int[] type;
    
    Person(int name, int score, int[] type){
        this.name= name;
        this.score= score;
        this.type= type;
    }    
}