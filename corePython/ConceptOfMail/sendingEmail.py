import smtplib
connection = smtplib.SMTP('smtp.gmail.com',587)
connection.ehlo()
connection.starttls()
connection.login('agrawalanant.908@gmail.com','anbx tjbu qneq jytw')
connection.sendmail('agrawalanant.908@gmail.com','aniketsirota64@gmail.com','subject: this is the subject \n\n hello user')
print("Email sent")
connection.quit()