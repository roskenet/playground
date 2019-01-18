import click

@click.command()
@click.option('--token', hide_input=True, envvar='TOKEN', type=click.STRING)
@click.option('--api-token', envvar='LX_API_TOKEN', prompt=True, hide_input=True,
              help='A valid LeanIX API token. '
                   'See http://dev.leanix.net/v4.0/docs/authentication#section-generate-api-tokens')
@click.option('--mtm-base-url', envvar='LX_MTM_BASE_URL',
              default='https://zalando.leanix.net/services/mtm/v1')
@click.option('--api-base-url', envvar='LX_API_BASE_URL',
              default='https://zalando.leanix.net/services/pathfinder/v1')
def cli(token, api_token, mtm_base_url, api_base_url):
    print('Hallo Welt!' 
          'token: ' + token)