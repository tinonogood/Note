# WIN10

https://gist.github.com/raelgc/6031306

##  hMailServer

### 1. Install

### 2. Create a domain

Open hMailServer Administrator program

Domains > add domain

At "domain name": localhost.com (as a fake domain)

Add the domain (localhost.com) to hosts file: C:\windows\system32\drivers\etc\hosts

### 3. Change server name

Expand Settings > Protocols > SMTP -> Delivery of e-mail

Host name: localhost

TCP Port (25)

### 4. Create an account

created domain > accounts > add account

address:  account name; password

Administration level > Server

### 5. "catch-all" address

Domains >  Advanced tab > catch-all address: account previous created  

## Thunderbird

Install > Account setup (usr/pwd; In/outgoing server hostname)

|   |   | Server host  | Port  | SSL  | Auth |
|---|---|---|---|---|---|
| Incoming  |  IMAP | localhost | ... |  ...  |  ... |
| Outgoing  |  SMTP |  localhost | ...  |  ... |  ... |
