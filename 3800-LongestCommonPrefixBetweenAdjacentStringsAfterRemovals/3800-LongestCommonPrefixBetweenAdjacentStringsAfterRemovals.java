// Last updated: 8/9/2025, 1:36:36 PM
class Solution {
    public int[] longestCommonPrefix(String[] words) {
        return answer(words);
    }
    public static int[] answer(String[] args){
        int n = args.length;
        if(n==1){
            return new int[]{0};
        }
        int[] a = pa(args);
        int[] x = pr(a);
        int[] y = sf(a);
        return res(args,a,x,y);
    }
    public static int[] pa(String[] w){
        int n = w.length;
        int[] z = new int[n-1];
        for(int i=0;i<n-1;i++){
            z[i] = cp(w[i],w[i+1]);
        }
        return z;
    }
    public static int[] pr(int[] a){
        int n = a.length;
        int[] p = new int[n];
        p[0] = a[0];
        for(int i=1;i<n;i++){
            p[i] = Math.max(p[i-1],a[i]);
        }
        return p;
    }
    public static int[] sf(int[] a){
        int n = a.length;
        int[] s = new int[n];
        s[n-1] = a[n-1];
        for(int i = n-2;i>=0;i--){
            s[i] = Math.max(s[i+1],a[i]);
        }
        return s;
    }
    public static int[] res(String[] w,int[] a,int[] p,int[] s){
        int n = w.length;
        int[] r = new int[n];
        for(int i=0;i<n;i++){
            if(n==2){
                r[i]=0;
                continue;
            }
            if(i==0){
                r[i] = s[1];
            }else if(i==n-1){
                r[i] = p[n-3];
            }else{
                int m = cp(w[i-1],w[i+1]);
                int l = (i>=2) ? p[i-2] :0;
                int rr = (i+1 <= n-2) ? s[i+1] :0;
                r[i] = Math.max(m,Math.max(l,rr));
            }
        }
        return r;
    }
    public static int cp(String a,String b){
        int len = Math.min(a.length(),b.length());
        for(int i=0;i<len;i++){
            if(a.charAt(i) != b.charAt(i)){
                return i;
            }
        }
        return len;
    }
    
}







