# pip3 install simpleaudio
import simpleaudio, math, struct
from itertools import chain, repeat
F  = 44100
S1 = '71♪,69,,71♪,66,,62♪,66,,59♪,,,'
S2 = '71♪,73,,74♪,73,,74,,71,,73♪,71,,73,,69,,71♪,69,,71,,67,,71♪,,,'
get_pause = lambda seconds: repeat(0, int(seconds * F))
sin_f     = lambda i, hz: math.sin(i * 2 * math.pi * hz / F)
get_wave  = lambda hz, seconds: (sin_f(i, hz) for i in range(int(seconds * F)))
get_hz    = lambda n: 8.176 * 2 ** (int(n) / 12)
parse_n   = lambda note: (get_hz(note[:2]), 0.25 if len(note) > 2 else 0.125)
get_note  = lambda note: get_wave(*parse_n(note)) if note else get_pause(0.125)
samples_f = chain.from_iterable(get_note(n) for n in f'{S1}{S1}{S2}'.split(','))
samples_b = b''.join(struct.pack('<h', int(a * 30000)) for a in samples_f)
simpleaudio.play_buffer(samples_b, 1, 2, F)
