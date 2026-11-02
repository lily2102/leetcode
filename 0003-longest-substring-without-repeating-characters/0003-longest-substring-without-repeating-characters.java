class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0,l=0;
        int len=s.length();
        int max=0;
       Map<Character,Integer> m = new HashMap<>();
        for(r=0;r<len;r++){
           char ch = s.charAt(r);
           m.put(ch,m.getOrDefault(ch,0)+1);
          while(m.get(ch)>1){
            m.put(s.charAt(l) , m.get(s.charAt(l))-1);
            if(m.get(s.charAt(l))==0) m.remove(s.charAt(l));
            l++;
          }
          max =Math.max(max,r-l+1);
        }
        return max;
    }
}