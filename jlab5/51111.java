			
			
			
			notChar = false;
			count = 0;
			space = sentence.indexOf(' ');
			
			for(i = 0; i<words.length(); i++)
			{
				c = words.charAt(i);
				if (c>= 'A' && c<='Z' || c>= 'a' && c<='z')
					{
						
						if(!notChar)
							{
								count++;
								System.out.println(count);
							}
					}