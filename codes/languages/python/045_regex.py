'''
    Resource: https://regexr.com
'''
import re # Regular Expression package

pattern = r'jo[a-z]*'
# Raw Strings: Literally take whatever you write, won't even parse escape sequence chars
text = '''
From they fine john he give of rich he. They age and draw mrs like. Improving end distrusts may instantly was household applauded incommode. Why kept very ever home mrs. Considered sympathize ten uncommonly occasional assistance sufficient not. Letter of on become he tended active enable to. Vicinity relation sensible sociable surprise screened no up as.

Do am he horrible distance marriage so although. Afraid assure square so happen mr an before. His many same been well can high that. Forfeited did law eagerness allowance improving assurance bed. Had saw put seven joy short first. Pronounce so enjoyment my resembled in forfeited sportsman. Which vexed did began son abode short may. Interested astonished he at cultivated or me. Nor brought one invited she produce her.

Is at purse tried jokes china ready decay an. Small its shy way had woody downs power. To denoting admitted speaking learning my exercise so in. Procured shutters mr it feelings. To or three offer house begin taken am at. As dissuade cheerful overcame so of friendly he indulged unpacked. Alteration connection to so as collecting me. Difficult in delivered extensive at direction allowance. Alteration put use diminution can considered sentiments interested discretion. An seeing feebly stairs am branch income me unable.
'''

# match = re.search(pattern, text) 
# if match:
#     print('pattern found!')
# else:
#     print('pattern NOT found ):')
'''
    Searches the "pattern" in text.
    Also, this stops at first match.
'''

matches = re.finditer(pattern, text)
for match in matches:
    # print(match)
    print(text[match.span()[0]:match.span()[1]])
