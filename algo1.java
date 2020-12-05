public class algo1 {

    public int[] solution(int N, int[] A) {
    int[] result = new int[N];
    int maximum = 0;
    int resetLimit = 0;

    for (int K = 0; K < A.length; K++)
    {
        if (A[K] < 1 || A[K] > N + 1)
            System.out.println("invalid operation");
        if (A[K] >= 1 && A[K] <= N)
        {
            if (result[A[K] - 1] < resetLimit) {
                result[A[K] - 1] = resetLimit + 1;
            } else {
                result[A[K] - 1]++;
            }
            if (result[A[K] - 1] > maximum)
            {
                maximum = result[A[K] - 1];
            }
        }
        else
        {
            resetLimit = maximum;
        }
    }
    for (int i = 0; i < result.length; i++)
        result[i] = Math.max(resetLimit, result[i]);
    return result;
}
    public static void main(String[] args) {
        int[] b = { 3,4,4,6,1,4,4 };
        int[] a = new int[5];
     algo1 c= new algo1();
     a=c.solution(5, b);
     for(int i=0;i<5;i++)
     {System.out.println(a[i]);}
    }   
}
