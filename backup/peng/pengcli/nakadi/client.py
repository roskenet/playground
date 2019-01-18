'''
Created on Nov 7, 2018

@author: froske
'''

from pyNakadi import NakadiClient, NakadiException

class MyNakadiClient():
    '''
    classdocs
    '''

    def __init__(self, token, url, event):
        '''
        Constructor
        '''
        self.token = token
        self.url = url
        self.event = event
        
    def doSomething(self):
        print('Executing MyNakadiClient!')
        print(self.token, self.url, self.event)
        self.get_subscription(self.token, self.url, self.event, 100)
        

    def get_subscription(self, token, host, subscription_id, limit):
        try:
            client = NakadiClient(token, host)
            return client.get_subscription_events_stream(subscription_id, batch_limit=limit, stream_limit=limit)
        except NakadiException as ex:
            #logger.exception(ex.msg, exc_info=ex)
            raise ex