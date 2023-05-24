#include<stdio.h>

int main()
{
    int n, i, j, temp;
    float wt = 0, tat = 0;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    int at[n], bt[n], ct[n], tat_time[n], wt_time[n];
    printf("Enter the Arrival Time and Burst Time of each process:\n");
    for(i = 0; i <; i++)
    {
        printf("Arrival Time of P%d: ", i+1);
        scanf("%d", &at[i]);
        printf("Burst Time of P%d: ", i+1);
        scanf("%d", &bt[i]);
    }
    // Sorting based on Arrival time
    for(i = 0; i <; i++)
    {
        for(j = i+1; j <; j++)
        {
            if(at[i] > at[j])
            {
                temp = at[i];
                at[i] = at[j];
                at[j] = temp;
                
                temp = bt[i];
                bt[i] = bt[j];
                bt[j] = temp;
            }
        }
    }
    // Calculation of Completion Time, Turn Around Time and Waiting Time
    for(i = 0; i < n; i++)
    {
        if(i == 0)
        {
            ct[i] = at[i] + bt[i];
        }
        else
        {
            if(at[i] > ct[i-1])
            {
                ct[i] = at[i] + bt[i];
            }
            else
            {
                ct[i] = ct[i-1] + bt[i];
            }
        }
        tat_time[i] = ct[i] - at[i];
        wt_time[i] = tat_time[i] - bt[i];
        wt += wt_time[i];
        tat += tat_time[i];
    }
    printf("\nProcess\tAT\tBT\tCT\tTAT\tWT\n");
    for(i = 0; i < n; i++)
    {
        printf("P%d\t%d\t%d\t%d\t%d\t%d\n", i+1, at[i], bt[i], ct[i], tat_time[i], wt_time[i]);
    }
    printf("\nAverage Waiting Time: %.2f\nAverage Turn Around Time: %.2f\n", (wt/n), (tat/n));
    return 0;
}
