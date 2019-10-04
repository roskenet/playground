FROM python:3.6-alpine

ARG src=actinium

WORKDIR /app
ENV PYTHONPATH=/app
ENV LOGGING_CONFIG=${PYTHONPATH}/logging.yaml

COPY Pipfile Pipfile.lock /app/

RUN python -m pip install pipenv \
  && apk add --no-cache yaml \
  && pipenv install --system --deploy

COPY logging.yaml ${LOGGING_CONFIG}
COPY ${src}/ ${PYTHONPATH}/${src}/

CMD ["python", "-m", "actinium"]
