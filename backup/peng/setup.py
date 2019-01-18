from setuptools import setup

setup(
    name='peng',
    version='0.0.4',
    packages=['pengcli'],
    install_requires=[
        'Click',
        'pyNakadi'],
    entry_points='''
        [console_scripts]
        peng=pengcli.peng:cli
        '''
)