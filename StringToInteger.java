public class StringToInteger {

	public int atoi(String str) {
        
		if (str == null || str.equals("")) {
			return 0;
		}
		
		str = str.trim();
		
		if (str.equals("")) {
			return 0;
		}
		
		char[] chars = str.toCharArray();
		boolean isPositive = true;
		boolean hasSymbol = false;
		
		if (chars[0] == '-') {
			isPositive = false;
			hasSymbol = true;
		} else if (chars[0] == '+') {
			hasSymbol = true;
		} else if (!Character.isDigit(chars[0])) {
			return 0;
		}
		
		for (int i = 1; i < chars.length; i++) {
			if (!Character.isDigit(chars[i])) {
				return 0;
			}
		}
		Integer  result = 0;
		try {
			result = Integer.valueOf(str.substring(hasSymbol ? 1 : 0));
		} catch (Exception e) {
			return 0;
		}
		
		if (hasSymbol) {
			if (!isPositive) {
				return -result;
			}
		}
		
		return result;
    }
