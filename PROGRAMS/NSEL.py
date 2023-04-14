    def NextSmallerLeft(self, n, a):
        l=[]
        s=[]
        for i in range(0,len(a)):
            while(len(s)!=0 and s[len(s)-1]>=a[i]):
                s.pop()
            if(len(s)==0):
                l.append(-1)
            else:
                l.append(s[len(s)-1])
            s.append(a[i])
        return l