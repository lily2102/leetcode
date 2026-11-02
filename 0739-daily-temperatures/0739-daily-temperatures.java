class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int an[] = new int[tem.length];
        Arrays.fill(an,-1);
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<tem.length;i++){
        while(!s.isEmpty() && tem[i]>tem[s.peek()]){
         an[s.peek()] =i;
         s.pop();
        }
        s.push(i);
        }
        for(int i=0;i<an.length;i++){
            if(an[i]==-1) an[i]=0;
            else an[i]-=i;
        }
        return an;
    }
}