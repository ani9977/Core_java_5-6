import smtplib
import traceback


gmail_user = 'agrawalanant.908@gmail.com'
gmail_password = 'anbx tjbu qneq jytw'

sent_from = gmail_user
to = ['aniketsirota64@gmail.com', 'agrawalanant.908@gmail.com']
subject = 'This is my first Python Message'
body = 'Hi, What is going on'

try:
    server = smtplib.SMTP_SSL('smtp.gmail.com', 465)
    server.ehlo()
    server.login(gmail_user, gmail_password)
    server.sendmail(sent_from, to, body)
    server.close()
    print('Email sent!')

except:
    traceback.print_exc()