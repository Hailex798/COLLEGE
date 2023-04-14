def isValid(self, s: str) -> bool:
    list_1 = []
	paren = {')':'(', '}':'{', ']':'['}
	for symbol in s:
		if symbol in paren:
			if not stack or stack[-1] != ch_opp[ch]:
				return False
			stack.pop()
		else:
			stack.append(ch)
	return not stack