  def nextgreatertoright(self, nums1: List[int], nums2: List[int]) -> List[int]:
        if not a:
            return []
        res = [-1] * len(a)
        stack = []
        dic = {}
        for i in range(len(b)-1, -1, -1):
            while stack and stack[-1] < b[i]:
                stack.pop()
            if not stack:
                dic[b[i]] = -1
            else:
                dic[b[i]] = stack[-1]
            stack.append(b[i])
        for i in range(len(a)):
            res[i] = dic[a[i]]
        return res