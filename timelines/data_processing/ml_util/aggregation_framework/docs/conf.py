# -*- cod ng: utf-8 -*-
#
# docb rd docu ntat on bu ld conf gurat on f le
# Note that not all poss ble conf gurat on values are present  n t 
# autogenerated f le.
#

from os.path  mport abspath, d rna ,  sf le, jo n


extens ons = [
  "sph nx.ext.autodoc",
  "sph nx.ext. ntersph nx",
  "sph nx.ext. fconf g",
  "sph nx.ext.graphv z",
  "tw ter.docb rd.ext.thr ftlexer",
  "tw ter.docb rd.ext.toctree_default_capt on",
  "sph nxcontr b.httpdoma n",
]


# Add any paths that conta n templates  re, relat ve to t  d rectory.
templates_path = ["_templates"]

# T  suff x of s ce f lena s.
s ce_suff x = ".rst"

# T  master toctree docu nt.
master_doc = " ndex"

# General  nformat on about t  project.
project = u"""Aggregat on Fra work"""
descr pt on = u""""""

# T  short X.Y vers on.
vers on = u"""1.0"""
# T  full vers on,  nclud ng alpha/beta/rc tags.
release = u"""1.0"""

exclude_patterns = ["_bu ld"]

pyg nts_style = "sph nx"

html_t   = "default"

html_stat c_path = ["_stat c"]

html_logo = u""""""

# Automag cally add project logo,  f   ex sts
# (c cks on any bu ld, not just  n )
# Scan for so  common defaults (png or svg format,
# called "logo" or project na ,  n docs folder)
 f not html_logo:
  locat on = d rna (abspath(__f le__))
  for logo_f le  n ["logo.png", "logo.svg", ("%s.png" % project), ("%s.svg" % project)]:
    html_logo = logo_f le  f  sf le(jo n(locat on, logo_f le)) else html_logo

graphv z_output_format = "svg"
