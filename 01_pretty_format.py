#Write a program (in any language of your choice) to pretty format a sentence.

paragraph = input('Enter a paragraph: ').lower()

formatted_paragraph = ''

sentences = list(paragraph.split('.'))  # dividing the paragraph into sentences

for sentence in sentences:
    new_sentence = ''
    words = list(sentence.split())  # dividing each sentence into words
    if words != []:
        new_sentence = ' '.join(words)
        formatted_paragraph += new_sentence.capitalize() + '. '

print("Formatted paragraph: ", formatted_paragraph)
