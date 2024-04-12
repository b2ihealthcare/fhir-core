package org.hl7.fhir.r4.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.

  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
 * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.

 */

// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.r4.model.Enumerations.FHIRVersion;
import org.hl7.fhir.r4.model.Enumerations.FHIRVersionEnumFactory;
import org.hl7.fhir.r4.model.Enumerations.PublicationStatus;
import org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory;
import org.hl7.fhir.utilities.Utilities;

import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;

/**
 * A set of rules of how a particular interoperability or standards problem is
 * solved - typically through the use of FHIR resources. This resource is used
 * to gather all the parts of an implementation guide into a logical whole and
 * to publish a computable definition of all the parts.
 */
@ResourceDef(name = "ImplementationGuide", profile = "http://hl7.org/fhir/StructureDefinition/ImplementationGuide")
@ChildOrder(names = { "url", "version", "name", "title", "status", "experimental", "date", "publisher", "contact",
    "description", "useContext", "jurisdiction", "copyright", "packageId", "license", "fhirVersion", "dependsOn",
    "global", "definition", "manifest" })
public class ImplementationGuide extends MetadataResource {

  public enum SPDXLicense {
    /**
     * BSD Zero Clause License
     */
    _0BSD,
    /**
     * Attribution Assurance License
     */
    AAL,
    /**
     * Abstyles License
     */
    ABSTYLES,
    /**
     * AdaCore Doc License
     */
    ADACORE_DOC,
    /**
     * Adobe Systems Incorporated Source Code License Agreement
     */
    ADOBE_2006,
    /**
     * Adobe Glyph List License
     */
    ADOBE_GLYPH,
    /**
     * Amazon Digital Services License
     */
    ADSL,
    /**
     * Academic Free License v1.1
     */
    AFL_1_1,
    /**
     * Academic Free License v1.2
     */
    AFL_1_2,
    /**
     * Academic Free License v2.0
     */
    AFL_2_0,
    /**
     * Academic Free License v2.1
     */
    AFL_2_1,
    /**
     * Academic Free License v3.0
     */
    AFL_3_0,
    /**
     * Afmparse License
     */
    AFMPARSE,
    /**
     * Affero General Public License v1.0
     */
    AGPL_1_0,
    /**
     * Affero General Public License v1.0 only
     */
    AGPL_1_0_ONLY,
    /**
     * Affero General Public License v1.0 or later
     */
    AGPL_1_0_OR_LATER,
    /**
     * GNU Affero General Public License v3.0
     */
    AGPL_3_0,
    /**
     * GNU Affero General Public License v3.0 only
     */
    AGPL_3_0_ONLY,
    /**
     * GNU Affero General Public License v3.0 or later
     */
    AGPL_3_0_OR_LATER,
    /**
     * Aladdin Free Public License
     */
    ALADDIN,
    /**
     * AMD's plpa_map.c License
     */
    AMDPLPA,
    /**
     * Apple MIT License
     */
    AML,
    /**
     * Academy of Motion Picture Arts and Sciences BSD
     */
    AMPAS,
    /**
     * ANTLR Software Rights Notice
     */
    ANTLR_PD,
    /**
     * ANTLR Software Rights Notice with license fallback
     */
    ANTLR_PD_FALLBACK,
    /**
     * Apache License 1.0
     */
    APACHE_1_0,
    /**
     * Apache License 1.1
     */
    APACHE_1_1,
    /**
     * Apache License 2.0
     */
    APACHE_2_0,
    /**
     * Adobe Postscript AFM License
     */
    APAFML,
    /**
     * Adaptive Public License 1.0
     */
    APL_1_0,
    /**
     * App::s2p License
     */
    APP_S2P,
    /**
     * Apple Public Source License 1.0
     */
    APSL_1_0,
    /**
     * Apple Public Source License 1.1
     */
    APSL_1_1,
    /**
     * Apple Public Source License 1.2
     */
    APSL_1_2,
    /**
     * Apple Public Source License 2.0
     */
    APSL_2_0,
    /**
     * Arphic Public License
     */
    ARPHIC_1999,
    /**
     * Artistic License 1.0
     */
    ARTISTIC_1_0,
    /**
     * Artistic License 1.0 w/clause 8
     */
    ARTISTIC_1_0_CL8,
    /**
     * Artistic License 1.0 (Perl)
     */
    ARTISTIC_1_0_PERL,
    /**
     * Artistic License 2.0
     */
    ARTISTIC_2_0,
    /**
     * ASWF Digital Assets License version 1.0
     */
    ASWF_DIGITAL_ASSETS_1_0,
    /**
     * ASWF Digital Assets License 1.1
     */
    ASWF_DIGITAL_ASSETS_1_1,
    /**
     * Baekmuk License
     */
    BAEKMUK,
    /**
     * Bahyph License
     */
    BAHYPH,
    /**
     * Barr License
     */
    BARR,
    /**
     * Beerware License
     */
    BEERWARE,
    /**
     * Bitstream Charter Font License
     */
    BITSTREAM_CHARTER,
    /**
     * Bitstream Vera Font License
     */
    BITSTREAM_VERA,
    /**
     * BitTorrent Open Source License v1.0
     */
    BITTORRENT_1_0,
    /**
     * BitTorrent Open Source License v1.1
     */
    BITTORRENT_1_1,
    /**
     * SQLite Blessing
     */
    BLESSING,
    /**
     * Blue Oak Model License 1.0.0
     */
    BLUEOAK_1_0_0,
    /**
     * Boehm-Demers-Weiser GC License
     */
    BOEHM_GC,
    /**
     * Borceux license
     */
    BORCEUX,
    /**
     * Brian Gladman 3-Clause License
     */
    BRIAN_GLADMAN_3_CLAUSE,
    /**
     * BSD 1-Clause License
     */
    BSD_1_CLAUSE,
    /**
     * BSD 2-Clause "Simplified" License
     */
    BSD_2_CLAUSE,
    /**
     * BSD 2-Clause FreeBSD License
     */
    BSD_2_CLAUSE_FREEBSD,
    /**
     * BSD 2-Clause NetBSD License
     */
    BSD_2_CLAUSE_NETBSD,
    /**
     * BSD-2-Clause Plus Patent License
     */
    BSD_2_CLAUSE_PATENT,
    /**
     * BSD 2-Clause with views sentence
     */
    BSD_2_CLAUSE_VIEWS,
    /**
     * BSD 3-Clause "New" or "Revised" License
     */
    BSD_3_CLAUSE,
    /**
     * BSD with attribution
     */
    BSD_3_CLAUSE_ATTRIBUTION,
    /**
     * BSD 3-Clause Clear License
     */
    BSD_3_CLAUSE_CLEAR,
    /**
     * Lawrence Berkeley National Labs BSD variant license
     */
    BSD_3_CLAUSE_LBNL,
    /**
     * BSD 3-Clause Modification
     */
    BSD_3_CLAUSE_MODIFICATION,
    /**
     * BSD 3-Clause No Military License
     */
    BSD_3_CLAUSE_NO_MILITARY_LICENSE,
    /**
     * BSD 3-Clause No Nuclear License
     */
    BSD_3_CLAUSE_NO_NUCLEAR_LICENSE,
    /**
     * BSD 3-Clause No Nuclear License 2014
     */
    BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014,
    /**
     * BSD 3-Clause No Nuclear Warranty
     */
    BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY,
    /**
     * BSD 3-Clause Open MPI variant
     */
    BSD_3_CLAUSE_OPEN_MPI,
    /**
     * BSD 4-Clause "Original" or "Old" License
     */
    BSD_4_CLAUSE,
    /**
     * BSD 4 Clause Shortened
     */
    BSD_4_CLAUSE_SHORTENED,
    /**
     * BSD-4-Clause (University of California-Specific)
     */
    BSD_4_CLAUSE_UC,
    /**
     * BSD 4.3 RENO License
     */
    BSD_4_3RENO,
    /**
     * BSD 4.3 TAHOE License
     */
    BSD_4_3TAHOE,
    /**
     * BSD Advertising Acknowledgement License
     */
    BSD_ADVERTISING_ACKNOWLEDGEMENT,
    /**
     * BSD with Attribution and HPND disclaimer
     */
    BSD_ATTRIBUTION_HPND_DISCLAIMER,
    /**
     * BSD Protection License
     */
    BSD_PROTECTION,
    /**
     * BSD Source Code Attribution
     */
    BSD_SOURCE_CODE,
    /**
     * Boost Software License 1.0
     */
    BSL_1_0,
    /**
     * Business Source License 1.1
     */
    BUSL_1_1,
    /**
     * bzip2 and libbzip2 License v1.0.5
     */
    BZIP2_1_0_5,
    /**
     * bzip2 and libbzip2 License v1.0.6
     */
    BZIP2_1_0_6,
    /**
     * Computational Use of Data Agreement v1.0
     */
    C_UDA_1_0,
    /**
     * Cryptographic Autonomy License 1.0
     */
    CAL_1_0,
    /**
     * Cryptographic Autonomy License 1.0 (Combined Work Exception)
     */
    CAL_1_0_COMBINED_WORK_EXCEPTION,
    /**
     * Caldera License
     */
    CALDERA,
    /**
     * Computer Associates Trusted Open Source License 1.1
     */
    CATOSL_1_1,
    /**
     * Creative Commons Attribution 1.0 Generic
     */
    CC_BY_1_0,
    /**
     * Creative Commons Attribution 2.0 Generic
     */
    CC_BY_2_0,
    /**
     * Creative Commons Attribution 2.5 Generic
     */
    CC_BY_2_5,
    /**
     * Creative Commons Attribution 2.5 Australia
     */
    CC_BY_2_5_AU,
    /**
     * Creative Commons Attribution 3.0 Unported
     */
    CC_BY_3_0,
    /**
     * Creative Commons Attribution 3.0 Austria
     */
    CC_BY_3_0_AT,
    /**
     * Creative Commons Attribution 3.0 Germany
     */
    CC_BY_3_0_DE,
    /**
     * Creative Commons Attribution 3.0 IGO
     */
    CC_BY_3_0_IGO,
    /**
     * Creative Commons Attribution 3.0 Netherlands
     */
    CC_BY_3_0_NL,
    /**
     * Creative Commons Attribution 3.0 United States
     */
    CC_BY_3_0_US,
    /**
     * Creative Commons Attribution 4.0 International
     */
    CC_BY_4_0,
    /**
     * Creative Commons Attribution Non Commercial 1.0 Generic
     */
    CC_BY_NC_1_0,
    /**
     * Creative Commons Attribution Non Commercial 2.0 Generic
     */
    CC_BY_NC_2_0,
    /**
     * Creative Commons Attribution Non Commercial 2.5 Generic
     */
    CC_BY_NC_2_5,
    /**
     * Creative Commons Attribution Non Commercial 3.0 Unported
     */
    CC_BY_NC_3_0,
    /**
     * Creative Commons Attribution Non Commercial 3.0 Germany
     */
    CC_BY_NC_3_0_DE,
    /**
     * Creative Commons Attribution Non Commercial 4.0 International
     */
    CC_BY_NC_4_0,
    /**
     * Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic
     */
    CC_BY_NC_ND_1_0,
    /**
     * Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic
     */
    CC_BY_NC_ND_2_0,
    /**
     * Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic
     */
    CC_BY_NC_ND_2_5,
    /**
     * Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported
     */
    CC_BY_NC_ND_3_0,
    /**
     * Creative Commons Attribution Non Commercial No Derivatives 3.0 Germany
     */
    CC_BY_NC_ND_3_0_DE,
    /**
     * Creative Commons Attribution Non Commercial No Derivatives 3.0 IGO
     */
    CC_BY_NC_ND_3_0_IGO,
    /**
     * Creative Commons Attribution Non Commercial No Derivatives 4.0 International
     */
    CC_BY_NC_ND_4_0,
    /**
     * Creative Commons Attribution Non Commercial Share Alike 1.0 Generic
     */
    CC_BY_NC_SA_1_0,
    /**
     * Creative Commons Attribution Non Commercial Share Alike 2.0 Generic
     */
    CC_BY_NC_SA_2_0,
    /**
     * Creative Commons Attribution Non Commercial Share Alike 2.0 Germany
     */
    CC_BY_NC_SA_2_0_DE,
    /**
     * Creative Commons Attribution-NonCommercial-ShareAlike 2.0 France
     */
    CC_BY_NC_SA_2_0_FR,
    /**
     * Creative Commons Attribution Non Commercial Share Alike 2.0 England and Wales
     */
    CC_BY_NC_SA_2_0_UK,
    /**
     * Creative Commons Attribution Non Commercial Share Alike 2.5 Generic
     */
    CC_BY_NC_SA_2_5,
    /**
     * Creative Commons Attribution Non Commercial Share Alike 3.0 Unported
     */
    CC_BY_NC_SA_3_0,
    /**
     * Creative Commons Attribution Non Commercial Share Alike 3.0 Germany
     */
    CC_BY_NC_SA_3_0_DE,
    /**
     * Creative Commons Attribution Non Commercial Share Alike 3.0 IGO
     */
    CC_BY_NC_SA_3_0_IGO,
    /**
     * Creative Commons Attribution Non Commercial Share Alike 4.0 International
     */
    CC_BY_NC_SA_4_0,
    /**
     * Creative Commons Attribution No Derivatives 1.0 Generic
     */
    CC_BY_ND_1_0,
    /**
     * Creative Commons Attribution No Derivatives 2.0 Generic
     */
    CC_BY_ND_2_0,
    /**
     * Creative Commons Attribution No Derivatives 2.5 Generic
     */
    CC_BY_ND_2_5,
    /**
     * Creative Commons Attribution No Derivatives 3.0 Unported
     */
    CC_BY_ND_3_0,
    /**
     * Creative Commons Attribution No Derivatives 3.0 Germany
     */
    CC_BY_ND_3_0_DE,
    /**
     * Creative Commons Attribution No Derivatives 4.0 International
     */
    CC_BY_ND_4_0,
    /**
     * Creative Commons Attribution Share Alike 1.0 Generic
     */
    CC_BY_SA_1_0,
    /**
     * Creative Commons Attribution Share Alike 2.0 Generic
     */
    CC_BY_SA_2_0,
    /**
     * Creative Commons Attribution Share Alike 2.0 England and Wales
     */
    CC_BY_SA_2_0_UK,
    /**
     * Creative Commons Attribution Share Alike 2.1 Japan
     */
    CC_BY_SA_2_1_JP,
    /**
     * Creative Commons Attribution Share Alike 2.5 Generic
     */
    CC_BY_SA_2_5,
    /**
     * Creative Commons Attribution Share Alike 3.0 Unported
     */
    CC_BY_SA_3_0,
    /**
     * Creative Commons Attribution Share Alike 3.0 Austria
     */
    CC_BY_SA_3_0_AT,
    /**
     * Creative Commons Attribution Share Alike 3.0 Germany
     */
    CC_BY_SA_3_0_DE,
    /**
     * Creative Commons Attribution-ShareAlike 3.0 IGO
     */
    CC_BY_SA_3_0_IGO,
    /**
     * Creative Commons Attribution Share Alike 4.0 International
     */
    CC_BY_SA_4_0,
    /**
     * Creative Commons Public Domain Dedication and Certification
     */
    CC_PDDC,
    /**
     * Creative Commons Zero v1.0 Universal
     */
    CC0_1_0,
    /**
     * Common Development and Distribution License 1.0
     */
    CDDL_1_0,
    /**
     * Common Development and Distribution License 1.1
     */
    CDDL_1_1,
    /**
     * Common Documentation License 1.0
     */
    CDL_1_0,
    /**
     * Community Data License Agreement Permissive 1.0
     */
    CDLA_PERMISSIVE_1_0,
    /**
     * Community Data License Agreement Permissive 2.0
     */
    CDLA_PERMISSIVE_2_0,
    /**
     * Community Data License Agreement Sharing 1.0
     */
    CDLA_SHARING_1_0,
    /**
     * CeCILL Free Software License Agreement v1.0
     */
    CECILL_1_0,
    /**
     * CeCILL Free Software License Agreement v1.1
     */
    CECILL_1_1,
    /**
     * CeCILL Free Software License Agreement v2.0
     */
    CECILL_2_0,
    /**
     * CeCILL Free Software License Agreement v2.1
     */
    CECILL_2_1,
    /**
     * CeCILL-B Free Software License Agreement
     */
    CECILL_B,
    /**
     * CeCILL-C Free Software License Agreement
     */
    CECILL_C,
    /**
     * CERN Open Hardware Licence v1.1
     */
    CERN_OHL_1_1,
    /**
     * CERN Open Hardware Licence v1.2
     */
    CERN_OHL_1_2,
    /**
     * CERN Open Hardware Licence Version 2 - Permissive
     */
    CERN_OHL_P_2_0,
    /**
     * CERN Open Hardware Licence Version 2 - Strongly Reciprocal
     */
    CERN_OHL_S_2_0,
    /**
     * CERN Open Hardware Licence Version 2 - Weakly Reciprocal
     */
    CERN_OHL_W_2_0,
    /**
     * CFITSIO License
     */
    CFITSIO,
    /**
     * Checkmk License
     */
    CHECKMK,
    /**
     * Clarified Artistic License
     */
    CLARTISTIC,
    /**
     * Clips License
     */
    CLIPS,
    /**
     * CMU Mach License
     */
    CMU_MACH,
    /**
     * CNRI Jython License
     */
    CNRI_JYTHON,
    /**
     * CNRI Python License
     */
    CNRI_PYTHON,
    /**
     * CNRI Python Open Source GPL Compatible License Agreement
     */
    CNRI_PYTHON_GPL_COMPATIBLE,
    /**
     * Copyfree Open Innovation License
     */
    COIL_1_0,
    /**
     * Community Specification License 1.0
     */
    COMMUNITY_SPEC_1_0,
    /**
     * Condor Public License v1.1
     */
    CONDOR_1_1,
    /**
     * copyleft-next 0.3.0
     */
    COPYLEFT_NEXT_0_3_0,
    /**
     * copyleft-next 0.3.1
     */
    COPYLEFT_NEXT_0_3_1,
    /**
     * Cornell Lossless JPEG License
     */
    CORNELL_LOSSLESS_JPEG,
    /**
     * Common Public Attribution License 1.0
     */
    CPAL_1_0,
    /**
     * Common Public License 1.0
     */
    CPL_1_0,
    /**
     * Code Project Open License 1.02
     */
    CPOL_1_02,
    /**
     * Crossword License
     */
    CROSSWORD,
    /**
     * CrystalStacker License
     */
    CRYSTALSTACKER,
    /**
     * CUA Office Public License v1.0
     */
    CUA_OPL_1_0,
    /**
     * Cube License
     */
    CUBE,
    /**
     * curl License
     */
    CURL,
    /**
     * Deutsche Freie Software Lizenz
     */
    D_FSL_1_0,
    /**
     * diffmark license
     */
    DIFFMARK,
    /**
     * Data licence Germany – attribution – version 2.0
     */
    DL_DE_BY_2_0,
    /**
     * DOC License
     */
    DOC,
    /**
     * Dotseqn License
     */
    DOTSEQN,
    /**
     * Detection Rule License 1.0
     */
    DRL_1_0,
    /**
     * DSDP License
     */
    DSDP,
    /**
     * David M. Gay dtoa License
     */
    DTOA,
    /**
     * dvipdfm License
     */
    DVIPDFM,
    /**
     * Educational Community License v1.0
     */
    ECL_1_0,
    /**
     * Educational Community License v2.0
     */
    ECL_2_0,
    /**
     * eCos license version 2.0
     */
    ECOS_2_0,
    /**
     * Eiffel Forum License v1.0
     */
    EFL_1_0,
    /**
     * Eiffel Forum License v2.0
     */
    EFL_2_0,
    /**
     * eGenix.com Public License 1.1.0
     */
    EGENIX,
    /**
     * Elastic License 2.0
     */
    ELASTIC_2_0,
    /**
     * Entessa Public License v1.0
     */
    ENTESSA,
    /**
     * EPICS Open License
     */
    EPICS,
    /**
     * Eclipse Public License 1.0
     */
    EPL_1_0,
    /**
     * Eclipse Public License 2.0
     */
    EPL_2_0,
    /**
     * Erlang Public License v1.1
     */
    ERLPL_1_1,
    /**
     * Etalab Open License 2.0
     */
    ETALAB_2_0,
    /**
     * EU DataGrid Software License
     */
    EUDATAGRID,
    /**
     * European Union Public License 1.0
     */
    EUPL_1_0,
    /**
     * European Union Public License 1.1
     */
    EUPL_1_1,
    /**
     * European Union Public License 1.2
     */
    EUPL_1_2,
    /**
     * Eurosym License
     */
    EUROSYM,
    /**
     * Fair License
     */
    FAIR,
    /**
     * Fraunhofer FDK AAC Codec Library
     */
    FDK_AAC,
    /**
     * Frameworx Open License 1.0
     */
    FRAMEWORX_1_0,
    /**
     * FreeBSD Documentation License
     */
    FREEBSD_DOC,
    /**
     * FreeImage Public License v1.0
     */
    FREEIMAGE,
    /**
     * FSF All Permissive License
     */
    FSFAP,
    /**
     * FSF Unlimited License
     */
    FSFUL,
    /**
     * FSF Unlimited License (with License Retention)
     */
    FSFULLR,
    /**
     * FSF Unlimited License (With License Retention and Warranty Disclaimer)
     */
    FSFULLRWD,
    /**
     * Freetype Project License
     */
    FTL,
    /**
     * GD License
     */
    GD,
    /**
     * GNU Free Documentation License v1.1
     */
    GFDL_1_1,
    /**
     * GNU Free Documentation License v1.1 only - invariants
     */
    GFDL_1_1_INVARIANTS_ONLY,
    /**
     * GNU Free Documentation License v1.1 or later - invariants
     */
    GFDL_1_1_INVARIANTS_OR_LATER,
    /**
     * GNU Free Documentation License v1.1 only - no invariants
     */
    GFDL_1_1_NO_INVARIANTS_ONLY,
    /**
     * GNU Free Documentation License v1.1 or later - no invariants
     */
    GFDL_1_1_NO_INVARIANTS_OR_LATER,
    /**
     * GNU Free Documentation License v1.1 only
     */
    GFDL_1_1_ONLY,
    /**
     * GNU Free Documentation License v1.1 or later
     */
    GFDL_1_1_OR_LATER,
    /**
     * GNU Free Documentation License v1.2
     */
    GFDL_1_2,
    /**
     * GNU Free Documentation License v1.2 only - invariants
     */
    GFDL_1_2_INVARIANTS_ONLY,
    /**
     * GNU Free Documentation License v1.2 or later - invariants
     */
    GFDL_1_2_INVARIANTS_OR_LATER,
    /**
     * GNU Free Documentation License v1.2 only - no invariants
     */
    GFDL_1_2_NO_INVARIANTS_ONLY,
    /**
     * GNU Free Documentation License v1.2 or later - no invariants
     */
    GFDL_1_2_NO_INVARIANTS_OR_LATER,
    /**
     * GNU Free Documentation License v1.2 only
     */
    GFDL_1_2_ONLY,
    /**
     * GNU Free Documentation License v1.2 or later
     */
    GFDL_1_2_OR_LATER,
    /**
     * GNU Free Documentation License v1.3
     */
    GFDL_1_3,
    /**
     * GNU Free Documentation License v1.3 only - invariants
     */
    GFDL_1_3_INVARIANTS_ONLY,
    /**
     * GNU Free Documentation License v1.3 or later - invariants
     */
    GFDL_1_3_INVARIANTS_OR_LATER,
    /**
     * GNU Free Documentation License v1.3 only - no invariants
     */
    GFDL_1_3_NO_INVARIANTS_ONLY,
    /**
     * GNU Free Documentation License v1.3 or later - no invariants
     */
    GFDL_1_3_NO_INVARIANTS_OR_LATER,
    /**
     * GNU Free Documentation License v1.3 only
     */
    GFDL_1_3_ONLY,
    /**
     * GNU Free Documentation License v1.3 or later
     */
    GFDL_1_3_OR_LATER,
    /**
     * Giftware License
     */
    GIFTWARE,
    /**
     * GL2PS License
     */
    GL2PS,
    /**
     * 3dfx Glide License
     */
    GLIDE,
    /**
     * Glulxe License
     */
    GLULXE,
    /**
     * Good Luck With That Public License
     */
    GLWTPL,
    /**
     * gnuplot License
     */
    GNUPLOT,
    /**
     * GNU General Public License v1.0 only
     */
    GPL_1_0,
    /**
     * GNU General Public License v1.0 or later
     */
    GPL_1_0PLUS,
    /**
     * GNU General Public License v1.0 only
     */
    GPL_1_0_ONLY,
    /**
     * GNU General Public License v1.0 or later
     */
    GPL_1_0_OR_LATER,
    /**
     * GNU General Public License v2.0 only
     */
    GPL_2_0,
    /**
     * GNU General Public License v2.0 or later
     */
    GPL_2_0PLUS,
    /**
     * GNU General Public License v2.0 only
     */
    GPL_2_0_ONLY,
    /**
     * GNU General Public License v2.0 or later
     */
    GPL_2_0_OR_LATER,
    /**
     * GNU General Public License v2.0 w/Autoconf exception
     */
    GPL_2_0_WITH_AUTOCONF_EXCEPTION,
    /**
     * GNU General Public License v2.0 w/Bison exception
     */
    GPL_2_0_WITH_BISON_EXCEPTION,
    /**
     * GNU General Public License v2.0 w/Classpath exception
     */
    GPL_2_0_WITH_CLASSPATH_EXCEPTION,
    /**
     * GNU General Public License v2.0 w/Font exception
     */
    GPL_2_0_WITH_FONT_EXCEPTION,
    /**
     * GNU General Public License v2.0 w/GCC Runtime Library exception
     */
    GPL_2_0_WITH_GCC_EXCEPTION,
    /**
     * GNU General Public License v3.0 only
     */
    GPL_3_0,
    /**
     * GNU General Public License v3.0 or later
     */
    GPL_3_0PLUS,
    /**
     * GNU General Public License v3.0 only
     */
    GPL_3_0_ONLY,
    /**
     * GNU General Public License v3.0 or later
     */
    GPL_3_0_OR_LATER,
    /**
     * GNU General Public License v3.0 w/Autoconf exception
     */
    GPL_3_0_WITH_AUTOCONF_EXCEPTION,
    /**
     * GNU General Public License v3.0 w/GCC Runtime Library exception
     */
    GPL_3_0_WITH_GCC_EXCEPTION,
    /**
     * Graphics Gems License
     */
    GRAPHICS_GEMS,
    /**
     * gSOAP Public License v1.3b
     */
    GSOAP_1_3B,
    /**
     * Haskell Language Report License
     */
    HASKELLREPORT,
    /**
     * Hippocratic License 2.1
     */
    HIPPOCRATIC_2_1,
    /**
     * Hewlett-Packard 1986 License
     */
    HP_1986,
    /**
     * Historical Permission Notice and Disclaimer
     */
    HPND,
    /**
     * HPND with US Government export control warning
     */
    HPND_EXPORT_US,
    /**
     * Historical Permission Notice and Disclaimer - Markus Kuhn variant
     */
    HPND_MARKUS_KUHN,
    /**
     * Historical Permission Notice and Disclaimer - sell variant
     */
    HPND_SELL_VARIANT,
    /**
     * HPND sell variant with MIT disclaimer
     */
    HPND_SELL_VARIANT_MIT_DISCLAIMER,
    /**
     * HTML Tidy License
     */
    HTMLTIDY,
    /**
     * IBM PowerPC Initialization and Boot Software
     */
    IBM_PIBS,
    /**
     * ICU License
     */
    ICU,
    /**
     * IEC Code Components End-user licence agreement
     */
    IEC_CODE_COMPONENTS_EULA,
    /**
     * Independent JPEG Group License
     */
    IJG,
    /**
     * Independent JPEG Group License - short
     */
    IJG_SHORT,
    /**
     * ImageMagick License
     */
    IMAGEMAGICK,
    /**
     * iMatix Standard Function Library Agreement
     */
    IMATIX,
    /**
     * Imlib2 License
     */
    IMLIB2,
    /**
     * Info-ZIP License
     */
    INFO_ZIP,
    /**
     * Inner Net License v2.0
     */
    INNER_NET_2_0,
    /**
     * Intel Open Source License
     */
    INTEL,
    /**
     * Intel ACPI Software License Agreement
     */
    INTEL_ACPI,
    /**
     * Interbase Public License v1.0
     */
    INTERBASE_1_0,
    /**
     * IPA Font License
     */
    IPA,
    /**
     * IBM Public License v1.0
     */
    IPL_1_0,
    /**
     * ISC License
     */
    ISC,
    /**
     * Jam License
     */
    JAM,
    /**
     * JasPer License
     */
    JASPER_2_0,
    /**
     * JPL Image Use Policy
     */
    JPL_IMAGE,
    /**
     * Japan Network Information Center License
     */
    JPNIC,
    /**
     * JSON License
     */
    JSON,
    /**
     * Kazlib License
     */
    KAZLIB,
    /**
     * Knuth CTAN License
     */
    KNUTH_CTAN,
    /**
     * Licence Art Libre 1.2
     */
    LAL_1_2,
    /**
     * Licence Art Libre 1.3
     */
    LAL_1_3,
    /**
     * Latex2e License
     */
    LATEX2E,
    /**
     * Latex2e with translated notice permission
     */
    LATEX2E_TRANSLATED_NOTICE,
    /**
     * Leptonica License
     */
    LEPTONICA,
    /**
     * GNU Library General Public License v2 only
     */
    LGPL_2_0,
    /**
     * GNU Library General Public License v2 or later
     */
    LGPL_2_0PLUS,
    /**
     * GNU Library General Public License v2 only
     */
    LGPL_2_0_ONLY,
    /**
     * GNU Library General Public License v2 or later
     */
    LGPL_2_0_OR_LATER,
    /**
     * GNU Lesser General Public License v2.1 only
     */
    LGPL_2_1,
    /**
     * GNU Lesser General Public License v2.1 or later
     */
    LGPL_2_1PLUS,
    /**
     * GNU Lesser General Public License v2.1 only
     */
    LGPL_2_1_ONLY,
    /**
     * GNU Lesser General Public License v2.1 or later
     */
    LGPL_2_1_OR_LATER,
    /**
     * GNU Lesser General Public License v3.0 only
     */
    LGPL_3_0,
    /**
     * GNU Lesser General Public License v3.0 or later
     */
    LGPL_3_0PLUS,
    /**
     * GNU Lesser General Public License v3.0 only
     */
    LGPL_3_0_ONLY,
    /**
     * GNU Lesser General Public License v3.0 or later
     */
    LGPL_3_0_OR_LATER,
    /**
     * Lesser General Public License For Linguistic Resources
     */
    LGPLLR,
    /**
     * libpng License
     */
    LIBPNG,
    /**
     * PNG Reference Library version 2
     */
    LIBPNG_2_0,
    /**
     * libselinux public domain notice
     */
    LIBSELINUX_1_0,
    /**
     * libtiff License
     */
    LIBTIFF,
    /**
     * libutil David Nugent License
     */
    LIBUTIL_DAVID_NUGENT,
    /**
     * Licence Libre du Québec – Permissive version 1.1
     */
    LILIQ_P_1_1,
    /**
     * Licence Libre du Québec – Réciprocité version 1.1
     */
    LILIQ_R_1_1,
    /**
     * Licence Libre du Québec – Réciprocité forte version 1.1
     */
    LILIQ_RPLUS_1_1,
    /**
     * Linux man-pages - 1 paragraph
     */
    LINUX_MAN_PAGES_1_PARA,
    /**
     * Linux man-pages Copyleft
     */
    LINUX_MAN_PAGES_COPYLEFT,
    /**
     * Linux man-pages Copyleft - 2 paragraphs
     */
    LINUX_MAN_PAGES_COPYLEFT_2_PARA,
    /**
     * Linux man-pages Copyleft Variant
     */
    LINUX_MAN_PAGES_COPYLEFT_VAR,
    /**
     * Linux Kernel Variant of OpenIB.org license
     */
    LINUX_OPENIB,
    /**
     * Common Lisp LOOP License
     */
    LOOP,
    /**
     * Lucent Public License Version 1.0
     */
    LPL_1_0,
    /**
     * Lucent Public License v1.02
     */
    LPL_1_02,
    /**
     * LaTeX Project Public License v1.0
     */
    LPPL_1_0,
    /**
     * LaTeX Project Public License v1.1
     */
    LPPL_1_1,
    /**
     * LaTeX Project Public License v1.2
     */
    LPPL_1_2,
    /**
     * LaTeX Project Public License v1.3a
     */
    LPPL_1_3A,
    /**
     * LaTeX Project Public License v1.3c
     */
    LPPL_1_3C,
    /**
     * LZMA SDK License (versions 9.11 to 9.20)
     */
    LZMA_SDK_9_11_TO_9_20,
    /**
     * LZMA SDK License (versions 9.22 and beyond)
     */
    LZMA_SDK_9_22,
    /**
     * MakeIndex License
     */
    MAKEINDEX,
    /**
     * Martin Birgmeier License
     */
    MARTIN_BIRGMEIER,
    /**
     * metamail License
     */
    METAMAIL,
    /**
     * Minpack License
     */
    MINPACK,
    /**
     * The MirOS Licence
     */
    MIROS,
    /**
     * MIT License
     */
    MIT,
    /**
     * MIT No Attribution
     */
    MIT_0,
    /**
     * Enlightenment License (e16)
     */
    MIT_ADVERTISING,
    /**
     * CMU License
     */
    MIT_CMU,
    /**
     * enna License
     */
    MIT_ENNA,
    /**
     * feh License
     */
    MIT_FEH,
    /**
     * MIT Festival Variant
     */
    MIT_FESTIVAL,
    /**
     * MIT License Modern Variant
     */
    MIT_MODERN_VARIANT,
    /**
     * MIT Open Group variant
     */
    MIT_OPEN_GROUP,
    /**
     * MIT Tom Wu Variant
     */
    MIT_WU,
    /**
     * MIT +no-false-attribs license
     */
    MITNFA,
    /**
     * Motosoto License
     */
    MOTOSOTO,
    /**
     * mpi Permissive License
     */
    MPI_PERMISSIVE,
    /**
     * mpich2 License
     */
    MPICH2,
    /**
     * Mozilla Public License 1.0
     */
    MPL_1_0,
    /**
     * Mozilla Public License 1.1
     */
    MPL_1_1,
    /**
     * Mozilla Public License 2.0
     */
    MPL_2_0,
    /**
     * Mozilla Public License 2.0 (no copyleft exception)
     */
    MPL_2_0_NO_COPYLEFT_EXCEPTION,
    /**
     * mplus Font License
     */
    MPLUS,
    /**
     * Microsoft Limited Public License
     */
    MS_LPL,
    /**
     * Microsoft Public License
     */
    MS_PL,
    /**
     * Microsoft Reciprocal License
     */
    MS_RL,
    /**
     * Matrix Template Library License
     */
    MTLL,
    /**
     * Mulan Permissive Software License, Version 1
     */
    MULANPSL_1_0,
    /**
     * Mulan Permissive Software License, Version 2
     */
    MULANPSL_2_0,
    /**
     * Multics License
     */
    MULTICS,
    /**
     * Mup License
     */
    MUP,
    /**
     * Nara Institute of Science and Technology License (2003)
     */
    NAIST_2003,
    /**
     * NASA Open Source Agreement 1.3
     */
    NASA_1_3,
    /**
     * Naumen Public License
     */
    NAUMEN,
    /**
     * Net Boolean Public License v1
     */
    NBPL_1_0,
    /**
     * Non-Commercial Government Licence
     */
    NCGL_UK_2_0,
    /**
     * University of Illinois/NCSA Open Source License
     */
    NCSA,
    /**
     * Net-SNMP License
     */
    NET_SNMP,
    /**
     * NetCDF license
     */
    NETCDF,
    /**
     * Newsletr License
     */
    NEWSLETR,
    /**
     * Nethack General Public License
     */
    NGPL,
    /**
     * NICTA Public Software License, Version 1.0
     */
    NICTA_1_0,
    /**
     * NIST Public Domain Notice
     */
    NIST_PD,
    /**
     * NIST Public Domain Notice with license fallback
     */
    NIST_PD_FALLBACK,
    /**
     * NIST Software License
     */
    NIST_SOFTWARE,
    /**
     * Norwegian Licence for Open Government Data (NLOD) 1.0
     */
    NLOD_1_0,
    /**
     * Norwegian Licence for Open Government Data (NLOD) 2.0
     */
    NLOD_2_0,
    /**
     * No Limit Public License
     */
    NLPL,
    /**
     * Nokia Open Source License
     */
    NOKIA,
    /**
     * Netizen Open Source License
     */
    NOSL,
    /**
     * Not an open source license.
     */
    NOT_OPEN_SOURCE,
    /**
     * Noweb License
     */
    NOWEB,
    /**
     * Netscape Public License v1.0
     */
    NPL_1_0,
    /**
     * Netscape Public License v1.1
     */
    NPL_1_1,
    /**
     * Non-Profit Open Software License 3.0
     */
    NPOSL_3_0,
    /**
     * NRL License
     */
    NRL,
    /**
     * NTP License
     */
    NTP,
    /**
     * NTP No Attribution
     */
    NTP_0,
    /**
     * Nunit License
     */
    NUNIT,
    /**
     * Open Use of Data Agreement v1.0
     */
    O_UDA_1_0,
    /**
     * Open CASCADE Technology Public License
     */
    OCCT_PL,
    /**
     * OCLC Research Public License 2.0
     */
    OCLC_2_0,
    /**
     * Open Data Commons Open Database License v1.0
     */
    ODBL_1_0,
    /**
     * Open Data Commons Attribution License v1.0
     */
    ODC_BY_1_0,
    /**
     * OFFIS License
     */
    OFFIS,
    /**
     * SIL Open Font License 1.0
     */
    OFL_1_0,
    /**
     * SIL Open Font License 1.0 with no Reserved Font Name
     */
    OFL_1_0_NO_RFN,
    /**
     * SIL Open Font License 1.0 with Reserved Font Name
     */
    OFL_1_0_RFN,
    /**
     * SIL Open Font License 1.1
     */
    OFL_1_1,
    /**
     * SIL Open Font License 1.1 with no Reserved Font Name
     */
    OFL_1_1_NO_RFN,
    /**
     * SIL Open Font License 1.1 with Reserved Font Name
     */
    OFL_1_1_RFN,
    /**
     * OGC Software License, Version 1.0
     */
    OGC_1_0,
    /**
     * Taiwan Open Government Data License, version 1.0
     */
    OGDL_TAIWAN_1_0,
    /**
     * Open Government Licence - Canada
     */
    OGL_CANADA_2_0,
    /**
     * Open Government Licence v1.0
     */
    OGL_UK_1_0,
    /**
     * Open Government Licence v2.0
     */
    OGL_UK_2_0,
    /**
     * Open Government Licence v3.0
     */
    OGL_UK_3_0,
    /**
     * Open Group Test Suite License
     */
    OGTSL,
    /**
     * Open LDAP Public License v1.1
     */
    OLDAP_1_1,
    /**
     * Open LDAP Public License v1.2
     */
    OLDAP_1_2,
    /**
     * Open LDAP Public License v1.3
     */
    OLDAP_1_3,
    /**
     * Open LDAP Public License v1.4
     */
    OLDAP_1_4,
    /**
     * Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)
     */
    OLDAP_2_0,
    /**
     * Open LDAP Public License v2.0.1
     */
    OLDAP_2_0_1,
    /**
     * Open LDAP Public License v2.1
     */
    OLDAP_2_1,
    /**
     * Open LDAP Public License v2.2
     */
    OLDAP_2_2,
    /**
     * Open LDAP Public License v2.2.1
     */
    OLDAP_2_2_1,
    /**
     * Open LDAP Public License 2.2.2
     */
    OLDAP_2_2_2,
    /**
     * Open LDAP Public License v2.3
     */
    OLDAP_2_3,
    /**
     * Open LDAP Public License v2.4
     */
    OLDAP_2_4,
    /**
     * Open LDAP Public License v2.5
     */
    OLDAP_2_5,
    /**
     * Open LDAP Public License v2.6
     */
    OLDAP_2_6,
    /**
     * Open LDAP Public License v2.7
     */
    OLDAP_2_7,
    /**
     * Open LDAP Public License v2.8
     */
    OLDAP_2_8,
    /**
     * Open Logistics Foundation License Version 1.3
     */
    OLFL_1_3,
    /**
     * Open Market License
     */
    OML,
    /**
     * OpenPBS v2.3 Software License
     */
    OPENPBS_2_3,
    /**
     * OpenSSL License
     */
    OPENSSL,
    /**
     * Open Public License v1.0
     */
    OPL_1_0,
    /**
     * United Kingdom Open Parliament Licence v3.0
     */
    OPL_UK_3_0,
    /**
     * Open Publication License v1.0
     */
    OPUBL_1_0,
    /**
     * OSET Public License version 2.1
     */
    OSET_PL_2_1,
    /**
     * Open Software License 1.0
     */
    OSL_1_0,
    /**
     * Open Software License 1.1
     */
    OSL_1_1,
    /**
     * Open Software License 2.0
     */
    OSL_2_0,
    /**
     * Open Software License 2.1
     */
    OSL_2_1,
    /**
     * Open Software License 3.0
     */
    OSL_3_0,
    /**
     * The Parity Public License 6.0.0
     */
    PARITY_6_0_0,
    /**
     * The Parity Public License 7.0.0
     */
    PARITY_7_0_0,
    /**
     * Open Data Commons Public Domain Dedication & License 1.0
     */
    PDDL_1_0,
    /**
     * PHP License v3.0
     */
    PHP_3_0,
    /**
     * PHP License v3.01
     */
    PHP_3_01,
    /**
     * Plexus Classworlds License
     */
    PLEXUS,
    /**
     * PolyForm Noncommercial License 1.0.0
     */
    POLYFORM_NONCOMMERCIAL_1_0_0,
    /**
     * PolyForm Small Business License 1.0.0
     */
    POLYFORM_SMALL_BUSINESS_1_0_0,
    /**
     * PostgreSQL License
     */
    POSTGRESQL,
    /**
     * Python Software Foundation License 2.0
     */
    PSF_2_0,
    /**
     * psfrag License
     */
    PSFRAG,
    /**
     * psutils License
     */
    PSUTILS,
    /**
     * Python License 2.0
     */
    PYTHON_2_0,
    /**
     * Python License 2.0.1
     */
    PYTHON_2_0_1,
    /**
     * Qhull License
     */
    QHULL,
    /**
     * Q Public License 1.0
     */
    QPL_1_0,
    /**
     * Q Public License 1.0 - INRIA 2004 variant
     */
    QPL_1_0_INRIA_2004,
    /**
     * Rdisc License
     */
    RDISC,
    /**
     * Red Hat eCos Public License v1.1
     */
    RHECOS_1_1,
    /**
     * Reciprocal Public License 1.1
     */
    RPL_1_1,
    /**
     * Reciprocal Public License 1.5
     */
    RPL_1_5,
    /**
     * RealNetworks Public Source License v1.0
     */
    RPSL_1_0,
    /**
     * RSA Message-Digest License
     */
    RSA_MD,
    /**
     * Ricoh Source Code Public License
     */
    RSCPL,
    /**
     * Ruby License
     */
    RUBY,
    /**
     * Sax Public Domain Notice
     */
    SAX_PD,
    /**
     * Saxpath License
     */
    SAXPATH,
    /**
     * SCEA Shared Source License
     */
    SCEA,
    /**
     * Scheme Language Report License
     */
    SCHEMEREPORT,
    /**
     * Sendmail License
     */
    SENDMAIL,
    /**
     * Sendmail License 8.23
     */
    SENDMAIL_8_23,
    /**
     * SGI Free Software License B v1.0
     */
    SGI_B_1_0,
    /**
     * SGI Free Software License B v1.1
     */
    SGI_B_1_1,
    /**
     * SGI Free Software License B v2.0
     */
    SGI_B_2_0,
    /**
     * SGP4 Permission Notice
     */
    SGP4,
    /**
     * Solderpad Hardware License v0.5
     */
    SHL_0_5,
    /**
     * Solderpad Hardware License, Version 0.51
     */
    SHL_0_51,
    /**
     * Simple Public License 2.0
     */
    SIMPL_2_0,
    /**
     * Sun Industry Standards Source License v1.1
     */
    SISSL,
    /**
     * Sun Industry Standards Source License v1.2
     */
    SISSL_1_2,
    /**
     * Sleepycat License
     */
    SLEEPYCAT,
    /**
     * Standard ML of New Jersey License
     */
    SMLNJ,
    /**
     * Secure Messaging Protocol Public License
     */
    SMPPL,
    /**
     * SNIA Public License 1.1
     */
    SNIA,
    /**
     * snprintf License
     */
    SNPRINTF,
    /**
     * Spencer License 86
     */
    SPENCER_86,
    /**
     * Spencer License 94
     */
    SPENCER_94,
    /**
     * Spencer License 99
     */
    SPENCER_99,
    /**
     * Sun Public License v1.0
     */
    SPL_1_0,
    /**
     * SSH OpenSSH license
     */
    SSH_OPENSSH,
    /**
     * SSH short notice
     */
    SSH_SHORT,
    /**
     * Server Side Public License, v 1
     */
    SSPL_1_0,
    /**
     * Standard ML of New Jersey License
     */
    STANDARDML_NJ,
    /**
     * SugarCRM Public License v1.1.3
     */
    SUGARCRM_1_1_3,
    /**
     * SunPro License
     */
    SUNPRO,
    /**
     * Scheme Widget Library (SWL) Software License Agreement
     */
    SWL,
    /**
     * Symlinks License
     */
    SYMLINKS,
    /**
     * TAPR Open Hardware License v1.0
     */
    TAPR_OHL_1_0,
    /**
     * TCL/TK License
     */
    TCL,
    /**
     * TCP Wrappers License
     */
    TCP_WRAPPERS,
    /**
     * TermReadKey License
     */
    TERMREADKEY,
    /**
     * TMate Open Source License
     */
    TMATE,
    /**
     * TORQUE v2.5+ Software License v1.1
     */
    TORQUE_1_1,
    /**
     * Trusster Open Source License
     */
    TOSL,
    /**
     * Time::ParseDate License
     */
    TPDL,
    /**
     * THOR Public License 1.0
     */
    TPL_1_0,
    /**
     * Text-Tabs+Wrap License
     */
    TTWL,
    /**
     * Technische Universitaet Berlin License 1.0
     */
    TU_BERLIN_1_0,
    /**
     * Technische Universitaet Berlin License 2.0
     */
    TU_BERLIN_2_0,
    /**
     * UCAR License
     */
    UCAR,
    /**
     * Upstream Compatibility License v1.0
     */
    UCL_1_0,
    /**
     * Unicode License Agreement - Data Files and Software (2015)
     */
    UNICODE_DFS_2015,
    /**
     * Unicode License Agreement - Data Files and Software (2016)
     */
    UNICODE_DFS_2016,
    /**
     * Unicode Terms of Use
     */
    UNICODE_TOU,
    /**
     * UnixCrypt License
     */
    UNIXCRYPT,
    /**
     * The Unlicense
     */
    UNLICENSE,
    /**
     * Universal Permissive License v1.0
     */
    UPL_1_0,
    /**
     * Vim License
     */
    VIM,
    /**
     * VOSTROM Public License for Open Source
     */
    VOSTROM,
    /**
     * Vovida Software License v1.0
     */
    VSL_1_0,
    /**
     * W3C Software Notice and License (2002-12-31)
     */
    W3C,
    /**
     * W3C Software Notice and License (1998-07-20)
     */
    W3C_19980720,
    /**
     * W3C Software Notice and Document License (2015-05-13)
     */
    W3C_20150513,
    /**
     * w3m License
     */
    W3M,
    /**
     * Sybase Open Watcom Public License 1.0
     */
    WATCOM_1_0,
    /**
     * Widget Workshop License
     */
    WIDGET_WORKSHOP,
    /**
     * Wsuipa License
     */
    WSUIPA,
    /**
     * Do What The F*ck You Want To Public License
     */
    WTFPL,
    /**
     * wxWindows Library License
     */
    WXWINDOWS,
    /**
     * X11 License
     */
    X11,
    /**
     * X11 License Distribution Modification Variant
     */
    X11_DISTRIBUTE_MODIFICATIONS_VARIANT,
    /**
     * Xdebug License v 1.03
     */
    XDEBUG_1_03,
    /**
     * Xerox License
     */
    XEROX,
    /**
     * Xfig License
     */
    XFIG,
    /**
     * XFree86 License 1.1
     */
    XFREE86_1_1,
    /**
     * xinetd License
     */
    XINETD,
    /**
     * xlock License
     */
    XLOCK,
    /**
     * X.Net License
     */
    XNET,
    /**
     * XPP License
     */
    XPP,
    /**
     * XSkat License
     */
    XSKAT,
    /**
     * Yahoo! Public License v1.0
     */
    YPL_1_0,
    /**
     * Yahoo! Public License v1.1
     */
    YPL_1_1,
    /**
     * Zed License
     */
    ZED,
    /**
     * Zend License v2.0
     */
    ZEND_2_0,
    /**
     * Zimbra Public License v1.3
     */
    ZIMBRA_1_3,
    /**
     * Zimbra Public License v1.4
     */
    ZIMBRA_1_4,
    /**
     * zlib License
     */
    ZLIB,
    /**
     * zlib/libpng License with Acknowledgement
     */
    ZLIB_ACKNOWLEDGEMENT,
    /**
     * Zope Public License 1.1
     */
    ZPL_1_1,
    /**
     * Zope Public License 2.0
     */
    ZPL_2_0,
    /**
     * Zope Public License 2.1
     */
    ZPL_2_1,
    /**
     * added to help the parsers
     */
    NULL;

    public static SPDXLicense fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("0BSD".equals(codeString))
        return _0BSD;
      if ("AAL".equals(codeString))
        return AAL;
      if ("Abstyles".equals(codeString))
        return ABSTYLES;
      if ("AdaCore-doc".equals(codeString))
        return ADACORE_DOC;
      if ("Adobe-2006".equals(codeString))
        return ADOBE_2006;
      if ("Adobe-Glyph".equals(codeString))
        return ADOBE_GLYPH;
      if ("ADSL".equals(codeString))
        return ADSL;
      if ("AFL-1.1".equals(codeString))
        return AFL_1_1;
      if ("AFL-1.2".equals(codeString))
        return AFL_1_2;
      if ("AFL-2.0".equals(codeString))
        return AFL_2_0;
      if ("AFL-2.1".equals(codeString))
        return AFL_2_1;
      if ("AFL-3.0".equals(codeString))
        return AFL_3_0;
      if ("Afmparse".equals(codeString))
        return AFMPARSE;
      if ("AGPL-1.0".equals(codeString))
        return AGPL_1_0;
      if ("AGPL-1.0-only".equals(codeString))
        return AGPL_1_0_ONLY;
      if ("AGPL-1.0-or-later".equals(codeString))
        return AGPL_1_0_OR_LATER;
      if ("AGPL-3.0".equals(codeString))
        return AGPL_3_0;
      if ("AGPL-3.0-only".equals(codeString))
        return AGPL_3_0_ONLY;
      if ("AGPL-3.0-or-later".equals(codeString))
        return AGPL_3_0_OR_LATER;
      if ("Aladdin".equals(codeString))
        return ALADDIN;
      if ("AMDPLPA".equals(codeString))
        return AMDPLPA;
      if ("AML".equals(codeString))
        return AML;
      if ("AMPAS".equals(codeString))
        return AMPAS;
      if ("ANTLR-PD".equals(codeString))
        return ANTLR_PD;
      if ("ANTLR-PD-fallback".equals(codeString))
        return ANTLR_PD_FALLBACK;
      if ("Apache-1.0".equals(codeString))
        return APACHE_1_0;
      if ("Apache-1.1".equals(codeString))
        return APACHE_1_1;
      if ("Apache-2.0".equals(codeString))
        return APACHE_2_0;
      if ("APAFML".equals(codeString))
        return APAFML;
      if ("APL-1.0".equals(codeString))
        return APL_1_0;
      if ("App-s2p".equals(codeString))
        return APP_S2P;
      if ("APSL-1.0".equals(codeString))
        return APSL_1_0;
      if ("APSL-1.1".equals(codeString))
        return APSL_1_1;
      if ("APSL-1.2".equals(codeString))
        return APSL_1_2;
      if ("APSL-2.0".equals(codeString))
        return APSL_2_0;
      if ("Arphic-1999".equals(codeString))
        return ARPHIC_1999;
      if ("Artistic-1.0".equals(codeString))
        return ARTISTIC_1_0;
      if ("Artistic-1.0-cl8".equals(codeString))
        return ARTISTIC_1_0_CL8;
      if ("Artistic-1.0-Perl".equals(codeString))
        return ARTISTIC_1_0_PERL;
      if ("Artistic-2.0".equals(codeString))
        return ARTISTIC_2_0;
      if ("ASWF-Digital-Assets-1.0".equals(codeString))
        return ASWF_DIGITAL_ASSETS_1_0;
      if ("ASWF-Digital-Assets-1.1".equals(codeString))
        return ASWF_DIGITAL_ASSETS_1_1;
      if ("Baekmuk".equals(codeString))
        return BAEKMUK;
      if ("Bahyph".equals(codeString))
        return BAHYPH;
      if ("Barr".equals(codeString))
        return BARR;
      if ("Beerware".equals(codeString))
        return BEERWARE;
      if ("Bitstream-Charter".equals(codeString))
        return BITSTREAM_CHARTER;
      if ("Bitstream-Vera".equals(codeString))
        return BITSTREAM_VERA;
      if ("BitTorrent-1.0".equals(codeString))
        return BITTORRENT_1_0;
      if ("BitTorrent-1.1".equals(codeString))
        return BITTORRENT_1_1;
      if ("blessing".equals(codeString))
        return BLESSING;
      if ("BlueOak-1.0.0".equals(codeString))
        return BLUEOAK_1_0_0;
      if ("Boehm-GC".equals(codeString))
        return BOEHM_GC;
      if ("Borceux".equals(codeString))
        return BORCEUX;
      if ("Brian-Gladman-3-Clause".equals(codeString))
        return BRIAN_GLADMAN_3_CLAUSE;
      if ("BSD-1-Clause".equals(codeString))
        return BSD_1_CLAUSE;
      if ("BSD-2-Clause".equals(codeString))
        return BSD_2_CLAUSE;
      if ("BSD-2-Clause-FreeBSD".equals(codeString))
        return BSD_2_CLAUSE_FREEBSD;
      if ("BSD-2-Clause-NetBSD".equals(codeString))
        return BSD_2_CLAUSE_NETBSD;
      if ("BSD-2-Clause-Patent".equals(codeString))
        return BSD_2_CLAUSE_PATENT;
      if ("BSD-2-Clause-Views".equals(codeString))
        return BSD_2_CLAUSE_VIEWS;
      if ("BSD-3-Clause".equals(codeString))
        return BSD_3_CLAUSE;
      if ("BSD-3-Clause-Attribution".equals(codeString))
        return BSD_3_CLAUSE_ATTRIBUTION;
      if ("BSD-3-Clause-Clear".equals(codeString))
        return BSD_3_CLAUSE_CLEAR;
      if ("BSD-3-Clause-LBNL".equals(codeString))
        return BSD_3_CLAUSE_LBNL;
      if ("BSD-3-Clause-Modification".equals(codeString))
        return BSD_3_CLAUSE_MODIFICATION;
      if ("BSD-3-Clause-No-Military-License".equals(codeString))
        return BSD_3_CLAUSE_NO_MILITARY_LICENSE;
      if ("BSD-3-Clause-No-Nuclear-License".equals(codeString))
        return BSD_3_CLAUSE_NO_NUCLEAR_LICENSE;
      if ("BSD-3-Clause-No-Nuclear-License-2014".equals(codeString))
        return BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014;
      if ("BSD-3-Clause-No-Nuclear-Warranty".equals(codeString))
        return BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY;
      if ("BSD-3-Clause-Open-MPI".equals(codeString))
        return BSD_3_CLAUSE_OPEN_MPI;
      if ("BSD-4-Clause".equals(codeString))
        return BSD_4_CLAUSE;
      if ("BSD-4-Clause-Shortened".equals(codeString))
        return BSD_4_CLAUSE_SHORTENED;
      if ("BSD-4-Clause-UC".equals(codeString))
        return BSD_4_CLAUSE_UC;
      if ("BSD-4.3RENO".equals(codeString))
        return BSD_4_3RENO;
      if ("BSD-4.3TAHOE".equals(codeString))
        return BSD_4_3TAHOE;
      if ("BSD-Advertising-Acknowledgement".equals(codeString))
        return BSD_ADVERTISING_ACKNOWLEDGEMENT;
      if ("BSD-Attribution-HPND-disclaimer".equals(codeString))
        return BSD_ATTRIBUTION_HPND_DISCLAIMER;
      if ("BSD-Protection".equals(codeString))
        return BSD_PROTECTION;
      if ("BSD-Source-Code".equals(codeString))
        return BSD_SOURCE_CODE;
      if ("BSL-1.0".equals(codeString))
        return BSL_1_0;
      if ("BUSL-1.1".equals(codeString))
        return BUSL_1_1;
      if ("bzip2-1.0.5".equals(codeString))
        return BZIP2_1_0_5;
      if ("bzip2-1.0.6".equals(codeString))
        return BZIP2_1_0_6;
      if ("C-UDA-1.0".equals(codeString))
        return C_UDA_1_0;
      if ("CAL-1.0".equals(codeString))
        return CAL_1_0;
      if ("CAL-1.0-Combined-Work-Exception".equals(codeString))
        return CAL_1_0_COMBINED_WORK_EXCEPTION;
      if ("Caldera".equals(codeString))
        return CALDERA;
      if ("CATOSL-1.1".equals(codeString))
        return CATOSL_1_1;
      if ("CC-BY-1.0".equals(codeString))
        return CC_BY_1_0;
      if ("CC-BY-2.0".equals(codeString))
        return CC_BY_2_0;
      if ("CC-BY-2.5".equals(codeString))
        return CC_BY_2_5;
      if ("CC-BY-2.5-AU".equals(codeString))
        return CC_BY_2_5_AU;
      if ("CC-BY-3.0".equals(codeString))
        return CC_BY_3_0;
      if ("CC-BY-3.0-AT".equals(codeString))
        return CC_BY_3_0_AT;
      if ("CC-BY-3.0-DE".equals(codeString))
        return CC_BY_3_0_DE;
      if ("CC-BY-3.0-IGO".equals(codeString))
        return CC_BY_3_0_IGO;
      if ("CC-BY-3.0-NL".equals(codeString))
        return CC_BY_3_0_NL;
      if ("CC-BY-3.0-US".equals(codeString))
        return CC_BY_3_0_US;
      if ("CC-BY-4.0".equals(codeString))
        return CC_BY_4_0;
      if ("CC-BY-NC-1.0".equals(codeString))
        return CC_BY_NC_1_0;
      if ("CC-BY-NC-2.0".equals(codeString))
        return CC_BY_NC_2_0;
      if ("CC-BY-NC-2.5".equals(codeString))
        return CC_BY_NC_2_5;
      if ("CC-BY-NC-3.0".equals(codeString))
        return CC_BY_NC_3_0;
      if ("CC-BY-NC-3.0-DE".equals(codeString))
        return CC_BY_NC_3_0_DE;
      if ("CC-BY-NC-4.0".equals(codeString))
        return CC_BY_NC_4_0;
      if ("CC-BY-NC-ND-1.0".equals(codeString))
        return CC_BY_NC_ND_1_0;
      if ("CC-BY-NC-ND-2.0".equals(codeString))
        return CC_BY_NC_ND_2_0;
      if ("CC-BY-NC-ND-2.5".equals(codeString))
        return CC_BY_NC_ND_2_5;
      if ("CC-BY-NC-ND-3.0".equals(codeString))
        return CC_BY_NC_ND_3_0;
      if ("CC-BY-NC-ND-3.0-DE".equals(codeString))
        return CC_BY_NC_ND_3_0_DE;
      if ("CC-BY-NC-ND-3.0-IGO".equals(codeString))
        return CC_BY_NC_ND_3_0_IGO;
      if ("CC-BY-NC-ND-4.0".equals(codeString))
        return CC_BY_NC_ND_4_0;
      if ("CC-BY-NC-SA-1.0".equals(codeString))
        return CC_BY_NC_SA_1_0;
      if ("CC-BY-NC-SA-2.0".equals(codeString))
        return CC_BY_NC_SA_2_0;
      if ("CC-BY-NC-SA-2.0-DE".equals(codeString))
        return CC_BY_NC_SA_2_0_DE;
      if ("CC-BY-NC-SA-2.0-FR".equals(codeString))
        return CC_BY_NC_SA_2_0_FR;
      if ("CC-BY-NC-SA-2.0-UK".equals(codeString))
        return CC_BY_NC_SA_2_0_UK;
      if ("CC-BY-NC-SA-2.5".equals(codeString))
        return CC_BY_NC_SA_2_5;
      if ("CC-BY-NC-SA-3.0".equals(codeString))
        return CC_BY_NC_SA_3_0;
      if ("CC-BY-NC-SA-3.0-DE".equals(codeString))
        return CC_BY_NC_SA_3_0_DE;
      if ("CC-BY-NC-SA-3.0-IGO".equals(codeString))
        return CC_BY_NC_SA_3_0_IGO;
      if ("CC-BY-NC-SA-4.0".equals(codeString))
        return CC_BY_NC_SA_4_0;
      if ("CC-BY-ND-1.0".equals(codeString))
        return CC_BY_ND_1_0;
      if ("CC-BY-ND-2.0".equals(codeString))
        return CC_BY_ND_2_0;
      if ("CC-BY-ND-2.5".equals(codeString))
        return CC_BY_ND_2_5;
      if ("CC-BY-ND-3.0".equals(codeString))
        return CC_BY_ND_3_0;
      if ("CC-BY-ND-3.0-DE".equals(codeString))
        return CC_BY_ND_3_0_DE;
      if ("CC-BY-ND-4.0".equals(codeString))
        return CC_BY_ND_4_0;
      if ("CC-BY-SA-1.0".equals(codeString))
        return CC_BY_SA_1_0;
      if ("CC-BY-SA-2.0".equals(codeString))
        return CC_BY_SA_2_0;
      if ("CC-BY-SA-2.0-UK".equals(codeString))
        return CC_BY_SA_2_0_UK;
      if ("CC-BY-SA-2.1-JP".equals(codeString))
        return CC_BY_SA_2_1_JP;
      if ("CC-BY-SA-2.5".equals(codeString))
        return CC_BY_SA_2_5;
      if ("CC-BY-SA-3.0".equals(codeString))
        return CC_BY_SA_3_0;
      if ("CC-BY-SA-3.0-AT".equals(codeString))
        return CC_BY_SA_3_0_AT;
      if ("CC-BY-SA-3.0-DE".equals(codeString))
        return CC_BY_SA_3_0_DE;
      if ("CC-BY-SA-3.0-IGO".equals(codeString))
        return CC_BY_SA_3_0_IGO;
      if ("CC-BY-SA-4.0".equals(codeString))
        return CC_BY_SA_4_0;
      if ("CC-PDDC".equals(codeString))
        return CC_PDDC;
      if ("CC0-1.0".equals(codeString))
        return CC0_1_0;
      if ("CDDL-1.0".equals(codeString))
        return CDDL_1_0;
      if ("CDDL-1.1".equals(codeString))
        return CDDL_1_1;
      if ("CDL-1.0".equals(codeString))
        return CDL_1_0;
      if ("CDLA-Permissive-1.0".equals(codeString))
        return CDLA_PERMISSIVE_1_0;
      if ("CDLA-Permissive-2.0".equals(codeString))
        return CDLA_PERMISSIVE_2_0;
      if ("CDLA-Sharing-1.0".equals(codeString))
        return CDLA_SHARING_1_0;
      if ("CECILL-1.0".equals(codeString))
        return CECILL_1_0;
      if ("CECILL-1.1".equals(codeString))
        return CECILL_1_1;
      if ("CECILL-2.0".equals(codeString))
        return CECILL_2_0;
      if ("CECILL-2.1".equals(codeString))
        return CECILL_2_1;
      if ("CECILL-B".equals(codeString))
        return CECILL_B;
      if ("CECILL-C".equals(codeString))
        return CECILL_C;
      if ("CERN-OHL-1.1".equals(codeString))
        return CERN_OHL_1_1;
      if ("CERN-OHL-1.2".equals(codeString))
        return CERN_OHL_1_2;
      if ("CERN-OHL-P-2.0".equals(codeString))
        return CERN_OHL_P_2_0;
      if ("CERN-OHL-S-2.0".equals(codeString))
        return CERN_OHL_S_2_0;
      if ("CERN-OHL-W-2.0".equals(codeString))
        return CERN_OHL_W_2_0;
      if ("CFITSIO".equals(codeString))
        return CFITSIO;
      if ("checkmk".equals(codeString))
        return CHECKMK;
      if ("ClArtistic".equals(codeString))
        return CLARTISTIC;
      if ("Clips".equals(codeString))
        return CLIPS;
      if ("CMU-Mach".equals(codeString))
        return CMU_MACH;
      if ("CNRI-Jython".equals(codeString))
        return CNRI_JYTHON;
      if ("CNRI-Python".equals(codeString))
        return CNRI_PYTHON;
      if ("CNRI-Python-GPL-Compatible".equals(codeString))
        return CNRI_PYTHON_GPL_COMPATIBLE;
      if ("COIL-1.0".equals(codeString))
        return COIL_1_0;
      if ("Community-Spec-1.0".equals(codeString))
        return COMMUNITY_SPEC_1_0;
      if ("Condor-1.1".equals(codeString))
        return CONDOR_1_1;
      if ("copyleft-next-0.3.0".equals(codeString))
        return COPYLEFT_NEXT_0_3_0;
      if ("copyleft-next-0.3.1".equals(codeString))
        return COPYLEFT_NEXT_0_3_1;
      if ("Cornell-Lossless-JPEG".equals(codeString))
        return CORNELL_LOSSLESS_JPEG;
      if ("CPAL-1.0".equals(codeString))
        return CPAL_1_0;
      if ("CPL-1.0".equals(codeString))
        return CPL_1_0;
      if ("CPOL-1.02".equals(codeString))
        return CPOL_1_02;
      if ("Crossword".equals(codeString))
        return CROSSWORD;
      if ("CrystalStacker".equals(codeString))
        return CRYSTALSTACKER;
      if ("CUA-OPL-1.0".equals(codeString))
        return CUA_OPL_1_0;
      if ("Cube".equals(codeString))
        return CUBE;
      if ("curl".equals(codeString))
        return CURL;
      if ("D-FSL-1.0".equals(codeString))
        return D_FSL_1_0;
      if ("diffmark".equals(codeString))
        return DIFFMARK;
      if ("DL-DE-BY-2.0".equals(codeString))
        return DL_DE_BY_2_0;
      if ("DOC".equals(codeString))
        return DOC;
      if ("Dotseqn".equals(codeString))
        return DOTSEQN;
      if ("DRL-1.0".equals(codeString))
        return DRL_1_0;
      if ("DSDP".equals(codeString))
        return DSDP;
      if ("dtoa".equals(codeString))
        return DTOA;
      if ("dvipdfm".equals(codeString))
        return DVIPDFM;
      if ("ECL-1.0".equals(codeString))
        return ECL_1_0;
      if ("ECL-2.0".equals(codeString))
        return ECL_2_0;
      if ("eCos-2.0".equals(codeString))
        return ECOS_2_0;
      if ("EFL-1.0".equals(codeString))
        return EFL_1_0;
      if ("EFL-2.0".equals(codeString))
        return EFL_2_0;
      if ("eGenix".equals(codeString))
        return EGENIX;
      if ("Elastic-2.0".equals(codeString))
        return ELASTIC_2_0;
      if ("Entessa".equals(codeString))
        return ENTESSA;
      if ("EPICS".equals(codeString))
        return EPICS;
      if ("EPL-1.0".equals(codeString))
        return EPL_1_0;
      if ("EPL-2.0".equals(codeString))
        return EPL_2_0;
      if ("ErlPL-1.1".equals(codeString))
        return ERLPL_1_1;
      if ("etalab-2.0".equals(codeString))
        return ETALAB_2_0;
      if ("EUDatagrid".equals(codeString))
        return EUDATAGRID;
      if ("EUPL-1.0".equals(codeString))
        return EUPL_1_0;
      if ("EUPL-1.1".equals(codeString))
        return EUPL_1_1;
      if ("EUPL-1.2".equals(codeString))
        return EUPL_1_2;
      if ("Eurosym".equals(codeString))
        return EUROSYM;
      if ("Fair".equals(codeString))
        return FAIR;
      if ("FDK-AAC".equals(codeString))
        return FDK_AAC;
      if ("Frameworx-1.0".equals(codeString))
        return FRAMEWORX_1_0;
      if ("FreeBSD-DOC".equals(codeString))
        return FREEBSD_DOC;
      if ("FreeImage".equals(codeString))
        return FREEIMAGE;
      if ("FSFAP".equals(codeString))
        return FSFAP;
      if ("FSFUL".equals(codeString))
        return FSFUL;
      if ("FSFULLR".equals(codeString))
        return FSFULLR;
      if ("FSFULLRWD".equals(codeString))
        return FSFULLRWD;
      if ("FTL".equals(codeString))
        return FTL;
      if ("GD".equals(codeString))
        return GD;
      if ("GFDL-1.1".equals(codeString))
        return GFDL_1_1;
      if ("GFDL-1.1-invariants-only".equals(codeString))
        return GFDL_1_1_INVARIANTS_ONLY;
      if ("GFDL-1.1-invariants-or-later".equals(codeString))
        return GFDL_1_1_INVARIANTS_OR_LATER;
      if ("GFDL-1.1-no-invariants-only".equals(codeString))
        return GFDL_1_1_NO_INVARIANTS_ONLY;
      if ("GFDL-1.1-no-invariants-or-later".equals(codeString))
        return GFDL_1_1_NO_INVARIANTS_OR_LATER;
      if ("GFDL-1.1-only".equals(codeString))
        return GFDL_1_1_ONLY;
      if ("GFDL-1.1-or-later".equals(codeString))
        return GFDL_1_1_OR_LATER;
      if ("GFDL-1.2".equals(codeString))
        return GFDL_1_2;
      if ("GFDL-1.2-invariants-only".equals(codeString))
        return GFDL_1_2_INVARIANTS_ONLY;
      if ("GFDL-1.2-invariants-or-later".equals(codeString))
        return GFDL_1_2_INVARIANTS_OR_LATER;
      if ("GFDL-1.2-no-invariants-only".equals(codeString))
        return GFDL_1_2_NO_INVARIANTS_ONLY;
      if ("GFDL-1.2-no-invariants-or-later".equals(codeString))
        return GFDL_1_2_NO_INVARIANTS_OR_LATER;
      if ("GFDL-1.2-only".equals(codeString))
        return GFDL_1_2_ONLY;
      if ("GFDL-1.2-or-later".equals(codeString))
        return GFDL_1_2_OR_LATER;
      if ("GFDL-1.3".equals(codeString))
        return GFDL_1_3;
      if ("GFDL-1.3-invariants-only".equals(codeString))
        return GFDL_1_3_INVARIANTS_ONLY;
      if ("GFDL-1.3-invariants-or-later".equals(codeString))
        return GFDL_1_3_INVARIANTS_OR_LATER;
      if ("GFDL-1.3-no-invariants-only".equals(codeString))
        return GFDL_1_3_NO_INVARIANTS_ONLY;
      if ("GFDL-1.3-no-invariants-or-later".equals(codeString))
        return GFDL_1_3_NO_INVARIANTS_OR_LATER;
      if ("GFDL-1.3-only".equals(codeString))
        return GFDL_1_3_ONLY;
      if ("GFDL-1.3-or-later".equals(codeString))
        return GFDL_1_3_OR_LATER;
      if ("Giftware".equals(codeString))
        return GIFTWARE;
      if ("GL2PS".equals(codeString))
        return GL2PS;
      if ("Glide".equals(codeString))
        return GLIDE;
      if ("Glulxe".equals(codeString))
        return GLULXE;
      if ("GLWTPL".equals(codeString))
        return GLWTPL;
      if ("gnuplot".equals(codeString))
        return GNUPLOT;
      if ("GPL-1.0".equals(codeString))
        return GPL_1_0;
      if ("GPL-1.0+".equals(codeString))
        return GPL_1_0PLUS;
      if ("GPL-1.0-only".equals(codeString))
        return GPL_1_0_ONLY;
      if ("GPL-1.0-or-later".equals(codeString))
        return GPL_1_0_OR_LATER;
      if ("GPL-2.0".equals(codeString))
        return GPL_2_0;
      if ("GPL-2.0+".equals(codeString))
        return GPL_2_0PLUS;
      if ("GPL-2.0-only".equals(codeString))
        return GPL_2_0_ONLY;
      if ("GPL-2.0-or-later".equals(codeString))
        return GPL_2_0_OR_LATER;
      if ("GPL-2.0-with-autoconf-exception".equals(codeString))
        return GPL_2_0_WITH_AUTOCONF_EXCEPTION;
      if ("GPL-2.0-with-bison-exception".equals(codeString))
        return GPL_2_0_WITH_BISON_EXCEPTION;
      if ("GPL-2.0-with-classpath-exception".equals(codeString))
        return GPL_2_0_WITH_CLASSPATH_EXCEPTION;
      if ("GPL-2.0-with-font-exception".equals(codeString))
        return GPL_2_0_WITH_FONT_EXCEPTION;
      if ("GPL-2.0-with-GCC-exception".equals(codeString))
        return GPL_2_0_WITH_GCC_EXCEPTION;
      if ("GPL-3.0".equals(codeString))
        return GPL_3_0;
      if ("GPL-3.0+".equals(codeString))
        return GPL_3_0PLUS;
      if ("GPL-3.0-only".equals(codeString))
        return GPL_3_0_ONLY;
      if ("GPL-3.0-or-later".equals(codeString))
        return GPL_3_0_OR_LATER;
      if ("GPL-3.0-with-autoconf-exception".equals(codeString))
        return GPL_3_0_WITH_AUTOCONF_EXCEPTION;
      if ("GPL-3.0-with-GCC-exception".equals(codeString))
        return GPL_3_0_WITH_GCC_EXCEPTION;
      if ("Graphics-Gems".equals(codeString))
        return GRAPHICS_GEMS;
      if ("gSOAP-1.3b".equals(codeString))
        return GSOAP_1_3B;
      if ("HaskellReport".equals(codeString))
        return HASKELLREPORT;
      if ("Hippocratic-2.1".equals(codeString))
        return HIPPOCRATIC_2_1;
      if ("HP-1986".equals(codeString))
        return HP_1986;
      if ("HPND".equals(codeString))
        return HPND;
      if ("HPND-export-US".equals(codeString))
        return HPND_EXPORT_US;
      if ("HPND-Markus-Kuhn".equals(codeString))
        return HPND_MARKUS_KUHN;
      if ("HPND-sell-variant".equals(codeString))
        return HPND_SELL_VARIANT;
      if ("HPND-sell-variant-MIT-disclaimer".equals(codeString))
        return HPND_SELL_VARIANT_MIT_DISCLAIMER;
      if ("HTMLTIDY".equals(codeString))
        return HTMLTIDY;
      if ("IBM-pibs".equals(codeString))
        return IBM_PIBS;
      if ("ICU".equals(codeString))
        return ICU;
      if ("IEC-Code-Components-EULA".equals(codeString))
        return IEC_CODE_COMPONENTS_EULA;
      if ("IJG".equals(codeString))
        return IJG;
      if ("IJG-short".equals(codeString))
        return IJG_SHORT;
      if ("ImageMagick".equals(codeString))
        return IMAGEMAGICK;
      if ("iMatix".equals(codeString))
        return IMATIX;
      if ("Imlib2".equals(codeString))
        return IMLIB2;
      if ("Info-ZIP".equals(codeString))
        return INFO_ZIP;
      if ("Inner-Net-2.0".equals(codeString))
        return INNER_NET_2_0;
      if ("Intel".equals(codeString))
        return INTEL;
      if ("Intel-ACPI".equals(codeString))
        return INTEL_ACPI;
      if ("Interbase-1.0".equals(codeString))
        return INTERBASE_1_0;
      if ("IPA".equals(codeString))
        return IPA;
      if ("IPL-1.0".equals(codeString))
        return IPL_1_0;
      if ("ISC".equals(codeString))
        return ISC;
      if ("Jam".equals(codeString))
        return JAM;
      if ("JasPer-2.0".equals(codeString))
        return JASPER_2_0;
      if ("JPL-image".equals(codeString))
        return JPL_IMAGE;
      if ("JPNIC".equals(codeString))
        return JPNIC;
      if ("JSON".equals(codeString))
        return JSON;
      if ("Kazlib".equals(codeString))
        return KAZLIB;
      if ("Knuth-CTAN".equals(codeString))
        return KNUTH_CTAN;
      if ("LAL-1.2".equals(codeString))
        return LAL_1_2;
      if ("LAL-1.3".equals(codeString))
        return LAL_1_3;
      if ("Latex2e".equals(codeString))
        return LATEX2E;
      if ("Latex2e-translated-notice".equals(codeString))
        return LATEX2E_TRANSLATED_NOTICE;
      if ("Leptonica".equals(codeString))
        return LEPTONICA;
      if ("LGPL-2.0".equals(codeString))
        return LGPL_2_0;
      if ("LGPL-2.0+".equals(codeString))
        return LGPL_2_0PLUS;
      if ("LGPL-2.0-only".equals(codeString))
        return LGPL_2_0_ONLY;
      if ("LGPL-2.0-or-later".equals(codeString))
        return LGPL_2_0_OR_LATER;
      if ("LGPL-2.1".equals(codeString))
        return LGPL_2_1;
      if ("LGPL-2.1+".equals(codeString))
        return LGPL_2_1PLUS;
      if ("LGPL-2.1-only".equals(codeString))
        return LGPL_2_1_ONLY;
      if ("LGPL-2.1-or-later".equals(codeString))
        return LGPL_2_1_OR_LATER;
      if ("LGPL-3.0".equals(codeString))
        return LGPL_3_0;
      if ("LGPL-3.0+".equals(codeString))
        return LGPL_3_0PLUS;
      if ("LGPL-3.0-only".equals(codeString))
        return LGPL_3_0_ONLY;
      if ("LGPL-3.0-or-later".equals(codeString))
        return LGPL_3_0_OR_LATER;
      if ("LGPLLR".equals(codeString))
        return LGPLLR;
      if ("Libpng".equals(codeString))
        return LIBPNG;
      if ("libpng-2.0".equals(codeString))
        return LIBPNG_2_0;
      if ("libselinux-1.0".equals(codeString))
        return LIBSELINUX_1_0;
      if ("libtiff".equals(codeString))
        return LIBTIFF;
      if ("libutil-David-Nugent".equals(codeString))
        return LIBUTIL_DAVID_NUGENT;
      if ("LiLiQ-P-1.1".equals(codeString))
        return LILIQ_P_1_1;
      if ("LiLiQ-R-1.1".equals(codeString))
        return LILIQ_R_1_1;
      if ("LiLiQ-Rplus-1.1".equals(codeString))
        return LILIQ_RPLUS_1_1;
      if ("Linux-man-pages-1-para".equals(codeString))
        return LINUX_MAN_PAGES_1_PARA;
      if ("Linux-man-pages-copyleft".equals(codeString))
        return LINUX_MAN_PAGES_COPYLEFT;
      if ("Linux-man-pages-copyleft-2-para".equals(codeString))
        return LINUX_MAN_PAGES_COPYLEFT_2_PARA;
      if ("Linux-man-pages-copyleft-var".equals(codeString))
        return LINUX_MAN_PAGES_COPYLEFT_VAR;
      if ("Linux-OpenIB".equals(codeString))
        return LINUX_OPENIB;
      if ("LOOP".equals(codeString))
        return LOOP;
      if ("LPL-1.0".equals(codeString))
        return LPL_1_0;
      if ("LPL-1.02".equals(codeString))
        return LPL_1_02;
      if ("LPPL-1.0".equals(codeString))
        return LPPL_1_0;
      if ("LPPL-1.1".equals(codeString))
        return LPPL_1_1;
      if ("LPPL-1.2".equals(codeString))
        return LPPL_1_2;
      if ("LPPL-1.3a".equals(codeString))
        return LPPL_1_3A;
      if ("LPPL-1.3c".equals(codeString))
        return LPPL_1_3C;
      if ("LZMA-SDK-9.11-to-9.20".equals(codeString))
        return LZMA_SDK_9_11_TO_9_20;
      if ("LZMA-SDK-9.22".equals(codeString))
        return LZMA_SDK_9_22;
      if ("MakeIndex".equals(codeString))
        return MAKEINDEX;
      if ("Martin-Birgmeier".equals(codeString))
        return MARTIN_BIRGMEIER;
      if ("metamail".equals(codeString))
        return METAMAIL;
      if ("Minpack".equals(codeString))
        return MINPACK;
      if ("MirOS".equals(codeString))
        return MIROS;
      if ("MIT".equals(codeString))
        return MIT;
      if ("MIT-0".equals(codeString))
        return MIT_0;
      if ("MIT-advertising".equals(codeString))
        return MIT_ADVERTISING;
      if ("MIT-CMU".equals(codeString))
        return MIT_CMU;
      if ("MIT-enna".equals(codeString))
        return MIT_ENNA;
      if ("MIT-feh".equals(codeString))
        return MIT_FEH;
      if ("MIT-Festival".equals(codeString))
        return MIT_FESTIVAL;
      if ("MIT-Modern-Variant".equals(codeString))
        return MIT_MODERN_VARIANT;
      if ("MIT-open-group".equals(codeString))
        return MIT_OPEN_GROUP;
      if ("MIT-Wu".equals(codeString))
        return MIT_WU;
      if ("MITNFA".equals(codeString))
        return MITNFA;
      if ("Motosoto".equals(codeString))
        return MOTOSOTO;
      if ("mpi-permissive".equals(codeString))
        return MPI_PERMISSIVE;
      if ("mpich2".equals(codeString))
        return MPICH2;
      if ("MPL-1.0".equals(codeString))
        return MPL_1_0;
      if ("MPL-1.1".equals(codeString))
        return MPL_1_1;
      if ("MPL-2.0".equals(codeString))
        return MPL_2_0;
      if ("MPL-2.0-no-copyleft-exception".equals(codeString))
        return MPL_2_0_NO_COPYLEFT_EXCEPTION;
      if ("mplus".equals(codeString))
        return MPLUS;
      if ("MS-LPL".equals(codeString))
        return MS_LPL;
      if ("MS-PL".equals(codeString))
        return MS_PL;
      if ("MS-RL".equals(codeString))
        return MS_RL;
      if ("MTLL".equals(codeString))
        return MTLL;
      if ("MulanPSL-1.0".equals(codeString))
        return MULANPSL_1_0;
      if ("MulanPSL-2.0".equals(codeString))
        return MULANPSL_2_0;
      if ("Multics".equals(codeString))
        return MULTICS;
      if ("Mup".equals(codeString))
        return MUP;
      if ("NAIST-2003".equals(codeString))
        return NAIST_2003;
      if ("NASA-1.3".equals(codeString))
        return NASA_1_3;
      if ("Naumen".equals(codeString))
        return NAUMEN;
      if ("NBPL-1.0".equals(codeString))
        return NBPL_1_0;
      if ("NCGL-UK-2.0".equals(codeString))
        return NCGL_UK_2_0;
      if ("NCSA".equals(codeString))
        return NCSA;
      if ("Net-SNMP".equals(codeString))
        return NET_SNMP;
      if ("NetCDF".equals(codeString))
        return NETCDF;
      if ("Newsletr".equals(codeString))
        return NEWSLETR;
      if ("NGPL".equals(codeString))
        return NGPL;
      if ("NICTA-1.0".equals(codeString))
        return NICTA_1_0;
      if ("NIST-PD".equals(codeString))
        return NIST_PD;
      if ("NIST-PD-fallback".equals(codeString))
        return NIST_PD_FALLBACK;
      if ("NIST-Software".equals(codeString))
        return NIST_SOFTWARE;
      if ("NLOD-1.0".equals(codeString))
        return NLOD_1_0;
      if ("NLOD-2.0".equals(codeString))
        return NLOD_2_0;
      if ("NLPL".equals(codeString))
        return NLPL;
      if ("Nokia".equals(codeString))
        return NOKIA;
      if ("NOSL".equals(codeString))
        return NOSL;
      if ("not-open-source".equals(codeString))
        return NOT_OPEN_SOURCE;
      if ("Noweb".equals(codeString))
        return NOWEB;
      if ("NPL-1.0".equals(codeString))
        return NPL_1_0;
      if ("NPL-1.1".equals(codeString))
        return NPL_1_1;
      if ("NPOSL-3.0".equals(codeString))
        return NPOSL_3_0;
      if ("NRL".equals(codeString))
        return NRL;
      if ("NTP".equals(codeString))
        return NTP;
      if ("NTP-0".equals(codeString))
        return NTP_0;
      if ("Nunit".equals(codeString))
        return NUNIT;
      if ("O-UDA-1.0".equals(codeString))
        return O_UDA_1_0;
      if ("OCCT-PL".equals(codeString))
        return OCCT_PL;
      if ("OCLC-2.0".equals(codeString))
        return OCLC_2_0;
      if ("ODbL-1.0".equals(codeString))
        return ODBL_1_0;
      if ("ODC-By-1.0".equals(codeString))
        return ODC_BY_1_0;
      if ("OFFIS".equals(codeString))
        return OFFIS;
      if ("OFL-1.0".equals(codeString))
        return OFL_1_0;
      if ("OFL-1.0-no-RFN".equals(codeString))
        return OFL_1_0_NO_RFN;
      if ("OFL-1.0-RFN".equals(codeString))
        return OFL_1_0_RFN;
      if ("OFL-1.1".equals(codeString))
        return OFL_1_1;
      if ("OFL-1.1-no-RFN".equals(codeString))
        return OFL_1_1_NO_RFN;
      if ("OFL-1.1-RFN".equals(codeString))
        return OFL_1_1_RFN;
      if ("OGC-1.0".equals(codeString))
        return OGC_1_0;
      if ("OGDL-Taiwan-1.0".equals(codeString))
        return OGDL_TAIWAN_1_0;
      if ("OGL-Canada-2.0".equals(codeString))
        return OGL_CANADA_2_0;
      if ("OGL-UK-1.0".equals(codeString))
        return OGL_UK_1_0;
      if ("OGL-UK-2.0".equals(codeString))
        return OGL_UK_2_0;
      if ("OGL-UK-3.0".equals(codeString))
        return OGL_UK_3_0;
      if ("OGTSL".equals(codeString))
        return OGTSL;
      if ("OLDAP-1.1".equals(codeString))
        return OLDAP_1_1;
      if ("OLDAP-1.2".equals(codeString))
        return OLDAP_1_2;
      if ("OLDAP-1.3".equals(codeString))
        return OLDAP_1_3;
      if ("OLDAP-1.4".equals(codeString))
        return OLDAP_1_4;
      if ("OLDAP-2.0".equals(codeString))
        return OLDAP_2_0;
      if ("OLDAP-2.0.1".equals(codeString))
        return OLDAP_2_0_1;
      if ("OLDAP-2.1".equals(codeString))
        return OLDAP_2_1;
      if ("OLDAP-2.2".equals(codeString))
        return OLDAP_2_2;
      if ("OLDAP-2.2.1".equals(codeString))
        return OLDAP_2_2_1;
      if ("OLDAP-2.2.2".equals(codeString))
        return OLDAP_2_2_2;
      if ("OLDAP-2.3".equals(codeString))
        return OLDAP_2_3;
      if ("OLDAP-2.4".equals(codeString))
        return OLDAP_2_4;
      if ("OLDAP-2.5".equals(codeString))
        return OLDAP_2_5;
      if ("OLDAP-2.6".equals(codeString))
        return OLDAP_2_6;
      if ("OLDAP-2.7".equals(codeString))
        return OLDAP_2_7;
      if ("OLDAP-2.8".equals(codeString))
        return OLDAP_2_8;
      if ("OLFL-1.3".equals(codeString))
        return OLFL_1_3;
      if ("OML".equals(codeString))
        return OML;
      if ("OpenPBS-2.3".equals(codeString))
        return OPENPBS_2_3;
      if ("OpenSSL".equals(codeString))
        return OPENSSL;
      if ("OPL-1.0".equals(codeString))
        return OPL_1_0;
      if ("OPL-UK-3.0".equals(codeString))
        return OPL_UK_3_0;
      if ("OPUBL-1.0".equals(codeString))
        return OPUBL_1_0;
      if ("OSET-PL-2.1".equals(codeString))
        return OSET_PL_2_1;
      if ("OSL-1.0".equals(codeString))
        return OSL_1_0;
      if ("OSL-1.1".equals(codeString))
        return OSL_1_1;
      if ("OSL-2.0".equals(codeString))
        return OSL_2_0;
      if ("OSL-2.1".equals(codeString))
        return OSL_2_1;
      if ("OSL-3.0".equals(codeString))
        return OSL_3_0;
      if ("Parity-6.0.0".equals(codeString))
        return PARITY_6_0_0;
      if ("Parity-7.0.0".equals(codeString))
        return PARITY_7_0_0;
      if ("PDDL-1.0".equals(codeString))
        return PDDL_1_0;
      if ("PHP-3.0".equals(codeString))
        return PHP_3_0;
      if ("PHP-3.01".equals(codeString))
        return PHP_3_01;
      if ("Plexus".equals(codeString))
        return PLEXUS;
      if ("PolyForm-Noncommercial-1.0.0".equals(codeString))
        return POLYFORM_NONCOMMERCIAL_1_0_0;
      if ("PolyForm-Small-Business-1.0.0".equals(codeString))
        return POLYFORM_SMALL_BUSINESS_1_0_0;
      if ("PostgreSQL".equals(codeString))
        return POSTGRESQL;
      if ("PSF-2.0".equals(codeString))
        return PSF_2_0;
      if ("psfrag".equals(codeString))
        return PSFRAG;
      if ("psutils".equals(codeString))
        return PSUTILS;
      if ("Python-2.0".equals(codeString))
        return PYTHON_2_0;
      if ("Python-2.0.1".equals(codeString))
        return PYTHON_2_0_1;
      if ("Qhull".equals(codeString))
        return QHULL;
      if ("QPL-1.0".equals(codeString))
        return QPL_1_0;
      if ("QPL-1.0-INRIA-2004".equals(codeString))
        return QPL_1_0_INRIA_2004;
      if ("Rdisc".equals(codeString))
        return RDISC;
      if ("RHeCos-1.1".equals(codeString))
        return RHECOS_1_1;
      if ("RPL-1.1".equals(codeString))
        return RPL_1_1;
      if ("RPL-1.5".equals(codeString))
        return RPL_1_5;
      if ("RPSL-1.0".equals(codeString))
        return RPSL_1_0;
      if ("RSA-MD".equals(codeString))
        return RSA_MD;
      if ("RSCPL".equals(codeString))
        return RSCPL;
      if ("Ruby".equals(codeString))
        return RUBY;
      if ("SAX-PD".equals(codeString))
        return SAX_PD;
      if ("Saxpath".equals(codeString))
        return SAXPATH;
      if ("SCEA".equals(codeString))
        return SCEA;
      if ("SchemeReport".equals(codeString))
        return SCHEMEREPORT;
      if ("Sendmail".equals(codeString))
        return SENDMAIL;
      if ("Sendmail-8.23".equals(codeString))
        return SENDMAIL_8_23;
      if ("SGI-B-1.0".equals(codeString))
        return SGI_B_1_0;
      if ("SGI-B-1.1".equals(codeString))
        return SGI_B_1_1;
      if ("SGI-B-2.0".equals(codeString))
        return SGI_B_2_0;
      if ("SGP4".equals(codeString))
        return SGP4;
      if ("SHL-0.5".equals(codeString))
        return SHL_0_5;
      if ("SHL-0.51".equals(codeString))
        return SHL_0_51;
      if ("SimPL-2.0".equals(codeString))
        return SIMPL_2_0;
      if ("SISSL".equals(codeString))
        return SISSL;
      if ("SISSL-1.2".equals(codeString))
        return SISSL_1_2;
      if ("Sleepycat".equals(codeString))
        return SLEEPYCAT;
      if ("SMLNJ".equals(codeString))
        return SMLNJ;
      if ("SMPPL".equals(codeString))
        return SMPPL;
      if ("SNIA".equals(codeString))
        return SNIA;
      if ("snprintf".equals(codeString))
        return SNPRINTF;
      if ("Spencer-86".equals(codeString))
        return SPENCER_86;
      if ("Spencer-94".equals(codeString))
        return SPENCER_94;
      if ("Spencer-99".equals(codeString))
        return SPENCER_99;
      if ("SPL-1.0".equals(codeString))
        return SPL_1_0;
      if ("SSH-OpenSSH".equals(codeString))
        return SSH_OPENSSH;
      if ("SSH-short".equals(codeString))
        return SSH_SHORT;
      if ("SSPL-1.0".equals(codeString))
        return SSPL_1_0;
      if ("StandardML-NJ".equals(codeString))
        return STANDARDML_NJ;
      if ("SugarCRM-1.1.3".equals(codeString))
        return SUGARCRM_1_1_3;
      if ("SunPro".equals(codeString))
        return SUNPRO;
      if ("SWL".equals(codeString))
        return SWL;
      if ("Symlinks".equals(codeString))
        return SYMLINKS;
      if ("TAPR-OHL-1.0".equals(codeString))
        return TAPR_OHL_1_0;
      if ("TCL".equals(codeString))
        return TCL;
      if ("TCP-wrappers".equals(codeString))
        return TCP_WRAPPERS;
      if ("TermReadKey".equals(codeString))
        return TERMREADKEY;
      if ("TMate".equals(codeString))
        return TMATE;
      if ("TORQUE-1.1".equals(codeString))
        return TORQUE_1_1;
      if ("TOSL".equals(codeString))
        return TOSL;
      if ("TPDL".equals(codeString))
        return TPDL;
      if ("TPL-1.0".equals(codeString))
        return TPL_1_0;
      if ("TTWL".equals(codeString))
        return TTWL;
      if ("TU-Berlin-1.0".equals(codeString))
        return TU_BERLIN_1_0;
      if ("TU-Berlin-2.0".equals(codeString))
        return TU_BERLIN_2_0;
      if ("UCAR".equals(codeString))
        return UCAR;
      if ("UCL-1.0".equals(codeString))
        return UCL_1_0;
      if ("Unicode-DFS-2015".equals(codeString))
        return UNICODE_DFS_2015;
      if ("Unicode-DFS-2016".equals(codeString))
        return UNICODE_DFS_2016;
      if ("Unicode-TOU".equals(codeString))
        return UNICODE_TOU;
      if ("UnixCrypt".equals(codeString))
        return UNIXCRYPT;
      if ("Unlicense".equals(codeString))
        return UNLICENSE;
      if ("UPL-1.0".equals(codeString))
        return UPL_1_0;
      if ("Vim".equals(codeString))
        return VIM;
      if ("VOSTROM".equals(codeString))
        return VOSTROM;
      if ("VSL-1.0".equals(codeString))
        return VSL_1_0;
      if ("W3C".equals(codeString))
        return W3C;
      if ("W3C-19980720".equals(codeString))
        return W3C_19980720;
      if ("W3C-20150513".equals(codeString))
        return W3C_20150513;
      if ("w3m".equals(codeString))
        return W3M;
      if ("Watcom-1.0".equals(codeString))
        return WATCOM_1_0;
      if ("Widget-Workshop".equals(codeString))
        return WIDGET_WORKSHOP;
      if ("Wsuipa".equals(codeString))
        return WSUIPA;
      if ("WTFPL".equals(codeString))
        return WTFPL;
      if ("wxWindows".equals(codeString))
        return WXWINDOWS;
      if ("X11".equals(codeString))
        return X11;
      if ("X11-distribute-modifications-variant".equals(codeString))
        return X11_DISTRIBUTE_MODIFICATIONS_VARIANT;
      if ("Xdebug-1.03".equals(codeString))
        return XDEBUG_1_03;
      if ("Xerox".equals(codeString))
        return XEROX;
      if ("Xfig".equals(codeString))
        return XFIG;
      if ("XFree86-1.1".equals(codeString))
        return XFREE86_1_1;
      if ("xinetd".equals(codeString))
        return XINETD;
      if ("xlock".equals(codeString))
        return XLOCK;
      if ("Xnet".equals(codeString))
        return XNET;
      if ("xpp".equals(codeString))
        return XPP;
      if ("XSkat".equals(codeString))
        return XSKAT;
      if ("YPL-1.0".equals(codeString))
        return YPL_1_0;
      if ("YPL-1.1".equals(codeString))
        return YPL_1_1;
      if ("Zed".equals(codeString))
        return ZED;
      if ("Zend-2.0".equals(codeString))
        return ZEND_2_0;
      if ("Zimbra-1.3".equals(codeString))
        return ZIMBRA_1_3;
      if ("Zimbra-1.4".equals(codeString))
        return ZIMBRA_1_4;
      if ("Zlib".equals(codeString))
        return ZLIB;
      if ("zlib-acknowledgement".equals(codeString))
        return ZLIB_ACKNOWLEDGEMENT;
      if ("ZPL-1.1".equals(codeString))
        return ZPL_1_1;
      if ("ZPL-2.0".equals(codeString))
        return ZPL_2_0;
      if ("ZPL-2.1".equals(codeString))
        return ZPL_2_1;
      throw new FHIRException("Unknown SPDXLicense code '" + codeString + "'");
    }

    public static boolean isValidCode(String codeString) {
      if (codeString == null || "".equals(codeString))
        return false;
      return Utilities.existsInList(codeString, "0BSD", "AAL", "Abstyles", "AdaCore-doc", "Adobe-2006", "Adobe-Glyph",
          "ADSL", "AFL-1.1", "AFL-1.2", "AFL-2.0", "AFL-2.1", "AFL-3.0", "Afmparse", "AGPL-1.0", "AGPL-1.0-only",
          "AGPL-1.0-or-later", "AGPL-3.0", "AGPL-3.0-only", "AGPL-3.0-or-later", "Aladdin", "AMDPLPA", "AML", "AMPAS",
          "ANTLR-PD", "ANTLR-PD-fallback", "Apache-1.0", "Apache-1.1", "Apache-2.0", "APAFML", "APL-1.0", "App-s2p",
          "APSL-1.0", "APSL-1.1", "APSL-1.2", "APSL-2.0", "Arphic-1999", "Artistic-1.0", "Artistic-1.0-cl8",
          "Artistic-1.0-Perl", "Artistic-2.0", "ASWF-Digital-Assets-1.0", "ASWF-Digital-Assets-1.1", "Baekmuk",
          "Bahyph", "Barr", "Beerware", "Bitstream-Charter", "Bitstream-Vera", "BitTorrent-1.0", "BitTorrent-1.1",
          "blessing", "BlueOak-1.0.0", "Boehm-GC", "Borceux", "Brian-Gladman-3-Clause", "BSD-1-Clause", "BSD-2-Clause",
          "BSD-2-Clause-FreeBSD", "BSD-2-Clause-NetBSD", "BSD-2-Clause-Patent", "BSD-2-Clause-Views", "BSD-3-Clause",
          "BSD-3-Clause-Attribution", "BSD-3-Clause-Clear", "BSD-3-Clause-LBNL", "BSD-3-Clause-Modification",
          "BSD-3-Clause-No-Military-License", "BSD-3-Clause-No-Nuclear-License", "BSD-3-Clause-No-Nuclear-License-2014",
          "BSD-3-Clause-No-Nuclear-Warranty", "BSD-3-Clause-Open-MPI", "BSD-4-Clause", "BSD-4-Clause-Shortened",
          "BSD-4-Clause-UC", "BSD-4.3RENO", "BSD-4.3TAHOE", "BSD-Advertising-Acknowledgement",
          "BSD-Attribution-HPND-disclaimer", "BSD-Protection", "BSD-Source-Code", "BSL-1.0", "BUSL-1.1", "bzip2-1.0.5",
          "bzip2-1.0.6", "C-UDA-1.0", "CAL-1.0", "CAL-1.0-Combined-Work-Exception", "Caldera", "CATOSL-1.1",
          "CC-BY-1.0", "CC-BY-2.0", "CC-BY-2.5", "CC-BY-2.5-AU", "CC-BY-3.0", "CC-BY-3.0-AT", "CC-BY-3.0-DE",
          "CC-BY-3.0-IGO", "CC-BY-3.0-NL", "CC-BY-3.0-US", "CC-BY-4.0", "CC-BY-NC-1.0", "CC-BY-NC-2.0", "CC-BY-NC-2.5",
          "CC-BY-NC-3.0", "CC-BY-NC-3.0-DE", "CC-BY-NC-4.0", "CC-BY-NC-ND-1.0", "CC-BY-NC-ND-2.0", "CC-BY-NC-ND-2.5",
          "CC-BY-NC-ND-3.0", "CC-BY-NC-ND-3.0-DE", "CC-BY-NC-ND-3.0-IGO", "CC-BY-NC-ND-4.0", "CC-BY-NC-SA-1.0",
          "CC-BY-NC-SA-2.0", "CC-BY-NC-SA-2.0-DE", "CC-BY-NC-SA-2.0-FR", "CC-BY-NC-SA-2.0-UK", "CC-BY-NC-SA-2.5",
          "CC-BY-NC-SA-3.0", "CC-BY-NC-SA-3.0-DE", "CC-BY-NC-SA-3.0-IGO", "CC-BY-NC-SA-4.0", "CC-BY-ND-1.0",
          "CC-BY-ND-2.0", "CC-BY-ND-2.5", "CC-BY-ND-3.0", "CC-BY-ND-3.0-DE", "CC-BY-ND-4.0", "CC-BY-SA-1.0",
          "CC-BY-SA-2.0", "CC-BY-SA-2.0-UK", "CC-BY-SA-2.1-JP", "CC-BY-SA-2.5", "CC-BY-SA-3.0", "CC-BY-SA-3.0-AT",
          "CC-BY-SA-3.0-DE", "CC-BY-SA-3.0-IGO", "CC-BY-SA-4.0", "CC-PDDC", "CC0-1.0", "CDDL-1.0", "CDDL-1.1",
          "CDL-1.0", "CDLA-Permissive-1.0", "CDLA-Permissive-2.0", "CDLA-Sharing-1.0", "CECILL-1.0", "CECILL-1.1",
          "CECILL-2.0", "CECILL-2.1", "CECILL-B", "CECILL-C", "CERN-OHL-1.1", "CERN-OHL-1.2", "CERN-OHL-P-2.0",
          "CERN-OHL-S-2.0", "CERN-OHL-W-2.0", "CFITSIO", "checkmk", "ClArtistic", "Clips", "CMU-Mach", "CNRI-Jython",
          "CNRI-Python", "CNRI-Python-GPL-Compatible", "COIL-1.0", "Community-Spec-1.0", "Condor-1.1",
          "copyleft-next-0.3.0", "copyleft-next-0.3.1", "Cornell-Lossless-JPEG", "CPAL-1.0", "CPL-1.0", "CPOL-1.02",
          "Crossword", "CrystalStacker", "CUA-OPL-1.0", "Cube", "curl", "D-FSL-1.0", "diffmark", "DL-DE-BY-2.0", "DOC",
          "Dotseqn", "DRL-1.0", "DSDP", "dtoa", "dvipdfm", "ECL-1.0", "ECL-2.0", "eCos-2.0", "EFL-1.0", "EFL-2.0",
          "eGenix", "Elastic-2.0", "Entessa", "EPICS", "EPL-1.0", "EPL-2.0", "ErlPL-1.1", "etalab-2.0", "EUDatagrid",
          "EUPL-1.0", "EUPL-1.1", "EUPL-1.2", "Eurosym", "Fair", "FDK-AAC", "Frameworx-1.0", "FreeBSD-DOC", "FreeImage",
          "FSFAP", "FSFUL", "FSFULLR", "FSFULLRWD", "FTL", "GD", "GFDL-1.1", "GFDL-1.1-invariants-only",
          "GFDL-1.1-invariants-or-later", "GFDL-1.1-no-invariants-only", "GFDL-1.1-no-invariants-or-later",
          "GFDL-1.1-only", "GFDL-1.1-or-later", "GFDL-1.2", "GFDL-1.2-invariants-only", "GFDL-1.2-invariants-or-later",
          "GFDL-1.2-no-invariants-only", "GFDL-1.2-no-invariants-or-later", "GFDL-1.2-only", "GFDL-1.2-or-later",
          "GFDL-1.3", "GFDL-1.3-invariants-only", "GFDL-1.3-invariants-or-later", "GFDL-1.3-no-invariants-only",
          "GFDL-1.3-no-invariants-or-later", "GFDL-1.3-only", "GFDL-1.3-or-later", "Giftware", "GL2PS", "Glide",
          "Glulxe", "GLWTPL", "gnuplot", "GPL-1.0", "GPL-1.0+", "GPL-1.0-only", "GPL-1.0-or-later", "GPL-2.0",
          "GPL-2.0+", "GPL-2.0-only", "GPL-2.0-or-later", "GPL-2.0-with-autoconf-exception",
          "GPL-2.0-with-bison-exception", "GPL-2.0-with-classpath-exception", "GPL-2.0-with-font-exception",
          "GPL-2.0-with-GCC-exception", "GPL-3.0", "GPL-3.0+", "GPL-3.0-only", "GPL-3.0-or-later",
          "GPL-3.0-with-autoconf-exception", "GPL-3.0-with-GCC-exception", "Graphics-Gems", "gSOAP-1.3b",
          "HaskellReport", "Hippocratic-2.1", "HP-1986", "HPND", "HPND-export-US", "HPND-Markus-Kuhn",
          "HPND-sell-variant", "HPND-sell-variant-MIT-disclaimer", "HTMLTIDY", "IBM-pibs", "ICU",
          "IEC-Code-Components-EULA", "IJG", "IJG-short", "ImageMagick", "iMatix", "Imlib2", "Info-ZIP",
          "Inner-Net-2.0", "Intel", "Intel-ACPI", "Interbase-1.0", "IPA", "IPL-1.0", "ISC", "Jam", "JasPer-2.0",
          "JPL-image", "JPNIC", "JSON", "Kazlib", "Knuth-CTAN", "LAL-1.2", "LAL-1.3", "Latex2e",
          "Latex2e-translated-notice", "Leptonica", "LGPL-2.0", "LGPL-2.0+", "LGPL-2.0-only", "LGPL-2.0-or-later",
          "LGPL-2.1", "LGPL-2.1+", "LGPL-2.1-only", "LGPL-2.1-or-later", "LGPL-3.0", "LGPL-3.0+", "LGPL-3.0-only",
          "LGPL-3.0-or-later", "LGPLLR", "Libpng", "libpng-2.0", "libselinux-1.0", "libtiff", "libutil-David-Nugent",
          "LiLiQ-P-1.1", "LiLiQ-R-1.1", "LiLiQ-Rplus-1.1", "Linux-man-pages-1-para", "Linux-man-pages-copyleft",
          "Linux-man-pages-copyleft-2-para", "Linux-man-pages-copyleft-var", "Linux-OpenIB", "LOOP", "LPL-1.0",
          "LPL-1.02", "LPPL-1.0", "LPPL-1.1", "LPPL-1.2", "LPPL-1.3a", "LPPL-1.3c", "LZMA-SDK-9.11-to-9.20",
          "LZMA-SDK-9.22", "MakeIndex", "Martin-Birgmeier", "metamail", "Minpack", "MirOS", "MIT", "MIT-0",
          "MIT-advertising", "MIT-CMU", "MIT-enna", "MIT-feh", "MIT-Festival", "MIT-Modern-Variant", "MIT-open-group",
          "MIT-Wu", "MITNFA", "Motosoto", "mpi-permissive", "mpich2", "MPL-1.0", "MPL-1.1", "MPL-2.0",
          "MPL-2.0-no-copyleft-exception", "mplus", "MS-LPL", "MS-PL", "MS-RL", "MTLL", "MulanPSL-1.0", "MulanPSL-2.0",
          "Multics", "Mup", "NAIST-2003", "NASA-1.3", "Naumen", "NBPL-1.0", "NCGL-UK-2.0", "NCSA", "Net-SNMP", "NetCDF",
          "Newsletr", "NGPL", "NICTA-1.0", "NIST-PD", "NIST-PD-fallback", "NIST-Software", "NLOD-1.0", "NLOD-2.0",
          "NLPL", "Nokia", "NOSL", "not-open-source", "Noweb", "NPL-1.0", "NPL-1.1", "NPOSL-3.0", "NRL", "NTP", "NTP-0",
          "Nunit", "O-UDA-1.0", "OCCT-PL", "OCLC-2.0", "ODbL-1.0", "ODC-By-1.0", "OFFIS", "OFL-1.0", "OFL-1.0-no-RFN",
          "OFL-1.0-RFN", "OFL-1.1", "OFL-1.1-no-RFN", "OFL-1.1-RFN", "OGC-1.0", "OGDL-Taiwan-1.0", "OGL-Canada-2.0",
          "OGL-UK-1.0", "OGL-UK-2.0", "OGL-UK-3.0", "OGTSL", "OLDAP-1.1", "OLDAP-1.2", "OLDAP-1.3", "OLDAP-1.4",
          "OLDAP-2.0", "OLDAP-2.0.1", "OLDAP-2.1", "OLDAP-2.2", "OLDAP-2.2.1", "OLDAP-2.2.2", "OLDAP-2.3", "OLDAP-2.4",
          "OLDAP-2.5", "OLDAP-2.6", "OLDAP-2.7", "OLDAP-2.8", "OLFL-1.3", "OML", "OpenPBS-2.3", "OpenSSL", "OPL-1.0",
          "OPL-UK-3.0", "OPUBL-1.0", "OSET-PL-2.1", "OSL-1.0", "OSL-1.1", "OSL-2.0", "OSL-2.1", "OSL-3.0",
          "Parity-6.0.0", "Parity-7.0.0", "PDDL-1.0", "PHP-3.0", "PHP-3.01", "Plexus", "PolyForm-Noncommercial-1.0.0",
          "PolyForm-Small-Business-1.0.0", "PostgreSQL", "PSF-2.0", "psfrag", "psutils", "Python-2.0", "Python-2.0.1",
          "Qhull", "QPL-1.0", "QPL-1.0-INRIA-2004", "Rdisc", "RHeCos-1.1", "RPL-1.1", "RPL-1.5", "RPSL-1.0", "RSA-MD",
          "RSCPL", "Ruby", "SAX-PD", "Saxpath", "SCEA", "SchemeReport", "Sendmail", "Sendmail-8.23", "SGI-B-1.0",
          "SGI-B-1.1", "SGI-B-2.0", "SGP4", "SHL-0.5", "SHL-0.51", "SimPL-2.0", "SISSL", "SISSL-1.2", "Sleepycat",
          "SMLNJ", "SMPPL", "SNIA", "snprintf", "Spencer-86", "Spencer-94", "Spencer-99", "SPL-1.0", "SSH-OpenSSH",
          "SSH-short", "SSPL-1.0", "StandardML-NJ", "SugarCRM-1.1.3", "SunPro", "SWL", "Symlinks", "TAPR-OHL-1.0",
          "TCL", "TCP-wrappers", "TermReadKey", "TMate", "TORQUE-1.1", "TOSL", "TPDL", "TPL-1.0", "TTWL",
          "TU-Berlin-1.0", "TU-Berlin-2.0", "UCAR", "UCL-1.0", "Unicode-DFS-2015", "Unicode-DFS-2016", "Unicode-TOU",
          "UnixCrypt", "Unlicense", "UPL-1.0", "Vim", "VOSTROM", "VSL-1.0", "W3C", "W3C-19980720", "W3C-20150513",
          "w3m", "Watcom-1.0", "Widget-Workshop", "Wsuipa", "WTFPL", "wxWindows", "X11",
          "X11-distribute-modifications-variant", "Xdebug-1.03", "Xerox", "Xfig", "XFree86-1.1", "xinetd", "xlock",
          "Xnet", "xpp", "XSkat", "YPL-1.0", "YPL-1.1", "Zed", "Zend-2.0", "Zimbra-1.3", "Zimbra-1.4", "Zlib",
          "zlib-acknowledgement", "ZPL-1.1", "ZPL-2.0", "ZPL-2.1");
    }

    public String toCode() {
      switch (this) {
      case _0BSD:
        return "0BSD";
      case AAL:
        return "AAL";
      case ABSTYLES:
        return "Abstyles";
      case ADACORE_DOC:
        return "AdaCore-doc";
      case ADOBE_2006:
        return "Adobe-2006";
      case ADOBE_GLYPH:
        return "Adobe-Glyph";
      case ADSL:
        return "ADSL";
      case AFL_1_1:
        return "AFL-1.1";
      case AFL_1_2:
        return "AFL-1.2";
      case AFL_2_0:
        return "AFL-2.0";
      case AFL_2_1:
        return "AFL-2.1";
      case AFL_3_0:
        return "AFL-3.0";
      case AFMPARSE:
        return "Afmparse";
      case AGPL_1_0:
        return "AGPL-1.0";
      case AGPL_1_0_ONLY:
        return "AGPL-1.0-only";
      case AGPL_1_0_OR_LATER:
        return "AGPL-1.0-or-later";
      case AGPL_3_0:
        return "AGPL-3.0";
      case AGPL_3_0_ONLY:
        return "AGPL-3.0-only";
      case AGPL_3_0_OR_LATER:
        return "AGPL-3.0-or-later";
      case ALADDIN:
        return "Aladdin";
      case AMDPLPA:
        return "AMDPLPA";
      case AML:
        return "AML";
      case AMPAS:
        return "AMPAS";
      case ANTLR_PD:
        return "ANTLR-PD";
      case ANTLR_PD_FALLBACK:
        return "ANTLR-PD-fallback";
      case APACHE_1_0:
        return "Apache-1.0";
      case APACHE_1_1:
        return "Apache-1.1";
      case APACHE_2_0:
        return "Apache-2.0";
      case APAFML:
        return "APAFML";
      case APL_1_0:
        return "APL-1.0";
      case APP_S2P:
        return "App-s2p";
      case APSL_1_0:
        return "APSL-1.0";
      case APSL_1_1:
        return "APSL-1.1";
      case APSL_1_2:
        return "APSL-1.2";
      case APSL_2_0:
        return "APSL-2.0";
      case ARPHIC_1999:
        return "Arphic-1999";
      case ARTISTIC_1_0:
        return "Artistic-1.0";
      case ARTISTIC_1_0_CL8:
        return "Artistic-1.0-cl8";
      case ARTISTIC_1_0_PERL:
        return "Artistic-1.0-Perl";
      case ARTISTIC_2_0:
        return "Artistic-2.0";
      case ASWF_DIGITAL_ASSETS_1_0:
        return "ASWF-Digital-Assets-1.0";
      case ASWF_DIGITAL_ASSETS_1_1:
        return "ASWF-Digital-Assets-1.1";
      case BAEKMUK:
        return "Baekmuk";
      case BAHYPH:
        return "Bahyph";
      case BARR:
        return "Barr";
      case BEERWARE:
        return "Beerware";
      case BITSTREAM_CHARTER:
        return "Bitstream-Charter";
      case BITSTREAM_VERA:
        return "Bitstream-Vera";
      case BITTORRENT_1_0:
        return "BitTorrent-1.0";
      case BITTORRENT_1_1:
        return "BitTorrent-1.1";
      case BLESSING:
        return "blessing";
      case BLUEOAK_1_0_0:
        return "BlueOak-1.0.0";
      case BOEHM_GC:
        return "Boehm-GC";
      case BORCEUX:
        return "Borceux";
      case BRIAN_GLADMAN_3_CLAUSE:
        return "Brian-Gladman-3-Clause";
      case BSD_1_CLAUSE:
        return "BSD-1-Clause";
      case BSD_2_CLAUSE:
        return "BSD-2-Clause";
      case BSD_2_CLAUSE_FREEBSD:
        return "BSD-2-Clause-FreeBSD";
      case BSD_2_CLAUSE_NETBSD:
        return "BSD-2-Clause-NetBSD";
      case BSD_2_CLAUSE_PATENT:
        return "BSD-2-Clause-Patent";
      case BSD_2_CLAUSE_VIEWS:
        return "BSD-2-Clause-Views";
      case BSD_3_CLAUSE:
        return "BSD-3-Clause";
      case BSD_3_CLAUSE_ATTRIBUTION:
        return "BSD-3-Clause-Attribution";
      case BSD_3_CLAUSE_CLEAR:
        return "BSD-3-Clause-Clear";
      case BSD_3_CLAUSE_LBNL:
        return "BSD-3-Clause-LBNL";
      case BSD_3_CLAUSE_MODIFICATION:
        return "BSD-3-Clause-Modification";
      case BSD_3_CLAUSE_NO_MILITARY_LICENSE:
        return "BSD-3-Clause-No-Military-License";
      case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE:
        return "BSD-3-Clause-No-Nuclear-License";
      case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014:
        return "BSD-3-Clause-No-Nuclear-License-2014";
      case BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY:
        return "BSD-3-Clause-No-Nuclear-Warranty";
      case BSD_3_CLAUSE_OPEN_MPI:
        return "BSD-3-Clause-Open-MPI";
      case BSD_4_CLAUSE:
        return "BSD-4-Clause";
      case BSD_4_CLAUSE_SHORTENED:
        return "BSD-4-Clause-Shortened";
      case BSD_4_CLAUSE_UC:
        return "BSD-4-Clause-UC";
      case BSD_4_3RENO:
        return "BSD-4.3RENO";
      case BSD_4_3TAHOE:
        return "BSD-4.3TAHOE";
      case BSD_ADVERTISING_ACKNOWLEDGEMENT:
        return "BSD-Advertising-Acknowledgement";
      case BSD_ATTRIBUTION_HPND_DISCLAIMER:
        return "BSD-Attribution-HPND-disclaimer";
      case BSD_PROTECTION:
        return "BSD-Protection";
      case BSD_SOURCE_CODE:
        return "BSD-Source-Code";
      case BSL_1_0:
        return "BSL-1.0";
      case BUSL_1_1:
        return "BUSL-1.1";
      case BZIP2_1_0_5:
        return "bzip2-1.0.5";
      case BZIP2_1_0_6:
        return "bzip2-1.0.6";
      case C_UDA_1_0:
        return "C-UDA-1.0";
      case CAL_1_0:
        return "CAL-1.0";
      case CAL_1_0_COMBINED_WORK_EXCEPTION:
        return "CAL-1.0-Combined-Work-Exception";
      case CALDERA:
        return "Caldera";
      case CATOSL_1_1:
        return "CATOSL-1.1";
      case CC_BY_1_0:
        return "CC-BY-1.0";
      case CC_BY_2_0:
        return "CC-BY-2.0";
      case CC_BY_2_5:
        return "CC-BY-2.5";
      case CC_BY_2_5_AU:
        return "CC-BY-2.5-AU";
      case CC_BY_3_0:
        return "CC-BY-3.0";
      case CC_BY_3_0_AT:
        return "CC-BY-3.0-AT";
      case CC_BY_3_0_DE:
        return "CC-BY-3.0-DE";
      case CC_BY_3_0_IGO:
        return "CC-BY-3.0-IGO";
      case CC_BY_3_0_NL:
        return "CC-BY-3.0-NL";
      case CC_BY_3_0_US:
        return "CC-BY-3.0-US";
      case CC_BY_4_0:
        return "CC-BY-4.0";
      case CC_BY_NC_1_0:
        return "CC-BY-NC-1.0";
      case CC_BY_NC_2_0:
        return "CC-BY-NC-2.0";
      case CC_BY_NC_2_5:
        return "CC-BY-NC-2.5";
      case CC_BY_NC_3_0:
        return "CC-BY-NC-3.0";
      case CC_BY_NC_3_0_DE:
        return "CC-BY-NC-3.0-DE";
      case CC_BY_NC_4_0:
        return "CC-BY-NC-4.0";
      case CC_BY_NC_ND_1_0:
        return "CC-BY-NC-ND-1.0";
      case CC_BY_NC_ND_2_0:
        return "CC-BY-NC-ND-2.0";
      case CC_BY_NC_ND_2_5:
        return "CC-BY-NC-ND-2.5";
      case CC_BY_NC_ND_3_0:
        return "CC-BY-NC-ND-3.0";
      case CC_BY_NC_ND_3_0_DE:
        return "CC-BY-NC-ND-3.0-DE";
      case CC_BY_NC_ND_3_0_IGO:
        return "CC-BY-NC-ND-3.0-IGO";
      case CC_BY_NC_ND_4_0:
        return "CC-BY-NC-ND-4.0";
      case CC_BY_NC_SA_1_0:
        return "CC-BY-NC-SA-1.0";
      case CC_BY_NC_SA_2_0:
        return "CC-BY-NC-SA-2.0";
      case CC_BY_NC_SA_2_0_DE:
        return "CC-BY-NC-SA-2.0-DE";
      case CC_BY_NC_SA_2_0_FR:
        return "CC-BY-NC-SA-2.0-FR";
      case CC_BY_NC_SA_2_0_UK:
        return "CC-BY-NC-SA-2.0-UK";
      case CC_BY_NC_SA_2_5:
        return "CC-BY-NC-SA-2.5";
      case CC_BY_NC_SA_3_0:
        return "CC-BY-NC-SA-3.0";
      case CC_BY_NC_SA_3_0_DE:
        return "CC-BY-NC-SA-3.0-DE";
      case CC_BY_NC_SA_3_0_IGO:
        return "CC-BY-NC-SA-3.0-IGO";
      case CC_BY_NC_SA_4_0:
        return "CC-BY-NC-SA-4.0";
      case CC_BY_ND_1_0:
        return "CC-BY-ND-1.0";
      case CC_BY_ND_2_0:
        return "CC-BY-ND-2.0";
      case CC_BY_ND_2_5:
        return "CC-BY-ND-2.5";
      case CC_BY_ND_3_0:
        return "CC-BY-ND-3.0";
      case CC_BY_ND_3_0_DE:
        return "CC-BY-ND-3.0-DE";
      case CC_BY_ND_4_0:
        return "CC-BY-ND-4.0";
      case CC_BY_SA_1_0:
        return "CC-BY-SA-1.0";
      case CC_BY_SA_2_0:
        return "CC-BY-SA-2.0";
      case CC_BY_SA_2_0_UK:
        return "CC-BY-SA-2.0-UK";
      case CC_BY_SA_2_1_JP:
        return "CC-BY-SA-2.1-JP";
      case CC_BY_SA_2_5:
        return "CC-BY-SA-2.5";
      case CC_BY_SA_3_0:
        return "CC-BY-SA-3.0";
      case CC_BY_SA_3_0_AT:
        return "CC-BY-SA-3.0-AT";
      case CC_BY_SA_3_0_DE:
        return "CC-BY-SA-3.0-DE";
      case CC_BY_SA_3_0_IGO:
        return "CC-BY-SA-3.0-IGO";
      case CC_BY_SA_4_0:
        return "CC-BY-SA-4.0";
      case CC_PDDC:
        return "CC-PDDC";
      case CC0_1_0:
        return "CC0-1.0";
      case CDDL_1_0:
        return "CDDL-1.0";
      case CDDL_1_1:
        return "CDDL-1.1";
      case CDL_1_0:
        return "CDL-1.0";
      case CDLA_PERMISSIVE_1_0:
        return "CDLA-Permissive-1.0";
      case CDLA_PERMISSIVE_2_0:
        return "CDLA-Permissive-2.0";
      case CDLA_SHARING_1_0:
        return "CDLA-Sharing-1.0";
      case CECILL_1_0:
        return "CECILL-1.0";
      case CECILL_1_1:
        return "CECILL-1.1";
      case CECILL_2_0:
        return "CECILL-2.0";
      case CECILL_2_1:
        return "CECILL-2.1";
      case CECILL_B:
        return "CECILL-B";
      case CECILL_C:
        return "CECILL-C";
      case CERN_OHL_1_1:
        return "CERN-OHL-1.1";
      case CERN_OHL_1_2:
        return "CERN-OHL-1.2";
      case CERN_OHL_P_2_0:
        return "CERN-OHL-P-2.0";
      case CERN_OHL_S_2_0:
        return "CERN-OHL-S-2.0";
      case CERN_OHL_W_2_0:
        return "CERN-OHL-W-2.0";
      case CFITSIO:
        return "CFITSIO";
      case CHECKMK:
        return "checkmk";
      case CLARTISTIC:
        return "ClArtistic";
      case CLIPS:
        return "Clips";
      case CMU_MACH:
        return "CMU-Mach";
      case CNRI_JYTHON:
        return "CNRI-Jython";
      case CNRI_PYTHON:
        return "CNRI-Python";
      case CNRI_PYTHON_GPL_COMPATIBLE:
        return "CNRI-Python-GPL-Compatible";
      case COIL_1_0:
        return "COIL-1.0";
      case COMMUNITY_SPEC_1_0:
        return "Community-Spec-1.0";
      case CONDOR_1_1:
        return "Condor-1.1";
      case COPYLEFT_NEXT_0_3_0:
        return "copyleft-next-0.3.0";
      case COPYLEFT_NEXT_0_3_1:
        return "copyleft-next-0.3.1";
      case CORNELL_LOSSLESS_JPEG:
        return "Cornell-Lossless-JPEG";
      case CPAL_1_0:
        return "CPAL-1.0";
      case CPL_1_0:
        return "CPL-1.0";
      case CPOL_1_02:
        return "CPOL-1.02";
      case CROSSWORD:
        return "Crossword";
      case CRYSTALSTACKER:
        return "CrystalStacker";
      case CUA_OPL_1_0:
        return "CUA-OPL-1.0";
      case CUBE:
        return "Cube";
      case CURL:
        return "curl";
      case D_FSL_1_0:
        return "D-FSL-1.0";
      case DIFFMARK:
        return "diffmark";
      case DL_DE_BY_2_0:
        return "DL-DE-BY-2.0";
      case DOC:
        return "DOC";
      case DOTSEQN:
        return "Dotseqn";
      case DRL_1_0:
        return "DRL-1.0";
      case DSDP:
        return "DSDP";
      case DTOA:
        return "dtoa";
      case DVIPDFM:
        return "dvipdfm";
      case ECL_1_0:
        return "ECL-1.0";
      case ECL_2_0:
        return "ECL-2.0";
      case ECOS_2_0:
        return "eCos-2.0";
      case EFL_1_0:
        return "EFL-1.0";
      case EFL_2_0:
        return "EFL-2.0";
      case EGENIX:
        return "eGenix";
      case ELASTIC_2_0:
        return "Elastic-2.0";
      case ENTESSA:
        return "Entessa";
      case EPICS:
        return "EPICS";
      case EPL_1_0:
        return "EPL-1.0";
      case EPL_2_0:
        return "EPL-2.0";
      case ERLPL_1_1:
        return "ErlPL-1.1";
      case ETALAB_2_0:
        return "etalab-2.0";
      case EUDATAGRID:
        return "EUDatagrid";
      case EUPL_1_0:
        return "EUPL-1.0";
      case EUPL_1_1:
        return "EUPL-1.1";
      case EUPL_1_2:
        return "EUPL-1.2";
      case EUROSYM:
        return "Eurosym";
      case FAIR:
        return "Fair";
      case FDK_AAC:
        return "FDK-AAC";
      case FRAMEWORX_1_0:
        return "Frameworx-1.0";
      case FREEBSD_DOC:
        return "FreeBSD-DOC";
      case FREEIMAGE:
        return "FreeImage";
      case FSFAP:
        return "FSFAP";
      case FSFUL:
        return "FSFUL";
      case FSFULLR:
        return "FSFULLR";
      case FSFULLRWD:
        return "FSFULLRWD";
      case FTL:
        return "FTL";
      case GD:
        return "GD";
      case GFDL_1_1:
        return "GFDL-1.1";
      case GFDL_1_1_INVARIANTS_ONLY:
        return "GFDL-1.1-invariants-only";
      case GFDL_1_1_INVARIANTS_OR_LATER:
        return "GFDL-1.1-invariants-or-later";
      case GFDL_1_1_NO_INVARIANTS_ONLY:
        return "GFDL-1.1-no-invariants-only";
      case GFDL_1_1_NO_INVARIANTS_OR_LATER:
        return "GFDL-1.1-no-invariants-or-later";
      case GFDL_1_1_ONLY:
        return "GFDL-1.1-only";
      case GFDL_1_1_OR_LATER:
        return "GFDL-1.1-or-later";
      case GFDL_1_2:
        return "GFDL-1.2";
      case GFDL_1_2_INVARIANTS_ONLY:
        return "GFDL-1.2-invariants-only";
      case GFDL_1_2_INVARIANTS_OR_LATER:
        return "GFDL-1.2-invariants-or-later";
      case GFDL_1_2_NO_INVARIANTS_ONLY:
        return "GFDL-1.2-no-invariants-only";
      case GFDL_1_2_NO_INVARIANTS_OR_LATER:
        return "GFDL-1.2-no-invariants-or-later";
      case GFDL_1_2_ONLY:
        return "GFDL-1.2-only";
      case GFDL_1_2_OR_LATER:
        return "GFDL-1.2-or-later";
      case GFDL_1_3:
        return "GFDL-1.3";
      case GFDL_1_3_INVARIANTS_ONLY:
        return "GFDL-1.3-invariants-only";
      case GFDL_1_3_INVARIANTS_OR_LATER:
        return "GFDL-1.3-invariants-or-later";
      case GFDL_1_3_NO_INVARIANTS_ONLY:
        return "GFDL-1.3-no-invariants-only";
      case GFDL_1_3_NO_INVARIANTS_OR_LATER:
        return "GFDL-1.3-no-invariants-or-later";
      case GFDL_1_3_ONLY:
        return "GFDL-1.3-only";
      case GFDL_1_3_OR_LATER:
        return "GFDL-1.3-or-later";
      case GIFTWARE:
        return "Giftware";
      case GL2PS:
        return "GL2PS";
      case GLIDE:
        return "Glide";
      case GLULXE:
        return "Glulxe";
      case GLWTPL:
        return "GLWTPL";
      case GNUPLOT:
        return "gnuplot";
      case GPL_1_0:
        return "GPL-1.0";
      case GPL_1_0PLUS:
        return "GPL-1.0+";
      case GPL_1_0_ONLY:
        return "GPL-1.0-only";
      case GPL_1_0_OR_LATER:
        return "GPL-1.0-or-later";
      case GPL_2_0:
        return "GPL-2.0";
      case GPL_2_0PLUS:
        return "GPL-2.0+";
      case GPL_2_0_ONLY:
        return "GPL-2.0-only";
      case GPL_2_0_OR_LATER:
        return "GPL-2.0-or-later";
      case GPL_2_0_WITH_AUTOCONF_EXCEPTION:
        return "GPL-2.0-with-autoconf-exception";
      case GPL_2_0_WITH_BISON_EXCEPTION:
        return "GPL-2.0-with-bison-exception";
      case GPL_2_0_WITH_CLASSPATH_EXCEPTION:
        return "GPL-2.0-with-classpath-exception";
      case GPL_2_0_WITH_FONT_EXCEPTION:
        return "GPL-2.0-with-font-exception";
      case GPL_2_0_WITH_GCC_EXCEPTION:
        return "GPL-2.0-with-GCC-exception";
      case GPL_3_0:
        return "GPL-3.0";
      case GPL_3_0PLUS:
        return "GPL-3.0+";
      case GPL_3_0_ONLY:
        return "GPL-3.0-only";
      case GPL_3_0_OR_LATER:
        return "GPL-3.0-or-later";
      case GPL_3_0_WITH_AUTOCONF_EXCEPTION:
        return "GPL-3.0-with-autoconf-exception";
      case GPL_3_0_WITH_GCC_EXCEPTION:
        return "GPL-3.0-with-GCC-exception";
      case GRAPHICS_GEMS:
        return "Graphics-Gems";
      case GSOAP_1_3B:
        return "gSOAP-1.3b";
      case HASKELLREPORT:
        return "HaskellReport";
      case HIPPOCRATIC_2_1:
        return "Hippocratic-2.1";
      case HP_1986:
        return "HP-1986";
      case HPND:
        return "HPND";
      case HPND_EXPORT_US:
        return "HPND-export-US";
      case HPND_MARKUS_KUHN:
        return "HPND-Markus-Kuhn";
      case HPND_SELL_VARIANT:
        return "HPND-sell-variant";
      case HPND_SELL_VARIANT_MIT_DISCLAIMER:
        return "HPND-sell-variant-MIT-disclaimer";
      case HTMLTIDY:
        return "HTMLTIDY";
      case IBM_PIBS:
        return "IBM-pibs";
      case ICU:
        return "ICU";
      case IEC_CODE_COMPONENTS_EULA:
        return "IEC-Code-Components-EULA";
      case IJG:
        return "IJG";
      case IJG_SHORT:
        return "IJG-short";
      case IMAGEMAGICK:
        return "ImageMagick";
      case IMATIX:
        return "iMatix";
      case IMLIB2:
        return "Imlib2";
      case INFO_ZIP:
        return "Info-ZIP";
      case INNER_NET_2_0:
        return "Inner-Net-2.0";
      case INTEL:
        return "Intel";
      case INTEL_ACPI:
        return "Intel-ACPI";
      case INTERBASE_1_0:
        return "Interbase-1.0";
      case IPA:
        return "IPA";
      case IPL_1_0:
        return "IPL-1.0";
      case ISC:
        return "ISC";
      case JAM:
        return "Jam";
      case JASPER_2_0:
        return "JasPer-2.0";
      case JPL_IMAGE:
        return "JPL-image";
      case JPNIC:
        return "JPNIC";
      case JSON:
        return "JSON";
      case KAZLIB:
        return "Kazlib";
      case KNUTH_CTAN:
        return "Knuth-CTAN";
      case LAL_1_2:
        return "LAL-1.2";
      case LAL_1_3:
        return "LAL-1.3";
      case LATEX2E:
        return "Latex2e";
      case LATEX2E_TRANSLATED_NOTICE:
        return "Latex2e-translated-notice";
      case LEPTONICA:
        return "Leptonica";
      case LGPL_2_0:
        return "LGPL-2.0";
      case LGPL_2_0PLUS:
        return "LGPL-2.0+";
      case LGPL_2_0_ONLY:
        return "LGPL-2.0-only";
      case LGPL_2_0_OR_LATER:
        return "LGPL-2.0-or-later";
      case LGPL_2_1:
        return "LGPL-2.1";
      case LGPL_2_1PLUS:
        return "LGPL-2.1+";
      case LGPL_2_1_ONLY:
        return "LGPL-2.1-only";
      case LGPL_2_1_OR_LATER:
        return "LGPL-2.1-or-later";
      case LGPL_3_0:
        return "LGPL-3.0";
      case LGPL_3_0PLUS:
        return "LGPL-3.0+";
      case LGPL_3_0_ONLY:
        return "LGPL-3.0-only";
      case LGPL_3_0_OR_LATER:
        return "LGPL-3.0-or-later";
      case LGPLLR:
        return "LGPLLR";
      case LIBPNG:
        return "Libpng";
      case LIBPNG_2_0:
        return "libpng-2.0";
      case LIBSELINUX_1_0:
        return "libselinux-1.0";
      case LIBTIFF:
        return "libtiff";
      case LIBUTIL_DAVID_NUGENT:
        return "libutil-David-Nugent";
      case LILIQ_P_1_1:
        return "LiLiQ-P-1.1";
      case LILIQ_R_1_1:
        return "LiLiQ-R-1.1";
      case LILIQ_RPLUS_1_1:
        return "LiLiQ-Rplus-1.1";
      case LINUX_MAN_PAGES_1_PARA:
        return "Linux-man-pages-1-para";
      case LINUX_MAN_PAGES_COPYLEFT:
        return "Linux-man-pages-copyleft";
      case LINUX_MAN_PAGES_COPYLEFT_2_PARA:
        return "Linux-man-pages-copyleft-2-para";
      case LINUX_MAN_PAGES_COPYLEFT_VAR:
        return "Linux-man-pages-copyleft-var";
      case LINUX_OPENIB:
        return "Linux-OpenIB";
      case LOOP:
        return "LOOP";
      case LPL_1_0:
        return "LPL-1.0";
      case LPL_1_02:
        return "LPL-1.02";
      case LPPL_1_0:
        return "LPPL-1.0";
      case LPPL_1_1:
        return "LPPL-1.1";
      case LPPL_1_2:
        return "LPPL-1.2";
      case LPPL_1_3A:
        return "LPPL-1.3a";
      case LPPL_1_3C:
        return "LPPL-1.3c";
      case LZMA_SDK_9_11_TO_9_20:
        return "LZMA-SDK-9.11-to-9.20";
      case LZMA_SDK_9_22:
        return "LZMA-SDK-9.22";
      case MAKEINDEX:
        return "MakeIndex";
      case MARTIN_BIRGMEIER:
        return "Martin-Birgmeier";
      case METAMAIL:
        return "metamail";
      case MINPACK:
        return "Minpack";
      case MIROS:
        return "MirOS";
      case MIT:
        return "MIT";
      case MIT_0:
        return "MIT-0";
      case MIT_ADVERTISING:
        return "MIT-advertising";
      case MIT_CMU:
        return "MIT-CMU";
      case MIT_ENNA:
        return "MIT-enna";
      case MIT_FEH:
        return "MIT-feh";
      case MIT_FESTIVAL:
        return "MIT-Festival";
      case MIT_MODERN_VARIANT:
        return "MIT-Modern-Variant";
      case MIT_OPEN_GROUP:
        return "MIT-open-group";
      case MIT_WU:
        return "MIT-Wu";
      case MITNFA:
        return "MITNFA";
      case MOTOSOTO:
        return "Motosoto";
      case MPI_PERMISSIVE:
        return "mpi-permissive";
      case MPICH2:
        return "mpich2";
      case MPL_1_0:
        return "MPL-1.0";
      case MPL_1_1:
        return "MPL-1.1";
      case MPL_2_0:
        return "MPL-2.0";
      case MPL_2_0_NO_COPYLEFT_EXCEPTION:
        return "MPL-2.0-no-copyleft-exception";
      case MPLUS:
        return "mplus";
      case MS_LPL:
        return "MS-LPL";
      case MS_PL:
        return "MS-PL";
      case MS_RL:
        return "MS-RL";
      case MTLL:
        return "MTLL";
      case MULANPSL_1_0:
        return "MulanPSL-1.0";
      case MULANPSL_2_0:
        return "MulanPSL-2.0";
      case MULTICS:
        return "Multics";
      case MUP:
        return "Mup";
      case NAIST_2003:
        return "NAIST-2003";
      case NASA_1_3:
        return "NASA-1.3";
      case NAUMEN:
        return "Naumen";
      case NBPL_1_0:
        return "NBPL-1.0";
      case NCGL_UK_2_0:
        return "NCGL-UK-2.0";
      case NCSA:
        return "NCSA";
      case NET_SNMP:
        return "Net-SNMP";
      case NETCDF:
        return "NetCDF";
      case NEWSLETR:
        return "Newsletr";
      case NGPL:
        return "NGPL";
      case NICTA_1_0:
        return "NICTA-1.0";
      case NIST_PD:
        return "NIST-PD";
      case NIST_PD_FALLBACK:
        return "NIST-PD-fallback";
      case NIST_SOFTWARE:
        return "NIST-Software";
      case NLOD_1_0:
        return "NLOD-1.0";
      case NLOD_2_0:
        return "NLOD-2.0";
      case NLPL:
        return "NLPL";
      case NOKIA:
        return "Nokia";
      case NOSL:
        return "NOSL";
      case NOT_OPEN_SOURCE:
        return "not-open-source";
      case NOWEB:
        return "Noweb";
      case NPL_1_0:
        return "NPL-1.0";
      case NPL_1_1:
        return "NPL-1.1";
      case NPOSL_3_0:
        return "NPOSL-3.0";
      case NRL:
        return "NRL";
      case NTP:
        return "NTP";
      case NTP_0:
        return "NTP-0";
      case NUNIT:
        return "Nunit";
      case O_UDA_1_0:
        return "O-UDA-1.0";
      case OCCT_PL:
        return "OCCT-PL";
      case OCLC_2_0:
        return "OCLC-2.0";
      case ODBL_1_0:
        return "ODbL-1.0";
      case ODC_BY_1_0:
        return "ODC-By-1.0";
      case OFFIS:
        return "OFFIS";
      case OFL_1_0:
        return "OFL-1.0";
      case OFL_1_0_NO_RFN:
        return "OFL-1.0-no-RFN";
      case OFL_1_0_RFN:
        return "OFL-1.0-RFN";
      case OFL_1_1:
        return "OFL-1.1";
      case OFL_1_1_NO_RFN:
        return "OFL-1.1-no-RFN";
      case OFL_1_1_RFN:
        return "OFL-1.1-RFN";
      case OGC_1_0:
        return "OGC-1.0";
      case OGDL_TAIWAN_1_0:
        return "OGDL-Taiwan-1.0";
      case OGL_CANADA_2_0:
        return "OGL-Canada-2.0";
      case OGL_UK_1_0:
        return "OGL-UK-1.0";
      case OGL_UK_2_0:
        return "OGL-UK-2.0";
      case OGL_UK_3_0:
        return "OGL-UK-3.0";
      case OGTSL:
        return "OGTSL";
      case OLDAP_1_1:
        return "OLDAP-1.1";
      case OLDAP_1_2:
        return "OLDAP-1.2";
      case OLDAP_1_3:
        return "OLDAP-1.3";
      case OLDAP_1_4:
        return "OLDAP-1.4";
      case OLDAP_2_0:
        return "OLDAP-2.0";
      case OLDAP_2_0_1:
        return "OLDAP-2.0.1";
      case OLDAP_2_1:
        return "OLDAP-2.1";
      case OLDAP_2_2:
        return "OLDAP-2.2";
      case OLDAP_2_2_1:
        return "OLDAP-2.2.1";
      case OLDAP_2_2_2:
        return "OLDAP-2.2.2";
      case OLDAP_2_3:
        return "OLDAP-2.3";
      case OLDAP_2_4:
        return "OLDAP-2.4";
      case OLDAP_2_5:
        return "OLDAP-2.5";
      case OLDAP_2_6:
        return "OLDAP-2.6";
      case OLDAP_2_7:
        return "OLDAP-2.7";
      case OLDAP_2_8:
        return "OLDAP-2.8";
      case OLFL_1_3:
        return "OLFL-1.3";
      case OML:
        return "OML";
      case OPENPBS_2_3:
        return "OpenPBS-2.3";
      case OPENSSL:
        return "OpenSSL";
      case OPL_1_0:
        return "OPL-1.0";
      case OPL_UK_3_0:
        return "OPL-UK-3.0";
      case OPUBL_1_0:
        return "OPUBL-1.0";
      case OSET_PL_2_1:
        return "OSET-PL-2.1";
      case OSL_1_0:
        return "OSL-1.0";
      case OSL_1_1:
        return "OSL-1.1";
      case OSL_2_0:
        return "OSL-2.0";
      case OSL_2_1:
        return "OSL-2.1";
      case OSL_3_0:
        return "OSL-3.0";
      case PARITY_6_0_0:
        return "Parity-6.0.0";
      case PARITY_7_0_0:
        return "Parity-7.0.0";
      case PDDL_1_0:
        return "PDDL-1.0";
      case PHP_3_0:
        return "PHP-3.0";
      case PHP_3_01:
        return "PHP-3.01";
      case PLEXUS:
        return "Plexus";
      case POLYFORM_NONCOMMERCIAL_1_0_0:
        return "PolyForm-Noncommercial-1.0.0";
      case POLYFORM_SMALL_BUSINESS_1_0_0:
        return "PolyForm-Small-Business-1.0.0";
      case POSTGRESQL:
        return "PostgreSQL";
      case PSF_2_0:
        return "PSF-2.0";
      case PSFRAG:
        return "psfrag";
      case PSUTILS:
        return "psutils";
      case PYTHON_2_0:
        return "Python-2.0";
      case PYTHON_2_0_1:
        return "Python-2.0.1";
      case QHULL:
        return "Qhull";
      case QPL_1_0:
        return "QPL-1.0";
      case QPL_1_0_INRIA_2004:
        return "QPL-1.0-INRIA-2004";
      case RDISC:
        return "Rdisc";
      case RHECOS_1_1:
        return "RHeCos-1.1";
      case RPL_1_1:
        return "RPL-1.1";
      case RPL_1_5:
        return "RPL-1.5";
      case RPSL_1_0:
        return "RPSL-1.0";
      case RSA_MD:
        return "RSA-MD";
      case RSCPL:
        return "RSCPL";
      case RUBY:
        return "Ruby";
      case SAX_PD:
        return "SAX-PD";
      case SAXPATH:
        return "Saxpath";
      case SCEA:
        return "SCEA";
      case SCHEMEREPORT:
        return "SchemeReport";
      case SENDMAIL:
        return "Sendmail";
      case SENDMAIL_8_23:
        return "Sendmail-8.23";
      case SGI_B_1_0:
        return "SGI-B-1.0";
      case SGI_B_1_1:
        return "SGI-B-1.1";
      case SGI_B_2_0:
        return "SGI-B-2.0";
      case SGP4:
        return "SGP4";
      case SHL_0_5:
        return "SHL-0.5";
      case SHL_0_51:
        return "SHL-0.51";
      case SIMPL_2_0:
        return "SimPL-2.0";
      case SISSL:
        return "SISSL";
      case SISSL_1_2:
        return "SISSL-1.2";
      case SLEEPYCAT:
        return "Sleepycat";
      case SMLNJ:
        return "SMLNJ";
      case SMPPL:
        return "SMPPL";
      case SNIA:
        return "SNIA";
      case SNPRINTF:
        return "snprintf";
      case SPENCER_86:
        return "Spencer-86";
      case SPENCER_94:
        return "Spencer-94";
      case SPENCER_99:
        return "Spencer-99";
      case SPL_1_0:
        return "SPL-1.0";
      case SSH_OPENSSH:
        return "SSH-OpenSSH";
      case SSH_SHORT:
        return "SSH-short";
      case SSPL_1_0:
        return "SSPL-1.0";
      case STANDARDML_NJ:
        return "StandardML-NJ";
      case SUGARCRM_1_1_3:
        return "SugarCRM-1.1.3";
      case SUNPRO:
        return "SunPro";
      case SWL:
        return "SWL";
      case SYMLINKS:
        return "Symlinks";
      case TAPR_OHL_1_0:
        return "TAPR-OHL-1.0";
      case TCL:
        return "TCL";
      case TCP_WRAPPERS:
        return "TCP-wrappers";
      case TERMREADKEY:
        return "TermReadKey";
      case TMATE:
        return "TMate";
      case TORQUE_1_1:
        return "TORQUE-1.1";
      case TOSL:
        return "TOSL";
      case TPDL:
        return "TPDL";
      case TPL_1_0:
        return "TPL-1.0";
      case TTWL:
        return "TTWL";
      case TU_BERLIN_1_0:
        return "TU-Berlin-1.0";
      case TU_BERLIN_2_0:
        return "TU-Berlin-2.0";
      case UCAR:
        return "UCAR";
      case UCL_1_0:
        return "UCL-1.0";
      case UNICODE_DFS_2015:
        return "Unicode-DFS-2015";
      case UNICODE_DFS_2016:
        return "Unicode-DFS-2016";
      case UNICODE_TOU:
        return "Unicode-TOU";
      case UNIXCRYPT:
        return "UnixCrypt";
      case UNLICENSE:
        return "Unlicense";
      case UPL_1_0:
        return "UPL-1.0";
      case VIM:
        return "Vim";
      case VOSTROM:
        return "VOSTROM";
      case VSL_1_0:
        return "VSL-1.0";
      case W3C:
        return "W3C";
      case W3C_19980720:
        return "W3C-19980720";
      case W3C_20150513:
        return "W3C-20150513";
      case W3M:
        return "w3m";
      case WATCOM_1_0:
        return "Watcom-1.0";
      case WIDGET_WORKSHOP:
        return "Widget-Workshop";
      case WSUIPA:
        return "Wsuipa";
      case WTFPL:
        return "WTFPL";
      case WXWINDOWS:
        return "wxWindows";
      case X11:
        return "X11";
      case X11_DISTRIBUTE_MODIFICATIONS_VARIANT:
        return "X11-distribute-modifications-variant";
      case XDEBUG_1_03:
        return "Xdebug-1.03";
      case XEROX:
        return "Xerox";
      case XFIG:
        return "Xfig";
      case XFREE86_1_1:
        return "XFree86-1.1";
      case XINETD:
        return "xinetd";
      case XLOCK:
        return "xlock";
      case XNET:
        return "Xnet";
      case XPP:
        return "xpp";
      case XSKAT:
        return "XSkat";
      case YPL_1_0:
        return "YPL-1.0";
      case YPL_1_1:
        return "YPL-1.1";
      case ZED:
        return "Zed";
      case ZEND_2_0:
        return "Zend-2.0";
      case ZIMBRA_1_3:
        return "Zimbra-1.3";
      case ZIMBRA_1_4:
        return "Zimbra-1.4";
      case ZLIB:
        return "Zlib";
      case ZLIB_ACKNOWLEDGEMENT:
        return "zlib-acknowledgement";
      case ZPL_1_1:
        return "ZPL-1.1";
      case ZPL_2_0:
        return "ZPL-2.0";
      case ZPL_2_1:
        return "ZPL-2.1";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case _0BSD:
        return "http://hl7.org/fhir/spdx-license";
      case AAL:
        return "http://hl7.org/fhir/spdx-license";
      case ABSTYLES:
        return "http://hl7.org/fhir/spdx-license";
      case ADACORE_DOC:
        return "http://hl7.org/fhir/spdx-license";
      case ADOBE_2006:
        return "http://hl7.org/fhir/spdx-license";
      case ADOBE_GLYPH:
        return "http://hl7.org/fhir/spdx-license";
      case ADSL:
        return "http://hl7.org/fhir/spdx-license";
      case AFL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case AFL_1_2:
        return "http://hl7.org/fhir/spdx-license";
      case AFL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case AFL_2_1:
        return "http://hl7.org/fhir/spdx-license";
      case AFL_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case AFMPARSE:
        return "http://hl7.org/fhir/spdx-license";
      case AGPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case AGPL_1_0_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case AGPL_1_0_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case AGPL_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case AGPL_3_0_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case AGPL_3_0_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case ALADDIN:
        return "http://hl7.org/fhir/spdx-license";
      case AMDPLPA:
        return "http://hl7.org/fhir/spdx-license";
      case AML:
        return "http://hl7.org/fhir/spdx-license";
      case AMPAS:
        return "http://hl7.org/fhir/spdx-license";
      case ANTLR_PD:
        return "http://hl7.org/fhir/spdx-license";
      case ANTLR_PD_FALLBACK:
        return "http://hl7.org/fhir/spdx-license";
      case APACHE_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case APACHE_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case APACHE_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case APAFML:
        return "http://hl7.org/fhir/spdx-license";
      case APL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case APP_S2P:
        return "http://hl7.org/fhir/spdx-license";
      case APSL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case APSL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case APSL_1_2:
        return "http://hl7.org/fhir/spdx-license";
      case APSL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case ARPHIC_1999:
        return "http://hl7.org/fhir/spdx-license";
      case ARTISTIC_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case ARTISTIC_1_0_CL8:
        return "http://hl7.org/fhir/spdx-license";
      case ARTISTIC_1_0_PERL:
        return "http://hl7.org/fhir/spdx-license";
      case ARTISTIC_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case ASWF_DIGITAL_ASSETS_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case ASWF_DIGITAL_ASSETS_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case BAEKMUK:
        return "http://hl7.org/fhir/spdx-license";
      case BAHYPH:
        return "http://hl7.org/fhir/spdx-license";
      case BARR:
        return "http://hl7.org/fhir/spdx-license";
      case BEERWARE:
        return "http://hl7.org/fhir/spdx-license";
      case BITSTREAM_CHARTER:
        return "http://hl7.org/fhir/spdx-license";
      case BITSTREAM_VERA:
        return "http://hl7.org/fhir/spdx-license";
      case BITTORRENT_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case BITTORRENT_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case BLESSING:
        return "http://hl7.org/fhir/spdx-license";
      case BLUEOAK_1_0_0:
        return "http://hl7.org/fhir/spdx-license";
      case BOEHM_GC:
        return "http://hl7.org/fhir/spdx-license";
      case BORCEUX:
        return "http://hl7.org/fhir/spdx-license";
      case BRIAN_GLADMAN_3_CLAUSE:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_1_CLAUSE:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_2_CLAUSE:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_2_CLAUSE_FREEBSD:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_2_CLAUSE_NETBSD:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_2_CLAUSE_PATENT:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_2_CLAUSE_VIEWS:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_3_CLAUSE:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_3_CLAUSE_ATTRIBUTION:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_3_CLAUSE_CLEAR:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_3_CLAUSE_LBNL:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_3_CLAUSE_MODIFICATION:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_3_CLAUSE_NO_MILITARY_LICENSE:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_3_CLAUSE_OPEN_MPI:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_4_CLAUSE:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_4_CLAUSE_SHORTENED:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_4_CLAUSE_UC:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_4_3RENO:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_4_3TAHOE:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_ADVERTISING_ACKNOWLEDGEMENT:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_ATTRIBUTION_HPND_DISCLAIMER:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_PROTECTION:
        return "http://hl7.org/fhir/spdx-license";
      case BSD_SOURCE_CODE:
        return "http://hl7.org/fhir/spdx-license";
      case BSL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case BUSL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case BZIP2_1_0_5:
        return "http://hl7.org/fhir/spdx-license";
      case BZIP2_1_0_6:
        return "http://hl7.org/fhir/spdx-license";
      case C_UDA_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CAL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CAL_1_0_COMBINED_WORK_EXCEPTION:
        return "http://hl7.org/fhir/spdx-license";
      case CALDERA:
        return "http://hl7.org/fhir/spdx-license";
      case CATOSL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_2_5:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_2_5_AU:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_3_0_AT:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_3_0_DE:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_3_0_IGO:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_3_0_NL:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_3_0_US:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_4_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_2_5:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_3_0_DE:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_4_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_ND_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_ND_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_ND_2_5:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_ND_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_ND_3_0_DE:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_ND_3_0_IGO:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_ND_4_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_SA_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_SA_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_SA_2_0_DE:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_SA_2_0_FR:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_SA_2_0_UK:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_SA_2_5:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_SA_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_SA_3_0_DE:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_SA_3_0_IGO:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_NC_SA_4_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_ND_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_ND_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_ND_2_5:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_ND_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_ND_3_0_DE:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_ND_4_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_SA_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_SA_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_SA_2_0_UK:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_SA_2_1_JP:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_SA_2_5:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_SA_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_SA_3_0_AT:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_SA_3_0_DE:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_SA_3_0_IGO:
        return "http://hl7.org/fhir/spdx-license";
      case CC_BY_SA_4_0:
        return "http://hl7.org/fhir/spdx-license";
      case CC_PDDC:
        return "http://hl7.org/fhir/spdx-license";
      case CC0_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CDDL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CDDL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case CDL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CDLA_PERMISSIVE_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CDLA_PERMISSIVE_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CDLA_SHARING_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CECILL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CECILL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case CECILL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CECILL_2_1:
        return "http://hl7.org/fhir/spdx-license";
      case CECILL_B:
        return "http://hl7.org/fhir/spdx-license";
      case CECILL_C:
        return "http://hl7.org/fhir/spdx-license";
      case CERN_OHL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case CERN_OHL_1_2:
        return "http://hl7.org/fhir/spdx-license";
      case CERN_OHL_P_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CERN_OHL_S_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CERN_OHL_W_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case CFITSIO:
        return "http://hl7.org/fhir/spdx-license";
      case CHECKMK:
        return "http://hl7.org/fhir/spdx-license";
      case CLARTISTIC:
        return "http://hl7.org/fhir/spdx-license";
      case CLIPS:
        return "http://hl7.org/fhir/spdx-license";
      case CMU_MACH:
        return "http://hl7.org/fhir/spdx-license";
      case CNRI_JYTHON:
        return "http://hl7.org/fhir/spdx-license";
      case CNRI_PYTHON:
        return "http://hl7.org/fhir/spdx-license";
      case CNRI_PYTHON_GPL_COMPATIBLE:
        return "http://hl7.org/fhir/spdx-license";
      case COIL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case COMMUNITY_SPEC_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CONDOR_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case COPYLEFT_NEXT_0_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case COPYLEFT_NEXT_0_3_1:
        return "http://hl7.org/fhir/spdx-license";
      case CORNELL_LOSSLESS_JPEG:
        return "http://hl7.org/fhir/spdx-license";
      case CPAL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CPOL_1_02:
        return "http://hl7.org/fhir/spdx-license";
      case CROSSWORD:
        return "http://hl7.org/fhir/spdx-license";
      case CRYSTALSTACKER:
        return "http://hl7.org/fhir/spdx-license";
      case CUA_OPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case CUBE:
        return "http://hl7.org/fhir/spdx-license";
      case CURL:
        return "http://hl7.org/fhir/spdx-license";
      case D_FSL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case DIFFMARK:
        return "http://hl7.org/fhir/spdx-license";
      case DL_DE_BY_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case DOC:
        return "http://hl7.org/fhir/spdx-license";
      case DOTSEQN:
        return "http://hl7.org/fhir/spdx-license";
      case DRL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case DSDP:
        return "http://hl7.org/fhir/spdx-license";
      case DTOA:
        return "http://hl7.org/fhir/spdx-license";
      case DVIPDFM:
        return "http://hl7.org/fhir/spdx-license";
      case ECL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case ECL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case ECOS_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case EFL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case EFL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case EGENIX:
        return "http://hl7.org/fhir/spdx-license";
      case ELASTIC_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case ENTESSA:
        return "http://hl7.org/fhir/spdx-license";
      case EPICS:
        return "http://hl7.org/fhir/spdx-license";
      case EPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case EPL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case ERLPL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case ETALAB_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case EUDATAGRID:
        return "http://hl7.org/fhir/spdx-license";
      case EUPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case EUPL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case EUPL_1_2:
        return "http://hl7.org/fhir/spdx-license";
      case EUROSYM:
        return "http://hl7.org/fhir/spdx-license";
      case FAIR:
        return "http://hl7.org/fhir/spdx-license";
      case FDK_AAC:
        return "http://hl7.org/fhir/spdx-license";
      case FRAMEWORX_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case FREEBSD_DOC:
        return "http://hl7.org/fhir/spdx-license";
      case FREEIMAGE:
        return "http://hl7.org/fhir/spdx-license";
      case FSFAP:
        return "http://hl7.org/fhir/spdx-license";
      case FSFUL:
        return "http://hl7.org/fhir/spdx-license";
      case FSFULLR:
        return "http://hl7.org/fhir/spdx-license";
      case FSFULLRWD:
        return "http://hl7.org/fhir/spdx-license";
      case FTL:
        return "http://hl7.org/fhir/spdx-license";
      case GD:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_1_INVARIANTS_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_1_INVARIANTS_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_1_NO_INVARIANTS_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_1_NO_INVARIANTS_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_1_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_1_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_2:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_2_INVARIANTS_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_2_INVARIANTS_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_2_NO_INVARIANTS_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_2_NO_INVARIANTS_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_2_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_2_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_3:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_3_INVARIANTS_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_3_INVARIANTS_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_3_NO_INVARIANTS_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_3_NO_INVARIANTS_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_3_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GFDL_1_3_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GIFTWARE:
        return "http://hl7.org/fhir/spdx-license";
      case GL2PS:
        return "http://hl7.org/fhir/spdx-license";
      case GLIDE:
        return "http://hl7.org/fhir/spdx-license";
      case GLULXE:
        return "http://hl7.org/fhir/spdx-license";
      case GLWTPL:
        return "http://hl7.org/fhir/spdx-license";
      case GNUPLOT:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_1_0PLUS:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_1_0_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_1_0_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_2_0PLUS:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_2_0_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_2_0_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_2_0_WITH_AUTOCONF_EXCEPTION:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_2_0_WITH_BISON_EXCEPTION:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_2_0_WITH_CLASSPATH_EXCEPTION:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_2_0_WITH_FONT_EXCEPTION:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_2_0_WITH_GCC_EXCEPTION:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_3_0PLUS:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_3_0_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_3_0_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_3_0_WITH_AUTOCONF_EXCEPTION:
        return "http://hl7.org/fhir/spdx-license";
      case GPL_3_0_WITH_GCC_EXCEPTION:
        return "http://hl7.org/fhir/spdx-license";
      case GRAPHICS_GEMS:
        return "http://hl7.org/fhir/spdx-license";
      case GSOAP_1_3B:
        return "http://hl7.org/fhir/spdx-license";
      case HASKELLREPORT:
        return "http://hl7.org/fhir/spdx-license";
      case HIPPOCRATIC_2_1:
        return "http://hl7.org/fhir/spdx-license";
      case HP_1986:
        return "http://hl7.org/fhir/spdx-license";
      case HPND:
        return "http://hl7.org/fhir/spdx-license";
      case HPND_EXPORT_US:
        return "http://hl7.org/fhir/spdx-license";
      case HPND_MARKUS_KUHN:
        return "http://hl7.org/fhir/spdx-license";
      case HPND_SELL_VARIANT:
        return "http://hl7.org/fhir/spdx-license";
      case HPND_SELL_VARIANT_MIT_DISCLAIMER:
        return "http://hl7.org/fhir/spdx-license";
      case HTMLTIDY:
        return "http://hl7.org/fhir/spdx-license";
      case IBM_PIBS:
        return "http://hl7.org/fhir/spdx-license";
      case ICU:
        return "http://hl7.org/fhir/spdx-license";
      case IEC_CODE_COMPONENTS_EULA:
        return "http://hl7.org/fhir/spdx-license";
      case IJG:
        return "http://hl7.org/fhir/spdx-license";
      case IJG_SHORT:
        return "http://hl7.org/fhir/spdx-license";
      case IMAGEMAGICK:
        return "http://hl7.org/fhir/spdx-license";
      case IMATIX:
        return "http://hl7.org/fhir/spdx-license";
      case IMLIB2:
        return "http://hl7.org/fhir/spdx-license";
      case INFO_ZIP:
        return "http://hl7.org/fhir/spdx-license";
      case INNER_NET_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case INTEL:
        return "http://hl7.org/fhir/spdx-license";
      case INTEL_ACPI:
        return "http://hl7.org/fhir/spdx-license";
      case INTERBASE_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case IPA:
        return "http://hl7.org/fhir/spdx-license";
      case IPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case ISC:
        return "http://hl7.org/fhir/spdx-license";
      case JAM:
        return "http://hl7.org/fhir/spdx-license";
      case JASPER_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case JPL_IMAGE:
        return "http://hl7.org/fhir/spdx-license";
      case JPNIC:
        return "http://hl7.org/fhir/spdx-license";
      case JSON:
        return "http://hl7.org/fhir/spdx-license";
      case KAZLIB:
        return "http://hl7.org/fhir/spdx-license";
      case KNUTH_CTAN:
        return "http://hl7.org/fhir/spdx-license";
      case LAL_1_2:
        return "http://hl7.org/fhir/spdx-license";
      case LAL_1_3:
        return "http://hl7.org/fhir/spdx-license";
      case LATEX2E:
        return "http://hl7.org/fhir/spdx-license";
      case LATEX2E_TRANSLATED_NOTICE:
        return "http://hl7.org/fhir/spdx-license";
      case LEPTONICA:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_2_0PLUS:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_2_0_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_2_0_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_2_1:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_2_1PLUS:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_2_1_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_2_1_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_3_0PLUS:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_3_0_ONLY:
        return "http://hl7.org/fhir/spdx-license";
      case LGPL_3_0_OR_LATER:
        return "http://hl7.org/fhir/spdx-license";
      case LGPLLR:
        return "http://hl7.org/fhir/spdx-license";
      case LIBPNG:
        return "http://hl7.org/fhir/spdx-license";
      case LIBPNG_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case LIBSELINUX_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case LIBTIFF:
        return "http://hl7.org/fhir/spdx-license";
      case LIBUTIL_DAVID_NUGENT:
        return "http://hl7.org/fhir/spdx-license";
      case LILIQ_P_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case LILIQ_R_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case LILIQ_RPLUS_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case LINUX_MAN_PAGES_1_PARA:
        return "http://hl7.org/fhir/spdx-license";
      case LINUX_MAN_PAGES_COPYLEFT:
        return "http://hl7.org/fhir/spdx-license";
      case LINUX_MAN_PAGES_COPYLEFT_2_PARA:
        return "http://hl7.org/fhir/spdx-license";
      case LINUX_MAN_PAGES_COPYLEFT_VAR:
        return "http://hl7.org/fhir/spdx-license";
      case LINUX_OPENIB:
        return "http://hl7.org/fhir/spdx-license";
      case LOOP:
        return "http://hl7.org/fhir/spdx-license";
      case LPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case LPL_1_02:
        return "http://hl7.org/fhir/spdx-license";
      case LPPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case LPPL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case LPPL_1_2:
        return "http://hl7.org/fhir/spdx-license";
      case LPPL_1_3A:
        return "http://hl7.org/fhir/spdx-license";
      case LPPL_1_3C:
        return "http://hl7.org/fhir/spdx-license";
      case LZMA_SDK_9_11_TO_9_20:
        return "http://hl7.org/fhir/spdx-license";
      case LZMA_SDK_9_22:
        return "http://hl7.org/fhir/spdx-license";
      case MAKEINDEX:
        return "http://hl7.org/fhir/spdx-license";
      case MARTIN_BIRGMEIER:
        return "http://hl7.org/fhir/spdx-license";
      case METAMAIL:
        return "http://hl7.org/fhir/spdx-license";
      case MINPACK:
        return "http://hl7.org/fhir/spdx-license";
      case MIROS:
        return "http://hl7.org/fhir/spdx-license";
      case MIT:
        return "http://hl7.org/fhir/spdx-license";
      case MIT_0:
        return "http://hl7.org/fhir/spdx-license";
      case MIT_ADVERTISING:
        return "http://hl7.org/fhir/spdx-license";
      case MIT_CMU:
        return "http://hl7.org/fhir/spdx-license";
      case MIT_ENNA:
        return "http://hl7.org/fhir/spdx-license";
      case MIT_FEH:
        return "http://hl7.org/fhir/spdx-license";
      case MIT_FESTIVAL:
        return "http://hl7.org/fhir/spdx-license";
      case MIT_MODERN_VARIANT:
        return "http://hl7.org/fhir/spdx-license";
      case MIT_OPEN_GROUP:
        return "http://hl7.org/fhir/spdx-license";
      case MIT_WU:
        return "http://hl7.org/fhir/spdx-license";
      case MITNFA:
        return "http://hl7.org/fhir/spdx-license";
      case MOTOSOTO:
        return "http://hl7.org/fhir/spdx-license";
      case MPI_PERMISSIVE:
        return "http://hl7.org/fhir/spdx-license";
      case MPICH2:
        return "http://hl7.org/fhir/spdx-license";
      case MPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case MPL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case MPL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case MPL_2_0_NO_COPYLEFT_EXCEPTION:
        return "http://hl7.org/fhir/spdx-license";
      case MPLUS:
        return "http://hl7.org/fhir/spdx-license";
      case MS_LPL:
        return "http://hl7.org/fhir/spdx-license";
      case MS_PL:
        return "http://hl7.org/fhir/spdx-license";
      case MS_RL:
        return "http://hl7.org/fhir/spdx-license";
      case MTLL:
        return "http://hl7.org/fhir/spdx-license";
      case MULANPSL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case MULANPSL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case MULTICS:
        return "http://hl7.org/fhir/spdx-license";
      case MUP:
        return "http://hl7.org/fhir/spdx-license";
      case NAIST_2003:
        return "http://hl7.org/fhir/spdx-license";
      case NASA_1_3:
        return "http://hl7.org/fhir/spdx-license";
      case NAUMEN:
        return "http://hl7.org/fhir/spdx-license";
      case NBPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case NCGL_UK_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case NCSA:
        return "http://hl7.org/fhir/spdx-license";
      case NET_SNMP:
        return "http://hl7.org/fhir/spdx-license";
      case NETCDF:
        return "http://hl7.org/fhir/spdx-license";
      case NEWSLETR:
        return "http://hl7.org/fhir/spdx-license";
      case NGPL:
        return "http://hl7.org/fhir/spdx-license";
      case NICTA_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case NIST_PD:
        return "http://hl7.org/fhir/spdx-license";
      case NIST_PD_FALLBACK:
        return "http://hl7.org/fhir/spdx-license";
      case NIST_SOFTWARE:
        return "http://hl7.org/fhir/spdx-license";
      case NLOD_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case NLOD_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case NLPL:
        return "http://hl7.org/fhir/spdx-license";
      case NOKIA:
        return "http://hl7.org/fhir/spdx-license";
      case NOSL:
        return "http://hl7.org/fhir/spdx-license";
      case NOT_OPEN_SOURCE:
        return "http://hl7.org/fhir/spdx-license";
      case NOWEB:
        return "http://hl7.org/fhir/spdx-license";
      case NPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case NPL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case NPOSL_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case NRL:
        return "http://hl7.org/fhir/spdx-license";
      case NTP:
        return "http://hl7.org/fhir/spdx-license";
      case NTP_0:
        return "http://hl7.org/fhir/spdx-license";
      case NUNIT:
        return "http://hl7.org/fhir/spdx-license";
      case O_UDA_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case OCCT_PL:
        return "http://hl7.org/fhir/spdx-license";
      case OCLC_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case ODBL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case ODC_BY_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case OFFIS:
        return "http://hl7.org/fhir/spdx-license";
      case OFL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case OFL_1_0_NO_RFN:
        return "http://hl7.org/fhir/spdx-license";
      case OFL_1_0_RFN:
        return "http://hl7.org/fhir/spdx-license";
      case OFL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case OFL_1_1_NO_RFN:
        return "http://hl7.org/fhir/spdx-license";
      case OFL_1_1_RFN:
        return "http://hl7.org/fhir/spdx-license";
      case OGC_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case OGDL_TAIWAN_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case OGL_CANADA_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case OGL_UK_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case OGL_UK_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case OGL_UK_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case OGTSL:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_1_2:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_1_3:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_1_4:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_0_1:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_1:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_2:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_2_1:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_2_2:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_3:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_4:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_5:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_6:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_7:
        return "http://hl7.org/fhir/spdx-license";
      case OLDAP_2_8:
        return "http://hl7.org/fhir/spdx-license";
      case OLFL_1_3:
        return "http://hl7.org/fhir/spdx-license";
      case OML:
        return "http://hl7.org/fhir/spdx-license";
      case OPENPBS_2_3:
        return "http://hl7.org/fhir/spdx-license";
      case OPENSSL:
        return "http://hl7.org/fhir/spdx-license";
      case OPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case OPL_UK_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case OPUBL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case OSET_PL_2_1:
        return "http://hl7.org/fhir/spdx-license";
      case OSL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case OSL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case OSL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case OSL_2_1:
        return "http://hl7.org/fhir/spdx-license";
      case OSL_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case PARITY_6_0_0:
        return "http://hl7.org/fhir/spdx-license";
      case PARITY_7_0_0:
        return "http://hl7.org/fhir/spdx-license";
      case PDDL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case PHP_3_0:
        return "http://hl7.org/fhir/spdx-license";
      case PHP_3_01:
        return "http://hl7.org/fhir/spdx-license";
      case PLEXUS:
        return "http://hl7.org/fhir/spdx-license";
      case POLYFORM_NONCOMMERCIAL_1_0_0:
        return "http://hl7.org/fhir/spdx-license";
      case POLYFORM_SMALL_BUSINESS_1_0_0:
        return "http://hl7.org/fhir/spdx-license";
      case POSTGRESQL:
        return "http://hl7.org/fhir/spdx-license";
      case PSF_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case PSFRAG:
        return "http://hl7.org/fhir/spdx-license";
      case PSUTILS:
        return "http://hl7.org/fhir/spdx-license";
      case PYTHON_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case PYTHON_2_0_1:
        return "http://hl7.org/fhir/spdx-license";
      case QHULL:
        return "http://hl7.org/fhir/spdx-license";
      case QPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case QPL_1_0_INRIA_2004:
        return "http://hl7.org/fhir/spdx-license";
      case RDISC:
        return "http://hl7.org/fhir/spdx-license";
      case RHECOS_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case RPL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case RPL_1_5:
        return "http://hl7.org/fhir/spdx-license";
      case RPSL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case RSA_MD:
        return "http://hl7.org/fhir/spdx-license";
      case RSCPL:
        return "http://hl7.org/fhir/spdx-license";
      case RUBY:
        return "http://hl7.org/fhir/spdx-license";
      case SAX_PD:
        return "http://hl7.org/fhir/spdx-license";
      case SAXPATH:
        return "http://hl7.org/fhir/spdx-license";
      case SCEA:
        return "http://hl7.org/fhir/spdx-license";
      case SCHEMEREPORT:
        return "http://hl7.org/fhir/spdx-license";
      case SENDMAIL:
        return "http://hl7.org/fhir/spdx-license";
      case SENDMAIL_8_23:
        return "http://hl7.org/fhir/spdx-license";
      case SGI_B_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case SGI_B_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case SGI_B_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case SGP4:
        return "http://hl7.org/fhir/spdx-license";
      case SHL_0_5:
        return "http://hl7.org/fhir/spdx-license";
      case SHL_0_51:
        return "http://hl7.org/fhir/spdx-license";
      case SIMPL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case SISSL:
        return "http://hl7.org/fhir/spdx-license";
      case SISSL_1_2:
        return "http://hl7.org/fhir/spdx-license";
      case SLEEPYCAT:
        return "http://hl7.org/fhir/spdx-license";
      case SMLNJ:
        return "http://hl7.org/fhir/spdx-license";
      case SMPPL:
        return "http://hl7.org/fhir/spdx-license";
      case SNIA:
        return "http://hl7.org/fhir/spdx-license";
      case SNPRINTF:
        return "http://hl7.org/fhir/spdx-license";
      case SPENCER_86:
        return "http://hl7.org/fhir/spdx-license";
      case SPENCER_94:
        return "http://hl7.org/fhir/spdx-license";
      case SPENCER_99:
        return "http://hl7.org/fhir/spdx-license";
      case SPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case SSH_OPENSSH:
        return "http://hl7.org/fhir/spdx-license";
      case SSH_SHORT:
        return "http://hl7.org/fhir/spdx-license";
      case SSPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case STANDARDML_NJ:
        return "http://hl7.org/fhir/spdx-license";
      case SUGARCRM_1_1_3:
        return "http://hl7.org/fhir/spdx-license";
      case SUNPRO:
        return "http://hl7.org/fhir/spdx-license";
      case SWL:
        return "http://hl7.org/fhir/spdx-license";
      case SYMLINKS:
        return "http://hl7.org/fhir/spdx-license";
      case TAPR_OHL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case TCL:
        return "http://hl7.org/fhir/spdx-license";
      case TCP_WRAPPERS:
        return "http://hl7.org/fhir/spdx-license";
      case TERMREADKEY:
        return "http://hl7.org/fhir/spdx-license";
      case TMATE:
        return "http://hl7.org/fhir/spdx-license";
      case TORQUE_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case TOSL:
        return "http://hl7.org/fhir/spdx-license";
      case TPDL:
        return "http://hl7.org/fhir/spdx-license";
      case TPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case TTWL:
        return "http://hl7.org/fhir/spdx-license";
      case TU_BERLIN_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case TU_BERLIN_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case UCAR:
        return "http://hl7.org/fhir/spdx-license";
      case UCL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case UNICODE_DFS_2015:
        return "http://hl7.org/fhir/spdx-license";
      case UNICODE_DFS_2016:
        return "http://hl7.org/fhir/spdx-license";
      case UNICODE_TOU:
        return "http://hl7.org/fhir/spdx-license";
      case UNIXCRYPT:
        return "http://hl7.org/fhir/spdx-license";
      case UNLICENSE:
        return "http://hl7.org/fhir/spdx-license";
      case UPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case VIM:
        return "http://hl7.org/fhir/spdx-license";
      case VOSTROM:
        return "http://hl7.org/fhir/spdx-license";
      case VSL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case W3C:
        return "http://hl7.org/fhir/spdx-license";
      case W3C_19980720:
        return "http://hl7.org/fhir/spdx-license";
      case W3C_20150513:
        return "http://hl7.org/fhir/spdx-license";
      case W3M:
        return "http://hl7.org/fhir/spdx-license";
      case WATCOM_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case WIDGET_WORKSHOP:
        return "http://hl7.org/fhir/spdx-license";
      case WSUIPA:
        return "http://hl7.org/fhir/spdx-license";
      case WTFPL:
        return "http://hl7.org/fhir/spdx-license";
      case WXWINDOWS:
        return "http://hl7.org/fhir/spdx-license";
      case X11:
        return "http://hl7.org/fhir/spdx-license";
      case X11_DISTRIBUTE_MODIFICATIONS_VARIANT:
        return "http://hl7.org/fhir/spdx-license";
      case XDEBUG_1_03:
        return "http://hl7.org/fhir/spdx-license";
      case XEROX:
        return "http://hl7.org/fhir/spdx-license";
      case XFIG:
        return "http://hl7.org/fhir/spdx-license";
      case XFREE86_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case XINETD:
        return "http://hl7.org/fhir/spdx-license";
      case XLOCK:
        return "http://hl7.org/fhir/spdx-license";
      case XNET:
        return "http://hl7.org/fhir/spdx-license";
      case XPP:
        return "http://hl7.org/fhir/spdx-license";
      case XSKAT:
        return "http://hl7.org/fhir/spdx-license";
      case YPL_1_0:
        return "http://hl7.org/fhir/spdx-license";
      case YPL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case ZED:
        return "http://hl7.org/fhir/spdx-license";
      case ZEND_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case ZIMBRA_1_3:
        return "http://hl7.org/fhir/spdx-license";
      case ZIMBRA_1_4:
        return "http://hl7.org/fhir/spdx-license";
      case ZLIB:
        return "http://hl7.org/fhir/spdx-license";
      case ZLIB_ACKNOWLEDGEMENT:
        return "http://hl7.org/fhir/spdx-license";
      case ZPL_1_1:
        return "http://hl7.org/fhir/spdx-license";
      case ZPL_2_0:
        return "http://hl7.org/fhir/spdx-license";
      case ZPL_2_1:
        return "http://hl7.org/fhir/spdx-license";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case _0BSD:
        return "BSD Zero Clause License";
      case AAL:
        return "Attribution Assurance License";
      case ABSTYLES:
        return "Abstyles License";
      case ADACORE_DOC:
        return "AdaCore Doc License";
      case ADOBE_2006:
        return "Adobe Systems Incorporated Source Code License Agreement";
      case ADOBE_GLYPH:
        return "Adobe Glyph List License";
      case ADSL:
        return "Amazon Digital Services License";
      case AFL_1_1:
        return "Academic Free License v1.1";
      case AFL_1_2:
        return "Academic Free License v1.2";
      case AFL_2_0:
        return "Academic Free License v2.0";
      case AFL_2_1:
        return "Academic Free License v2.1";
      case AFL_3_0:
        return "Academic Free License v3.0";
      case AFMPARSE:
        return "Afmparse License";
      case AGPL_1_0:
        return "Affero General Public License v1.0";
      case AGPL_1_0_ONLY:
        return "Affero General Public License v1.0 only";
      case AGPL_1_0_OR_LATER:
        return "Affero General Public License v1.0 or later";
      case AGPL_3_0:
        return "GNU Affero General Public License v3.0";
      case AGPL_3_0_ONLY:
        return "GNU Affero General Public License v3.0 only";
      case AGPL_3_0_OR_LATER:
        return "GNU Affero General Public License v3.0 or later";
      case ALADDIN:
        return "Aladdin Free Public License";
      case AMDPLPA:
        return "AMD's plpa_map.c License";
      case AML:
        return "Apple MIT License";
      case AMPAS:
        return "Academy of Motion Picture Arts and Sciences BSD";
      case ANTLR_PD:
        return "ANTLR Software Rights Notice";
      case ANTLR_PD_FALLBACK:
        return "ANTLR Software Rights Notice with license fallback";
      case APACHE_1_0:
        return "Apache License 1.0";
      case APACHE_1_1:
        return "Apache License 1.1";
      case APACHE_2_0:
        return "Apache License 2.0";
      case APAFML:
        return "Adobe Postscript AFM License";
      case APL_1_0:
        return "Adaptive Public License 1.0";
      case APP_S2P:
        return "App::s2p License";
      case APSL_1_0:
        return "Apple Public Source License 1.0";
      case APSL_1_1:
        return "Apple Public Source License 1.1";
      case APSL_1_2:
        return "Apple Public Source License 1.2";
      case APSL_2_0:
        return "Apple Public Source License 2.0";
      case ARPHIC_1999:
        return "Arphic Public License";
      case ARTISTIC_1_0:
        return "Artistic License 1.0";
      case ARTISTIC_1_0_CL8:
        return "Artistic License 1.0 w/clause 8";
      case ARTISTIC_1_0_PERL:
        return "Artistic License 1.0 (Perl)";
      case ARTISTIC_2_0:
        return "Artistic License 2.0";
      case ASWF_DIGITAL_ASSETS_1_0:
        return "ASWF Digital Assets License version 1.0";
      case ASWF_DIGITAL_ASSETS_1_1:
        return "ASWF Digital Assets License 1.1";
      case BAEKMUK:
        return "Baekmuk License";
      case BAHYPH:
        return "Bahyph License";
      case BARR:
        return "Barr License";
      case BEERWARE:
        return "Beerware License";
      case BITSTREAM_CHARTER:
        return "Bitstream Charter Font License";
      case BITSTREAM_VERA:
        return "Bitstream Vera Font License";
      case BITTORRENT_1_0:
        return "BitTorrent Open Source License v1.0";
      case BITTORRENT_1_1:
        return "BitTorrent Open Source License v1.1";
      case BLESSING:
        return "SQLite Blessing";
      case BLUEOAK_1_0_0:
        return "Blue Oak Model License 1.0.0";
      case BOEHM_GC:
        return "Boehm-Demers-Weiser GC License";
      case BORCEUX:
        return "Borceux license";
      case BRIAN_GLADMAN_3_CLAUSE:
        return "Brian Gladman 3-Clause License";
      case BSD_1_CLAUSE:
        return "BSD 1-Clause License";
      case BSD_2_CLAUSE:
        return "BSD 2-Clause \"Simplified\" License";
      case BSD_2_CLAUSE_FREEBSD:
        return "BSD 2-Clause FreeBSD License";
      case BSD_2_CLAUSE_NETBSD:
        return "BSD 2-Clause NetBSD License";
      case BSD_2_CLAUSE_PATENT:
        return "BSD-2-Clause Plus Patent License";
      case BSD_2_CLAUSE_VIEWS:
        return "BSD 2-Clause with views sentence";
      case BSD_3_CLAUSE:
        return "BSD 3-Clause \"New\" or \"Revised\" License";
      case BSD_3_CLAUSE_ATTRIBUTION:
        return "BSD with attribution";
      case BSD_3_CLAUSE_CLEAR:
        return "BSD 3-Clause Clear License";
      case BSD_3_CLAUSE_LBNL:
        return "Lawrence Berkeley National Labs BSD variant license";
      case BSD_3_CLAUSE_MODIFICATION:
        return "BSD 3-Clause Modification";
      case BSD_3_CLAUSE_NO_MILITARY_LICENSE:
        return "BSD 3-Clause No Military License";
      case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE:
        return "BSD 3-Clause No Nuclear License";
      case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014:
        return "BSD 3-Clause No Nuclear License 2014";
      case BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY:
        return "BSD 3-Clause No Nuclear Warranty";
      case BSD_3_CLAUSE_OPEN_MPI:
        return "BSD 3-Clause Open MPI variant";
      case BSD_4_CLAUSE:
        return "BSD 4-Clause \"Original\" or \"Old\" License";
      case BSD_4_CLAUSE_SHORTENED:
        return "BSD 4 Clause Shortened";
      case BSD_4_CLAUSE_UC:
        return "BSD-4-Clause (University of California-Specific)";
      case BSD_4_3RENO:
        return "BSD 4.3 RENO License";
      case BSD_4_3TAHOE:
        return "BSD 4.3 TAHOE License";
      case BSD_ADVERTISING_ACKNOWLEDGEMENT:
        return "BSD Advertising Acknowledgement License";
      case BSD_ATTRIBUTION_HPND_DISCLAIMER:
        return "BSD with Attribution and HPND disclaimer";
      case BSD_PROTECTION:
        return "BSD Protection License";
      case BSD_SOURCE_CODE:
        return "BSD Source Code Attribution";
      case BSL_1_0:
        return "Boost Software License 1.0";
      case BUSL_1_1:
        return "Business Source License 1.1";
      case BZIP2_1_0_5:
        return "bzip2 and libbzip2 License v1.0.5";
      case BZIP2_1_0_6:
        return "bzip2 and libbzip2 License v1.0.6";
      case C_UDA_1_0:
        return "Computational Use of Data Agreement v1.0";
      case CAL_1_0:
        return "Cryptographic Autonomy License 1.0";
      case CAL_1_0_COMBINED_WORK_EXCEPTION:
        return "Cryptographic Autonomy License 1.0 (Combined Work Exception)";
      case CALDERA:
        return "Caldera License";
      case CATOSL_1_1:
        return "Computer Associates Trusted Open Source License 1.1";
      case CC_BY_1_0:
        return "Creative Commons Attribution 1.0 Generic";
      case CC_BY_2_0:
        return "Creative Commons Attribution 2.0 Generic";
      case CC_BY_2_5:
        return "Creative Commons Attribution 2.5 Generic";
      case CC_BY_2_5_AU:
        return "Creative Commons Attribution 2.5 Australia";
      case CC_BY_3_0:
        return "Creative Commons Attribution 3.0 Unported";
      case CC_BY_3_0_AT:
        return "Creative Commons Attribution 3.0 Austria";
      case CC_BY_3_0_DE:
        return "Creative Commons Attribution 3.0 Germany";
      case CC_BY_3_0_IGO:
        return "Creative Commons Attribution 3.0 IGO";
      case CC_BY_3_0_NL:
        return "Creative Commons Attribution 3.0 Netherlands";
      case CC_BY_3_0_US:
        return "Creative Commons Attribution 3.0 United States";
      case CC_BY_4_0:
        return "Creative Commons Attribution 4.0 International";
      case CC_BY_NC_1_0:
        return "Creative Commons Attribution Non Commercial 1.0 Generic";
      case CC_BY_NC_2_0:
        return "Creative Commons Attribution Non Commercial 2.0 Generic";
      case CC_BY_NC_2_5:
        return "Creative Commons Attribution Non Commercial 2.5 Generic";
      case CC_BY_NC_3_0:
        return "Creative Commons Attribution Non Commercial 3.0 Unported";
      case CC_BY_NC_3_0_DE:
        return "Creative Commons Attribution Non Commercial 3.0 Germany";
      case CC_BY_NC_4_0:
        return "Creative Commons Attribution Non Commercial 4.0 International";
      case CC_BY_NC_ND_1_0:
        return "Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic";
      case CC_BY_NC_ND_2_0:
        return "Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic";
      case CC_BY_NC_ND_2_5:
        return "Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic";
      case CC_BY_NC_ND_3_0:
        return "Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported";
      case CC_BY_NC_ND_3_0_DE:
        return "Creative Commons Attribution Non Commercial No Derivatives 3.0 Germany";
      case CC_BY_NC_ND_3_0_IGO:
        return "Creative Commons Attribution Non Commercial No Derivatives 3.0 IGO";
      case CC_BY_NC_ND_4_0:
        return "Creative Commons Attribution Non Commercial No Derivatives 4.0 International";
      case CC_BY_NC_SA_1_0:
        return "Creative Commons Attribution Non Commercial Share Alike 1.0 Generic";
      case CC_BY_NC_SA_2_0:
        return "Creative Commons Attribution Non Commercial Share Alike 2.0 Generic";
      case CC_BY_NC_SA_2_0_DE:
        return "Creative Commons Attribution Non Commercial Share Alike 2.0 Germany";
      case CC_BY_NC_SA_2_0_FR:
        return "Creative Commons Attribution-NonCommercial-ShareAlike 2.0 France";
      case CC_BY_NC_SA_2_0_UK:
        return "Creative Commons Attribution Non Commercial Share Alike 2.0 England and Wales";
      case CC_BY_NC_SA_2_5:
        return "Creative Commons Attribution Non Commercial Share Alike 2.5 Generic";
      case CC_BY_NC_SA_3_0:
        return "Creative Commons Attribution Non Commercial Share Alike 3.0 Unported";
      case CC_BY_NC_SA_3_0_DE:
        return "Creative Commons Attribution Non Commercial Share Alike 3.0 Germany";
      case CC_BY_NC_SA_3_0_IGO:
        return "Creative Commons Attribution Non Commercial Share Alike 3.0 IGO";
      case CC_BY_NC_SA_4_0:
        return "Creative Commons Attribution Non Commercial Share Alike 4.0 International";
      case CC_BY_ND_1_0:
        return "Creative Commons Attribution No Derivatives 1.0 Generic";
      case CC_BY_ND_2_0:
        return "Creative Commons Attribution No Derivatives 2.0 Generic";
      case CC_BY_ND_2_5:
        return "Creative Commons Attribution No Derivatives 2.5 Generic";
      case CC_BY_ND_3_0:
        return "Creative Commons Attribution No Derivatives 3.0 Unported";
      case CC_BY_ND_3_0_DE:
        return "Creative Commons Attribution No Derivatives 3.0 Germany";
      case CC_BY_ND_4_0:
        return "Creative Commons Attribution No Derivatives 4.0 International";
      case CC_BY_SA_1_0:
        return "Creative Commons Attribution Share Alike 1.0 Generic";
      case CC_BY_SA_2_0:
        return "Creative Commons Attribution Share Alike 2.0 Generic";
      case CC_BY_SA_2_0_UK:
        return "Creative Commons Attribution Share Alike 2.0 England and Wales";
      case CC_BY_SA_2_1_JP:
        return "Creative Commons Attribution Share Alike 2.1 Japan";
      case CC_BY_SA_2_5:
        return "Creative Commons Attribution Share Alike 2.5 Generic";
      case CC_BY_SA_3_0:
        return "Creative Commons Attribution Share Alike 3.0 Unported";
      case CC_BY_SA_3_0_AT:
        return "Creative Commons Attribution Share Alike 3.0 Austria";
      case CC_BY_SA_3_0_DE:
        return "Creative Commons Attribution Share Alike 3.0 Germany";
      case CC_BY_SA_3_0_IGO:
        return "Creative Commons Attribution-ShareAlike 3.0 IGO";
      case CC_BY_SA_4_0:
        return "Creative Commons Attribution Share Alike 4.0 International";
      case CC_PDDC:
        return "Creative Commons Public Domain Dedication and Certification";
      case CC0_1_0:
        return "Creative Commons Zero v1.0 Universal";
      case CDDL_1_0:
        return "Common Development and Distribution License 1.0";
      case CDDL_1_1:
        return "Common Development and Distribution License 1.1";
      case CDL_1_0:
        return "Common Documentation License 1.0";
      case CDLA_PERMISSIVE_1_0:
        return "Community Data License Agreement Permissive 1.0";
      case CDLA_PERMISSIVE_2_0:
        return "Community Data License Agreement Permissive 2.0";
      case CDLA_SHARING_1_0:
        return "Community Data License Agreement Sharing 1.0";
      case CECILL_1_0:
        return "CeCILL Free Software License Agreement v1.0";
      case CECILL_1_1:
        return "CeCILL Free Software License Agreement v1.1";
      case CECILL_2_0:
        return "CeCILL Free Software License Agreement v2.0";
      case CECILL_2_1:
        return "CeCILL Free Software License Agreement v2.1";
      case CECILL_B:
        return "CeCILL-B Free Software License Agreement";
      case CECILL_C:
        return "CeCILL-C Free Software License Agreement";
      case CERN_OHL_1_1:
        return "CERN Open Hardware Licence v1.1";
      case CERN_OHL_1_2:
        return "CERN Open Hardware Licence v1.2";
      case CERN_OHL_P_2_0:
        return "CERN Open Hardware Licence Version 2 - Permissive";
      case CERN_OHL_S_2_0:
        return "CERN Open Hardware Licence Version 2 - Strongly Reciprocal";
      case CERN_OHL_W_2_0:
        return "CERN Open Hardware Licence Version 2 - Weakly Reciprocal";
      case CFITSIO:
        return "CFITSIO License";
      case CHECKMK:
        return "Checkmk License";
      case CLARTISTIC:
        return "Clarified Artistic License";
      case CLIPS:
        return "Clips License";
      case CMU_MACH:
        return "CMU Mach License";
      case CNRI_JYTHON:
        return "CNRI Jython License";
      case CNRI_PYTHON:
        return "CNRI Python License";
      case CNRI_PYTHON_GPL_COMPATIBLE:
        return "CNRI Python Open Source GPL Compatible License Agreement";
      case COIL_1_0:
        return "Copyfree Open Innovation License";
      case COMMUNITY_SPEC_1_0:
        return "Community Specification License 1.0";
      case CONDOR_1_1:
        return "Condor Public License v1.1";
      case COPYLEFT_NEXT_0_3_0:
        return "copyleft-next 0.3.0";
      case COPYLEFT_NEXT_0_3_1:
        return "copyleft-next 0.3.1";
      case CORNELL_LOSSLESS_JPEG:
        return "Cornell Lossless JPEG License";
      case CPAL_1_0:
        return "Common Public Attribution License 1.0";
      case CPL_1_0:
        return "Common Public License 1.0";
      case CPOL_1_02:
        return "Code Project Open License 1.02";
      case CROSSWORD:
        return "Crossword License";
      case CRYSTALSTACKER:
        return "CrystalStacker License";
      case CUA_OPL_1_0:
        return "CUA Office Public License v1.0";
      case CUBE:
        return "Cube License";
      case CURL:
        return "curl License";
      case D_FSL_1_0:
        return "Deutsche Freie Software Lizenz";
      case DIFFMARK:
        return "diffmark license";
      case DL_DE_BY_2_0:
        return "Data licence Germany – attribution – version 2.0";
      case DOC:
        return "DOC License";
      case DOTSEQN:
        return "Dotseqn License";
      case DRL_1_0:
        return "Detection Rule License 1.0";
      case DSDP:
        return "DSDP License";
      case DTOA:
        return "David M. Gay dtoa License";
      case DVIPDFM:
        return "dvipdfm License";
      case ECL_1_0:
        return "Educational Community License v1.0";
      case ECL_2_0:
        return "Educational Community License v2.0";
      case ECOS_2_0:
        return "eCos license version 2.0";
      case EFL_1_0:
        return "Eiffel Forum License v1.0";
      case EFL_2_0:
        return "Eiffel Forum License v2.0";
      case EGENIX:
        return "eGenix.com Public License 1.1.0";
      case ELASTIC_2_0:
        return "Elastic License 2.0";
      case ENTESSA:
        return "Entessa Public License v1.0";
      case EPICS:
        return "EPICS Open License";
      case EPL_1_0:
        return "Eclipse Public License 1.0";
      case EPL_2_0:
        return "Eclipse Public License 2.0";
      case ERLPL_1_1:
        return "Erlang Public License v1.1";
      case ETALAB_2_0:
        return "Etalab Open License 2.0";
      case EUDATAGRID:
        return "EU DataGrid Software License";
      case EUPL_1_0:
        return "European Union Public License 1.0";
      case EUPL_1_1:
        return "European Union Public License 1.1";
      case EUPL_1_2:
        return "European Union Public License 1.2";
      case EUROSYM:
        return "Eurosym License";
      case FAIR:
        return "Fair License";
      case FDK_AAC:
        return "Fraunhofer FDK AAC Codec Library";
      case FRAMEWORX_1_0:
        return "Frameworx Open License 1.0";
      case FREEBSD_DOC:
        return "FreeBSD Documentation License";
      case FREEIMAGE:
        return "FreeImage Public License v1.0";
      case FSFAP:
        return "FSF All Permissive License";
      case FSFUL:
        return "FSF Unlimited License";
      case FSFULLR:
        return "FSF Unlimited License (with License Retention)";
      case FSFULLRWD:
        return "FSF Unlimited License (With License Retention and Warranty Disclaimer)";
      case FTL:
        return "Freetype Project License";
      case GD:
        return "GD License";
      case GFDL_1_1:
        return "GNU Free Documentation License v1.1";
      case GFDL_1_1_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.1 only - invariants";
      case GFDL_1_1_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.1 or later - invariants";
      case GFDL_1_1_NO_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.1 only - no invariants";
      case GFDL_1_1_NO_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.1 or later - no invariants";
      case GFDL_1_1_ONLY:
        return "GNU Free Documentation License v1.1 only";
      case GFDL_1_1_OR_LATER:
        return "GNU Free Documentation License v1.1 or later";
      case GFDL_1_2:
        return "GNU Free Documentation License v1.2";
      case GFDL_1_2_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.2 only - invariants";
      case GFDL_1_2_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.2 or later - invariants";
      case GFDL_1_2_NO_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.2 only - no invariants";
      case GFDL_1_2_NO_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.2 or later - no invariants";
      case GFDL_1_2_ONLY:
        return "GNU Free Documentation License v1.2 only";
      case GFDL_1_2_OR_LATER:
        return "GNU Free Documentation License v1.2 or later";
      case GFDL_1_3:
        return "GNU Free Documentation License v1.3";
      case GFDL_1_3_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.3 only - invariants";
      case GFDL_1_3_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.3 or later - invariants";
      case GFDL_1_3_NO_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.3 only - no invariants";
      case GFDL_1_3_NO_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.3 or later - no invariants";
      case GFDL_1_3_ONLY:
        return "GNU Free Documentation License v1.3 only";
      case GFDL_1_3_OR_LATER:
        return "GNU Free Documentation License v1.3 or later";
      case GIFTWARE:
        return "Giftware License";
      case GL2PS:
        return "GL2PS License";
      case GLIDE:
        return "3dfx Glide License";
      case GLULXE:
        return "Glulxe License";
      case GLWTPL:
        return "Good Luck With That Public License";
      case GNUPLOT:
        return "gnuplot License";
      case GPL_1_0:
        return "GNU General Public License v1.0 only";
      case GPL_1_0PLUS:
        return "GNU General Public License v1.0 or later";
      case GPL_1_0_ONLY:
        return "GNU General Public License v1.0 only";
      case GPL_1_0_OR_LATER:
        return "GNU General Public License v1.0 or later";
      case GPL_2_0:
        return "GNU General Public License v2.0 only";
      case GPL_2_0PLUS:
        return "GNU General Public License v2.0 or later";
      case GPL_2_0_ONLY:
        return "GNU General Public License v2.0 only";
      case GPL_2_0_OR_LATER:
        return "GNU General Public License v2.0 or later";
      case GPL_2_0_WITH_AUTOCONF_EXCEPTION:
        return "GNU General Public License v2.0 w/Autoconf exception";
      case GPL_2_0_WITH_BISON_EXCEPTION:
        return "GNU General Public License v2.0 w/Bison exception";
      case GPL_2_0_WITH_CLASSPATH_EXCEPTION:
        return "GNU General Public License v2.0 w/Classpath exception";
      case GPL_2_0_WITH_FONT_EXCEPTION:
        return "GNU General Public License v2.0 w/Font exception";
      case GPL_2_0_WITH_GCC_EXCEPTION:
        return "GNU General Public License v2.0 w/GCC Runtime Library exception";
      case GPL_3_0:
        return "GNU General Public License v3.0 only";
      case GPL_3_0PLUS:
        return "GNU General Public License v3.0 or later";
      case GPL_3_0_ONLY:
        return "GNU General Public License v3.0 only";
      case GPL_3_0_OR_LATER:
        return "GNU General Public License v3.0 or later";
      case GPL_3_0_WITH_AUTOCONF_EXCEPTION:
        return "GNU General Public License v3.0 w/Autoconf exception";
      case GPL_3_0_WITH_GCC_EXCEPTION:
        return "GNU General Public License v3.0 w/GCC Runtime Library exception";
      case GRAPHICS_GEMS:
        return "Graphics Gems License";
      case GSOAP_1_3B:
        return "gSOAP Public License v1.3b";
      case HASKELLREPORT:
        return "Haskell Language Report License";
      case HIPPOCRATIC_2_1:
        return "Hippocratic License 2.1";
      case HP_1986:
        return "Hewlett-Packard 1986 License";
      case HPND:
        return "Historical Permission Notice and Disclaimer";
      case HPND_EXPORT_US:
        return "HPND with US Government export control warning";
      case HPND_MARKUS_KUHN:
        return "Historical Permission Notice and Disclaimer - Markus Kuhn variant";
      case HPND_SELL_VARIANT:
        return "Historical Permission Notice and Disclaimer - sell variant";
      case HPND_SELL_VARIANT_MIT_DISCLAIMER:
        return "HPND sell variant with MIT disclaimer";
      case HTMLTIDY:
        return "HTML Tidy License";
      case IBM_PIBS:
        return "IBM PowerPC Initialization and Boot Software";
      case ICU:
        return "ICU License";
      case IEC_CODE_COMPONENTS_EULA:
        return "IEC    Code Components End-user licence agreement";
      case IJG:
        return "Independent JPEG Group License";
      case IJG_SHORT:
        return "Independent JPEG Group License - short";
      case IMAGEMAGICK:
        return "ImageMagick License";
      case IMATIX:
        return "iMatix Standard Function Library Agreement";
      case IMLIB2:
        return "Imlib2 License";
      case INFO_ZIP:
        return "Info-ZIP License";
      case INNER_NET_2_0:
        return "Inner Net License v2.0";
      case INTEL:
        return "Intel Open Source License";
      case INTEL_ACPI:
        return "Intel ACPI Software License Agreement";
      case INTERBASE_1_0:
        return "Interbase Public License v1.0";
      case IPA:
        return "IPA Font License";
      case IPL_1_0:
        return "IBM Public License v1.0";
      case ISC:
        return "ISC License";
      case JAM:
        return "Jam License";
      case JASPER_2_0:
        return "JasPer License";
      case JPL_IMAGE:
        return "JPL Image Use Policy";
      case JPNIC:
        return "Japan Network Information Center License";
      case JSON:
        return "JSON License";
      case KAZLIB:
        return "Kazlib License";
      case KNUTH_CTAN:
        return "Knuth CTAN License";
      case LAL_1_2:
        return "Licence Art Libre 1.2";
      case LAL_1_3:
        return "Licence Art Libre 1.3";
      case LATEX2E:
        return "Latex2e License";
      case LATEX2E_TRANSLATED_NOTICE:
        return "Latex2e with translated notice permission";
      case LEPTONICA:
        return "Leptonica License";
      case LGPL_2_0:
        return "GNU Library General Public License v2 only";
      case LGPL_2_0PLUS:
        return "GNU Library General Public License v2 or later";
      case LGPL_2_0_ONLY:
        return "GNU Library General Public License v2 only";
      case LGPL_2_0_OR_LATER:
        return "GNU Library General Public License v2 or later";
      case LGPL_2_1:
        return "GNU Lesser General Public License v2.1 only";
      case LGPL_2_1PLUS:
        return "GNU Lesser General Public License v2.1 or later";
      case LGPL_2_1_ONLY:
        return "GNU Lesser General Public License v2.1 only";
      case LGPL_2_1_OR_LATER:
        return "GNU Lesser General Public License v2.1 or later";
      case LGPL_3_0:
        return "GNU Lesser General Public License v3.0 only";
      case LGPL_3_0PLUS:
        return "GNU Lesser General Public License v3.0 or later";
      case LGPL_3_0_ONLY:
        return "GNU Lesser General Public License v3.0 only";
      case LGPL_3_0_OR_LATER:
        return "GNU Lesser General Public License v3.0 or later";
      case LGPLLR:
        return "Lesser General Public License For Linguistic Resources";
      case LIBPNG:
        return "libpng License";
      case LIBPNG_2_0:
        return "PNG Reference Library version 2";
      case LIBSELINUX_1_0:
        return "libselinux public domain notice";
      case LIBTIFF:
        return "libtiff License";
      case LIBUTIL_DAVID_NUGENT:
        return "libutil David Nugent License";
      case LILIQ_P_1_1:
        return "Licence Libre du Québec – Permissive version 1.1";
      case LILIQ_R_1_1:
        return "Licence Libre du Québec – Réciprocité version 1.1";
      case LILIQ_RPLUS_1_1:
        return "Licence Libre du Québec – Réciprocité forte version 1.1";
      case LINUX_MAN_PAGES_1_PARA:
        return "Linux man-pages - 1 paragraph";
      case LINUX_MAN_PAGES_COPYLEFT:
        return "Linux man-pages Copyleft";
      case LINUX_MAN_PAGES_COPYLEFT_2_PARA:
        return "Linux man-pages Copyleft - 2 paragraphs";
      case LINUX_MAN_PAGES_COPYLEFT_VAR:
        return "Linux man-pages Copyleft Variant";
      case LINUX_OPENIB:
        return "Linux Kernel Variant of OpenIB.org license";
      case LOOP:
        return "Common Lisp LOOP License";
      case LPL_1_0:
        return "Lucent Public License Version 1.0";
      case LPL_1_02:
        return "Lucent Public License v1.02";
      case LPPL_1_0:
        return "LaTeX Project Public License v1.0";
      case LPPL_1_1:
        return "LaTeX Project Public License v1.1";
      case LPPL_1_2:
        return "LaTeX Project Public License v1.2";
      case LPPL_1_3A:
        return "LaTeX Project Public License v1.3a";
      case LPPL_1_3C:
        return "LaTeX Project Public License v1.3c";
      case LZMA_SDK_9_11_TO_9_20:
        return "LZMA SDK License (versions 9.11 to 9.20)";
      case LZMA_SDK_9_22:
        return "LZMA SDK License (versions 9.22 and beyond)";
      case MAKEINDEX:
        return "MakeIndex License";
      case MARTIN_BIRGMEIER:
        return "Martin Birgmeier License";
      case METAMAIL:
        return "metamail License";
      case MINPACK:
        return "Minpack License";
      case MIROS:
        return "The MirOS Licence";
      case MIT:
        return "MIT License";
      case MIT_0:
        return "MIT No Attribution";
      case MIT_ADVERTISING:
        return "Enlightenment License (e16)";
      case MIT_CMU:
        return "CMU License";
      case MIT_ENNA:
        return "enna License";
      case MIT_FEH:
        return "feh License";
      case MIT_FESTIVAL:
        return "MIT Festival Variant";
      case MIT_MODERN_VARIANT:
        return "MIT License Modern Variant";
      case MIT_OPEN_GROUP:
        return "MIT Open Group variant";
      case MIT_WU:
        return "MIT Tom Wu Variant";
      case MITNFA:
        return "MIT +no-false-attribs license";
      case MOTOSOTO:
        return "Motosoto License";
      case MPI_PERMISSIVE:
        return "mpi Permissive License";
      case MPICH2:
        return "mpich2 License";
      case MPL_1_0:
        return "Mozilla Public License 1.0";
      case MPL_1_1:
        return "Mozilla Public License 1.1";
      case MPL_2_0:
        return "Mozilla Public License 2.0";
      case MPL_2_0_NO_COPYLEFT_EXCEPTION:
        return "Mozilla Public License 2.0 (no copyleft exception)";
      case MPLUS:
        return "mplus Font License";
      case MS_LPL:
        return "Microsoft Limited Public License";
      case MS_PL:
        return "Microsoft Public License";
      case MS_RL:
        return "Microsoft Reciprocal License";
      case MTLL:
        return "Matrix Template Library License";
      case MULANPSL_1_0:
        return "Mulan Permissive Software License, Version 1";
      case MULANPSL_2_0:
        return "Mulan Permissive Software License, Version 2";
      case MULTICS:
        return "Multics License";
      case MUP:
        return "Mup License";
      case NAIST_2003:
        return "Nara Institute of Science and Technology License (2003)";
      case NASA_1_3:
        return "NASA Open Source Agreement 1.3";
      case NAUMEN:
        return "Naumen Public License";
      case NBPL_1_0:
        return "Net Boolean Public License v1";
      case NCGL_UK_2_0:
        return "Non-Commercial Government Licence";
      case NCSA:
        return "University of Illinois/NCSA Open Source License";
      case NET_SNMP:
        return "Net-SNMP License";
      case NETCDF:
        return "NetCDF license";
      case NEWSLETR:
        return "Newsletr License";
      case NGPL:
        return "Nethack General Public License";
      case NICTA_1_0:
        return "NICTA Public Software License, Version 1.0";
      case NIST_PD:
        return "NIST Public Domain Notice";
      case NIST_PD_FALLBACK:
        return "NIST Public Domain Notice with license fallback";
      case NIST_SOFTWARE:
        return "NIST Software License";
      case NLOD_1_0:
        return "Norwegian Licence for Open Government Data (NLOD) 1.0";
      case NLOD_2_0:
        return "Norwegian Licence for Open Government Data (NLOD) 2.0";
      case NLPL:
        return "No Limit Public License";
      case NOKIA:
        return "Nokia Open Source License";
      case NOSL:
        return "Netizen Open Source License";
      case NOT_OPEN_SOURCE:
        return "Not an open source license.";
      case NOWEB:
        return "Noweb License";
      case NPL_1_0:
        return "Netscape Public License v1.0";
      case NPL_1_1:
        return "Netscape Public License v1.1";
      case NPOSL_3_0:
        return "Non-Profit Open Software License 3.0";
      case NRL:
        return "NRL License";
      case NTP:
        return "NTP License";
      case NTP_0:
        return "NTP No Attribution";
      case NUNIT:
        return "Nunit License";
      case O_UDA_1_0:
        return "Open Use of Data Agreement v1.0";
      case OCCT_PL:
        return "Open CASCADE Technology Public License";
      case OCLC_2_0:
        return "OCLC Research Public License 2.0";
      case ODBL_1_0:
        return "Open Data Commons Open Database License v1.0";
      case ODC_BY_1_0:
        return "Open Data Commons Attribution License v1.0";
      case OFFIS:
        return "OFFIS License";
      case OFL_1_0:
        return "SIL Open Font License 1.0";
      case OFL_1_0_NO_RFN:
        return "SIL Open Font License 1.0 with no Reserved Font Name";
      case OFL_1_0_RFN:
        return "SIL Open Font License 1.0 with Reserved Font Name";
      case OFL_1_1:
        return "SIL Open Font License 1.1";
      case OFL_1_1_NO_RFN:
        return "SIL Open Font License 1.1 with no Reserved Font Name";
      case OFL_1_1_RFN:
        return "SIL Open Font License 1.1 with Reserved Font Name";
      case OGC_1_0:
        return "OGC Software License, Version 1.0";
      case OGDL_TAIWAN_1_0:
        return "Taiwan Open Government Data License, version 1.0";
      case OGL_CANADA_2_0:
        return "Open Government Licence - Canada";
      case OGL_UK_1_0:
        return "Open Government Licence v1.0";
      case OGL_UK_2_0:
        return "Open Government Licence v2.0";
      case OGL_UK_3_0:
        return "Open Government Licence v3.0";
      case OGTSL:
        return "Open Group Test Suite License";
      case OLDAP_1_1:
        return "Open LDAP Public License v1.1";
      case OLDAP_1_2:
        return "Open LDAP Public License v1.2";
      case OLDAP_1_3:
        return "Open LDAP Public License v1.3";
      case OLDAP_1_4:
        return "Open LDAP Public License v1.4";
      case OLDAP_2_0:
        return "Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)";
      case OLDAP_2_0_1:
        return "Open LDAP Public License v2.0.1";
      case OLDAP_2_1:
        return "Open LDAP Public License v2.1";
      case OLDAP_2_2:
        return "Open LDAP Public License v2.2";
      case OLDAP_2_2_1:
        return "Open LDAP Public License v2.2.1";
      case OLDAP_2_2_2:
        return "Open LDAP Public License 2.2.2";
      case OLDAP_2_3:
        return "Open LDAP Public License v2.3";
      case OLDAP_2_4:
        return "Open LDAP Public License v2.4";
      case OLDAP_2_5:
        return "Open LDAP Public License v2.5";
      case OLDAP_2_6:
        return "Open LDAP Public License v2.6";
      case OLDAP_2_7:
        return "Open LDAP Public License v2.7";
      case OLDAP_2_8:
        return "Open LDAP Public License v2.8";
      case OLFL_1_3:
        return "Open Logistics Foundation License Version 1.3";
      case OML:
        return "Open Market License";
      case OPENPBS_2_3:
        return "OpenPBS v2.3 Software License";
      case OPENSSL:
        return "OpenSSL License";
      case OPL_1_0:
        return "Open Public License v1.0";
      case OPL_UK_3_0:
        return "United    Kingdom Open Parliament Licence v3.0";
      case OPUBL_1_0:
        return "Open Publication License v1.0";
      case OSET_PL_2_1:
        return "OSET Public License version 2.1";
      case OSL_1_0:
        return "Open Software License 1.0";
      case OSL_1_1:
        return "Open Software License 1.1";
      case OSL_2_0:
        return "Open Software License 2.0";
      case OSL_2_1:
        return "Open Software License 2.1";
      case OSL_3_0:
        return "Open Software License 3.0";
      case PARITY_6_0_0:
        return "The Parity Public License 6.0.0";
      case PARITY_7_0_0:
        return "The Parity Public License 7.0.0";
      case PDDL_1_0:
        return "Open Data Commons Public Domain Dedication & License 1.0";
      case PHP_3_0:
        return "PHP License v3.0";
      case PHP_3_01:
        return "PHP License v3.01";
      case PLEXUS:
        return "Plexus Classworlds License";
      case POLYFORM_NONCOMMERCIAL_1_0_0:
        return "PolyForm Noncommercial License 1.0.0";
      case POLYFORM_SMALL_BUSINESS_1_0_0:
        return "PolyForm Small Business License 1.0.0";
      case POSTGRESQL:
        return "PostgreSQL License";
      case PSF_2_0:
        return "Python Software Foundation License 2.0";
      case PSFRAG:
        return "psfrag License";
      case PSUTILS:
        return "psutils License";
      case PYTHON_2_0:
        return "Python License 2.0";
      case PYTHON_2_0_1:
        return "Python License 2.0.1";
      case QHULL:
        return "Qhull License";
      case QPL_1_0:
        return "Q Public License 1.0";
      case QPL_1_0_INRIA_2004:
        return "Q Public License 1.0 - INRIA 2004 variant";
      case RDISC:
        return "Rdisc License";
      case RHECOS_1_1:
        return "Red Hat eCos Public License v1.1";
      case RPL_1_1:
        return "Reciprocal Public License 1.1";
      case RPL_1_5:
        return "Reciprocal Public License 1.5";
      case RPSL_1_0:
        return "RealNetworks Public Source License v1.0";
      case RSA_MD:
        return "RSA Message-Digest License";
      case RSCPL:
        return "Ricoh Source Code Public License";
      case RUBY:
        return "Ruby License";
      case SAX_PD:
        return "Sax Public Domain Notice";
      case SAXPATH:
        return "Saxpath License";
      case SCEA:
        return "SCEA Shared Source License";
      case SCHEMEREPORT:
        return "Scheme Language Report License";
      case SENDMAIL:
        return "Sendmail License";
      case SENDMAIL_8_23:
        return "Sendmail License 8.23";
      case SGI_B_1_0:
        return "SGI Free Software License B v1.0";
      case SGI_B_1_1:
        return "SGI Free Software License B v1.1";
      case SGI_B_2_0:
        return "SGI Free Software License B v2.0";
      case SGP4:
        return "SGP4 Permission Notice";
      case SHL_0_5:
        return "Solderpad Hardware License v0.5";
      case SHL_0_51:
        return "Solderpad Hardware License, Version 0.51";
      case SIMPL_2_0:
        return "Simple Public License 2.0";
      case SISSL:
        return "Sun Industry Standards Source License v1.1";
      case SISSL_1_2:
        return "Sun Industry Standards Source License v1.2";
      case SLEEPYCAT:
        return "Sleepycat License";
      case SMLNJ:
        return "Standard ML of New Jersey License";
      case SMPPL:
        return "Secure Messaging Protocol Public License";
      case SNIA:
        return "SNIA Public License 1.1";
      case SNPRINTF:
        return "snprintf License";
      case SPENCER_86:
        return "Spencer License 86";
      case SPENCER_94:
        return "Spencer License 94";
      case SPENCER_99:
        return "Spencer License 99";
      case SPL_1_0:
        return "Sun Public License v1.0";
      case SSH_OPENSSH:
        return "SSH OpenSSH license";
      case SSH_SHORT:
        return "SSH short notice";
      case SSPL_1_0:
        return "Server Side Public License, v 1";
      case STANDARDML_NJ:
        return "Standard ML of New Jersey License";
      case SUGARCRM_1_1_3:
        return "SugarCRM Public License v1.1.3";
      case SUNPRO:
        return "SunPro License";
      case SWL:
        return "Scheme Widget Library (SWL) Software License Agreement";
      case SYMLINKS:
        return "Symlinks License";
      case TAPR_OHL_1_0:
        return "TAPR Open Hardware License v1.0";
      case TCL:
        return "TCL/TK License";
      case TCP_WRAPPERS:
        return "TCP Wrappers License";
      case TERMREADKEY:
        return "TermReadKey License";
      case TMATE:
        return "TMate Open Source License";
      case TORQUE_1_1:
        return "TORQUE v2.5+ Software License v1.1";
      case TOSL:
        return "Trusster Open Source License";
      case TPDL:
        return "Time::ParseDate License";
      case TPL_1_0:
        return "THOR Public License 1.0";
      case TTWL:
        return "Text-Tabs+Wrap License";
      case TU_BERLIN_1_0:
        return "Technische Universitaet Berlin License 1.0";
      case TU_BERLIN_2_0:
        return "Technische Universitaet Berlin License 2.0";
      case UCAR:
        return "UCAR License";
      case UCL_1_0:
        return "Upstream Compatibility License v1.0";
      case UNICODE_DFS_2015:
        return "Unicode License Agreement - Data Files and Software (2015)";
      case UNICODE_DFS_2016:
        return "Unicode License Agreement - Data Files and Software (2016)";
      case UNICODE_TOU:
        return "Unicode Terms of Use";
      case UNIXCRYPT:
        return "UnixCrypt License";
      case UNLICENSE:
        return "The Unlicense";
      case UPL_1_0:
        return "Universal Permissive License v1.0";
      case VIM:
        return "Vim License";
      case VOSTROM:
        return "VOSTROM Public License for Open Source";
      case VSL_1_0:
        return "Vovida Software License v1.0";
      case W3C:
        return "W3C Software Notice and License (2002-12-31)";
      case W3C_19980720:
        return "W3C Software Notice and License (1998-07-20)";
      case W3C_20150513:
        return "W3C Software Notice and Document License (2015-05-13)";
      case W3M:
        return "w3m License";
      case WATCOM_1_0:
        return "Sybase Open Watcom Public License 1.0";
      case WIDGET_WORKSHOP:
        return "Widget Workshop License";
      case WSUIPA:
        return "Wsuipa License";
      case WTFPL:
        return "Do What The F*ck You Want To Public License";
      case WXWINDOWS:
        return "wxWindows Library License";
      case X11:
        return "X11 License";
      case X11_DISTRIBUTE_MODIFICATIONS_VARIANT:
        return "X11 License Distribution Modification Variant";
      case XDEBUG_1_03:
        return "Xdebug License v 1.03";
      case XEROX:
        return "Xerox License";
      case XFIG:
        return "Xfig License";
      case XFREE86_1_1:
        return "XFree86 License 1.1";
      case XINETD:
        return "xinetd License";
      case XLOCK:
        return "xlock License";
      case XNET:
        return "X.Net License";
      case XPP:
        return "XPP License";
      case XSKAT:
        return "XSkat License";
      case YPL_1_0:
        return "Yahoo! Public License v1.0";
      case YPL_1_1:
        return "Yahoo! Public License v1.1";
      case ZED:
        return "Zed License";
      case ZEND_2_0:
        return "Zend License v2.0";
      case ZIMBRA_1_3:
        return "Zimbra Public License v1.3";
      case ZIMBRA_1_4:
        return "Zimbra Public License v1.4";
      case ZLIB:
        return "zlib License";
      case ZLIB_ACKNOWLEDGEMENT:
        return "zlib/libpng License with Acknowledgement";
      case ZPL_1_1:
        return "Zope Public License 1.1";
      case ZPL_2_0:
        return "Zope Public License 2.0";
      case ZPL_2_1:
        return "Zope Public License 2.1";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case _0BSD:
        return "BSD Zero Clause License";
      case AAL:
        return "Attribution Assurance License";
      case ABSTYLES:
        return "Abstyles License";
      case ADACORE_DOC:
        return "AdaCore Doc License";
      case ADOBE_2006:
        return "Adobe Systems Incorporated Source Code License Agreement";
      case ADOBE_GLYPH:
        return "Adobe Glyph List License";
      case ADSL:
        return "Amazon Digital Services License";
      case AFL_1_1:
        return "Academic Free License v1.1";
      case AFL_1_2:
        return "Academic Free License v1.2";
      case AFL_2_0:
        return "Academic Free License v2.0";
      case AFL_2_1:
        return "Academic Free License v2.1";
      case AFL_3_0:
        return "Academic Free License v3.0";
      case AFMPARSE:
        return "Afmparse License";
      case AGPL_1_0:
        return "Affero General Public License v1.0";
      case AGPL_1_0_ONLY:
        return "Affero General Public License v1.0 only";
      case AGPL_1_0_OR_LATER:
        return "Affero General Public License v1.0 or later";
      case AGPL_3_0:
        return "GNU Affero General Public License v3.0";
      case AGPL_3_0_ONLY:
        return "GNU Affero General Public License v3.0 only";
      case AGPL_3_0_OR_LATER:
        return "GNU Affero General Public License v3.0 or later";
      case ALADDIN:
        return "Aladdin Free Public License";
      case AMDPLPA:
        return "AMD's plpa_map.c License";
      case AML:
        return "Apple MIT License";
      case AMPAS:
        return "Academy of Motion Picture Arts and Sciences BSD";
      case ANTLR_PD:
        return "ANTLR Software Rights Notice";
      case ANTLR_PD_FALLBACK:
        return "ANTLR Software Rights Notice with license fallback";
      case APACHE_1_0:
        return "Apache License 1.0";
      case APACHE_1_1:
        return "Apache License 1.1";
      case APACHE_2_0:
        return "Apache License 2.0";
      case APAFML:
        return "Adobe Postscript AFM License";
      case APL_1_0:
        return "Adaptive Public License 1.0";
      case APP_S2P:
        return "App::s2p License";
      case APSL_1_0:
        return "Apple Public Source License 1.0";
      case APSL_1_1:
        return "Apple Public Source License 1.1";
      case APSL_1_2:
        return "Apple Public Source License 1.2";
      case APSL_2_0:
        return "Apple Public Source License 2.0";
      case ARPHIC_1999:
        return "Arphic Public License";
      case ARTISTIC_1_0:
        return "Artistic License 1.0";
      case ARTISTIC_1_0_CL8:
        return "Artistic License 1.0 w/clause 8";
      case ARTISTIC_1_0_PERL:
        return "Artistic License 1.0 (Perl)";
      case ARTISTIC_2_0:
        return "Artistic License 2.0";
      case ASWF_DIGITAL_ASSETS_1_0:
        return "ASWF Digital Assets License version 1.0";
      case ASWF_DIGITAL_ASSETS_1_1:
        return "ASWF Digital Assets License 1.1";
      case BAEKMUK:
        return "Baekmuk License";
      case BAHYPH:
        return "Bahyph License";
      case BARR:
        return "Barr License";
      case BEERWARE:
        return "Beerware License";
      case BITSTREAM_CHARTER:
        return "Bitstream Charter Font License";
      case BITSTREAM_VERA:
        return "Bitstream Vera Font License";
      case BITTORRENT_1_0:
        return "BitTorrent Open Source License v1.0";
      case BITTORRENT_1_1:
        return "BitTorrent Open Source License v1.1";
      case BLESSING:
        return "SQLite Blessing";
      case BLUEOAK_1_0_0:
        return "Blue Oak Model License 1.0.0";
      case BOEHM_GC:
        return "Boehm-Demers-Weiser GC License";
      case BORCEUX:
        return "Borceux license";
      case BRIAN_GLADMAN_3_CLAUSE:
        return "Brian Gladman 3-Clause License";
      case BSD_1_CLAUSE:
        return "BSD 1-Clause License";
      case BSD_2_CLAUSE:
        return "BSD 2-Clause \"Simplified\" License";
      case BSD_2_CLAUSE_FREEBSD:
        return "BSD 2-Clause FreeBSD License";
      case BSD_2_CLAUSE_NETBSD:
        return "BSD 2-Clause NetBSD License";
      case BSD_2_CLAUSE_PATENT:
        return "BSD-2-Clause Plus Patent License";
      case BSD_2_CLAUSE_VIEWS:
        return "BSD 2-Clause with views sentence";
      case BSD_3_CLAUSE:
        return "BSD 3-Clause \"New\" or \"Revised\" License";
      case BSD_3_CLAUSE_ATTRIBUTION:
        return "BSD with attribution";
      case BSD_3_CLAUSE_CLEAR:
        return "BSD 3-Clause Clear License";
      case BSD_3_CLAUSE_LBNL:
        return "Lawrence Berkeley National Labs BSD variant license";
      case BSD_3_CLAUSE_MODIFICATION:
        return "BSD 3-Clause Modification";
      case BSD_3_CLAUSE_NO_MILITARY_LICENSE:
        return "BSD 3-Clause No Military License";
      case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE:
        return "BSD 3-Clause No Nuclear License";
      case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014:
        return "BSD 3-Clause No Nuclear License 2014";
      case BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY:
        return "BSD 3-Clause No Nuclear Warranty";
      case BSD_3_CLAUSE_OPEN_MPI:
        return "BSD 3-Clause Open MPI variant";
      case BSD_4_CLAUSE:
        return "BSD 4-Clause \"Original\" or \"Old\" License";
      case BSD_4_CLAUSE_SHORTENED:
        return "BSD 4 Clause Shortened";
      case BSD_4_CLAUSE_UC:
        return "BSD-4-Clause (University of California-Specific)";
      case BSD_4_3RENO:
        return "BSD 4.3 RENO License";
      case BSD_4_3TAHOE:
        return "BSD 4.3 TAHOE License";
      case BSD_ADVERTISING_ACKNOWLEDGEMENT:
        return "BSD Advertising Acknowledgement License";
      case BSD_ATTRIBUTION_HPND_DISCLAIMER:
        return "BSD with Attribution and HPND disclaimer";
      case BSD_PROTECTION:
        return "BSD Protection License";
      case BSD_SOURCE_CODE:
        return "BSD Source Code Attribution";
      case BSL_1_0:
        return "Boost Software License 1.0";
      case BUSL_1_1:
        return "Business Source License 1.1";
      case BZIP2_1_0_5:
        return "bzip2 and libbzip2 License v1.0.5";
      case BZIP2_1_0_6:
        return "bzip2 and libbzip2 License v1.0.6";
      case C_UDA_1_0:
        return "Computational Use of Data Agreement v1.0";
      case CAL_1_0:
        return "Cryptographic Autonomy License 1.0";
      case CAL_1_0_COMBINED_WORK_EXCEPTION:
        return "Cryptographic Autonomy License 1.0 (Combined Work Exception)";
      case CALDERA:
        return "Caldera License";
      case CATOSL_1_1:
        return "Computer Associates Trusted Open Source License 1.1";
      case CC_BY_1_0:
        return "Creative Commons Attribution 1.0 Generic";
      case CC_BY_2_0:
        return "Creative Commons Attribution 2.0 Generic";
      case CC_BY_2_5:
        return "Creative Commons Attribution 2.5 Generic";
      case CC_BY_2_5_AU:
        return "Creative Commons Attribution 2.5 Australia";
      case CC_BY_3_0:
        return "Creative Commons Attribution 3.0 Unported";
      case CC_BY_3_0_AT:
        return "Creative Commons Attribution 3.0 Austria";
      case CC_BY_3_0_DE:
        return "Creative Commons Attribution 3.0 Germany";
      case CC_BY_3_0_IGO:
        return "Creative Commons Attribution 3.0 IGO";
      case CC_BY_3_0_NL:
        return "Creative Commons Attribution 3.0 Netherlands";
      case CC_BY_3_0_US:
        return "Creative Commons Attribution 3.0 United States";
      case CC_BY_4_0:
        return "Creative Commons Attribution 4.0 International";
      case CC_BY_NC_1_0:
        return "Creative Commons Attribution Non Commercial 1.0 Generic";
      case CC_BY_NC_2_0:
        return "Creative Commons Attribution Non Commercial 2.0 Generic";
      case CC_BY_NC_2_5:
        return "Creative Commons Attribution Non Commercial 2.5 Generic";
      case CC_BY_NC_3_0:
        return "Creative Commons Attribution Non Commercial 3.0 Unported";
      case CC_BY_NC_3_0_DE:
        return "Creative Commons Attribution Non Commercial 3.0 Germany";
      case CC_BY_NC_4_0:
        return "Creative Commons Attribution Non Commercial 4.0 International";
      case CC_BY_NC_ND_1_0:
        return "Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic";
      case CC_BY_NC_ND_2_0:
        return "Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic";
      case CC_BY_NC_ND_2_5:
        return "Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic";
      case CC_BY_NC_ND_3_0:
        return "Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported";
      case CC_BY_NC_ND_3_0_DE:
        return "Creative Commons Attribution Non Commercial No Derivatives 3.0 Germany";
      case CC_BY_NC_ND_3_0_IGO:
        return "Creative Commons Attribution Non Commercial No Derivatives 3.0 IGO";
      case CC_BY_NC_ND_4_0:
        return "Creative Commons Attribution Non Commercial No Derivatives 4.0 International";
      case CC_BY_NC_SA_1_0:
        return "Creative Commons Attribution Non Commercial Share Alike 1.0 Generic";
      case CC_BY_NC_SA_2_0:
        return "Creative Commons Attribution Non Commercial Share Alike 2.0 Generic";
      case CC_BY_NC_SA_2_0_DE:
        return "Creative Commons Attribution Non Commercial Share Alike 2.0 Germany";
      case CC_BY_NC_SA_2_0_FR:
        return "Creative Commons Attribution-NonCommercial-ShareAlike 2.0 France";
      case CC_BY_NC_SA_2_0_UK:
        return "Creative Commons Attribution Non Commercial Share Alike 2.0 England and Wales";
      case CC_BY_NC_SA_2_5:
        return "Creative Commons Attribution Non Commercial Share Alike 2.5 Generic";
      case CC_BY_NC_SA_3_0:
        return "Creative Commons Attribution Non Commercial Share Alike 3.0 Unported";
      case CC_BY_NC_SA_3_0_DE:
        return "Creative Commons Attribution Non Commercial Share Alike 3.0 Germany";
      case CC_BY_NC_SA_3_0_IGO:
        return "Creative Commons Attribution Non Commercial Share Alike 3.0 IGO";
      case CC_BY_NC_SA_4_0:
        return "Creative Commons Attribution Non Commercial Share Alike 4.0 International";
      case CC_BY_ND_1_0:
        return "Creative Commons Attribution No Derivatives 1.0 Generic";
      case CC_BY_ND_2_0:
        return "Creative Commons Attribution No Derivatives 2.0 Generic";
      case CC_BY_ND_2_5:
        return "Creative Commons Attribution No Derivatives 2.5 Generic";
      case CC_BY_ND_3_0:
        return "Creative Commons Attribution No Derivatives 3.0 Unported";
      case CC_BY_ND_3_0_DE:
        return "Creative Commons Attribution No Derivatives 3.0 Germany";
      case CC_BY_ND_4_0:
        return "Creative Commons Attribution No Derivatives 4.0 International";
      case CC_BY_SA_1_0:
        return "Creative Commons Attribution Share Alike 1.0 Generic";
      case CC_BY_SA_2_0:
        return "Creative Commons Attribution Share Alike 2.0 Generic";
      case CC_BY_SA_2_0_UK:
        return "Creative Commons Attribution Share Alike 2.0 England and Wales";
      case CC_BY_SA_2_1_JP:
        return "Creative Commons Attribution Share Alike 2.1 Japan";
      case CC_BY_SA_2_5:
        return "Creative Commons Attribution Share Alike 2.5 Generic";
      case CC_BY_SA_3_0:
        return "Creative Commons Attribution Share Alike 3.0 Unported";
      case CC_BY_SA_3_0_AT:
        return "Creative Commons Attribution Share Alike 3.0 Austria";
      case CC_BY_SA_3_0_DE:
        return "Creative Commons Attribution Share Alike 3.0 Germany";
      case CC_BY_SA_3_0_IGO:
        return "Creative Commons Attribution-ShareAlike 3.0 IGO";
      case CC_BY_SA_4_0:
        return "Creative Commons Attribution Share Alike 4.0 International";
      case CC_PDDC:
        return "Creative Commons Public Domain Dedication and Certification";
      case CC0_1_0:
        return "Creative Commons Zero v1.0 Universal";
      case CDDL_1_0:
        return "Common Development and Distribution License 1.0";
      case CDDL_1_1:
        return "Common Development and Distribution License 1.1";
      case CDL_1_0:
        return "Common Documentation License 1.0";
      case CDLA_PERMISSIVE_1_0:
        return "Community Data License Agreement Permissive 1.0";
      case CDLA_PERMISSIVE_2_0:
        return "Community Data License Agreement Permissive 2.0";
      case CDLA_SHARING_1_0:
        return "Community Data License Agreement Sharing 1.0";
      case CECILL_1_0:
        return "CeCILL Free Software License Agreement v1.0";
      case CECILL_1_1:
        return "CeCILL Free Software License Agreement v1.1";
      case CECILL_2_0:
        return "CeCILL Free Software License Agreement v2.0";
      case CECILL_2_1:
        return "CeCILL Free Software License Agreement v2.1";
      case CECILL_B:
        return "CeCILL-B Free Software License Agreement";
      case CECILL_C:
        return "CeCILL-C Free Software License Agreement";
      case CERN_OHL_1_1:
        return "CERN Open Hardware Licence v1.1";
      case CERN_OHL_1_2:
        return "CERN Open Hardware Licence v1.2";
      case CERN_OHL_P_2_0:
        return "CERN Open Hardware Licence Version 2 - Permissive";
      case CERN_OHL_S_2_0:
        return "CERN Open Hardware Licence Version 2 - Strongly Reciprocal";
      case CERN_OHL_W_2_0:
        return "CERN Open Hardware Licence Version 2 - Weakly Reciprocal";
      case CFITSIO:
        return "CFITSIO License";
      case CHECKMK:
        return "Checkmk License";
      case CLARTISTIC:
        return "Clarified Artistic License";
      case CLIPS:
        return "Clips License";
      case CMU_MACH:
        return "CMU Mach License";
      case CNRI_JYTHON:
        return "CNRI Jython License";
      case CNRI_PYTHON:
        return "CNRI Python License";
      case CNRI_PYTHON_GPL_COMPATIBLE:
        return "CNRI Python Open Source GPL Compatible License Agreement";
      case COIL_1_0:
        return "Copyfree Open Innovation License";
      case COMMUNITY_SPEC_1_0:
        return "Community Specification License 1.0";
      case CONDOR_1_1:
        return "Condor Public License v1.1";
      case COPYLEFT_NEXT_0_3_0:
        return "copyleft-next 0.3.0";
      case COPYLEFT_NEXT_0_3_1:
        return "copyleft-next 0.3.1";
      case CORNELL_LOSSLESS_JPEG:
        return "Cornell Lossless JPEG License";
      case CPAL_1_0:
        return "Common Public Attribution License 1.0";
      case CPL_1_0:
        return "Common Public License 1.0";
      case CPOL_1_02:
        return "Code Project Open License 1.02";
      case CROSSWORD:
        return "Crossword License";
      case CRYSTALSTACKER:
        return "CrystalStacker License";
      case CUA_OPL_1_0:
        return "CUA Office Public License v1.0";
      case CUBE:
        return "Cube License";
      case CURL:
        return "curl License";
      case D_FSL_1_0:
        return "Deutsche Freie Software Lizenz";
      case DIFFMARK:
        return "diffmark license";
      case DL_DE_BY_2_0:
        return "Data licence Germany – attribution – version 2.0";
      case DOC:
        return "DOC License";
      case DOTSEQN:
        return "Dotseqn License";
      case DRL_1_0:
        return "Detection Rule License 1.0";
      case DSDP:
        return "DSDP License";
      case DTOA:
        return "David M. Gay dtoa License";
      case DVIPDFM:
        return "dvipdfm License";
      case ECL_1_0:
        return "Educational Community License v1.0";
      case ECL_2_0:
        return "Educational Community License v2.0";
      case ECOS_2_0:
        return "eCos license version 2.0";
      case EFL_1_0:
        return "Eiffel Forum License v1.0";
      case EFL_2_0:
        return "Eiffel Forum License v2.0";
      case EGENIX:
        return "eGenix.com Public License 1.1.0";
      case ELASTIC_2_0:
        return "Elastic License 2.0";
      case ENTESSA:
        return "Entessa Public License v1.0";
      case EPICS:
        return "EPICS Open License";
      case EPL_1_0:
        return "Eclipse Public License 1.0";
      case EPL_2_0:
        return "Eclipse Public License 2.0";
      case ERLPL_1_1:
        return "Erlang Public License v1.1";
      case ETALAB_2_0:
        return "Etalab Open License 2.0";
      case EUDATAGRID:
        return "EU DataGrid Software License";
      case EUPL_1_0:
        return "European Union Public License 1.0";
      case EUPL_1_1:
        return "European Union Public License 1.1";
      case EUPL_1_2:
        return "European Union Public License 1.2";
      case EUROSYM:
        return "Eurosym License";
      case FAIR:
        return "Fair License";
      case FDK_AAC:
        return "Fraunhofer FDK AAC Codec Library";
      case FRAMEWORX_1_0:
        return "Frameworx Open License 1.0";
      case FREEBSD_DOC:
        return "FreeBSD Documentation License";
      case FREEIMAGE:
        return "FreeImage Public License v1.0";
      case FSFAP:
        return "FSF All Permissive License";
      case FSFUL:
        return "FSF Unlimited License";
      case FSFULLR:
        return "FSF Unlimited License (with License Retention)";
      case FSFULLRWD:
        return "FSF Unlimited License (With License Retention and Warranty Disclaimer)";
      case FTL:
        return "Freetype Project License";
      case GD:
        return "GD License";
      case GFDL_1_1:
        return "GNU Free Documentation License v1.1";
      case GFDL_1_1_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.1 only - invariants";
      case GFDL_1_1_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.1 or later - invariants";
      case GFDL_1_1_NO_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.1 only - no invariants";
      case GFDL_1_1_NO_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.1 or later - no invariants";
      case GFDL_1_1_ONLY:
        return "GNU Free Documentation License v1.1 only";
      case GFDL_1_1_OR_LATER:
        return "GNU Free Documentation License v1.1 or later";
      case GFDL_1_2:
        return "GNU Free Documentation License v1.2";
      case GFDL_1_2_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.2 only - invariants";
      case GFDL_1_2_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.2 or later - invariants";
      case GFDL_1_2_NO_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.2 only - no invariants";
      case GFDL_1_2_NO_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.2 or later - no invariants";
      case GFDL_1_2_ONLY:
        return "GNU Free Documentation License v1.2 only";
      case GFDL_1_2_OR_LATER:
        return "GNU Free Documentation License v1.2 or later";
      case GFDL_1_3:
        return "GNU Free Documentation License v1.3";
      case GFDL_1_3_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.3 only - invariants";
      case GFDL_1_3_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.3 or later - invariants";
      case GFDL_1_3_NO_INVARIANTS_ONLY:
        return "GNU Free Documentation License v1.3 only - no invariants";
      case GFDL_1_3_NO_INVARIANTS_OR_LATER:
        return "GNU Free Documentation License v1.3 or later - no invariants";
      case GFDL_1_3_ONLY:
        return "GNU Free Documentation License v1.3 only";
      case GFDL_1_3_OR_LATER:
        return "GNU Free Documentation License v1.3 or later";
      case GIFTWARE:
        return "Giftware License";
      case GL2PS:
        return "GL2PS License";
      case GLIDE:
        return "3dfx Glide License";
      case GLULXE:
        return "Glulxe License";
      case GLWTPL:
        return "Good Luck With That Public License";
      case GNUPLOT:
        return "gnuplot License";
      case GPL_1_0:
        return "GNU General Public License v1.0 only";
      case GPL_1_0PLUS:
        return "GNU General Public License v1.0 or later";
      case GPL_1_0_ONLY:
        return "GNU General Public License v1.0 only";
      case GPL_1_0_OR_LATER:
        return "GNU General Public License v1.0 or later";
      case GPL_2_0:
        return "GNU General Public License v2.0 only";
      case GPL_2_0PLUS:
        return "GNU General Public License v2.0 or later";
      case GPL_2_0_ONLY:
        return "GNU General Public License v2.0 only";
      case GPL_2_0_OR_LATER:
        return "GNU General Public License v2.0 or later";
      case GPL_2_0_WITH_AUTOCONF_EXCEPTION:
        return "GNU General Public License v2.0 w/Autoconf exception";
      case GPL_2_0_WITH_BISON_EXCEPTION:
        return "GNU General Public License v2.0 w/Bison exception";
      case GPL_2_0_WITH_CLASSPATH_EXCEPTION:
        return "GNU General Public License v2.0 w/Classpath exception";
      case GPL_2_0_WITH_FONT_EXCEPTION:
        return "GNU General Public License v2.0 w/Font exception";
      case GPL_2_0_WITH_GCC_EXCEPTION:
        return "GNU General Public License v2.0 w/GCC Runtime Library exception";
      case GPL_3_0:
        return "GNU General Public License v3.0 only";
      case GPL_3_0PLUS:
        return "GNU General Public License v3.0 or later";
      case GPL_3_0_ONLY:
        return "GNU General Public License v3.0 only";
      case GPL_3_0_OR_LATER:
        return "GNU General Public License v3.0 or later";
      case GPL_3_0_WITH_AUTOCONF_EXCEPTION:
        return "GNU General Public License v3.0 w/Autoconf exception";
      case GPL_3_0_WITH_GCC_EXCEPTION:
        return "GNU General Public License v3.0 w/GCC Runtime Library exception";
      case GRAPHICS_GEMS:
        return "Graphics Gems License";
      case GSOAP_1_3B:
        return "gSOAP Public License v1.3b";
      case HASKELLREPORT:
        return "Haskell Language Report License";
      case HIPPOCRATIC_2_1:
        return "Hippocratic License 2.1";
      case HP_1986:
        return "Hewlett-Packard 1986 License";
      case HPND:
        return "Historical Permission Notice and Disclaimer";
      case HPND_EXPORT_US:
        return "HPND with US Government export control warning";
      case HPND_MARKUS_KUHN:
        return "Historical Permission Notice and Disclaimer - Markus Kuhn variant";
      case HPND_SELL_VARIANT:
        return "Historical Permission Notice and Disclaimer - sell variant";
      case HPND_SELL_VARIANT_MIT_DISCLAIMER:
        return "HPND sell variant with MIT disclaimer";
      case HTMLTIDY:
        return "HTML Tidy License";
      case IBM_PIBS:
        return "IBM PowerPC Initialization and Boot Software";
      case ICU:
        return "ICU License";
      case IEC_CODE_COMPONENTS_EULA:
        return "IEC    Code Components End-user licence agreement";
      case IJG:
        return "Independent JPEG Group License";
      case IJG_SHORT:
        return "Independent JPEG Group License - short";
      case IMAGEMAGICK:
        return "ImageMagick License";
      case IMATIX:
        return "iMatix Standard Function Library Agreement";
      case IMLIB2:
        return "Imlib2 License";
      case INFO_ZIP:
        return "Info-ZIP License";
      case INNER_NET_2_0:
        return "Inner Net License v2.0";
      case INTEL:
        return "Intel Open Source License";
      case INTEL_ACPI:
        return "Intel ACPI Software License Agreement";
      case INTERBASE_1_0:
        return "Interbase Public License v1.0";
      case IPA:
        return "IPA Font License";
      case IPL_1_0:
        return "IBM Public License v1.0";
      case ISC:
        return "ISC License";
      case JAM:
        return "Jam License";
      case JASPER_2_0:
        return "JasPer License";
      case JPL_IMAGE:
        return "JPL Image Use Policy";
      case JPNIC:
        return "Japan Network Information Center License";
      case JSON:
        return "JSON License";
      case KAZLIB:
        return "Kazlib License";
      case KNUTH_CTAN:
        return "Knuth CTAN License";
      case LAL_1_2:
        return "Licence Art Libre 1.2";
      case LAL_1_3:
        return "Licence Art Libre 1.3";
      case LATEX2E:
        return "Latex2e License";
      case LATEX2E_TRANSLATED_NOTICE:
        return "Latex2e with translated notice permission";
      case LEPTONICA:
        return "Leptonica License";
      case LGPL_2_0:
        return "GNU Library General Public License v2 only";
      case LGPL_2_0PLUS:
        return "GNU Library General Public License v2 or later";
      case LGPL_2_0_ONLY:
        return "GNU Library General Public License v2 only";
      case LGPL_2_0_OR_LATER:
        return "GNU Library General Public License v2 or later";
      case LGPL_2_1:
        return "GNU Lesser General Public License v2.1 only";
      case LGPL_2_1PLUS:
        return "GNU Lesser General Public License v2.1 or later";
      case LGPL_2_1_ONLY:
        return "GNU Lesser General Public License v2.1 only";
      case LGPL_2_1_OR_LATER:
        return "GNU Lesser General Public License v2.1 or later";
      case LGPL_3_0:
        return "GNU Lesser General Public License v3.0 only";
      case LGPL_3_0PLUS:
        return "GNU Lesser General Public License v3.0 or later";
      case LGPL_3_0_ONLY:
        return "GNU Lesser General Public License v3.0 only";
      case LGPL_3_0_OR_LATER:
        return "GNU Lesser General Public License v3.0 or later";
      case LGPLLR:
        return "Lesser General Public License For Linguistic Resources";
      case LIBPNG:
        return "libpng License";
      case LIBPNG_2_0:
        return "PNG Reference Library version 2";
      case LIBSELINUX_1_0:
        return "libselinux public domain notice";
      case LIBTIFF:
        return "libtiff License";
      case LIBUTIL_DAVID_NUGENT:
        return "libutil David Nugent License";
      case LILIQ_P_1_1:
        return "Licence Libre du Québec – Permissive version 1.1";
      case LILIQ_R_1_1:
        return "Licence Libre du Québec – Réciprocité version 1.1";
      case LILIQ_RPLUS_1_1:
        return "Licence Libre du Québec – Réciprocité forte version 1.1";
      case LINUX_MAN_PAGES_1_PARA:
        return "Linux man-pages - 1 paragraph";
      case LINUX_MAN_PAGES_COPYLEFT:
        return "Linux man-pages Copyleft";
      case LINUX_MAN_PAGES_COPYLEFT_2_PARA:
        return "Linux man-pages Copyleft - 2 paragraphs";
      case LINUX_MAN_PAGES_COPYLEFT_VAR:
        return "Linux man-pages Copyleft Variant";
      case LINUX_OPENIB:
        return "Linux Kernel Variant of OpenIB.org license";
      case LOOP:
        return "Common Lisp LOOP License";
      case LPL_1_0:
        return "Lucent Public License Version 1.0";
      case LPL_1_02:
        return "Lucent Public License v1.02";
      case LPPL_1_0:
        return "LaTeX Project Public License v1.0";
      case LPPL_1_1:
        return "LaTeX Project Public License v1.1";
      case LPPL_1_2:
        return "LaTeX Project Public License v1.2";
      case LPPL_1_3A:
        return "LaTeX Project Public License v1.3a";
      case LPPL_1_3C:
        return "LaTeX Project Public License v1.3c";
      case LZMA_SDK_9_11_TO_9_20:
        return "LZMA SDK License (versions 9.11 to 9.20)";
      case LZMA_SDK_9_22:
        return "LZMA SDK License (versions 9.22 and beyond)";
      case MAKEINDEX:
        return "MakeIndex License";
      case MARTIN_BIRGMEIER:
        return "Martin Birgmeier License";
      case METAMAIL:
        return "metamail License";
      case MINPACK:
        return "Minpack License";
      case MIROS:
        return "The MirOS Licence";
      case MIT:
        return "MIT License";
      case MIT_0:
        return "MIT No Attribution";
      case MIT_ADVERTISING:
        return "Enlightenment License (e16)";
      case MIT_CMU:
        return "CMU License";
      case MIT_ENNA:
        return "enna License";
      case MIT_FEH:
        return "feh License";
      case MIT_FESTIVAL:
        return "MIT Festival Variant";
      case MIT_MODERN_VARIANT:
        return "MIT License Modern Variant";
      case MIT_OPEN_GROUP:
        return "MIT Open Group variant";
      case MIT_WU:
        return "MIT Tom Wu Variant";
      case MITNFA:
        return "MIT +no-false-attribs license";
      case MOTOSOTO:
        return "Motosoto License";
      case MPI_PERMISSIVE:
        return "mpi Permissive License";
      case MPICH2:
        return "mpich2 License";
      case MPL_1_0:
        return "Mozilla Public License 1.0";
      case MPL_1_1:
        return "Mozilla Public License 1.1";
      case MPL_2_0:
        return "Mozilla Public License 2.0";
      case MPL_2_0_NO_COPYLEFT_EXCEPTION:
        return "Mozilla Public License 2.0 (no copyleft exception)";
      case MPLUS:
        return "mplus Font License";
      case MS_LPL:
        return "Microsoft Limited Public License";
      case MS_PL:
        return "Microsoft Public License";
      case MS_RL:
        return "Microsoft Reciprocal License";
      case MTLL:
        return "Matrix Template Library License";
      case MULANPSL_1_0:
        return "Mulan Permissive Software License, Version 1";
      case MULANPSL_2_0:
        return "Mulan Permissive Software License, Version 2";
      case MULTICS:
        return "Multics License";
      case MUP:
        return "Mup License";
      case NAIST_2003:
        return "Nara Institute of Science and Technology License (2003)";
      case NASA_1_3:
        return "NASA Open Source Agreement 1.3";
      case NAUMEN:
        return "Naumen Public License";
      case NBPL_1_0:
        return "Net Boolean Public License v1";
      case NCGL_UK_2_0:
        return "Non-Commercial Government Licence";
      case NCSA:
        return "University of Illinois/NCSA Open Source License";
      case NET_SNMP:
        return "Net-SNMP License";
      case NETCDF:
        return "NetCDF license";
      case NEWSLETR:
        return "Newsletr License";
      case NGPL:
        return "Nethack General Public License";
      case NICTA_1_0:
        return "NICTA Public Software License, Version 1.0";
      case NIST_PD:
        return "NIST Public Domain Notice";
      case NIST_PD_FALLBACK:
        return "NIST Public Domain Notice with license fallback";
      case NIST_SOFTWARE:
        return "NIST Software License";
      case NLOD_1_0:
        return "Norwegian Licence for Open Government Data (NLOD) 1.0";
      case NLOD_2_0:
        return "Norwegian Licence for Open Government Data (NLOD) 2.0";
      case NLPL:
        return "No Limit Public License";
      case NOKIA:
        return "Nokia Open Source License";
      case NOSL:
        return "Netizen Open Source License";
      case NOT_OPEN_SOURCE:
        return "Not open source";
      case NOWEB:
        return "Noweb License";
      case NPL_1_0:
        return "Netscape Public License v1.0";
      case NPL_1_1:
        return "Netscape Public License v1.1";
      case NPOSL_3_0:
        return "Non-Profit Open Software License 3.0";
      case NRL:
        return "NRL License";
      case NTP:
        return "NTP License";
      case NTP_0:
        return "NTP No Attribution";
      case NUNIT:
        return "Nunit License";
      case O_UDA_1_0:
        return "Open Use of Data Agreement v1.0";
      case OCCT_PL:
        return "Open CASCADE Technology Public License";
      case OCLC_2_0:
        return "OCLC Research Public License 2.0";
      case ODBL_1_0:
        return "Open Data Commons Open Database License v1.0";
      case ODC_BY_1_0:
        return "Open Data Commons Attribution License v1.0";
      case OFFIS:
        return "OFFIS License";
      case OFL_1_0:
        return "SIL Open Font License 1.0";
      case OFL_1_0_NO_RFN:
        return "SIL Open Font License 1.0 with no Reserved Font Name";
      case OFL_1_0_RFN:
        return "SIL Open Font License 1.0 with Reserved Font Name";
      case OFL_1_1:
        return "SIL Open Font License 1.1";
      case OFL_1_1_NO_RFN:
        return "SIL Open Font License 1.1 with no Reserved Font Name";
      case OFL_1_1_RFN:
        return "SIL Open Font License 1.1 with Reserved Font Name";
      case OGC_1_0:
        return "OGC Software License, Version 1.0";
      case OGDL_TAIWAN_1_0:
        return "Taiwan Open Government Data License, version 1.0";
      case OGL_CANADA_2_0:
        return "Open Government Licence - Canada";
      case OGL_UK_1_0:
        return "Open Government Licence v1.0";
      case OGL_UK_2_0:
        return "Open Government Licence v2.0";
      case OGL_UK_3_0:
        return "Open Government Licence v3.0";
      case OGTSL:
        return "Open Group Test Suite License";
      case OLDAP_1_1:
        return "Open LDAP Public License v1.1";
      case OLDAP_1_2:
        return "Open LDAP Public License v1.2";
      case OLDAP_1_3:
        return "Open LDAP Public License v1.3";
      case OLDAP_1_4:
        return "Open LDAP Public License v1.4";
      case OLDAP_2_0:
        return "Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)";
      case OLDAP_2_0_1:
        return "Open LDAP Public License v2.0.1";
      case OLDAP_2_1:
        return "Open LDAP Public License v2.1";
      case OLDAP_2_2:
        return "Open LDAP Public License v2.2";
      case OLDAP_2_2_1:
        return "Open LDAP Public License v2.2.1";
      case OLDAP_2_2_2:
        return "Open LDAP Public License 2.2.2";
      case OLDAP_2_3:
        return "Open LDAP Public License v2.3";
      case OLDAP_2_4:
        return "Open LDAP Public License v2.4";
      case OLDAP_2_5:
        return "Open LDAP Public License v2.5";
      case OLDAP_2_6:
        return "Open LDAP Public License v2.6";
      case OLDAP_2_7:
        return "Open LDAP Public License v2.7";
      case OLDAP_2_8:
        return "Open LDAP Public License v2.8";
      case OLFL_1_3:
        return "Open Logistics Foundation License Version 1.3";
      case OML:
        return "Open Market License";
      case OPENPBS_2_3:
        return "OpenPBS v2.3 Software License";
      case OPENSSL:
        return "OpenSSL License";
      case OPL_1_0:
        return "Open Public License v1.0";
      case OPL_UK_3_0:
        return "United    Kingdom Open Parliament Licence v3.0";
      case OPUBL_1_0:
        return "Open Publication License v1.0";
      case OSET_PL_2_1:
        return "OSET Public License version 2.1";
      case OSL_1_0:
        return "Open Software License 1.0";
      case OSL_1_1:
        return "Open Software License 1.1";
      case OSL_2_0:
        return "Open Software License 2.0";
      case OSL_2_1:
        return "Open Software License 2.1";
      case OSL_3_0:
        return "Open Software License 3.0";
      case PARITY_6_0_0:
        return "The Parity Public License 6.0.0";
      case PARITY_7_0_0:
        return "The Parity Public License 7.0.0";
      case PDDL_1_0:
        return "Open Data Commons Public Domain Dedication & License 1.0";
      case PHP_3_0:
        return "PHP License v3.0";
      case PHP_3_01:
        return "PHP License v3.01";
      case PLEXUS:
        return "Plexus Classworlds License";
      case POLYFORM_NONCOMMERCIAL_1_0_0:
        return "PolyForm Noncommercial License 1.0.0";
      case POLYFORM_SMALL_BUSINESS_1_0_0:
        return "PolyForm Small Business License 1.0.0";
      case POSTGRESQL:
        return "PostgreSQL License";
      case PSF_2_0:
        return "Python Software Foundation License 2.0";
      case PSFRAG:
        return "psfrag License";
      case PSUTILS:
        return "psutils License";
      case PYTHON_2_0:
        return "Python License 2.0";
      case PYTHON_2_0_1:
        return "Python License 2.0.1";
      case QHULL:
        return "Qhull License";
      case QPL_1_0:
        return "Q Public License 1.0";
      case QPL_1_0_INRIA_2004:
        return "Q Public License 1.0 - INRIA 2004 variant";
      case RDISC:
        return "Rdisc License";
      case RHECOS_1_1:
        return "Red Hat eCos Public License v1.1";
      case RPL_1_1:
        return "Reciprocal Public License 1.1";
      case RPL_1_5:
        return "Reciprocal Public License 1.5";
      case RPSL_1_0:
        return "RealNetworks Public Source License v1.0";
      case RSA_MD:
        return "RSA Message-Digest License";
      case RSCPL:
        return "Ricoh Source Code Public License";
      case RUBY:
        return "Ruby License";
      case SAX_PD:
        return "Sax Public Domain Notice";
      case SAXPATH:
        return "Saxpath License";
      case SCEA:
        return "SCEA Shared Source License";
      case SCHEMEREPORT:
        return "Scheme Language Report License";
      case SENDMAIL:
        return "Sendmail License";
      case SENDMAIL_8_23:
        return "Sendmail License 8.23";
      case SGI_B_1_0:
        return "SGI Free Software License B v1.0";
      case SGI_B_1_1:
        return "SGI Free Software License B v1.1";
      case SGI_B_2_0:
        return "SGI Free Software License B v2.0";
      case SGP4:
        return "SGP4 Permission Notice";
      case SHL_0_5:
        return "Solderpad Hardware License v0.5";
      case SHL_0_51:
        return "Solderpad Hardware License, Version 0.51";
      case SIMPL_2_0:
        return "Simple Public License 2.0";
      case SISSL:
        return "Sun Industry Standards Source License v1.1";
      case SISSL_1_2:
        return "Sun Industry Standards Source License v1.2";
      case SLEEPYCAT:
        return "Sleepycat License";
      case SMLNJ:
        return "Standard ML of New Jersey License";
      case SMPPL:
        return "Secure Messaging Protocol Public License";
      case SNIA:
        return "SNIA Public License 1.1";
      case SNPRINTF:
        return "snprintf License";
      case SPENCER_86:
        return "Spencer License 86";
      case SPENCER_94:
        return "Spencer License 94";
      case SPENCER_99:
        return "Spencer License 99";
      case SPL_1_0:
        return "Sun Public License v1.0";
      case SSH_OPENSSH:
        return "SSH OpenSSH license";
      case SSH_SHORT:
        return "SSH short notice";
      case SSPL_1_0:
        return "Server Side Public License, v 1";
      case STANDARDML_NJ:
        return "Standard ML of New Jersey License";
      case SUGARCRM_1_1_3:
        return "SugarCRM Public License v1.1.3";
      case SUNPRO:
        return "SunPro License";
      case SWL:
        return "Scheme Widget Library (SWL) Software License Agreement";
      case SYMLINKS:
        return "Symlinks License";
      case TAPR_OHL_1_0:
        return "TAPR Open Hardware License v1.0";
      case TCL:
        return "TCL/TK License";
      case TCP_WRAPPERS:
        return "TCP Wrappers License";
      case TERMREADKEY:
        return "TermReadKey License";
      case TMATE:
        return "TMate Open Source License";
      case TORQUE_1_1:
        return "TORQUE v2.5+ Software License v1.1";
      case TOSL:
        return "Trusster Open Source License";
      case TPDL:
        return "Time::ParseDate License";
      case TPL_1_0:
        return "THOR Public License 1.0";
      case TTWL:
        return "Text-Tabs+Wrap License";
      case TU_BERLIN_1_0:
        return "Technische Universitaet Berlin License 1.0";
      case TU_BERLIN_2_0:
        return "Technische Universitaet Berlin License 2.0";
      case UCAR:
        return "UCAR License";
      case UCL_1_0:
        return "Upstream Compatibility License v1.0";
      case UNICODE_DFS_2015:
        return "Unicode License Agreement - Data Files and Software (2015)";
      case UNICODE_DFS_2016:
        return "Unicode License Agreement - Data Files and Software (2016)";
      case UNICODE_TOU:
        return "Unicode Terms of Use";
      case UNIXCRYPT:
        return "UnixCrypt License";
      case UNLICENSE:
        return "The Unlicense";
      case UPL_1_0:
        return "Universal Permissive License v1.0";
      case VIM:
        return "Vim License";
      case VOSTROM:
        return "VOSTROM Public License for Open Source";
      case VSL_1_0:
        return "Vovida Software License v1.0";
      case W3C:
        return "W3C Software Notice and License (2002-12-31)";
      case W3C_19980720:
        return "W3C Software Notice and License (1998-07-20)";
      case W3C_20150513:
        return "W3C Software Notice and Document License (2015-05-13)";
      case W3M:
        return "w3m License";
      case WATCOM_1_0:
        return "Sybase Open Watcom Public License 1.0";
      case WIDGET_WORKSHOP:
        return "Widget Workshop License";
      case WSUIPA:
        return "Wsuipa License";
      case WTFPL:
        return "Do What The F*ck You Want To Public License";
      case WXWINDOWS:
        return "wxWindows Library License";
      case X11:
        return "X11 License";
      case X11_DISTRIBUTE_MODIFICATIONS_VARIANT:
        return "X11 License Distribution Modification Variant";
      case XDEBUG_1_03:
        return "Xdebug License v 1.03";
      case XEROX:
        return "Xerox License";
      case XFIG:
        return "Xfig License";
      case XFREE86_1_1:
        return "XFree86 License 1.1";
      case XINETD:
        return "xinetd License";
      case XLOCK:
        return "xlock License";
      case XNET:
        return "X.Net License";
      case XPP:
        return "XPP License";
      case XSKAT:
        return "XSkat License";
      case YPL_1_0:
        return "Yahoo! Public License v1.0";
      case YPL_1_1:
        return "Yahoo! Public License v1.1";
      case ZED:
        return "Zed License";
      case ZEND_2_0:
        return "Zend License v2.0";
      case ZIMBRA_1_3:
        return "Zimbra Public License v1.3";
      case ZIMBRA_1_4:
        return "Zimbra Public License v1.4";
      case ZLIB:
        return "zlib License";
      case ZLIB_ACKNOWLEDGEMENT:
        return "zlib/libpng License with Acknowledgement";
      case ZPL_1_1:
        return "Zope Public License 1.1";
      case ZPL_2_0:
        return "Zope Public License 2.0";
      case ZPL_2_1:
        return "Zope Public License 2.1";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class SPDXLicenseEnumFactory implements EnumFactory<SPDXLicense> {
    public SPDXLicense fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("0BSD".equals(codeString))
        return SPDXLicense._0BSD;
      if ("AAL".equals(codeString))
        return SPDXLicense.AAL;
      if ("Abstyles".equals(codeString))
        return SPDXLicense.ABSTYLES;
      if ("AdaCore-doc".equals(codeString))
        return SPDXLicense.ADACORE_DOC;
      if ("Adobe-2006".equals(codeString))
        return SPDXLicense.ADOBE_2006;
      if ("Adobe-Glyph".equals(codeString))
        return SPDXLicense.ADOBE_GLYPH;
      if ("ADSL".equals(codeString))
        return SPDXLicense.ADSL;
      if ("AFL-1.1".equals(codeString))
        return SPDXLicense.AFL_1_1;
      if ("AFL-1.2".equals(codeString))
        return SPDXLicense.AFL_1_2;
      if ("AFL-2.0".equals(codeString))
        return SPDXLicense.AFL_2_0;
      if ("AFL-2.1".equals(codeString))
        return SPDXLicense.AFL_2_1;
      if ("AFL-3.0".equals(codeString))
        return SPDXLicense.AFL_3_0;
      if ("Afmparse".equals(codeString))
        return SPDXLicense.AFMPARSE;
      if ("AGPL-1.0".equals(codeString))
        return SPDXLicense.AGPL_1_0;
      if ("AGPL-1.0-only".equals(codeString))
        return SPDXLicense.AGPL_1_0_ONLY;
      if ("AGPL-1.0-or-later".equals(codeString))
        return SPDXLicense.AGPL_1_0_OR_LATER;
      if ("AGPL-3.0".equals(codeString))
        return SPDXLicense.AGPL_3_0;
      if ("AGPL-3.0-only".equals(codeString))
        return SPDXLicense.AGPL_3_0_ONLY;
      if ("AGPL-3.0-or-later".equals(codeString))
        return SPDXLicense.AGPL_3_0_OR_LATER;
      if ("Aladdin".equals(codeString))
        return SPDXLicense.ALADDIN;
      if ("AMDPLPA".equals(codeString))
        return SPDXLicense.AMDPLPA;
      if ("AML".equals(codeString))
        return SPDXLicense.AML;
      if ("AMPAS".equals(codeString))
        return SPDXLicense.AMPAS;
      if ("ANTLR-PD".equals(codeString))
        return SPDXLicense.ANTLR_PD;
      if ("ANTLR-PD-fallback".equals(codeString))
        return SPDXLicense.ANTLR_PD_FALLBACK;
      if ("Apache-1.0".equals(codeString))
        return SPDXLicense.APACHE_1_0;
      if ("Apache-1.1".equals(codeString))
        return SPDXLicense.APACHE_1_1;
      if ("Apache-2.0".equals(codeString))
        return SPDXLicense.APACHE_2_0;
      if ("APAFML".equals(codeString))
        return SPDXLicense.APAFML;
      if ("APL-1.0".equals(codeString))
        return SPDXLicense.APL_1_0;
      if ("App-s2p".equals(codeString))
        return SPDXLicense.APP_S2P;
      if ("APSL-1.0".equals(codeString))
        return SPDXLicense.APSL_1_0;
      if ("APSL-1.1".equals(codeString))
        return SPDXLicense.APSL_1_1;
      if ("APSL-1.2".equals(codeString))
        return SPDXLicense.APSL_1_2;
      if ("APSL-2.0".equals(codeString))
        return SPDXLicense.APSL_2_0;
      if ("Arphic-1999".equals(codeString))
        return SPDXLicense.ARPHIC_1999;
      if ("Artistic-1.0".equals(codeString))
        return SPDXLicense.ARTISTIC_1_0;
      if ("Artistic-1.0-cl8".equals(codeString))
        return SPDXLicense.ARTISTIC_1_0_CL8;
      if ("Artistic-1.0-Perl".equals(codeString))
        return SPDXLicense.ARTISTIC_1_0_PERL;
      if ("Artistic-2.0".equals(codeString))
        return SPDXLicense.ARTISTIC_2_0;
      if ("ASWF-Digital-Assets-1.0".equals(codeString))
        return SPDXLicense.ASWF_DIGITAL_ASSETS_1_0;
      if ("ASWF-Digital-Assets-1.1".equals(codeString))
        return SPDXLicense.ASWF_DIGITAL_ASSETS_1_1;
      if ("Baekmuk".equals(codeString))
        return SPDXLicense.BAEKMUK;
      if ("Bahyph".equals(codeString))
        return SPDXLicense.BAHYPH;
      if ("Barr".equals(codeString))
        return SPDXLicense.BARR;
      if ("Beerware".equals(codeString))
        return SPDXLicense.BEERWARE;
      if ("Bitstream-Charter".equals(codeString))
        return SPDXLicense.BITSTREAM_CHARTER;
      if ("Bitstream-Vera".equals(codeString))
        return SPDXLicense.BITSTREAM_VERA;
      if ("BitTorrent-1.0".equals(codeString))
        return SPDXLicense.BITTORRENT_1_0;
      if ("BitTorrent-1.1".equals(codeString))
        return SPDXLicense.BITTORRENT_1_1;
      if ("blessing".equals(codeString))
        return SPDXLicense.BLESSING;
      if ("BlueOak-1.0.0".equals(codeString))
        return SPDXLicense.BLUEOAK_1_0_0;
      if ("Boehm-GC".equals(codeString))
        return SPDXLicense.BOEHM_GC;
      if ("Borceux".equals(codeString))
        return SPDXLicense.BORCEUX;
      if ("Brian-Gladman-3-Clause".equals(codeString))
        return SPDXLicense.BRIAN_GLADMAN_3_CLAUSE;
      if ("BSD-1-Clause".equals(codeString))
        return SPDXLicense.BSD_1_CLAUSE;
      if ("BSD-2-Clause".equals(codeString))
        return SPDXLicense.BSD_2_CLAUSE;
      if ("BSD-2-Clause-FreeBSD".equals(codeString))
        return SPDXLicense.BSD_2_CLAUSE_FREEBSD;
      if ("BSD-2-Clause-NetBSD".equals(codeString))
        return SPDXLicense.BSD_2_CLAUSE_NETBSD;
      if ("BSD-2-Clause-Patent".equals(codeString))
        return SPDXLicense.BSD_2_CLAUSE_PATENT;
      if ("BSD-2-Clause-Views".equals(codeString))
        return SPDXLicense.BSD_2_CLAUSE_VIEWS;
      if ("BSD-3-Clause".equals(codeString))
        return SPDXLicense.BSD_3_CLAUSE;
      if ("BSD-3-Clause-Attribution".equals(codeString))
        return SPDXLicense.BSD_3_CLAUSE_ATTRIBUTION;
      if ("BSD-3-Clause-Clear".equals(codeString))
        return SPDXLicense.BSD_3_CLAUSE_CLEAR;
      if ("BSD-3-Clause-LBNL".equals(codeString))
        return SPDXLicense.BSD_3_CLAUSE_LBNL;
      if ("BSD-3-Clause-Modification".equals(codeString))
        return SPDXLicense.BSD_3_CLAUSE_MODIFICATION;
      if ("BSD-3-Clause-No-Military-License".equals(codeString))
        return SPDXLicense.BSD_3_CLAUSE_NO_MILITARY_LICENSE;
      if ("BSD-3-Clause-No-Nuclear-License".equals(codeString))
        return SPDXLicense.BSD_3_CLAUSE_NO_NUCLEAR_LICENSE;
      if ("BSD-3-Clause-No-Nuclear-License-2014".equals(codeString))
        return SPDXLicense.BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014;
      if ("BSD-3-Clause-No-Nuclear-Warranty".equals(codeString))
        return SPDXLicense.BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY;
      if ("BSD-3-Clause-Open-MPI".equals(codeString))
        return SPDXLicense.BSD_3_CLAUSE_OPEN_MPI;
      if ("BSD-4-Clause".equals(codeString))
        return SPDXLicense.BSD_4_CLAUSE;
      if ("BSD-4-Clause-Shortened".equals(codeString))
        return SPDXLicense.BSD_4_CLAUSE_SHORTENED;
      if ("BSD-4-Clause-UC".equals(codeString))
        return SPDXLicense.BSD_4_CLAUSE_UC;
      if ("BSD-4.3RENO".equals(codeString))
        return SPDXLicense.BSD_4_3RENO;
      if ("BSD-4.3TAHOE".equals(codeString))
        return SPDXLicense.BSD_4_3TAHOE;
      if ("BSD-Advertising-Acknowledgement".equals(codeString))
        return SPDXLicense.BSD_ADVERTISING_ACKNOWLEDGEMENT;
      if ("BSD-Attribution-HPND-disclaimer".equals(codeString))
        return SPDXLicense.BSD_ATTRIBUTION_HPND_DISCLAIMER;
      if ("BSD-Protection".equals(codeString))
        return SPDXLicense.BSD_PROTECTION;
      if ("BSD-Source-Code".equals(codeString))
        return SPDXLicense.BSD_SOURCE_CODE;
      if ("BSL-1.0".equals(codeString))
        return SPDXLicense.BSL_1_0;
      if ("BUSL-1.1".equals(codeString))
        return SPDXLicense.BUSL_1_1;
      if ("bzip2-1.0.5".equals(codeString))
        return SPDXLicense.BZIP2_1_0_5;
      if ("bzip2-1.0.6".equals(codeString))
        return SPDXLicense.BZIP2_1_0_6;
      if ("C-UDA-1.0".equals(codeString))
        return SPDXLicense.C_UDA_1_0;
      if ("CAL-1.0".equals(codeString))
        return SPDXLicense.CAL_1_0;
      if ("CAL-1.0-Combined-Work-Exception".equals(codeString))
        return SPDXLicense.CAL_1_0_COMBINED_WORK_EXCEPTION;
      if ("Caldera".equals(codeString))
        return SPDXLicense.CALDERA;
      if ("CATOSL-1.1".equals(codeString))
        return SPDXLicense.CATOSL_1_1;
      if ("CC-BY-1.0".equals(codeString))
        return SPDXLicense.CC_BY_1_0;
      if ("CC-BY-2.0".equals(codeString))
        return SPDXLicense.CC_BY_2_0;
      if ("CC-BY-2.5".equals(codeString))
        return SPDXLicense.CC_BY_2_5;
      if ("CC-BY-2.5-AU".equals(codeString))
        return SPDXLicense.CC_BY_2_5_AU;
      if ("CC-BY-3.0".equals(codeString))
        return SPDXLicense.CC_BY_3_0;
      if ("CC-BY-3.0-AT".equals(codeString))
        return SPDXLicense.CC_BY_3_0_AT;
      if ("CC-BY-3.0-DE".equals(codeString))
        return SPDXLicense.CC_BY_3_0_DE;
      if ("CC-BY-3.0-IGO".equals(codeString))
        return SPDXLicense.CC_BY_3_0_IGO;
      if ("CC-BY-3.0-NL".equals(codeString))
        return SPDXLicense.CC_BY_3_0_NL;
      if ("CC-BY-3.0-US".equals(codeString))
        return SPDXLicense.CC_BY_3_0_US;
      if ("CC-BY-4.0".equals(codeString))
        return SPDXLicense.CC_BY_4_0;
      if ("CC-BY-NC-1.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_1_0;
      if ("CC-BY-NC-2.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_2_0;
      if ("CC-BY-NC-2.5".equals(codeString))
        return SPDXLicense.CC_BY_NC_2_5;
      if ("CC-BY-NC-3.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_3_0;
      if ("CC-BY-NC-3.0-DE".equals(codeString))
        return SPDXLicense.CC_BY_NC_3_0_DE;
      if ("CC-BY-NC-4.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_4_0;
      if ("CC-BY-NC-ND-1.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_ND_1_0;
      if ("CC-BY-NC-ND-2.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_ND_2_0;
      if ("CC-BY-NC-ND-2.5".equals(codeString))
        return SPDXLicense.CC_BY_NC_ND_2_5;
      if ("CC-BY-NC-ND-3.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_ND_3_0;
      if ("CC-BY-NC-ND-3.0-DE".equals(codeString))
        return SPDXLicense.CC_BY_NC_ND_3_0_DE;
      if ("CC-BY-NC-ND-3.0-IGO".equals(codeString))
        return SPDXLicense.CC_BY_NC_ND_3_0_IGO;
      if ("CC-BY-NC-ND-4.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_ND_4_0;
      if ("CC-BY-NC-SA-1.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_SA_1_0;
      if ("CC-BY-NC-SA-2.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_SA_2_0;
      if ("CC-BY-NC-SA-2.0-DE".equals(codeString))
        return SPDXLicense.CC_BY_NC_SA_2_0_DE;
      if ("CC-BY-NC-SA-2.0-FR".equals(codeString))
        return SPDXLicense.CC_BY_NC_SA_2_0_FR;
      if ("CC-BY-NC-SA-2.0-UK".equals(codeString))
        return SPDXLicense.CC_BY_NC_SA_2_0_UK;
      if ("CC-BY-NC-SA-2.5".equals(codeString))
        return SPDXLicense.CC_BY_NC_SA_2_5;
      if ("CC-BY-NC-SA-3.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_SA_3_0;
      if ("CC-BY-NC-SA-3.0-DE".equals(codeString))
        return SPDXLicense.CC_BY_NC_SA_3_0_DE;
      if ("CC-BY-NC-SA-3.0-IGO".equals(codeString))
        return SPDXLicense.CC_BY_NC_SA_3_0_IGO;
      if ("CC-BY-NC-SA-4.0".equals(codeString))
        return SPDXLicense.CC_BY_NC_SA_4_0;
      if ("CC-BY-ND-1.0".equals(codeString))
        return SPDXLicense.CC_BY_ND_1_0;
      if ("CC-BY-ND-2.0".equals(codeString))
        return SPDXLicense.CC_BY_ND_2_0;
      if ("CC-BY-ND-2.5".equals(codeString))
        return SPDXLicense.CC_BY_ND_2_5;
      if ("CC-BY-ND-3.0".equals(codeString))
        return SPDXLicense.CC_BY_ND_3_0;
      if ("CC-BY-ND-3.0-DE".equals(codeString))
        return SPDXLicense.CC_BY_ND_3_0_DE;
      if ("CC-BY-ND-4.0".equals(codeString))
        return SPDXLicense.CC_BY_ND_4_0;
      if ("CC-BY-SA-1.0".equals(codeString))
        return SPDXLicense.CC_BY_SA_1_0;
      if ("CC-BY-SA-2.0".equals(codeString))
        return SPDXLicense.CC_BY_SA_2_0;
      if ("CC-BY-SA-2.0-UK".equals(codeString))
        return SPDXLicense.CC_BY_SA_2_0_UK;
      if ("CC-BY-SA-2.1-JP".equals(codeString))
        return SPDXLicense.CC_BY_SA_2_1_JP;
      if ("CC-BY-SA-2.5".equals(codeString))
        return SPDXLicense.CC_BY_SA_2_5;
      if ("CC-BY-SA-3.0".equals(codeString))
        return SPDXLicense.CC_BY_SA_3_0;
      if ("CC-BY-SA-3.0-AT".equals(codeString))
        return SPDXLicense.CC_BY_SA_3_0_AT;
      if ("CC-BY-SA-3.0-DE".equals(codeString))
        return SPDXLicense.CC_BY_SA_3_0_DE;
      if ("CC-BY-SA-3.0-IGO".equals(codeString))
        return SPDXLicense.CC_BY_SA_3_0_IGO;
      if ("CC-BY-SA-4.0".equals(codeString))
        return SPDXLicense.CC_BY_SA_4_0;
      if ("CC-PDDC".equals(codeString))
        return SPDXLicense.CC_PDDC;
      if ("CC0-1.0".equals(codeString))
        return SPDXLicense.CC0_1_0;
      if ("CDDL-1.0".equals(codeString))
        return SPDXLicense.CDDL_1_0;
      if ("CDDL-1.1".equals(codeString))
        return SPDXLicense.CDDL_1_1;
      if ("CDL-1.0".equals(codeString))
        return SPDXLicense.CDL_1_0;
      if ("CDLA-Permissive-1.0".equals(codeString))
        return SPDXLicense.CDLA_PERMISSIVE_1_0;
      if ("CDLA-Permissive-2.0".equals(codeString))
        return SPDXLicense.CDLA_PERMISSIVE_2_0;
      if ("CDLA-Sharing-1.0".equals(codeString))
        return SPDXLicense.CDLA_SHARING_1_0;
      if ("CECILL-1.0".equals(codeString))
        return SPDXLicense.CECILL_1_0;
      if ("CECILL-1.1".equals(codeString))
        return SPDXLicense.CECILL_1_1;
      if ("CECILL-2.0".equals(codeString))
        return SPDXLicense.CECILL_2_0;
      if ("CECILL-2.1".equals(codeString))
        return SPDXLicense.CECILL_2_1;
      if ("CECILL-B".equals(codeString))
        return SPDXLicense.CECILL_B;
      if ("CECILL-C".equals(codeString))
        return SPDXLicense.CECILL_C;
      if ("CERN-OHL-1.1".equals(codeString))
        return SPDXLicense.CERN_OHL_1_1;
      if ("CERN-OHL-1.2".equals(codeString))
        return SPDXLicense.CERN_OHL_1_2;
      if ("CERN-OHL-P-2.0".equals(codeString))
        return SPDXLicense.CERN_OHL_P_2_0;
      if ("CERN-OHL-S-2.0".equals(codeString))
        return SPDXLicense.CERN_OHL_S_2_0;
      if ("CERN-OHL-W-2.0".equals(codeString))
        return SPDXLicense.CERN_OHL_W_2_0;
      if ("CFITSIO".equals(codeString))
        return SPDXLicense.CFITSIO;
      if ("checkmk".equals(codeString))
        return SPDXLicense.CHECKMK;
      if ("ClArtistic".equals(codeString))
        return SPDXLicense.CLARTISTIC;
      if ("Clips".equals(codeString))
        return SPDXLicense.CLIPS;
      if ("CMU-Mach".equals(codeString))
        return SPDXLicense.CMU_MACH;
      if ("CNRI-Jython".equals(codeString))
        return SPDXLicense.CNRI_JYTHON;
      if ("CNRI-Python".equals(codeString))
        return SPDXLicense.CNRI_PYTHON;
      if ("CNRI-Python-GPL-Compatible".equals(codeString))
        return SPDXLicense.CNRI_PYTHON_GPL_COMPATIBLE;
      if ("COIL-1.0".equals(codeString))
        return SPDXLicense.COIL_1_0;
      if ("Community-Spec-1.0".equals(codeString))
        return SPDXLicense.COMMUNITY_SPEC_1_0;
      if ("Condor-1.1".equals(codeString))
        return SPDXLicense.CONDOR_1_1;
      if ("copyleft-next-0.3.0".equals(codeString))
        return SPDXLicense.COPYLEFT_NEXT_0_3_0;
      if ("copyleft-next-0.3.1".equals(codeString))
        return SPDXLicense.COPYLEFT_NEXT_0_3_1;
      if ("Cornell-Lossless-JPEG".equals(codeString))
        return SPDXLicense.CORNELL_LOSSLESS_JPEG;
      if ("CPAL-1.0".equals(codeString))
        return SPDXLicense.CPAL_1_0;
      if ("CPL-1.0".equals(codeString))
        return SPDXLicense.CPL_1_0;
      if ("CPOL-1.02".equals(codeString))
        return SPDXLicense.CPOL_1_02;
      if ("Crossword".equals(codeString))
        return SPDXLicense.CROSSWORD;
      if ("CrystalStacker".equals(codeString))
        return SPDXLicense.CRYSTALSTACKER;
      if ("CUA-OPL-1.0".equals(codeString))
        return SPDXLicense.CUA_OPL_1_0;
      if ("Cube".equals(codeString))
        return SPDXLicense.CUBE;
      if ("curl".equals(codeString))
        return SPDXLicense.CURL;
      if ("D-FSL-1.0".equals(codeString))
        return SPDXLicense.D_FSL_1_0;
      if ("diffmark".equals(codeString))
        return SPDXLicense.DIFFMARK;
      if ("DL-DE-BY-2.0".equals(codeString))
        return SPDXLicense.DL_DE_BY_2_0;
      if ("DOC".equals(codeString))
        return SPDXLicense.DOC;
      if ("Dotseqn".equals(codeString))
        return SPDXLicense.DOTSEQN;
      if ("DRL-1.0".equals(codeString))
        return SPDXLicense.DRL_1_0;
      if ("DSDP".equals(codeString))
        return SPDXLicense.DSDP;
      if ("dtoa".equals(codeString))
        return SPDXLicense.DTOA;
      if ("dvipdfm".equals(codeString))
        return SPDXLicense.DVIPDFM;
      if ("ECL-1.0".equals(codeString))
        return SPDXLicense.ECL_1_0;
      if ("ECL-2.0".equals(codeString))
        return SPDXLicense.ECL_2_0;
      if ("eCos-2.0".equals(codeString))
        return SPDXLicense.ECOS_2_0;
      if ("EFL-1.0".equals(codeString))
        return SPDXLicense.EFL_1_0;
      if ("EFL-2.0".equals(codeString))
        return SPDXLicense.EFL_2_0;
      if ("eGenix".equals(codeString))
        return SPDXLicense.EGENIX;
      if ("Elastic-2.0".equals(codeString))
        return SPDXLicense.ELASTIC_2_0;
      if ("Entessa".equals(codeString))
        return SPDXLicense.ENTESSA;
      if ("EPICS".equals(codeString))
        return SPDXLicense.EPICS;
      if ("EPL-1.0".equals(codeString))
        return SPDXLicense.EPL_1_0;
      if ("EPL-2.0".equals(codeString))
        return SPDXLicense.EPL_2_0;
      if ("ErlPL-1.1".equals(codeString))
        return SPDXLicense.ERLPL_1_1;
      if ("etalab-2.0".equals(codeString))
        return SPDXLicense.ETALAB_2_0;
      if ("EUDatagrid".equals(codeString))
        return SPDXLicense.EUDATAGRID;
      if ("EUPL-1.0".equals(codeString))
        return SPDXLicense.EUPL_1_0;
      if ("EUPL-1.1".equals(codeString))
        return SPDXLicense.EUPL_1_1;
      if ("EUPL-1.2".equals(codeString))
        return SPDXLicense.EUPL_1_2;
      if ("Eurosym".equals(codeString))
        return SPDXLicense.EUROSYM;
      if ("Fair".equals(codeString))
        return SPDXLicense.FAIR;
      if ("FDK-AAC".equals(codeString))
        return SPDXLicense.FDK_AAC;
      if ("Frameworx-1.0".equals(codeString))
        return SPDXLicense.FRAMEWORX_1_0;
      if ("FreeBSD-DOC".equals(codeString))
        return SPDXLicense.FREEBSD_DOC;
      if ("FreeImage".equals(codeString))
        return SPDXLicense.FREEIMAGE;
      if ("FSFAP".equals(codeString))
        return SPDXLicense.FSFAP;
      if ("FSFUL".equals(codeString))
        return SPDXLicense.FSFUL;
      if ("FSFULLR".equals(codeString))
        return SPDXLicense.FSFULLR;
      if ("FSFULLRWD".equals(codeString))
        return SPDXLicense.FSFULLRWD;
      if ("FTL".equals(codeString))
        return SPDXLicense.FTL;
      if ("GD".equals(codeString))
        return SPDXLicense.GD;
      if ("GFDL-1.1".equals(codeString))
        return SPDXLicense.GFDL_1_1;
      if ("GFDL-1.1-invariants-only".equals(codeString))
        return SPDXLicense.GFDL_1_1_INVARIANTS_ONLY;
      if ("GFDL-1.1-invariants-or-later".equals(codeString))
        return SPDXLicense.GFDL_1_1_INVARIANTS_OR_LATER;
      if ("GFDL-1.1-no-invariants-only".equals(codeString))
        return SPDXLicense.GFDL_1_1_NO_INVARIANTS_ONLY;
      if ("GFDL-1.1-no-invariants-or-later".equals(codeString))
        return SPDXLicense.GFDL_1_1_NO_INVARIANTS_OR_LATER;
      if ("GFDL-1.1-only".equals(codeString))
        return SPDXLicense.GFDL_1_1_ONLY;
      if ("GFDL-1.1-or-later".equals(codeString))
        return SPDXLicense.GFDL_1_1_OR_LATER;
      if ("GFDL-1.2".equals(codeString))
        return SPDXLicense.GFDL_1_2;
      if ("GFDL-1.2-invariants-only".equals(codeString))
        return SPDXLicense.GFDL_1_2_INVARIANTS_ONLY;
      if ("GFDL-1.2-invariants-or-later".equals(codeString))
        return SPDXLicense.GFDL_1_2_INVARIANTS_OR_LATER;
      if ("GFDL-1.2-no-invariants-only".equals(codeString))
        return SPDXLicense.GFDL_1_2_NO_INVARIANTS_ONLY;
      if ("GFDL-1.2-no-invariants-or-later".equals(codeString))
        return SPDXLicense.GFDL_1_2_NO_INVARIANTS_OR_LATER;
      if ("GFDL-1.2-only".equals(codeString))
        return SPDXLicense.GFDL_1_2_ONLY;
      if ("GFDL-1.2-or-later".equals(codeString))
        return SPDXLicense.GFDL_1_2_OR_LATER;
      if ("GFDL-1.3".equals(codeString))
        return SPDXLicense.GFDL_1_3;
      if ("GFDL-1.3-invariants-only".equals(codeString))
        return SPDXLicense.GFDL_1_3_INVARIANTS_ONLY;
      if ("GFDL-1.3-invariants-or-later".equals(codeString))
        return SPDXLicense.GFDL_1_3_INVARIANTS_OR_LATER;
      if ("GFDL-1.3-no-invariants-only".equals(codeString))
        return SPDXLicense.GFDL_1_3_NO_INVARIANTS_ONLY;
      if ("GFDL-1.3-no-invariants-or-later".equals(codeString))
        return SPDXLicense.GFDL_1_3_NO_INVARIANTS_OR_LATER;
      if ("GFDL-1.3-only".equals(codeString))
        return SPDXLicense.GFDL_1_3_ONLY;
      if ("GFDL-1.3-or-later".equals(codeString))
        return SPDXLicense.GFDL_1_3_OR_LATER;
      if ("Giftware".equals(codeString))
        return SPDXLicense.GIFTWARE;
      if ("GL2PS".equals(codeString))
        return SPDXLicense.GL2PS;
      if ("Glide".equals(codeString))
        return SPDXLicense.GLIDE;
      if ("Glulxe".equals(codeString))
        return SPDXLicense.GLULXE;
      if ("GLWTPL".equals(codeString))
        return SPDXLicense.GLWTPL;
      if ("gnuplot".equals(codeString))
        return SPDXLicense.GNUPLOT;
      if ("GPL-1.0".equals(codeString))
        return SPDXLicense.GPL_1_0;
      if ("GPL-1.0+".equals(codeString))
        return SPDXLicense.GPL_1_0PLUS;
      if ("GPL-1.0-only".equals(codeString))
        return SPDXLicense.GPL_1_0_ONLY;
      if ("GPL-1.0-or-later".equals(codeString))
        return SPDXLicense.GPL_1_0_OR_LATER;
      if ("GPL-2.0".equals(codeString))
        return SPDXLicense.GPL_2_0;
      if ("GPL-2.0+".equals(codeString))
        return SPDXLicense.GPL_2_0PLUS;
      if ("GPL-2.0-only".equals(codeString))
        return SPDXLicense.GPL_2_0_ONLY;
      if ("GPL-2.0-or-later".equals(codeString))
        return SPDXLicense.GPL_2_0_OR_LATER;
      if ("GPL-2.0-with-autoconf-exception".equals(codeString))
        return SPDXLicense.GPL_2_0_WITH_AUTOCONF_EXCEPTION;
      if ("GPL-2.0-with-bison-exception".equals(codeString))
        return SPDXLicense.GPL_2_0_WITH_BISON_EXCEPTION;
      if ("GPL-2.0-with-classpath-exception".equals(codeString))
        return SPDXLicense.GPL_2_0_WITH_CLASSPATH_EXCEPTION;
      if ("GPL-2.0-with-font-exception".equals(codeString))
        return SPDXLicense.GPL_2_0_WITH_FONT_EXCEPTION;
      if ("GPL-2.0-with-GCC-exception".equals(codeString))
        return SPDXLicense.GPL_2_0_WITH_GCC_EXCEPTION;
      if ("GPL-3.0".equals(codeString))
        return SPDXLicense.GPL_3_0;
      if ("GPL-3.0+".equals(codeString))
        return SPDXLicense.GPL_3_0PLUS;
      if ("GPL-3.0-only".equals(codeString))
        return SPDXLicense.GPL_3_0_ONLY;
      if ("GPL-3.0-or-later".equals(codeString))
        return SPDXLicense.GPL_3_0_OR_LATER;
      if ("GPL-3.0-with-autoconf-exception".equals(codeString))
        return SPDXLicense.GPL_3_0_WITH_AUTOCONF_EXCEPTION;
      if ("GPL-3.0-with-GCC-exception".equals(codeString))
        return SPDXLicense.GPL_3_0_WITH_GCC_EXCEPTION;
      if ("Graphics-Gems".equals(codeString))
        return SPDXLicense.GRAPHICS_GEMS;
      if ("gSOAP-1.3b".equals(codeString))
        return SPDXLicense.GSOAP_1_3B;
      if ("HaskellReport".equals(codeString))
        return SPDXLicense.HASKELLREPORT;
      if ("Hippocratic-2.1".equals(codeString))
        return SPDXLicense.HIPPOCRATIC_2_1;
      if ("HP-1986".equals(codeString))
        return SPDXLicense.HP_1986;
      if ("HPND".equals(codeString))
        return SPDXLicense.HPND;
      if ("HPND-export-US".equals(codeString))
        return SPDXLicense.HPND_EXPORT_US;
      if ("HPND-Markus-Kuhn".equals(codeString))
        return SPDXLicense.HPND_MARKUS_KUHN;
      if ("HPND-sell-variant".equals(codeString))
        return SPDXLicense.HPND_SELL_VARIANT;
      if ("HPND-sell-variant-MIT-disclaimer".equals(codeString))
        return SPDXLicense.HPND_SELL_VARIANT_MIT_DISCLAIMER;
      if ("HTMLTIDY".equals(codeString))
        return SPDXLicense.HTMLTIDY;
      if ("IBM-pibs".equals(codeString))
        return SPDXLicense.IBM_PIBS;
      if ("ICU".equals(codeString))
        return SPDXLicense.ICU;
      if ("IEC-Code-Components-EULA".equals(codeString))
        return SPDXLicense.IEC_CODE_COMPONENTS_EULA;
      if ("IJG".equals(codeString))
        return SPDXLicense.IJG;
      if ("IJG-short".equals(codeString))
        return SPDXLicense.IJG_SHORT;
      if ("ImageMagick".equals(codeString))
        return SPDXLicense.IMAGEMAGICK;
      if ("iMatix".equals(codeString))
        return SPDXLicense.IMATIX;
      if ("Imlib2".equals(codeString))
        return SPDXLicense.IMLIB2;
      if ("Info-ZIP".equals(codeString))
        return SPDXLicense.INFO_ZIP;
      if ("Inner-Net-2.0".equals(codeString))
        return SPDXLicense.INNER_NET_2_0;
      if ("Intel".equals(codeString))
        return SPDXLicense.INTEL;
      if ("Intel-ACPI".equals(codeString))
        return SPDXLicense.INTEL_ACPI;
      if ("Interbase-1.0".equals(codeString))
        return SPDXLicense.INTERBASE_1_0;
      if ("IPA".equals(codeString))
        return SPDXLicense.IPA;
      if ("IPL-1.0".equals(codeString))
        return SPDXLicense.IPL_1_0;
      if ("ISC".equals(codeString))
        return SPDXLicense.ISC;
      if ("Jam".equals(codeString))
        return SPDXLicense.JAM;
      if ("JasPer-2.0".equals(codeString))
        return SPDXLicense.JASPER_2_0;
      if ("JPL-image".equals(codeString))
        return SPDXLicense.JPL_IMAGE;
      if ("JPNIC".equals(codeString))
        return SPDXLicense.JPNIC;
      if ("JSON".equals(codeString))
        return SPDXLicense.JSON;
      if ("Kazlib".equals(codeString))
        return SPDXLicense.KAZLIB;
      if ("Knuth-CTAN".equals(codeString))
        return SPDXLicense.KNUTH_CTAN;
      if ("LAL-1.2".equals(codeString))
        return SPDXLicense.LAL_1_2;
      if ("LAL-1.3".equals(codeString))
        return SPDXLicense.LAL_1_3;
      if ("Latex2e".equals(codeString))
        return SPDXLicense.LATEX2E;
      if ("Latex2e-translated-notice".equals(codeString))
        return SPDXLicense.LATEX2E_TRANSLATED_NOTICE;
      if ("Leptonica".equals(codeString))
        return SPDXLicense.LEPTONICA;
      if ("LGPL-2.0".equals(codeString))
        return SPDXLicense.LGPL_2_0;
      if ("LGPL-2.0+".equals(codeString))
        return SPDXLicense.LGPL_2_0PLUS;
      if ("LGPL-2.0-only".equals(codeString))
        return SPDXLicense.LGPL_2_0_ONLY;
      if ("LGPL-2.0-or-later".equals(codeString))
        return SPDXLicense.LGPL_2_0_OR_LATER;
      if ("LGPL-2.1".equals(codeString))
        return SPDXLicense.LGPL_2_1;
      if ("LGPL-2.1+".equals(codeString))
        return SPDXLicense.LGPL_2_1PLUS;
      if ("LGPL-2.1-only".equals(codeString))
        return SPDXLicense.LGPL_2_1_ONLY;
      if ("LGPL-2.1-or-later".equals(codeString))
        return SPDXLicense.LGPL_2_1_OR_LATER;
      if ("LGPL-3.0".equals(codeString))
        return SPDXLicense.LGPL_3_0;
      if ("LGPL-3.0+".equals(codeString))
        return SPDXLicense.LGPL_3_0PLUS;
      if ("LGPL-3.0-only".equals(codeString))
        return SPDXLicense.LGPL_3_0_ONLY;
      if ("LGPL-3.0-or-later".equals(codeString))
        return SPDXLicense.LGPL_3_0_OR_LATER;
      if ("LGPLLR".equals(codeString))
        return SPDXLicense.LGPLLR;
      if ("Libpng".equals(codeString))
        return SPDXLicense.LIBPNG;
      if ("libpng-2.0".equals(codeString))
        return SPDXLicense.LIBPNG_2_0;
      if ("libselinux-1.0".equals(codeString))
        return SPDXLicense.LIBSELINUX_1_0;
      if ("libtiff".equals(codeString))
        return SPDXLicense.LIBTIFF;
      if ("libutil-David-Nugent".equals(codeString))
        return SPDXLicense.LIBUTIL_DAVID_NUGENT;
      if ("LiLiQ-P-1.1".equals(codeString))
        return SPDXLicense.LILIQ_P_1_1;
      if ("LiLiQ-R-1.1".equals(codeString))
        return SPDXLicense.LILIQ_R_1_1;
      if ("LiLiQ-Rplus-1.1".equals(codeString))
        return SPDXLicense.LILIQ_RPLUS_1_1;
      if ("Linux-man-pages-1-para".equals(codeString))
        return SPDXLicense.LINUX_MAN_PAGES_1_PARA;
      if ("Linux-man-pages-copyleft".equals(codeString))
        return SPDXLicense.LINUX_MAN_PAGES_COPYLEFT;
      if ("Linux-man-pages-copyleft-2-para".equals(codeString))
        return SPDXLicense.LINUX_MAN_PAGES_COPYLEFT_2_PARA;
      if ("Linux-man-pages-copyleft-var".equals(codeString))
        return SPDXLicense.LINUX_MAN_PAGES_COPYLEFT_VAR;
      if ("Linux-OpenIB".equals(codeString))
        return SPDXLicense.LINUX_OPENIB;
      if ("LOOP".equals(codeString))
        return SPDXLicense.LOOP;
      if ("LPL-1.0".equals(codeString))
        return SPDXLicense.LPL_1_0;
      if ("LPL-1.02".equals(codeString))
        return SPDXLicense.LPL_1_02;
      if ("LPPL-1.0".equals(codeString))
        return SPDXLicense.LPPL_1_0;
      if ("LPPL-1.1".equals(codeString))
        return SPDXLicense.LPPL_1_1;
      if ("LPPL-1.2".equals(codeString))
        return SPDXLicense.LPPL_1_2;
      if ("LPPL-1.3a".equals(codeString))
        return SPDXLicense.LPPL_1_3A;
      if ("LPPL-1.3c".equals(codeString))
        return SPDXLicense.LPPL_1_3C;
      if ("LZMA-SDK-9.11-to-9.20".equals(codeString))
        return SPDXLicense.LZMA_SDK_9_11_TO_9_20;
      if ("LZMA-SDK-9.22".equals(codeString))
        return SPDXLicense.LZMA_SDK_9_22;
      if ("MakeIndex".equals(codeString))
        return SPDXLicense.MAKEINDEX;
      if ("Martin-Birgmeier".equals(codeString))
        return SPDXLicense.MARTIN_BIRGMEIER;
      if ("metamail".equals(codeString))
        return SPDXLicense.METAMAIL;
      if ("Minpack".equals(codeString))
        return SPDXLicense.MINPACK;
      if ("MirOS".equals(codeString))
        return SPDXLicense.MIROS;
      if ("MIT".equals(codeString))
        return SPDXLicense.MIT;
      if ("MIT-0".equals(codeString))
        return SPDXLicense.MIT_0;
      if ("MIT-advertising".equals(codeString))
        return SPDXLicense.MIT_ADVERTISING;
      if ("MIT-CMU".equals(codeString))
        return SPDXLicense.MIT_CMU;
      if ("MIT-enna".equals(codeString))
        return SPDXLicense.MIT_ENNA;
      if ("MIT-feh".equals(codeString))
        return SPDXLicense.MIT_FEH;
      if ("MIT-Festival".equals(codeString))
        return SPDXLicense.MIT_FESTIVAL;
      if ("MIT-Modern-Variant".equals(codeString))
        return SPDXLicense.MIT_MODERN_VARIANT;
      if ("MIT-open-group".equals(codeString))
        return SPDXLicense.MIT_OPEN_GROUP;
      if ("MIT-Wu".equals(codeString))
        return SPDXLicense.MIT_WU;
      if ("MITNFA".equals(codeString))
        return SPDXLicense.MITNFA;
      if ("Motosoto".equals(codeString))
        return SPDXLicense.MOTOSOTO;
      if ("mpi-permissive".equals(codeString))
        return SPDXLicense.MPI_PERMISSIVE;
      if ("mpich2".equals(codeString))
        return SPDXLicense.MPICH2;
      if ("MPL-1.0".equals(codeString))
        return SPDXLicense.MPL_1_0;
      if ("MPL-1.1".equals(codeString))
        return SPDXLicense.MPL_1_1;
      if ("MPL-2.0".equals(codeString))
        return SPDXLicense.MPL_2_0;
      if ("MPL-2.0-no-copyleft-exception".equals(codeString))
        return SPDXLicense.MPL_2_0_NO_COPYLEFT_EXCEPTION;
      if ("mplus".equals(codeString))
        return SPDXLicense.MPLUS;
      if ("MS-LPL".equals(codeString))
        return SPDXLicense.MS_LPL;
      if ("MS-PL".equals(codeString))
        return SPDXLicense.MS_PL;
      if ("MS-RL".equals(codeString))
        return SPDXLicense.MS_RL;
      if ("MTLL".equals(codeString))
        return SPDXLicense.MTLL;
      if ("MulanPSL-1.0".equals(codeString))
        return SPDXLicense.MULANPSL_1_0;
      if ("MulanPSL-2.0".equals(codeString))
        return SPDXLicense.MULANPSL_2_0;
      if ("Multics".equals(codeString))
        return SPDXLicense.MULTICS;
      if ("Mup".equals(codeString))
        return SPDXLicense.MUP;
      if ("NAIST-2003".equals(codeString))
        return SPDXLicense.NAIST_2003;
      if ("NASA-1.3".equals(codeString))
        return SPDXLicense.NASA_1_3;
      if ("Naumen".equals(codeString))
        return SPDXLicense.NAUMEN;
      if ("NBPL-1.0".equals(codeString))
        return SPDXLicense.NBPL_1_0;
      if ("NCGL-UK-2.0".equals(codeString))
        return SPDXLicense.NCGL_UK_2_0;
      if ("NCSA".equals(codeString))
        return SPDXLicense.NCSA;
      if ("Net-SNMP".equals(codeString))
        return SPDXLicense.NET_SNMP;
      if ("NetCDF".equals(codeString))
        return SPDXLicense.NETCDF;
      if ("Newsletr".equals(codeString))
        return SPDXLicense.NEWSLETR;
      if ("NGPL".equals(codeString))
        return SPDXLicense.NGPL;
      if ("NICTA-1.0".equals(codeString))
        return SPDXLicense.NICTA_1_0;
      if ("NIST-PD".equals(codeString))
        return SPDXLicense.NIST_PD;
      if ("NIST-PD-fallback".equals(codeString))
        return SPDXLicense.NIST_PD_FALLBACK;
      if ("NIST-Software".equals(codeString))
        return SPDXLicense.NIST_SOFTWARE;
      if ("NLOD-1.0".equals(codeString))
        return SPDXLicense.NLOD_1_0;
      if ("NLOD-2.0".equals(codeString))
        return SPDXLicense.NLOD_2_0;
      if ("NLPL".equals(codeString))
        return SPDXLicense.NLPL;
      if ("Nokia".equals(codeString))
        return SPDXLicense.NOKIA;
      if ("NOSL".equals(codeString))
        return SPDXLicense.NOSL;
      if ("not-open-source".equals(codeString))
        return SPDXLicense.NOT_OPEN_SOURCE;
      if ("Noweb".equals(codeString))
        return SPDXLicense.NOWEB;
      if ("NPL-1.0".equals(codeString))
        return SPDXLicense.NPL_1_0;
      if ("NPL-1.1".equals(codeString))
        return SPDXLicense.NPL_1_1;
      if ("NPOSL-3.0".equals(codeString))
        return SPDXLicense.NPOSL_3_0;
      if ("NRL".equals(codeString))
        return SPDXLicense.NRL;
      if ("NTP".equals(codeString))
        return SPDXLicense.NTP;
      if ("NTP-0".equals(codeString))
        return SPDXLicense.NTP_0;
      if ("Nunit".equals(codeString))
        return SPDXLicense.NUNIT;
      if ("O-UDA-1.0".equals(codeString))
        return SPDXLicense.O_UDA_1_0;
      if ("OCCT-PL".equals(codeString))
        return SPDXLicense.OCCT_PL;
      if ("OCLC-2.0".equals(codeString))
        return SPDXLicense.OCLC_2_0;
      if ("ODbL-1.0".equals(codeString))
        return SPDXLicense.ODBL_1_0;
      if ("ODC-By-1.0".equals(codeString))
        return SPDXLicense.ODC_BY_1_0;
      if ("OFFIS".equals(codeString))
        return SPDXLicense.OFFIS;
      if ("OFL-1.0".equals(codeString))
        return SPDXLicense.OFL_1_0;
      if ("OFL-1.0-no-RFN".equals(codeString))
        return SPDXLicense.OFL_1_0_NO_RFN;
      if ("OFL-1.0-RFN".equals(codeString))
        return SPDXLicense.OFL_1_0_RFN;
      if ("OFL-1.1".equals(codeString))
        return SPDXLicense.OFL_1_1;
      if ("OFL-1.1-no-RFN".equals(codeString))
        return SPDXLicense.OFL_1_1_NO_RFN;
      if ("OFL-1.1-RFN".equals(codeString))
        return SPDXLicense.OFL_1_1_RFN;
      if ("OGC-1.0".equals(codeString))
        return SPDXLicense.OGC_1_0;
      if ("OGDL-Taiwan-1.0".equals(codeString))
        return SPDXLicense.OGDL_TAIWAN_1_0;
      if ("OGL-Canada-2.0".equals(codeString))
        return SPDXLicense.OGL_CANADA_2_0;
      if ("OGL-UK-1.0".equals(codeString))
        return SPDXLicense.OGL_UK_1_0;
      if ("OGL-UK-2.0".equals(codeString))
        return SPDXLicense.OGL_UK_2_0;
      if ("OGL-UK-3.0".equals(codeString))
        return SPDXLicense.OGL_UK_3_0;
      if ("OGTSL".equals(codeString))
        return SPDXLicense.OGTSL;
      if ("OLDAP-1.1".equals(codeString))
        return SPDXLicense.OLDAP_1_1;
      if ("OLDAP-1.2".equals(codeString))
        return SPDXLicense.OLDAP_1_2;
      if ("OLDAP-1.3".equals(codeString))
        return SPDXLicense.OLDAP_1_3;
      if ("OLDAP-1.4".equals(codeString))
        return SPDXLicense.OLDAP_1_4;
      if ("OLDAP-2.0".equals(codeString))
        return SPDXLicense.OLDAP_2_0;
      if ("OLDAP-2.0.1".equals(codeString))
        return SPDXLicense.OLDAP_2_0_1;
      if ("OLDAP-2.1".equals(codeString))
        return SPDXLicense.OLDAP_2_1;
      if ("OLDAP-2.2".equals(codeString))
        return SPDXLicense.OLDAP_2_2;
      if ("OLDAP-2.2.1".equals(codeString))
        return SPDXLicense.OLDAP_2_2_1;
      if ("OLDAP-2.2.2".equals(codeString))
        return SPDXLicense.OLDAP_2_2_2;
      if ("OLDAP-2.3".equals(codeString))
        return SPDXLicense.OLDAP_2_3;
      if ("OLDAP-2.4".equals(codeString))
        return SPDXLicense.OLDAP_2_4;
      if ("OLDAP-2.5".equals(codeString))
        return SPDXLicense.OLDAP_2_5;
      if ("OLDAP-2.6".equals(codeString))
        return SPDXLicense.OLDAP_2_6;
      if ("OLDAP-2.7".equals(codeString))
        return SPDXLicense.OLDAP_2_7;
      if ("OLDAP-2.8".equals(codeString))
        return SPDXLicense.OLDAP_2_8;
      if ("OLFL-1.3".equals(codeString))
        return SPDXLicense.OLFL_1_3;
      if ("OML".equals(codeString))
        return SPDXLicense.OML;
      if ("OpenPBS-2.3".equals(codeString))
        return SPDXLicense.OPENPBS_2_3;
      if ("OpenSSL".equals(codeString))
        return SPDXLicense.OPENSSL;
      if ("OPL-1.0".equals(codeString))
        return SPDXLicense.OPL_1_0;
      if ("OPL-UK-3.0".equals(codeString))
        return SPDXLicense.OPL_UK_3_0;
      if ("OPUBL-1.0".equals(codeString))
        return SPDXLicense.OPUBL_1_0;
      if ("OSET-PL-2.1".equals(codeString))
        return SPDXLicense.OSET_PL_2_1;
      if ("OSL-1.0".equals(codeString))
        return SPDXLicense.OSL_1_0;
      if ("OSL-1.1".equals(codeString))
        return SPDXLicense.OSL_1_1;
      if ("OSL-2.0".equals(codeString))
        return SPDXLicense.OSL_2_0;
      if ("OSL-2.1".equals(codeString))
        return SPDXLicense.OSL_2_1;
      if ("OSL-3.0".equals(codeString))
        return SPDXLicense.OSL_3_0;
      if ("Parity-6.0.0".equals(codeString))
        return SPDXLicense.PARITY_6_0_0;
      if ("Parity-7.0.0".equals(codeString))
        return SPDXLicense.PARITY_7_0_0;
      if ("PDDL-1.0".equals(codeString))
        return SPDXLicense.PDDL_1_0;
      if ("PHP-3.0".equals(codeString))
        return SPDXLicense.PHP_3_0;
      if ("PHP-3.01".equals(codeString))
        return SPDXLicense.PHP_3_01;
      if ("Plexus".equals(codeString))
        return SPDXLicense.PLEXUS;
      if ("PolyForm-Noncommercial-1.0.0".equals(codeString))
        return SPDXLicense.POLYFORM_NONCOMMERCIAL_1_0_0;
      if ("PolyForm-Small-Business-1.0.0".equals(codeString))
        return SPDXLicense.POLYFORM_SMALL_BUSINESS_1_0_0;
      if ("PostgreSQL".equals(codeString))
        return SPDXLicense.POSTGRESQL;
      if ("PSF-2.0".equals(codeString))
        return SPDXLicense.PSF_2_0;
      if ("psfrag".equals(codeString))
        return SPDXLicense.PSFRAG;
      if ("psutils".equals(codeString))
        return SPDXLicense.PSUTILS;
      if ("Python-2.0".equals(codeString))
        return SPDXLicense.PYTHON_2_0;
      if ("Python-2.0.1".equals(codeString))
        return SPDXLicense.PYTHON_2_0_1;
      if ("Qhull".equals(codeString))
        return SPDXLicense.QHULL;
      if ("QPL-1.0".equals(codeString))
        return SPDXLicense.QPL_1_0;
      if ("QPL-1.0-INRIA-2004".equals(codeString))
        return SPDXLicense.QPL_1_0_INRIA_2004;
      if ("Rdisc".equals(codeString))
        return SPDXLicense.RDISC;
      if ("RHeCos-1.1".equals(codeString))
        return SPDXLicense.RHECOS_1_1;
      if ("RPL-1.1".equals(codeString))
        return SPDXLicense.RPL_1_1;
      if ("RPL-1.5".equals(codeString))
        return SPDXLicense.RPL_1_5;
      if ("RPSL-1.0".equals(codeString))
        return SPDXLicense.RPSL_1_0;
      if ("RSA-MD".equals(codeString))
        return SPDXLicense.RSA_MD;
      if ("RSCPL".equals(codeString))
        return SPDXLicense.RSCPL;
      if ("Ruby".equals(codeString))
        return SPDXLicense.RUBY;
      if ("SAX-PD".equals(codeString))
        return SPDXLicense.SAX_PD;
      if ("Saxpath".equals(codeString))
        return SPDXLicense.SAXPATH;
      if ("SCEA".equals(codeString))
        return SPDXLicense.SCEA;
      if ("SchemeReport".equals(codeString))
        return SPDXLicense.SCHEMEREPORT;
      if ("Sendmail".equals(codeString))
        return SPDXLicense.SENDMAIL;
      if ("Sendmail-8.23".equals(codeString))
        return SPDXLicense.SENDMAIL_8_23;
      if ("SGI-B-1.0".equals(codeString))
        return SPDXLicense.SGI_B_1_0;
      if ("SGI-B-1.1".equals(codeString))
        return SPDXLicense.SGI_B_1_1;
      if ("SGI-B-2.0".equals(codeString))
        return SPDXLicense.SGI_B_2_0;
      if ("SGP4".equals(codeString))
        return SPDXLicense.SGP4;
      if ("SHL-0.5".equals(codeString))
        return SPDXLicense.SHL_0_5;
      if ("SHL-0.51".equals(codeString))
        return SPDXLicense.SHL_0_51;
      if ("SimPL-2.0".equals(codeString))
        return SPDXLicense.SIMPL_2_0;
      if ("SISSL".equals(codeString))
        return SPDXLicense.SISSL;
      if ("SISSL-1.2".equals(codeString))
        return SPDXLicense.SISSL_1_2;
      if ("Sleepycat".equals(codeString))
        return SPDXLicense.SLEEPYCAT;
      if ("SMLNJ".equals(codeString))
        return SPDXLicense.SMLNJ;
      if ("SMPPL".equals(codeString))
        return SPDXLicense.SMPPL;
      if ("SNIA".equals(codeString))
        return SPDXLicense.SNIA;
      if ("snprintf".equals(codeString))
        return SPDXLicense.SNPRINTF;
      if ("Spencer-86".equals(codeString))
        return SPDXLicense.SPENCER_86;
      if ("Spencer-94".equals(codeString))
        return SPDXLicense.SPENCER_94;
      if ("Spencer-99".equals(codeString))
        return SPDXLicense.SPENCER_99;
      if ("SPL-1.0".equals(codeString))
        return SPDXLicense.SPL_1_0;
      if ("SSH-OpenSSH".equals(codeString))
        return SPDXLicense.SSH_OPENSSH;
      if ("SSH-short".equals(codeString))
        return SPDXLicense.SSH_SHORT;
      if ("SSPL-1.0".equals(codeString))
        return SPDXLicense.SSPL_1_0;
      if ("StandardML-NJ".equals(codeString))
        return SPDXLicense.STANDARDML_NJ;
      if ("SugarCRM-1.1.3".equals(codeString))
        return SPDXLicense.SUGARCRM_1_1_3;
      if ("SunPro".equals(codeString))
        return SPDXLicense.SUNPRO;
      if ("SWL".equals(codeString))
        return SPDXLicense.SWL;
      if ("Symlinks".equals(codeString))
        return SPDXLicense.SYMLINKS;
      if ("TAPR-OHL-1.0".equals(codeString))
        return SPDXLicense.TAPR_OHL_1_0;
      if ("TCL".equals(codeString))
        return SPDXLicense.TCL;
      if ("TCP-wrappers".equals(codeString))
        return SPDXLicense.TCP_WRAPPERS;
      if ("TermReadKey".equals(codeString))
        return SPDXLicense.TERMREADKEY;
      if ("TMate".equals(codeString))
        return SPDXLicense.TMATE;
      if ("TORQUE-1.1".equals(codeString))
        return SPDXLicense.TORQUE_1_1;
      if ("TOSL".equals(codeString))
        return SPDXLicense.TOSL;
      if ("TPDL".equals(codeString))
        return SPDXLicense.TPDL;
      if ("TPL-1.0".equals(codeString))
        return SPDXLicense.TPL_1_0;
      if ("TTWL".equals(codeString))
        return SPDXLicense.TTWL;
      if ("TU-Berlin-1.0".equals(codeString))
        return SPDXLicense.TU_BERLIN_1_0;
      if ("TU-Berlin-2.0".equals(codeString))
        return SPDXLicense.TU_BERLIN_2_0;
      if ("UCAR".equals(codeString))
        return SPDXLicense.UCAR;
      if ("UCL-1.0".equals(codeString))
        return SPDXLicense.UCL_1_0;
      if ("Unicode-DFS-2015".equals(codeString))
        return SPDXLicense.UNICODE_DFS_2015;
      if ("Unicode-DFS-2016".equals(codeString))
        return SPDXLicense.UNICODE_DFS_2016;
      if ("Unicode-TOU".equals(codeString))
        return SPDXLicense.UNICODE_TOU;
      if ("UnixCrypt".equals(codeString))
        return SPDXLicense.UNIXCRYPT;
      if ("Unlicense".equals(codeString))
        return SPDXLicense.UNLICENSE;
      if ("UPL-1.0".equals(codeString))
        return SPDXLicense.UPL_1_0;
      if ("Vim".equals(codeString))
        return SPDXLicense.VIM;
      if ("VOSTROM".equals(codeString))
        return SPDXLicense.VOSTROM;
      if ("VSL-1.0".equals(codeString))
        return SPDXLicense.VSL_1_0;
      if ("W3C".equals(codeString))
        return SPDXLicense.W3C;
      if ("W3C-19980720".equals(codeString))
        return SPDXLicense.W3C_19980720;
      if ("W3C-20150513".equals(codeString))
        return SPDXLicense.W3C_20150513;
      if ("w3m".equals(codeString))
        return SPDXLicense.W3M;
      if ("Watcom-1.0".equals(codeString))
        return SPDXLicense.WATCOM_1_0;
      if ("Widget-Workshop".equals(codeString))
        return SPDXLicense.WIDGET_WORKSHOP;
      if ("Wsuipa".equals(codeString))
        return SPDXLicense.WSUIPA;
      if ("WTFPL".equals(codeString))
        return SPDXLicense.WTFPL;
      if ("wxWindows".equals(codeString))
        return SPDXLicense.WXWINDOWS;
      if ("X11".equals(codeString))
        return SPDXLicense.X11;
      if ("X11-distribute-modifications-variant".equals(codeString))
        return SPDXLicense.X11_DISTRIBUTE_MODIFICATIONS_VARIANT;
      if ("Xdebug-1.03".equals(codeString))
        return SPDXLicense.XDEBUG_1_03;
      if ("Xerox".equals(codeString))
        return SPDXLicense.XEROX;
      if ("Xfig".equals(codeString))
        return SPDXLicense.XFIG;
      if ("XFree86-1.1".equals(codeString))
        return SPDXLicense.XFREE86_1_1;
      if ("xinetd".equals(codeString))
        return SPDXLicense.XINETD;
      if ("xlock".equals(codeString))
        return SPDXLicense.XLOCK;
      if ("Xnet".equals(codeString))
        return SPDXLicense.XNET;
      if ("xpp".equals(codeString))
        return SPDXLicense.XPP;
      if ("XSkat".equals(codeString))
        return SPDXLicense.XSKAT;
      if ("YPL-1.0".equals(codeString))
        return SPDXLicense.YPL_1_0;
      if ("YPL-1.1".equals(codeString))
        return SPDXLicense.YPL_1_1;
      if ("Zed".equals(codeString))
        return SPDXLicense.ZED;
      if ("Zend-2.0".equals(codeString))
        return SPDXLicense.ZEND_2_0;
      if ("Zimbra-1.3".equals(codeString))
        return SPDXLicense.ZIMBRA_1_3;
      if ("Zimbra-1.4".equals(codeString))
        return SPDXLicense.ZIMBRA_1_4;
      if ("Zlib".equals(codeString))
        return SPDXLicense.ZLIB;
      if ("zlib-acknowledgement".equals(codeString))
        return SPDXLicense.ZLIB_ACKNOWLEDGEMENT;
      if ("ZPL-1.1".equals(codeString))
        return SPDXLicense.ZPL_1_1;
      if ("ZPL-2.0".equals(codeString))
        return SPDXLicense.ZPL_2_0;
      if ("ZPL-2.1".equals(codeString))
        return SPDXLicense.ZPL_2_1;
      throw new IllegalArgumentException("Unknown SPDXLicense code '" + codeString + "'");
    }

    public Enumeration<SPDXLicense> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NULL, code);
      String codeString = ((PrimitiveType) code).asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NULL, code);
      if ("0BSD".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense._0BSD, code);
      if ("AAL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AAL, code);
      if ("Abstyles".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ABSTYLES, code);
      if ("AdaCore-doc".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ADACORE_DOC, code);
      if ("Adobe-2006".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ADOBE_2006, code);
      if ("Adobe-Glyph".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ADOBE_GLYPH, code);
      if ("ADSL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ADSL, code);
      if ("AFL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AFL_1_1, code);
      if ("AFL-1.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AFL_1_2, code);
      if ("AFL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AFL_2_0, code);
      if ("AFL-2.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AFL_2_1, code);
      if ("AFL-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AFL_3_0, code);
      if ("Afmparse".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AFMPARSE, code);
      if ("AGPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AGPL_1_0, code);
      if ("AGPL-1.0-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AGPL_1_0_ONLY, code);
      if ("AGPL-1.0-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AGPL_1_0_OR_LATER, code);
      if ("AGPL-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AGPL_3_0, code);
      if ("AGPL-3.0-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AGPL_3_0_ONLY, code);
      if ("AGPL-3.0-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AGPL_3_0_OR_LATER, code);
      if ("Aladdin".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ALADDIN, code);
      if ("AMDPLPA".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AMDPLPA, code);
      if ("AML".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AML, code);
      if ("AMPAS".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.AMPAS, code);
      if ("ANTLR-PD".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ANTLR_PD, code);
      if ("ANTLR-PD-fallback".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ANTLR_PD_FALLBACK, code);
      if ("Apache-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.APACHE_1_0, code);
      if ("Apache-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.APACHE_1_1, code);
      if ("Apache-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.APACHE_2_0, code);
      if ("APAFML".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.APAFML, code);
      if ("APL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.APL_1_0, code);
      if ("App-s2p".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.APP_S2P, code);
      if ("APSL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.APSL_1_0, code);
      if ("APSL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.APSL_1_1, code);
      if ("APSL-1.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.APSL_1_2, code);
      if ("APSL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.APSL_2_0, code);
      if ("Arphic-1999".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ARPHIC_1999, code);
      if ("Artistic-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ARTISTIC_1_0, code);
      if ("Artistic-1.0-cl8".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ARTISTIC_1_0_CL8, code);
      if ("Artistic-1.0-Perl".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ARTISTIC_1_0_PERL, code);
      if ("Artistic-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ARTISTIC_2_0, code);
      if ("ASWF-Digital-Assets-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ASWF_DIGITAL_ASSETS_1_0, code);
      if ("ASWF-Digital-Assets-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ASWF_DIGITAL_ASSETS_1_1, code);
      if ("Baekmuk".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BAEKMUK, code);
      if ("Bahyph".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BAHYPH, code);
      if ("Barr".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BARR, code);
      if ("Beerware".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BEERWARE, code);
      if ("Bitstream-Charter".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BITSTREAM_CHARTER, code);
      if ("Bitstream-Vera".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BITSTREAM_VERA, code);
      if ("BitTorrent-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BITTORRENT_1_0, code);
      if ("BitTorrent-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BITTORRENT_1_1, code);
      if ("blessing".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BLESSING, code);
      if ("BlueOak-1.0.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BLUEOAK_1_0_0, code);
      if ("Boehm-GC".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BOEHM_GC, code);
      if ("Borceux".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BORCEUX, code);
      if ("Brian-Gladman-3-Clause".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BRIAN_GLADMAN_3_CLAUSE, code);
      if ("BSD-1-Clause".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_1_CLAUSE, code);
      if ("BSD-2-Clause".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_2_CLAUSE, code);
      if ("BSD-2-Clause-FreeBSD".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_2_CLAUSE_FREEBSD, code);
      if ("BSD-2-Clause-NetBSD".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_2_CLAUSE_NETBSD, code);
      if ("BSD-2-Clause-Patent".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_2_CLAUSE_PATENT, code);
      if ("BSD-2-Clause-Views".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_2_CLAUSE_VIEWS, code);
      if ("BSD-3-Clause".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_3_CLAUSE, code);
      if ("BSD-3-Clause-Attribution".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_3_CLAUSE_ATTRIBUTION, code);
      if ("BSD-3-Clause-Clear".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_3_CLAUSE_CLEAR, code);
      if ("BSD-3-Clause-LBNL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_3_CLAUSE_LBNL, code);
      if ("BSD-3-Clause-Modification".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_3_CLAUSE_MODIFICATION, code);
      if ("BSD-3-Clause-No-Military-License".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_3_CLAUSE_NO_MILITARY_LICENSE, code);
      if ("BSD-3-Clause-No-Nuclear-License".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_3_CLAUSE_NO_NUCLEAR_LICENSE, code);
      if ("BSD-3-Clause-No-Nuclear-License-2014".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014, code);
      if ("BSD-3-Clause-No-Nuclear-Warranty".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY, code);
      if ("BSD-3-Clause-Open-MPI".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_3_CLAUSE_OPEN_MPI, code);
      if ("BSD-4-Clause".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_4_CLAUSE, code);
      if ("BSD-4-Clause-Shortened".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_4_CLAUSE_SHORTENED, code);
      if ("BSD-4-Clause-UC".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_4_CLAUSE_UC, code);
      if ("BSD-4.3RENO".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_4_3RENO, code);
      if ("BSD-4.3TAHOE".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_4_3TAHOE, code);
      if ("BSD-Advertising-Acknowledgement".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_ADVERTISING_ACKNOWLEDGEMENT, code);
      if ("BSD-Attribution-HPND-disclaimer".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_ATTRIBUTION_HPND_DISCLAIMER, code);
      if ("BSD-Protection".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_PROTECTION, code);
      if ("BSD-Source-Code".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSD_SOURCE_CODE, code);
      if ("BSL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BSL_1_0, code);
      if ("BUSL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BUSL_1_1, code);
      if ("bzip2-1.0.5".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BZIP2_1_0_5, code);
      if ("bzip2-1.0.6".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.BZIP2_1_0_6, code);
      if ("C-UDA-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.C_UDA_1_0, code);
      if ("CAL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CAL_1_0, code);
      if ("CAL-1.0-Combined-Work-Exception".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CAL_1_0_COMBINED_WORK_EXCEPTION, code);
      if ("Caldera".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CALDERA, code);
      if ("CATOSL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CATOSL_1_1, code);
      if ("CC-BY-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_1_0, code);
      if ("CC-BY-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_2_0, code);
      if ("CC-BY-2.5".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_2_5, code);
      if ("CC-BY-2.5-AU".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_2_5_AU, code);
      if ("CC-BY-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_3_0, code);
      if ("CC-BY-3.0-AT".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_3_0_AT, code);
      if ("CC-BY-3.0-DE".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_3_0_DE, code);
      if ("CC-BY-3.0-IGO".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_3_0_IGO, code);
      if ("CC-BY-3.0-NL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_3_0_NL, code);
      if ("CC-BY-3.0-US".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_3_0_US, code);
      if ("CC-BY-4.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_4_0, code);
      if ("CC-BY-NC-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_1_0, code);
      if ("CC-BY-NC-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_2_0, code);
      if ("CC-BY-NC-2.5".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_2_5, code);
      if ("CC-BY-NC-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_3_0, code);
      if ("CC-BY-NC-3.0-DE".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_3_0_DE, code);
      if ("CC-BY-NC-4.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_4_0, code);
      if ("CC-BY-NC-ND-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_ND_1_0, code);
      if ("CC-BY-NC-ND-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_ND_2_0, code);
      if ("CC-BY-NC-ND-2.5".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_ND_2_5, code);
      if ("CC-BY-NC-ND-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_ND_3_0, code);
      if ("CC-BY-NC-ND-3.0-DE".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_ND_3_0_DE, code);
      if ("CC-BY-NC-ND-3.0-IGO".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_ND_3_0_IGO, code);
      if ("CC-BY-NC-ND-4.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_ND_4_0, code);
      if ("CC-BY-NC-SA-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_SA_1_0, code);
      if ("CC-BY-NC-SA-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_SA_2_0, code);
      if ("CC-BY-NC-SA-2.0-DE".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_SA_2_0_DE, code);
      if ("CC-BY-NC-SA-2.0-FR".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_SA_2_0_FR, code);
      if ("CC-BY-NC-SA-2.0-UK".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_SA_2_0_UK, code);
      if ("CC-BY-NC-SA-2.5".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_SA_2_5, code);
      if ("CC-BY-NC-SA-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_SA_3_0, code);
      if ("CC-BY-NC-SA-3.0-DE".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_SA_3_0_DE, code);
      if ("CC-BY-NC-SA-3.0-IGO".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_SA_3_0_IGO, code);
      if ("CC-BY-NC-SA-4.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_NC_SA_4_0, code);
      if ("CC-BY-ND-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_ND_1_0, code);
      if ("CC-BY-ND-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_ND_2_0, code);
      if ("CC-BY-ND-2.5".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_ND_2_5, code);
      if ("CC-BY-ND-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_ND_3_0, code);
      if ("CC-BY-ND-3.0-DE".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_ND_3_0_DE, code);
      if ("CC-BY-ND-4.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_ND_4_0, code);
      if ("CC-BY-SA-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_SA_1_0, code);
      if ("CC-BY-SA-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_SA_2_0, code);
      if ("CC-BY-SA-2.0-UK".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_SA_2_0_UK, code);
      if ("CC-BY-SA-2.1-JP".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_SA_2_1_JP, code);
      if ("CC-BY-SA-2.5".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_SA_2_5, code);
      if ("CC-BY-SA-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_SA_3_0, code);
      if ("CC-BY-SA-3.0-AT".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_SA_3_0_AT, code);
      if ("CC-BY-SA-3.0-DE".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_SA_3_0_DE, code);
      if ("CC-BY-SA-3.0-IGO".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_SA_3_0_IGO, code);
      if ("CC-BY-SA-4.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_BY_SA_4_0, code);
      if ("CC-PDDC".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC_PDDC, code);
      if ("CC0-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CC0_1_0, code);
      if ("CDDL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CDDL_1_0, code);
      if ("CDDL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CDDL_1_1, code);
      if ("CDL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CDL_1_0, code);
      if ("CDLA-Permissive-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CDLA_PERMISSIVE_1_0, code);
      if ("CDLA-Permissive-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CDLA_PERMISSIVE_2_0, code);
      if ("CDLA-Sharing-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CDLA_SHARING_1_0, code);
      if ("CECILL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CECILL_1_0, code);
      if ("CECILL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CECILL_1_1, code);
      if ("CECILL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CECILL_2_0, code);
      if ("CECILL-2.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CECILL_2_1, code);
      if ("CECILL-B".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CECILL_B, code);
      if ("CECILL-C".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CECILL_C, code);
      if ("CERN-OHL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CERN_OHL_1_1, code);
      if ("CERN-OHL-1.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CERN_OHL_1_2, code);
      if ("CERN-OHL-P-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CERN_OHL_P_2_0, code);
      if ("CERN-OHL-S-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CERN_OHL_S_2_0, code);
      if ("CERN-OHL-W-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CERN_OHL_W_2_0, code);
      if ("CFITSIO".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CFITSIO, code);
      if ("checkmk".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CHECKMK, code);
      if ("ClArtistic".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CLARTISTIC, code);
      if ("Clips".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CLIPS, code);
      if ("CMU-Mach".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CMU_MACH, code);
      if ("CNRI-Jython".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CNRI_JYTHON, code);
      if ("CNRI-Python".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CNRI_PYTHON, code);
      if ("CNRI-Python-GPL-Compatible".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CNRI_PYTHON_GPL_COMPATIBLE, code);
      if ("COIL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.COIL_1_0, code);
      if ("Community-Spec-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.COMMUNITY_SPEC_1_0, code);
      if ("Condor-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CONDOR_1_1, code);
      if ("copyleft-next-0.3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.COPYLEFT_NEXT_0_3_0, code);
      if ("copyleft-next-0.3.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.COPYLEFT_NEXT_0_3_1, code);
      if ("Cornell-Lossless-JPEG".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CORNELL_LOSSLESS_JPEG, code);
      if ("CPAL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CPAL_1_0, code);
      if ("CPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CPL_1_0, code);
      if ("CPOL-1.02".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CPOL_1_02, code);
      if ("Crossword".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CROSSWORD, code);
      if ("CrystalStacker".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CRYSTALSTACKER, code);
      if ("CUA-OPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CUA_OPL_1_0, code);
      if ("Cube".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CUBE, code);
      if ("curl".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.CURL, code);
      if ("D-FSL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.D_FSL_1_0, code);
      if ("diffmark".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.DIFFMARK, code);
      if ("DL-DE-BY-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.DL_DE_BY_2_0, code);
      if ("DOC".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.DOC, code);
      if ("Dotseqn".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.DOTSEQN, code);
      if ("DRL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.DRL_1_0, code);
      if ("DSDP".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.DSDP, code);
      if ("dtoa".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.DTOA, code);
      if ("dvipdfm".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.DVIPDFM, code);
      if ("ECL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ECL_1_0, code);
      if ("ECL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ECL_2_0, code);
      if ("eCos-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ECOS_2_0, code);
      if ("EFL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EFL_1_0, code);
      if ("EFL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EFL_2_0, code);
      if ("eGenix".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EGENIX, code);
      if ("Elastic-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ELASTIC_2_0, code);
      if ("Entessa".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ENTESSA, code);
      if ("EPICS".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EPICS, code);
      if ("EPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EPL_1_0, code);
      if ("EPL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EPL_2_0, code);
      if ("ErlPL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ERLPL_1_1, code);
      if ("etalab-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ETALAB_2_0, code);
      if ("EUDatagrid".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EUDATAGRID, code);
      if ("EUPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EUPL_1_0, code);
      if ("EUPL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EUPL_1_1, code);
      if ("EUPL-1.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EUPL_1_2, code);
      if ("Eurosym".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.EUROSYM, code);
      if ("Fair".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.FAIR, code);
      if ("FDK-AAC".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.FDK_AAC, code);
      if ("Frameworx-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.FRAMEWORX_1_0, code);
      if ("FreeBSD-DOC".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.FREEBSD_DOC, code);
      if ("FreeImage".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.FREEIMAGE, code);
      if ("FSFAP".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.FSFAP, code);
      if ("FSFUL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.FSFUL, code);
      if ("FSFULLR".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.FSFULLR, code);
      if ("FSFULLRWD".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.FSFULLRWD, code);
      if ("FTL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.FTL, code);
      if ("GD".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GD, code);
      if ("GFDL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_1, code);
      if ("GFDL-1.1-invariants-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_1_INVARIANTS_ONLY, code);
      if ("GFDL-1.1-invariants-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_1_INVARIANTS_OR_LATER, code);
      if ("GFDL-1.1-no-invariants-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_1_NO_INVARIANTS_ONLY, code);
      if ("GFDL-1.1-no-invariants-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_1_NO_INVARIANTS_OR_LATER, code);
      if ("GFDL-1.1-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_1_ONLY, code);
      if ("GFDL-1.1-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_1_OR_LATER, code);
      if ("GFDL-1.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_2, code);
      if ("GFDL-1.2-invariants-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_2_INVARIANTS_ONLY, code);
      if ("GFDL-1.2-invariants-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_2_INVARIANTS_OR_LATER, code);
      if ("GFDL-1.2-no-invariants-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_2_NO_INVARIANTS_ONLY, code);
      if ("GFDL-1.2-no-invariants-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_2_NO_INVARIANTS_OR_LATER, code);
      if ("GFDL-1.2-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_2_ONLY, code);
      if ("GFDL-1.2-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_2_OR_LATER, code);
      if ("GFDL-1.3".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_3, code);
      if ("GFDL-1.3-invariants-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_3_INVARIANTS_ONLY, code);
      if ("GFDL-1.3-invariants-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_3_INVARIANTS_OR_LATER, code);
      if ("GFDL-1.3-no-invariants-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_3_NO_INVARIANTS_ONLY, code);
      if ("GFDL-1.3-no-invariants-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_3_NO_INVARIANTS_OR_LATER, code);
      if ("GFDL-1.3-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_3_ONLY, code);
      if ("GFDL-1.3-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GFDL_1_3_OR_LATER, code);
      if ("Giftware".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GIFTWARE, code);
      if ("GL2PS".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GL2PS, code);
      if ("Glide".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GLIDE, code);
      if ("Glulxe".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GLULXE, code);
      if ("GLWTPL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GLWTPL, code);
      if ("gnuplot".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GNUPLOT, code);
      if ("GPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_1_0, code);
      if ("GPL-1.0+".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_1_0PLUS, code);
      if ("GPL-1.0-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_1_0_ONLY, code);
      if ("GPL-1.0-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_1_0_OR_LATER, code);
      if ("GPL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_2_0, code);
      if ("GPL-2.0+".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_2_0PLUS, code);
      if ("GPL-2.0-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_2_0_ONLY, code);
      if ("GPL-2.0-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_2_0_OR_LATER, code);
      if ("GPL-2.0-with-autoconf-exception".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_2_0_WITH_AUTOCONF_EXCEPTION, code);
      if ("GPL-2.0-with-bison-exception".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_2_0_WITH_BISON_EXCEPTION, code);
      if ("GPL-2.0-with-classpath-exception".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_2_0_WITH_CLASSPATH_EXCEPTION, code);
      if ("GPL-2.0-with-font-exception".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_2_0_WITH_FONT_EXCEPTION, code);
      if ("GPL-2.0-with-GCC-exception".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_2_0_WITH_GCC_EXCEPTION, code);
      if ("GPL-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_3_0, code);
      if ("GPL-3.0+".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_3_0PLUS, code);
      if ("GPL-3.0-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_3_0_ONLY, code);
      if ("GPL-3.0-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_3_0_OR_LATER, code);
      if ("GPL-3.0-with-autoconf-exception".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_3_0_WITH_AUTOCONF_EXCEPTION, code);
      if ("GPL-3.0-with-GCC-exception".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GPL_3_0_WITH_GCC_EXCEPTION, code);
      if ("Graphics-Gems".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GRAPHICS_GEMS, code);
      if ("gSOAP-1.3b".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.GSOAP_1_3B, code);
      if ("HaskellReport".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.HASKELLREPORT, code);
      if ("Hippocratic-2.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.HIPPOCRATIC_2_1, code);
      if ("HP-1986".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.HP_1986, code);
      if ("HPND".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.HPND, code);
      if ("HPND-export-US".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.HPND_EXPORT_US, code);
      if ("HPND-Markus-Kuhn".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.HPND_MARKUS_KUHN, code);
      if ("HPND-sell-variant".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.HPND_SELL_VARIANT, code);
      if ("HPND-sell-variant-MIT-disclaimer".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.HPND_SELL_VARIANT_MIT_DISCLAIMER, code);
      if ("HTMLTIDY".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.HTMLTIDY, code);
      if ("IBM-pibs".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.IBM_PIBS, code);
      if ("ICU".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ICU, code);
      if ("IEC-Code-Components-EULA".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.IEC_CODE_COMPONENTS_EULA, code);
      if ("IJG".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.IJG, code);
      if ("IJG-short".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.IJG_SHORT, code);
      if ("ImageMagick".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.IMAGEMAGICK, code);
      if ("iMatix".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.IMATIX, code);
      if ("Imlib2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.IMLIB2, code);
      if ("Info-ZIP".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.INFO_ZIP, code);
      if ("Inner-Net-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.INNER_NET_2_0, code);
      if ("Intel".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.INTEL, code);
      if ("Intel-ACPI".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.INTEL_ACPI, code);
      if ("Interbase-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.INTERBASE_1_0, code);
      if ("IPA".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.IPA, code);
      if ("IPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.IPL_1_0, code);
      if ("ISC".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ISC, code);
      if ("Jam".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.JAM, code);
      if ("JasPer-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.JASPER_2_0, code);
      if ("JPL-image".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.JPL_IMAGE, code);
      if ("JPNIC".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.JPNIC, code);
      if ("JSON".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.JSON, code);
      if ("Kazlib".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.KAZLIB, code);
      if ("Knuth-CTAN".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.KNUTH_CTAN, code);
      if ("LAL-1.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LAL_1_2, code);
      if ("LAL-1.3".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LAL_1_3, code);
      if ("Latex2e".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LATEX2E, code);
      if ("Latex2e-translated-notice".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LATEX2E_TRANSLATED_NOTICE, code);
      if ("Leptonica".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LEPTONICA, code);
      if ("LGPL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_2_0, code);
      if ("LGPL-2.0+".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_2_0PLUS, code);
      if ("LGPL-2.0-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_2_0_ONLY, code);
      if ("LGPL-2.0-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_2_0_OR_LATER, code);
      if ("LGPL-2.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_2_1, code);
      if ("LGPL-2.1+".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_2_1PLUS, code);
      if ("LGPL-2.1-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_2_1_ONLY, code);
      if ("LGPL-2.1-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_2_1_OR_LATER, code);
      if ("LGPL-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_3_0, code);
      if ("LGPL-3.0+".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_3_0PLUS, code);
      if ("LGPL-3.0-only".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_3_0_ONLY, code);
      if ("LGPL-3.0-or-later".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPL_3_0_OR_LATER, code);
      if ("LGPLLR".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LGPLLR, code);
      if ("Libpng".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LIBPNG, code);
      if ("libpng-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LIBPNG_2_0, code);
      if ("libselinux-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LIBSELINUX_1_0, code);
      if ("libtiff".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LIBTIFF, code);
      if ("libutil-David-Nugent".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LIBUTIL_DAVID_NUGENT, code);
      if ("LiLiQ-P-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LILIQ_P_1_1, code);
      if ("LiLiQ-R-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LILIQ_R_1_1, code);
      if ("LiLiQ-Rplus-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LILIQ_RPLUS_1_1, code);
      if ("Linux-man-pages-1-para".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LINUX_MAN_PAGES_1_PARA, code);
      if ("Linux-man-pages-copyleft".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LINUX_MAN_PAGES_COPYLEFT, code);
      if ("Linux-man-pages-copyleft-2-para".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LINUX_MAN_PAGES_COPYLEFT_2_PARA, code);
      if ("Linux-man-pages-copyleft-var".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LINUX_MAN_PAGES_COPYLEFT_VAR, code);
      if ("Linux-OpenIB".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LINUX_OPENIB, code);
      if ("LOOP".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LOOP, code);
      if ("LPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LPL_1_0, code);
      if ("LPL-1.02".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LPL_1_02, code);
      if ("LPPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LPPL_1_0, code);
      if ("LPPL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LPPL_1_1, code);
      if ("LPPL-1.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LPPL_1_2, code);
      if ("LPPL-1.3a".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LPPL_1_3A, code);
      if ("LPPL-1.3c".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LPPL_1_3C, code);
      if ("LZMA-SDK-9.11-to-9.20".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LZMA_SDK_9_11_TO_9_20, code);
      if ("LZMA-SDK-9.22".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.LZMA_SDK_9_22, code);
      if ("MakeIndex".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MAKEINDEX, code);
      if ("Martin-Birgmeier".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MARTIN_BIRGMEIER, code);
      if ("metamail".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.METAMAIL, code);
      if ("Minpack".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MINPACK, code);
      if ("MirOS".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIROS, code);
      if ("MIT".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIT, code);
      if ("MIT-0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIT_0, code);
      if ("MIT-advertising".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIT_ADVERTISING, code);
      if ("MIT-CMU".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIT_CMU, code);
      if ("MIT-enna".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIT_ENNA, code);
      if ("MIT-feh".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIT_FEH, code);
      if ("MIT-Festival".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIT_FESTIVAL, code);
      if ("MIT-Modern-Variant".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIT_MODERN_VARIANT, code);
      if ("MIT-open-group".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIT_OPEN_GROUP, code);
      if ("MIT-Wu".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MIT_WU, code);
      if ("MITNFA".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MITNFA, code);
      if ("Motosoto".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MOTOSOTO, code);
      if ("mpi-permissive".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MPI_PERMISSIVE, code);
      if ("mpich2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MPICH2, code);
      if ("MPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MPL_1_0, code);
      if ("MPL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MPL_1_1, code);
      if ("MPL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MPL_2_0, code);
      if ("MPL-2.0-no-copyleft-exception".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MPL_2_0_NO_COPYLEFT_EXCEPTION, code);
      if ("mplus".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MPLUS, code);
      if ("MS-LPL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MS_LPL, code);
      if ("MS-PL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MS_PL, code);
      if ("MS-RL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MS_RL, code);
      if ("MTLL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MTLL, code);
      if ("MulanPSL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MULANPSL_1_0, code);
      if ("MulanPSL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MULANPSL_2_0, code);
      if ("Multics".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MULTICS, code);
      if ("Mup".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.MUP, code);
      if ("NAIST-2003".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NAIST_2003, code);
      if ("NASA-1.3".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NASA_1_3, code);
      if ("Naumen".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NAUMEN, code);
      if ("NBPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NBPL_1_0, code);
      if ("NCGL-UK-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NCGL_UK_2_0, code);
      if ("NCSA".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NCSA, code);
      if ("Net-SNMP".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NET_SNMP, code);
      if ("NetCDF".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NETCDF, code);
      if ("Newsletr".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NEWSLETR, code);
      if ("NGPL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NGPL, code);
      if ("NICTA-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NICTA_1_0, code);
      if ("NIST-PD".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NIST_PD, code);
      if ("NIST-PD-fallback".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NIST_PD_FALLBACK, code);
      if ("NIST-Software".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NIST_SOFTWARE, code);
      if ("NLOD-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NLOD_1_0, code);
      if ("NLOD-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NLOD_2_0, code);
      if ("NLPL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NLPL, code);
      if ("Nokia".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NOKIA, code);
      if ("NOSL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NOSL, code);
      if ("not-open-source".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NOT_OPEN_SOURCE, code);
      if ("Noweb".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NOWEB, code);
      if ("NPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NPL_1_0, code);
      if ("NPL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NPL_1_1, code);
      if ("NPOSL-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NPOSL_3_0, code);
      if ("NRL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NRL, code);
      if ("NTP".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NTP, code);
      if ("NTP-0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NTP_0, code);
      if ("Nunit".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.NUNIT, code);
      if ("O-UDA-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.O_UDA_1_0, code);
      if ("OCCT-PL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OCCT_PL, code);
      if ("OCLC-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OCLC_2_0, code);
      if ("ODbL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ODBL_1_0, code);
      if ("ODC-By-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ODC_BY_1_0, code);
      if ("OFFIS".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OFFIS, code);
      if ("OFL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OFL_1_0, code);
      if ("OFL-1.0-no-RFN".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OFL_1_0_NO_RFN, code);
      if ("OFL-1.0-RFN".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OFL_1_0_RFN, code);
      if ("OFL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OFL_1_1, code);
      if ("OFL-1.1-no-RFN".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OFL_1_1_NO_RFN, code);
      if ("OFL-1.1-RFN".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OFL_1_1_RFN, code);
      if ("OGC-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OGC_1_0, code);
      if ("OGDL-Taiwan-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OGDL_TAIWAN_1_0, code);
      if ("OGL-Canada-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OGL_CANADA_2_0, code);
      if ("OGL-UK-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OGL_UK_1_0, code);
      if ("OGL-UK-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OGL_UK_2_0, code);
      if ("OGL-UK-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OGL_UK_3_0, code);
      if ("OGTSL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OGTSL, code);
      if ("OLDAP-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_1_1, code);
      if ("OLDAP-1.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_1_2, code);
      if ("OLDAP-1.3".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_1_3, code);
      if ("OLDAP-1.4".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_1_4, code);
      if ("OLDAP-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_0, code);
      if ("OLDAP-2.0.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_0_1, code);
      if ("OLDAP-2.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_1, code);
      if ("OLDAP-2.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_2, code);
      if ("OLDAP-2.2.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_2_1, code);
      if ("OLDAP-2.2.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_2_2, code);
      if ("OLDAP-2.3".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_3, code);
      if ("OLDAP-2.4".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_4, code);
      if ("OLDAP-2.5".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_5, code);
      if ("OLDAP-2.6".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_6, code);
      if ("OLDAP-2.7".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_7, code);
      if ("OLDAP-2.8".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLDAP_2_8, code);
      if ("OLFL-1.3".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OLFL_1_3, code);
      if ("OML".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OML, code);
      if ("OpenPBS-2.3".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OPENPBS_2_3, code);
      if ("OpenSSL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OPENSSL, code);
      if ("OPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OPL_1_0, code);
      if ("OPL-UK-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OPL_UK_3_0, code);
      if ("OPUBL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OPUBL_1_0, code);
      if ("OSET-PL-2.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OSET_PL_2_1, code);
      if ("OSL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OSL_1_0, code);
      if ("OSL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OSL_1_1, code);
      if ("OSL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OSL_2_0, code);
      if ("OSL-2.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OSL_2_1, code);
      if ("OSL-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.OSL_3_0, code);
      if ("Parity-6.0.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PARITY_6_0_0, code);
      if ("Parity-7.0.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PARITY_7_0_0, code);
      if ("PDDL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PDDL_1_0, code);
      if ("PHP-3.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PHP_3_0, code);
      if ("PHP-3.01".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PHP_3_01, code);
      if ("Plexus".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PLEXUS, code);
      if ("PolyForm-Noncommercial-1.0.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.POLYFORM_NONCOMMERCIAL_1_0_0, code);
      if ("PolyForm-Small-Business-1.0.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.POLYFORM_SMALL_BUSINESS_1_0_0, code);
      if ("PostgreSQL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.POSTGRESQL, code);
      if ("PSF-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PSF_2_0, code);
      if ("psfrag".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PSFRAG, code);
      if ("psutils".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PSUTILS, code);
      if ("Python-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PYTHON_2_0, code);
      if ("Python-2.0.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.PYTHON_2_0_1, code);
      if ("Qhull".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.QHULL, code);
      if ("QPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.QPL_1_0, code);
      if ("QPL-1.0-INRIA-2004".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.QPL_1_0_INRIA_2004, code);
      if ("Rdisc".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.RDISC, code);
      if ("RHeCos-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.RHECOS_1_1, code);
      if ("RPL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.RPL_1_1, code);
      if ("RPL-1.5".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.RPL_1_5, code);
      if ("RPSL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.RPSL_1_0, code);
      if ("RSA-MD".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.RSA_MD, code);
      if ("RSCPL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.RSCPL, code);
      if ("Ruby".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.RUBY, code);
      if ("SAX-PD".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SAX_PD, code);
      if ("Saxpath".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SAXPATH, code);
      if ("SCEA".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SCEA, code);
      if ("SchemeReport".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SCHEMEREPORT, code);
      if ("Sendmail".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SENDMAIL, code);
      if ("Sendmail-8.23".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SENDMAIL_8_23, code);
      if ("SGI-B-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SGI_B_1_0, code);
      if ("SGI-B-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SGI_B_1_1, code);
      if ("SGI-B-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SGI_B_2_0, code);
      if ("SGP4".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SGP4, code);
      if ("SHL-0.5".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SHL_0_5, code);
      if ("SHL-0.51".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SHL_0_51, code);
      if ("SimPL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SIMPL_2_0, code);
      if ("SISSL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SISSL, code);
      if ("SISSL-1.2".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SISSL_1_2, code);
      if ("Sleepycat".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SLEEPYCAT, code);
      if ("SMLNJ".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SMLNJ, code);
      if ("SMPPL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SMPPL, code);
      if ("SNIA".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SNIA, code);
      if ("snprintf".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SNPRINTF, code);
      if ("Spencer-86".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SPENCER_86, code);
      if ("Spencer-94".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SPENCER_94, code);
      if ("Spencer-99".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SPENCER_99, code);
      if ("SPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SPL_1_0, code);
      if ("SSH-OpenSSH".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SSH_OPENSSH, code);
      if ("SSH-short".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SSH_SHORT, code);
      if ("SSPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SSPL_1_0, code);
      if ("StandardML-NJ".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.STANDARDML_NJ, code);
      if ("SugarCRM-1.1.3".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SUGARCRM_1_1_3, code);
      if ("SunPro".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SUNPRO, code);
      if ("SWL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SWL, code);
      if ("Symlinks".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.SYMLINKS, code);
      if ("TAPR-OHL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TAPR_OHL_1_0, code);
      if ("TCL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TCL, code);
      if ("TCP-wrappers".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TCP_WRAPPERS, code);
      if ("TermReadKey".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TERMREADKEY, code);
      if ("TMate".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TMATE, code);
      if ("TORQUE-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TORQUE_1_1, code);
      if ("TOSL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TOSL, code);
      if ("TPDL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TPDL, code);
      if ("TPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TPL_1_0, code);
      if ("TTWL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TTWL, code);
      if ("TU-Berlin-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TU_BERLIN_1_0, code);
      if ("TU-Berlin-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.TU_BERLIN_2_0, code);
      if ("UCAR".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.UCAR, code);
      if ("UCL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.UCL_1_0, code);
      if ("Unicode-DFS-2015".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.UNICODE_DFS_2015, code);
      if ("Unicode-DFS-2016".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.UNICODE_DFS_2016, code);
      if ("Unicode-TOU".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.UNICODE_TOU, code);
      if ("UnixCrypt".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.UNIXCRYPT, code);
      if ("Unlicense".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.UNLICENSE, code);
      if ("UPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.UPL_1_0, code);
      if ("Vim".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.VIM, code);
      if ("VOSTROM".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.VOSTROM, code);
      if ("VSL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.VSL_1_0, code);
      if ("W3C".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.W3C, code);
      if ("W3C-19980720".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.W3C_19980720, code);
      if ("W3C-20150513".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.W3C_20150513, code);
      if ("w3m".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.W3M, code);
      if ("Watcom-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.WATCOM_1_0, code);
      if ("Widget-Workshop".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.WIDGET_WORKSHOP, code);
      if ("Wsuipa".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.WSUIPA, code);
      if ("WTFPL".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.WTFPL, code);
      if ("wxWindows".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.WXWINDOWS, code);
      if ("X11".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.X11, code);
      if ("X11-distribute-modifications-variant".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.X11_DISTRIBUTE_MODIFICATIONS_VARIANT, code);
      if ("Xdebug-1.03".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.XDEBUG_1_03, code);
      if ("Xerox".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.XEROX, code);
      if ("Xfig".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.XFIG, code);
      if ("XFree86-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.XFREE86_1_1, code);
      if ("xinetd".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.XINETD, code);
      if ("xlock".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.XLOCK, code);
      if ("Xnet".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.XNET, code);
      if ("xpp".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.XPP, code);
      if ("XSkat".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.XSKAT, code);
      if ("YPL-1.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.YPL_1_0, code);
      if ("YPL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.YPL_1_1, code);
      if ("Zed".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ZED, code);
      if ("Zend-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ZEND_2_0, code);
      if ("Zimbra-1.3".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ZIMBRA_1_3, code);
      if ("Zimbra-1.4".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ZIMBRA_1_4, code);
      if ("Zlib".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ZLIB, code);
      if ("zlib-acknowledgement".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ZLIB_ACKNOWLEDGEMENT, code);
      if ("ZPL-1.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ZPL_1_1, code);
      if ("ZPL-2.0".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ZPL_2_0, code);
      if ("ZPL-2.1".equals(codeString))
        return new Enumeration<SPDXLicense>(this, SPDXLicense.ZPL_2_1, code);
      throw new FHIRException("Unknown SPDXLicense code '" + codeString + "'");
    }

    public String toCode(SPDXLicense code) {
      if (code == SPDXLicense._0BSD)
        return "0BSD";
      if (code == SPDXLicense.AAL)
        return "AAL";
      if (code == SPDXLicense.ABSTYLES)
        return "Abstyles";
      if (code == SPDXLicense.ADACORE_DOC)
        return "AdaCore-doc";
      if (code == SPDXLicense.ADOBE_2006)
        return "Adobe-2006";
      if (code == SPDXLicense.ADOBE_GLYPH)
        return "Adobe-Glyph";
      if (code == SPDXLicense.ADSL)
        return "ADSL";
      if (code == SPDXLicense.AFL_1_1)
        return "AFL-1.1";
      if (code == SPDXLicense.AFL_1_2)
        return "AFL-1.2";
      if (code == SPDXLicense.AFL_2_0)
        return "AFL-2.0";
      if (code == SPDXLicense.AFL_2_1)
        return "AFL-2.1";
      if (code == SPDXLicense.AFL_3_0)
        return "AFL-3.0";
      if (code == SPDXLicense.AFMPARSE)
        return "Afmparse";
      if (code == SPDXLicense.AGPL_1_0)
        return "AGPL-1.0";
      if (code == SPDXLicense.AGPL_1_0_ONLY)
        return "AGPL-1.0-only";
      if (code == SPDXLicense.AGPL_1_0_OR_LATER)
        return "AGPL-1.0-or-later";
      if (code == SPDXLicense.AGPL_3_0)
        return "AGPL-3.0";
      if (code == SPDXLicense.AGPL_3_0_ONLY)
        return "AGPL-3.0-only";
      if (code == SPDXLicense.AGPL_3_0_OR_LATER)
        return "AGPL-3.0-or-later";
      if (code == SPDXLicense.ALADDIN)
        return "Aladdin";
      if (code == SPDXLicense.AMDPLPA)
        return "AMDPLPA";
      if (code == SPDXLicense.AML)
        return "AML";
      if (code == SPDXLicense.AMPAS)
        return "AMPAS";
      if (code == SPDXLicense.ANTLR_PD)
        return "ANTLR-PD";
      if (code == SPDXLicense.ANTLR_PD_FALLBACK)
        return "ANTLR-PD-fallback";
      if (code == SPDXLicense.APACHE_1_0)
        return "Apache-1.0";
      if (code == SPDXLicense.APACHE_1_1)
        return "Apache-1.1";
      if (code == SPDXLicense.APACHE_2_0)
        return "Apache-2.0";
      if (code == SPDXLicense.APAFML)
        return "APAFML";
      if (code == SPDXLicense.APL_1_0)
        return "APL-1.0";
      if (code == SPDXLicense.APP_S2P)
        return "App-s2p";
      if (code == SPDXLicense.APSL_1_0)
        return "APSL-1.0";
      if (code == SPDXLicense.APSL_1_1)
        return "APSL-1.1";
      if (code == SPDXLicense.APSL_1_2)
        return "APSL-1.2";
      if (code == SPDXLicense.APSL_2_0)
        return "APSL-2.0";
      if (code == SPDXLicense.ARPHIC_1999)
        return "Arphic-1999";
      if (code == SPDXLicense.ARTISTIC_1_0)
        return "Artistic-1.0";
      if (code == SPDXLicense.ARTISTIC_1_0_CL8)
        return "Artistic-1.0-cl8";
      if (code == SPDXLicense.ARTISTIC_1_0_PERL)
        return "Artistic-1.0-Perl";
      if (code == SPDXLicense.ARTISTIC_2_0)
        return "Artistic-2.0";
      if (code == SPDXLicense.ASWF_DIGITAL_ASSETS_1_0)
        return "ASWF-Digital-Assets-1.0";
      if (code == SPDXLicense.ASWF_DIGITAL_ASSETS_1_1)
        return "ASWF-Digital-Assets-1.1";
      if (code == SPDXLicense.BAEKMUK)
        return "Baekmuk";
      if (code == SPDXLicense.BAHYPH)
        return "Bahyph";
      if (code == SPDXLicense.BARR)
        return "Barr";
      if (code == SPDXLicense.BEERWARE)
        return "Beerware";
      if (code == SPDXLicense.BITSTREAM_CHARTER)
        return "Bitstream-Charter";
      if (code == SPDXLicense.BITSTREAM_VERA)
        return "Bitstream-Vera";
      if (code == SPDXLicense.BITTORRENT_1_0)
        return "BitTorrent-1.0";
      if (code == SPDXLicense.BITTORRENT_1_1)
        return "BitTorrent-1.1";
      if (code == SPDXLicense.BLESSING)
        return "blessing";
      if (code == SPDXLicense.BLUEOAK_1_0_0)
        return "BlueOak-1.0.0";
      if (code == SPDXLicense.BOEHM_GC)
        return "Boehm-GC";
      if (code == SPDXLicense.BORCEUX)
        return "Borceux";
      if (code == SPDXLicense.BRIAN_GLADMAN_3_CLAUSE)
        return "Brian-Gladman-3-Clause";
      if (code == SPDXLicense.BSD_1_CLAUSE)
        return "BSD-1-Clause";
      if (code == SPDXLicense.BSD_2_CLAUSE)
        return "BSD-2-Clause";
      if (code == SPDXLicense.BSD_2_CLAUSE_FREEBSD)
        return "BSD-2-Clause-FreeBSD";
      if (code == SPDXLicense.BSD_2_CLAUSE_NETBSD)
        return "BSD-2-Clause-NetBSD";
      if (code == SPDXLicense.BSD_2_CLAUSE_PATENT)
        return "BSD-2-Clause-Patent";
      if (code == SPDXLicense.BSD_2_CLAUSE_VIEWS)
        return "BSD-2-Clause-Views";
      if (code == SPDXLicense.BSD_3_CLAUSE)
        return "BSD-3-Clause";
      if (code == SPDXLicense.BSD_3_CLAUSE_ATTRIBUTION)
        return "BSD-3-Clause-Attribution";
      if (code == SPDXLicense.BSD_3_CLAUSE_CLEAR)
        return "BSD-3-Clause-Clear";
      if (code == SPDXLicense.BSD_3_CLAUSE_LBNL)
        return "BSD-3-Clause-LBNL";
      if (code == SPDXLicense.BSD_3_CLAUSE_MODIFICATION)
        return "BSD-3-Clause-Modification";
      if (code == SPDXLicense.BSD_3_CLAUSE_NO_MILITARY_LICENSE)
        return "BSD-3-Clause-No-Military-License";
      if (code == SPDXLicense.BSD_3_CLAUSE_NO_NUCLEAR_LICENSE)
        return "BSD-3-Clause-No-Nuclear-License";
      if (code == SPDXLicense.BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014)
        return "BSD-3-Clause-No-Nuclear-License-2014";
      if (code == SPDXLicense.BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY)
        return "BSD-3-Clause-No-Nuclear-Warranty";
      if (code == SPDXLicense.BSD_3_CLAUSE_OPEN_MPI)
        return "BSD-3-Clause-Open-MPI";
      if (code == SPDXLicense.BSD_4_CLAUSE)
        return "BSD-4-Clause";
      if (code == SPDXLicense.BSD_4_CLAUSE_SHORTENED)
        return "BSD-4-Clause-Shortened";
      if (code == SPDXLicense.BSD_4_CLAUSE_UC)
        return "BSD-4-Clause-UC";
      if (code == SPDXLicense.BSD_4_3RENO)
        return "BSD-4.3RENO";
      if (code == SPDXLicense.BSD_4_3TAHOE)
        return "BSD-4.3TAHOE";
      if (code == SPDXLicense.BSD_ADVERTISING_ACKNOWLEDGEMENT)
        return "BSD-Advertising-Acknowledgement";
      if (code == SPDXLicense.BSD_ATTRIBUTION_HPND_DISCLAIMER)
        return "BSD-Attribution-HPND-disclaimer";
      if (code == SPDXLicense.BSD_PROTECTION)
        return "BSD-Protection";
      if (code == SPDXLicense.BSD_SOURCE_CODE)
        return "BSD-Source-Code";
      if (code == SPDXLicense.BSL_1_0)
        return "BSL-1.0";
      if (code == SPDXLicense.BUSL_1_1)
        return "BUSL-1.1";
      if (code == SPDXLicense.BZIP2_1_0_5)
        return "bzip2-1.0.5";
      if (code == SPDXLicense.BZIP2_1_0_6)
        return "bzip2-1.0.6";
      if (code == SPDXLicense.C_UDA_1_0)
        return "C-UDA-1.0";
      if (code == SPDXLicense.CAL_1_0)
        return "CAL-1.0";
      if (code == SPDXLicense.CAL_1_0_COMBINED_WORK_EXCEPTION)
        return "CAL-1.0-Combined-Work-Exception";
      if (code == SPDXLicense.CALDERA)
        return "Caldera";
      if (code == SPDXLicense.CATOSL_1_1)
        return "CATOSL-1.1";
      if (code == SPDXLicense.CC_BY_1_0)
        return "CC-BY-1.0";
      if (code == SPDXLicense.CC_BY_2_0)
        return "CC-BY-2.0";
      if (code == SPDXLicense.CC_BY_2_5)
        return "CC-BY-2.5";
      if (code == SPDXLicense.CC_BY_2_5_AU)
        return "CC-BY-2.5-AU";
      if (code == SPDXLicense.CC_BY_3_0)
        return "CC-BY-3.0";
      if (code == SPDXLicense.CC_BY_3_0_AT)
        return "CC-BY-3.0-AT";
      if (code == SPDXLicense.CC_BY_3_0_DE)
        return "CC-BY-3.0-DE";
      if (code == SPDXLicense.CC_BY_3_0_IGO)
        return "CC-BY-3.0-IGO";
      if (code == SPDXLicense.CC_BY_3_0_NL)
        return "CC-BY-3.0-NL";
      if (code == SPDXLicense.CC_BY_3_0_US)
        return "CC-BY-3.0-US";
      if (code == SPDXLicense.CC_BY_4_0)
        return "CC-BY-4.0";
      if (code == SPDXLicense.CC_BY_NC_1_0)
        return "CC-BY-NC-1.0";
      if (code == SPDXLicense.CC_BY_NC_2_0)
        return "CC-BY-NC-2.0";
      if (code == SPDXLicense.CC_BY_NC_2_5)
        return "CC-BY-NC-2.5";
      if (code == SPDXLicense.CC_BY_NC_3_0)
        return "CC-BY-NC-3.0";
      if (code == SPDXLicense.CC_BY_NC_3_0_DE)
        return "CC-BY-NC-3.0-DE";
      if (code == SPDXLicense.CC_BY_NC_4_0)
        return "CC-BY-NC-4.0";
      if (code == SPDXLicense.CC_BY_NC_ND_1_0)
        return "CC-BY-NC-ND-1.0";
      if (code == SPDXLicense.CC_BY_NC_ND_2_0)
        return "CC-BY-NC-ND-2.0";
      if (code == SPDXLicense.CC_BY_NC_ND_2_5)
        return "CC-BY-NC-ND-2.5";
      if (code == SPDXLicense.CC_BY_NC_ND_3_0)
        return "CC-BY-NC-ND-3.0";
      if (code == SPDXLicense.CC_BY_NC_ND_3_0_DE)
        return "CC-BY-NC-ND-3.0-DE";
      if (code == SPDXLicense.CC_BY_NC_ND_3_0_IGO)
        return "CC-BY-NC-ND-3.0-IGO";
      if (code == SPDXLicense.CC_BY_NC_ND_4_0)
        return "CC-BY-NC-ND-4.0";
      if (code == SPDXLicense.CC_BY_NC_SA_1_0)
        return "CC-BY-NC-SA-1.0";
      if (code == SPDXLicense.CC_BY_NC_SA_2_0)
        return "CC-BY-NC-SA-2.0";
      if (code == SPDXLicense.CC_BY_NC_SA_2_0_DE)
        return "CC-BY-NC-SA-2.0-DE";
      if (code == SPDXLicense.CC_BY_NC_SA_2_0_FR)
        return "CC-BY-NC-SA-2.0-FR";
      if (code == SPDXLicense.CC_BY_NC_SA_2_0_UK)
        return "CC-BY-NC-SA-2.0-UK";
      if (code == SPDXLicense.CC_BY_NC_SA_2_5)
        return "CC-BY-NC-SA-2.5";
      if (code == SPDXLicense.CC_BY_NC_SA_3_0)
        return "CC-BY-NC-SA-3.0";
      if (code == SPDXLicense.CC_BY_NC_SA_3_0_DE)
        return "CC-BY-NC-SA-3.0-DE";
      if (code == SPDXLicense.CC_BY_NC_SA_3_0_IGO)
        return "CC-BY-NC-SA-3.0-IGO";
      if (code == SPDXLicense.CC_BY_NC_SA_4_0)
        return "CC-BY-NC-SA-4.0";
      if (code == SPDXLicense.CC_BY_ND_1_0)
        return "CC-BY-ND-1.0";
      if (code == SPDXLicense.CC_BY_ND_2_0)
        return "CC-BY-ND-2.0";
      if (code == SPDXLicense.CC_BY_ND_2_5)
        return "CC-BY-ND-2.5";
      if (code == SPDXLicense.CC_BY_ND_3_0)
        return "CC-BY-ND-3.0";
      if (code == SPDXLicense.CC_BY_ND_3_0_DE)
        return "CC-BY-ND-3.0-DE";
      if (code == SPDXLicense.CC_BY_ND_4_0)
        return "CC-BY-ND-4.0";
      if (code == SPDXLicense.CC_BY_SA_1_0)
        return "CC-BY-SA-1.0";
      if (code == SPDXLicense.CC_BY_SA_2_0)
        return "CC-BY-SA-2.0";
      if (code == SPDXLicense.CC_BY_SA_2_0_UK)
        return "CC-BY-SA-2.0-UK";
      if (code == SPDXLicense.CC_BY_SA_2_1_JP)
        return "CC-BY-SA-2.1-JP";
      if (code == SPDXLicense.CC_BY_SA_2_5)
        return "CC-BY-SA-2.5";
      if (code == SPDXLicense.CC_BY_SA_3_0)
        return "CC-BY-SA-3.0";
      if (code == SPDXLicense.CC_BY_SA_3_0_AT)
        return "CC-BY-SA-3.0-AT";
      if (code == SPDXLicense.CC_BY_SA_3_0_DE)
        return "CC-BY-SA-3.0-DE";
      if (code == SPDXLicense.CC_BY_SA_3_0_IGO)
        return "CC-BY-SA-3.0-IGO";
      if (code == SPDXLicense.CC_BY_SA_4_0)
        return "CC-BY-SA-4.0";
      if (code == SPDXLicense.CC_PDDC)
        return "CC-PDDC";
      if (code == SPDXLicense.CC0_1_0)
        return "CC0-1.0";
      if (code == SPDXLicense.CDDL_1_0)
        return "CDDL-1.0";
      if (code == SPDXLicense.CDDL_1_1)
        return "CDDL-1.1";
      if (code == SPDXLicense.CDL_1_0)
        return "CDL-1.0";
      if (code == SPDXLicense.CDLA_PERMISSIVE_1_0)
        return "CDLA-Permissive-1.0";
      if (code == SPDXLicense.CDLA_PERMISSIVE_2_0)
        return "CDLA-Permissive-2.0";
      if (code == SPDXLicense.CDLA_SHARING_1_0)
        return "CDLA-Sharing-1.0";
      if (code == SPDXLicense.CECILL_1_0)
        return "CECILL-1.0";
      if (code == SPDXLicense.CECILL_1_1)
        return "CECILL-1.1";
      if (code == SPDXLicense.CECILL_2_0)
        return "CECILL-2.0";
      if (code == SPDXLicense.CECILL_2_1)
        return "CECILL-2.1";
      if (code == SPDXLicense.CECILL_B)
        return "CECILL-B";
      if (code == SPDXLicense.CECILL_C)
        return "CECILL-C";
      if (code == SPDXLicense.CERN_OHL_1_1)
        return "CERN-OHL-1.1";
      if (code == SPDXLicense.CERN_OHL_1_2)
        return "CERN-OHL-1.2";
      if (code == SPDXLicense.CERN_OHL_P_2_0)
        return "CERN-OHL-P-2.0";
      if (code == SPDXLicense.CERN_OHL_S_2_0)
        return "CERN-OHL-S-2.0";
      if (code == SPDXLicense.CERN_OHL_W_2_0)
        return "CERN-OHL-W-2.0";
      if (code == SPDXLicense.CFITSIO)
        return "CFITSIO";
      if (code == SPDXLicense.CHECKMK)
        return "checkmk";
      if (code == SPDXLicense.CLARTISTIC)
        return "ClArtistic";
      if (code == SPDXLicense.CLIPS)
        return "Clips";
      if (code == SPDXLicense.CMU_MACH)
        return "CMU-Mach";
      if (code == SPDXLicense.CNRI_JYTHON)
        return "CNRI-Jython";
      if (code == SPDXLicense.CNRI_PYTHON)
        return "CNRI-Python";
      if (code == SPDXLicense.CNRI_PYTHON_GPL_COMPATIBLE)
        return "CNRI-Python-GPL-Compatible";
      if (code == SPDXLicense.COIL_1_0)
        return "COIL-1.0";
      if (code == SPDXLicense.COMMUNITY_SPEC_1_0)
        return "Community-Spec-1.0";
      if (code == SPDXLicense.CONDOR_1_1)
        return "Condor-1.1";
      if (code == SPDXLicense.COPYLEFT_NEXT_0_3_0)
        return "copyleft-next-0.3.0";
      if (code == SPDXLicense.COPYLEFT_NEXT_0_3_1)
        return "copyleft-next-0.3.1";
      if (code == SPDXLicense.CORNELL_LOSSLESS_JPEG)
        return "Cornell-Lossless-JPEG";
      if (code == SPDXLicense.CPAL_1_0)
        return "CPAL-1.0";
      if (code == SPDXLicense.CPL_1_0)
        return "CPL-1.0";
      if (code == SPDXLicense.CPOL_1_02)
        return "CPOL-1.02";
      if (code == SPDXLicense.CROSSWORD)
        return "Crossword";
      if (code == SPDXLicense.CRYSTALSTACKER)
        return "CrystalStacker";
      if (code == SPDXLicense.CUA_OPL_1_0)
        return "CUA-OPL-1.0";
      if (code == SPDXLicense.CUBE)
        return "Cube";
      if (code == SPDXLicense.CURL)
        return "curl";
      if (code == SPDXLicense.D_FSL_1_0)
        return "D-FSL-1.0";
      if (code == SPDXLicense.DIFFMARK)
        return "diffmark";
      if (code == SPDXLicense.DL_DE_BY_2_0)
        return "DL-DE-BY-2.0";
      if (code == SPDXLicense.DOC)
        return "DOC";
      if (code == SPDXLicense.DOTSEQN)
        return "Dotseqn";
      if (code == SPDXLicense.DRL_1_0)
        return "DRL-1.0";
      if (code == SPDXLicense.DSDP)
        return "DSDP";
      if (code == SPDXLicense.DTOA)
        return "dtoa";
      if (code == SPDXLicense.DVIPDFM)
        return "dvipdfm";
      if (code == SPDXLicense.ECL_1_0)
        return "ECL-1.0";
      if (code == SPDXLicense.ECL_2_0)
        return "ECL-2.0";
      if (code == SPDXLicense.ECOS_2_0)
        return "eCos-2.0";
      if (code == SPDXLicense.EFL_1_0)
        return "EFL-1.0";
      if (code == SPDXLicense.EFL_2_0)
        return "EFL-2.0";
      if (code == SPDXLicense.EGENIX)
        return "eGenix";
      if (code == SPDXLicense.ELASTIC_2_0)
        return "Elastic-2.0";
      if (code == SPDXLicense.ENTESSA)
        return "Entessa";
      if (code == SPDXLicense.EPICS)
        return "EPICS";
      if (code == SPDXLicense.EPL_1_0)
        return "EPL-1.0";
      if (code == SPDXLicense.EPL_2_0)
        return "EPL-2.0";
      if (code == SPDXLicense.ERLPL_1_1)
        return "ErlPL-1.1";
      if (code == SPDXLicense.ETALAB_2_0)
        return "etalab-2.0";
      if (code == SPDXLicense.EUDATAGRID)
        return "EUDatagrid";
      if (code == SPDXLicense.EUPL_1_0)
        return "EUPL-1.0";
      if (code == SPDXLicense.EUPL_1_1)
        return "EUPL-1.1";
      if (code == SPDXLicense.EUPL_1_2)
        return "EUPL-1.2";
      if (code == SPDXLicense.EUROSYM)
        return "Eurosym";
      if (code == SPDXLicense.FAIR)
        return "Fair";
      if (code == SPDXLicense.FDK_AAC)
        return "FDK-AAC";
      if (code == SPDXLicense.FRAMEWORX_1_0)
        return "Frameworx-1.0";
      if (code == SPDXLicense.FREEBSD_DOC)
        return "FreeBSD-DOC";
      if (code == SPDXLicense.FREEIMAGE)
        return "FreeImage";
      if (code == SPDXLicense.FSFAP)
        return "FSFAP";
      if (code == SPDXLicense.FSFUL)
        return "FSFUL";
      if (code == SPDXLicense.FSFULLR)
        return "FSFULLR";
      if (code == SPDXLicense.FSFULLRWD)
        return "FSFULLRWD";
      if (code == SPDXLicense.FTL)
        return "FTL";
      if (code == SPDXLicense.GD)
        return "GD";
      if (code == SPDXLicense.GFDL_1_1)
        return "GFDL-1.1";
      if (code == SPDXLicense.GFDL_1_1_INVARIANTS_ONLY)
        return "GFDL-1.1-invariants-only";
      if (code == SPDXLicense.GFDL_1_1_INVARIANTS_OR_LATER)
        return "GFDL-1.1-invariants-or-later";
      if (code == SPDXLicense.GFDL_1_1_NO_INVARIANTS_ONLY)
        return "GFDL-1.1-no-invariants-only";
      if (code == SPDXLicense.GFDL_1_1_NO_INVARIANTS_OR_LATER)
        return "GFDL-1.1-no-invariants-or-later";
      if (code == SPDXLicense.GFDL_1_1_ONLY)
        return "GFDL-1.1-only";
      if (code == SPDXLicense.GFDL_1_1_OR_LATER)
        return "GFDL-1.1-or-later";
      if (code == SPDXLicense.GFDL_1_2)
        return "GFDL-1.2";
      if (code == SPDXLicense.GFDL_1_2_INVARIANTS_ONLY)
        return "GFDL-1.2-invariants-only";
      if (code == SPDXLicense.GFDL_1_2_INVARIANTS_OR_LATER)
        return "GFDL-1.2-invariants-or-later";
      if (code == SPDXLicense.GFDL_1_2_NO_INVARIANTS_ONLY)
        return "GFDL-1.2-no-invariants-only";
      if (code == SPDXLicense.GFDL_1_2_NO_INVARIANTS_OR_LATER)
        return "GFDL-1.2-no-invariants-or-later";
      if (code == SPDXLicense.GFDL_1_2_ONLY)
        return "GFDL-1.2-only";
      if (code == SPDXLicense.GFDL_1_2_OR_LATER)
        return "GFDL-1.2-or-later";
      if (code == SPDXLicense.GFDL_1_3)
        return "GFDL-1.3";
      if (code == SPDXLicense.GFDL_1_3_INVARIANTS_ONLY)
        return "GFDL-1.3-invariants-only";
      if (code == SPDXLicense.GFDL_1_3_INVARIANTS_OR_LATER)
        return "GFDL-1.3-invariants-or-later";
      if (code == SPDXLicense.GFDL_1_3_NO_INVARIANTS_ONLY)
        return "GFDL-1.3-no-invariants-only";
      if (code == SPDXLicense.GFDL_1_3_NO_INVARIANTS_OR_LATER)
        return "GFDL-1.3-no-invariants-or-later";
      if (code == SPDXLicense.GFDL_1_3_ONLY)
        return "GFDL-1.3-only";
      if (code == SPDXLicense.GFDL_1_3_OR_LATER)
        return "GFDL-1.3-or-later";
      if (code == SPDXLicense.GIFTWARE)
        return "Giftware";
      if (code == SPDXLicense.GL2PS)
        return "GL2PS";
      if (code == SPDXLicense.GLIDE)
        return "Glide";
      if (code == SPDXLicense.GLULXE)
        return "Glulxe";
      if (code == SPDXLicense.GLWTPL)
        return "GLWTPL";
      if (code == SPDXLicense.GNUPLOT)
        return "gnuplot";
      if (code == SPDXLicense.GPL_1_0)
        return "GPL-1.0";
      if (code == SPDXLicense.GPL_1_0PLUS)
        return "GPL-1.0+";
      if (code == SPDXLicense.GPL_1_0_ONLY)
        return "GPL-1.0-only";
      if (code == SPDXLicense.GPL_1_0_OR_LATER)
        return "GPL-1.0-or-later";
      if (code == SPDXLicense.GPL_2_0)
        return "GPL-2.0";
      if (code == SPDXLicense.GPL_2_0PLUS)
        return "GPL-2.0+";
      if (code == SPDXLicense.GPL_2_0_ONLY)
        return "GPL-2.0-only";
      if (code == SPDXLicense.GPL_2_0_OR_LATER)
        return "GPL-2.0-or-later";
      if (code == SPDXLicense.GPL_2_0_WITH_AUTOCONF_EXCEPTION)
        return "GPL-2.0-with-autoconf-exception";
      if (code == SPDXLicense.GPL_2_0_WITH_BISON_EXCEPTION)
        return "GPL-2.0-with-bison-exception";
      if (code == SPDXLicense.GPL_2_0_WITH_CLASSPATH_EXCEPTION)
        return "GPL-2.0-with-classpath-exception";
      if (code == SPDXLicense.GPL_2_0_WITH_FONT_EXCEPTION)
        return "GPL-2.0-with-font-exception";
      if (code == SPDXLicense.GPL_2_0_WITH_GCC_EXCEPTION)
        return "GPL-2.0-with-GCC-exception";
      if (code == SPDXLicense.GPL_3_0)
        return "GPL-3.0";
      if (code == SPDXLicense.GPL_3_0PLUS)
        return "GPL-3.0+";
      if (code == SPDXLicense.GPL_3_0_ONLY)
        return "GPL-3.0-only";
      if (code == SPDXLicense.GPL_3_0_OR_LATER)
        return "GPL-3.0-or-later";
      if (code == SPDXLicense.GPL_3_0_WITH_AUTOCONF_EXCEPTION)
        return "GPL-3.0-with-autoconf-exception";
      if (code == SPDXLicense.GPL_3_0_WITH_GCC_EXCEPTION)
        return "GPL-3.0-with-GCC-exception";
      if (code == SPDXLicense.GRAPHICS_GEMS)
        return "Graphics-Gems";
      if (code == SPDXLicense.GSOAP_1_3B)
        return "gSOAP-1.3b";
      if (code == SPDXLicense.HASKELLREPORT)
        return "HaskellReport";
      if (code == SPDXLicense.HIPPOCRATIC_2_1)
        return "Hippocratic-2.1";
      if (code == SPDXLicense.HP_1986)
        return "HP-1986";
      if (code == SPDXLicense.HPND)
        return "HPND";
      if (code == SPDXLicense.HPND_EXPORT_US)
        return "HPND-export-US";
      if (code == SPDXLicense.HPND_MARKUS_KUHN)
        return "HPND-Markus-Kuhn";
      if (code == SPDXLicense.HPND_SELL_VARIANT)
        return "HPND-sell-variant";
      if (code == SPDXLicense.HPND_SELL_VARIANT_MIT_DISCLAIMER)
        return "HPND-sell-variant-MIT-disclaimer";
      if (code == SPDXLicense.HTMLTIDY)
        return "HTMLTIDY";
      if (code == SPDXLicense.IBM_PIBS)
        return "IBM-pibs";
      if (code == SPDXLicense.ICU)
        return "ICU";
      if (code == SPDXLicense.IEC_CODE_COMPONENTS_EULA)
        return "IEC-Code-Components-EULA";
      if (code == SPDXLicense.IJG)
        return "IJG";
      if (code == SPDXLicense.IJG_SHORT)
        return "IJG-short";
      if (code == SPDXLicense.IMAGEMAGICK)
        return "ImageMagick";
      if (code == SPDXLicense.IMATIX)
        return "iMatix";
      if (code == SPDXLicense.IMLIB2)
        return "Imlib2";
      if (code == SPDXLicense.INFO_ZIP)
        return "Info-ZIP";
      if (code == SPDXLicense.INNER_NET_2_0)
        return "Inner-Net-2.0";
      if (code == SPDXLicense.INTEL)
        return "Intel";
      if (code == SPDXLicense.INTEL_ACPI)
        return "Intel-ACPI";
      if (code == SPDXLicense.INTERBASE_1_0)
        return "Interbase-1.0";
      if (code == SPDXLicense.IPA)
        return "IPA";
      if (code == SPDXLicense.IPL_1_0)
        return "IPL-1.0";
      if (code == SPDXLicense.ISC)
        return "ISC";
      if (code == SPDXLicense.JAM)
        return "Jam";
      if (code == SPDXLicense.JASPER_2_0)
        return "JasPer-2.0";
      if (code == SPDXLicense.JPL_IMAGE)
        return "JPL-image";
      if (code == SPDXLicense.JPNIC)
        return "JPNIC";
      if (code == SPDXLicense.JSON)
        return "JSON";
      if (code == SPDXLicense.KAZLIB)
        return "Kazlib";
      if (code == SPDXLicense.KNUTH_CTAN)
        return "Knuth-CTAN";
      if (code == SPDXLicense.LAL_1_2)
        return "LAL-1.2";
      if (code == SPDXLicense.LAL_1_3)
        return "LAL-1.3";
      if (code == SPDXLicense.LATEX2E)
        return "Latex2e";
      if (code == SPDXLicense.LATEX2E_TRANSLATED_NOTICE)
        return "Latex2e-translated-notice";
      if (code == SPDXLicense.LEPTONICA)
        return "Leptonica";
      if (code == SPDXLicense.LGPL_2_0)
        return "LGPL-2.0";
      if (code == SPDXLicense.LGPL_2_0PLUS)
        return "LGPL-2.0+";
      if (code == SPDXLicense.LGPL_2_0_ONLY)
        return "LGPL-2.0-only";
      if (code == SPDXLicense.LGPL_2_0_OR_LATER)
        return "LGPL-2.0-or-later";
      if (code == SPDXLicense.LGPL_2_1)
        return "LGPL-2.1";
      if (code == SPDXLicense.LGPL_2_1PLUS)
        return "LGPL-2.1+";
      if (code == SPDXLicense.LGPL_2_1_ONLY)
        return "LGPL-2.1-only";
      if (code == SPDXLicense.LGPL_2_1_OR_LATER)
        return "LGPL-2.1-or-later";
      if (code == SPDXLicense.LGPL_3_0)
        return "LGPL-3.0";
      if (code == SPDXLicense.LGPL_3_0PLUS)
        return "LGPL-3.0+";
      if (code == SPDXLicense.LGPL_3_0_ONLY)
        return "LGPL-3.0-only";
      if (code == SPDXLicense.LGPL_3_0_OR_LATER)
        return "LGPL-3.0-or-later";
      if (code == SPDXLicense.LGPLLR)
        return "LGPLLR";
      if (code == SPDXLicense.LIBPNG)
        return "Libpng";
      if (code == SPDXLicense.LIBPNG_2_0)
        return "libpng-2.0";
      if (code == SPDXLicense.LIBSELINUX_1_0)
        return "libselinux-1.0";
      if (code == SPDXLicense.LIBTIFF)
        return "libtiff";
      if (code == SPDXLicense.LIBUTIL_DAVID_NUGENT)
        return "libutil-David-Nugent";
      if (code == SPDXLicense.LILIQ_P_1_1)
        return "LiLiQ-P-1.1";
      if (code == SPDXLicense.LILIQ_R_1_1)
        return "LiLiQ-R-1.1";
      if (code == SPDXLicense.LILIQ_RPLUS_1_1)
        return "LiLiQ-Rplus-1.1";
      if (code == SPDXLicense.LINUX_MAN_PAGES_1_PARA)
        return "Linux-man-pages-1-para";
      if (code == SPDXLicense.LINUX_MAN_PAGES_COPYLEFT)
        return "Linux-man-pages-copyleft";
      if (code == SPDXLicense.LINUX_MAN_PAGES_COPYLEFT_2_PARA)
        return "Linux-man-pages-copyleft-2-para";
      if (code == SPDXLicense.LINUX_MAN_PAGES_COPYLEFT_VAR)
        return "Linux-man-pages-copyleft-var";
      if (code == SPDXLicense.LINUX_OPENIB)
        return "Linux-OpenIB";
      if (code == SPDXLicense.LOOP)
        return "LOOP";
      if (code == SPDXLicense.LPL_1_0)
        return "LPL-1.0";
      if (code == SPDXLicense.LPL_1_02)
        return "LPL-1.02";
      if (code == SPDXLicense.LPPL_1_0)
        return "LPPL-1.0";
      if (code == SPDXLicense.LPPL_1_1)
        return "LPPL-1.1";
      if (code == SPDXLicense.LPPL_1_2)
        return "LPPL-1.2";
      if (code == SPDXLicense.LPPL_1_3A)
        return "LPPL-1.3a";
      if (code == SPDXLicense.LPPL_1_3C)
        return "LPPL-1.3c";
      if (code == SPDXLicense.LZMA_SDK_9_11_TO_9_20)
        return "LZMA-SDK-9.11-to-9.20";
      if (code == SPDXLicense.LZMA_SDK_9_22)
        return "LZMA-SDK-9.22";
      if (code == SPDXLicense.MAKEINDEX)
        return "MakeIndex";
      if (code == SPDXLicense.MARTIN_BIRGMEIER)
        return "Martin-Birgmeier";
      if (code == SPDXLicense.METAMAIL)
        return "metamail";
      if (code == SPDXLicense.MINPACK)
        return "Minpack";
      if (code == SPDXLicense.MIROS)
        return "MirOS";
      if (code == SPDXLicense.MIT)
        return "MIT";
      if (code == SPDXLicense.MIT_0)
        return "MIT-0";
      if (code == SPDXLicense.MIT_ADVERTISING)
        return "MIT-advertising";
      if (code == SPDXLicense.MIT_CMU)
        return "MIT-CMU";
      if (code == SPDXLicense.MIT_ENNA)
        return "MIT-enna";
      if (code == SPDXLicense.MIT_FEH)
        return "MIT-feh";
      if (code == SPDXLicense.MIT_FESTIVAL)
        return "MIT-Festival";
      if (code == SPDXLicense.MIT_MODERN_VARIANT)
        return "MIT-Modern-Variant";
      if (code == SPDXLicense.MIT_OPEN_GROUP)
        return "MIT-open-group";
      if (code == SPDXLicense.MIT_WU)
        return "MIT-Wu";
      if (code == SPDXLicense.MITNFA)
        return "MITNFA";
      if (code == SPDXLicense.MOTOSOTO)
        return "Motosoto";
      if (code == SPDXLicense.MPI_PERMISSIVE)
        return "mpi-permissive";
      if (code == SPDXLicense.MPICH2)
        return "mpich2";
      if (code == SPDXLicense.MPL_1_0)
        return "MPL-1.0";
      if (code == SPDXLicense.MPL_1_1)
        return "MPL-1.1";
      if (code == SPDXLicense.MPL_2_0)
        return "MPL-2.0";
      if (code == SPDXLicense.MPL_2_0_NO_COPYLEFT_EXCEPTION)
        return "MPL-2.0-no-copyleft-exception";
      if (code == SPDXLicense.MPLUS)
        return "mplus";
      if (code == SPDXLicense.MS_LPL)
        return "MS-LPL";
      if (code == SPDXLicense.MS_PL)
        return "MS-PL";
      if (code == SPDXLicense.MS_RL)
        return "MS-RL";
      if (code == SPDXLicense.MTLL)
        return "MTLL";
      if (code == SPDXLicense.MULANPSL_1_0)
        return "MulanPSL-1.0";
      if (code == SPDXLicense.MULANPSL_2_0)
        return "MulanPSL-2.0";
      if (code == SPDXLicense.MULTICS)
        return "Multics";
      if (code == SPDXLicense.MUP)
        return "Mup";
      if (code == SPDXLicense.NAIST_2003)
        return "NAIST-2003";
      if (code == SPDXLicense.NASA_1_3)
        return "NASA-1.3";
      if (code == SPDXLicense.NAUMEN)
        return "Naumen";
      if (code == SPDXLicense.NBPL_1_0)
        return "NBPL-1.0";
      if (code == SPDXLicense.NCGL_UK_2_0)
        return "NCGL-UK-2.0";
      if (code == SPDXLicense.NCSA)
        return "NCSA";
      if (code == SPDXLicense.NET_SNMP)
        return "Net-SNMP";
      if (code == SPDXLicense.NETCDF)
        return "NetCDF";
      if (code == SPDXLicense.NEWSLETR)
        return "Newsletr";
      if (code == SPDXLicense.NGPL)
        return "NGPL";
      if (code == SPDXLicense.NICTA_1_0)
        return "NICTA-1.0";
      if (code == SPDXLicense.NIST_PD)
        return "NIST-PD";
      if (code == SPDXLicense.NIST_PD_FALLBACK)
        return "NIST-PD-fallback";
      if (code == SPDXLicense.NIST_SOFTWARE)
        return "NIST-Software";
      if (code == SPDXLicense.NLOD_1_0)
        return "NLOD-1.0";
      if (code == SPDXLicense.NLOD_2_0)
        return "NLOD-2.0";
      if (code == SPDXLicense.NLPL)
        return "NLPL";
      if (code == SPDXLicense.NOKIA)
        return "Nokia";
      if (code == SPDXLicense.NOSL)
        return "NOSL";
      if (code == SPDXLicense.NOT_OPEN_SOURCE)
        return "not-open-source";
      if (code == SPDXLicense.NOWEB)
        return "Noweb";
      if (code == SPDXLicense.NPL_1_0)
        return "NPL-1.0";
      if (code == SPDXLicense.NPL_1_1)
        return "NPL-1.1";
      if (code == SPDXLicense.NPOSL_3_0)
        return "NPOSL-3.0";
      if (code == SPDXLicense.NRL)
        return "NRL";
      if (code == SPDXLicense.NTP)
        return "NTP";
      if (code == SPDXLicense.NTP_0)
        return "NTP-0";
      if (code == SPDXLicense.NUNIT)
        return "Nunit";
      if (code == SPDXLicense.O_UDA_1_0)
        return "O-UDA-1.0";
      if (code == SPDXLicense.OCCT_PL)
        return "OCCT-PL";
      if (code == SPDXLicense.OCLC_2_0)
        return "OCLC-2.0";
      if (code == SPDXLicense.ODBL_1_0)
        return "ODbL-1.0";
      if (code == SPDXLicense.ODC_BY_1_0)
        return "ODC-By-1.0";
      if (code == SPDXLicense.OFFIS)
        return "OFFIS";
      if (code == SPDXLicense.OFL_1_0)
        return "OFL-1.0";
      if (code == SPDXLicense.OFL_1_0_NO_RFN)
        return "OFL-1.0-no-RFN";
      if (code == SPDXLicense.OFL_1_0_RFN)
        return "OFL-1.0-RFN";
      if (code == SPDXLicense.OFL_1_1)
        return "OFL-1.1";
      if (code == SPDXLicense.OFL_1_1_NO_RFN)
        return "OFL-1.1-no-RFN";
      if (code == SPDXLicense.OFL_1_1_RFN)
        return "OFL-1.1-RFN";
      if (code == SPDXLicense.OGC_1_0)
        return "OGC-1.0";
      if (code == SPDXLicense.OGDL_TAIWAN_1_0)
        return "OGDL-Taiwan-1.0";
      if (code == SPDXLicense.OGL_CANADA_2_0)
        return "OGL-Canada-2.0";
      if (code == SPDXLicense.OGL_UK_1_0)
        return "OGL-UK-1.0";
      if (code == SPDXLicense.OGL_UK_2_0)
        return "OGL-UK-2.0";
      if (code == SPDXLicense.OGL_UK_3_0)
        return "OGL-UK-3.0";
      if (code == SPDXLicense.OGTSL)
        return "OGTSL";
      if (code == SPDXLicense.OLDAP_1_1)
        return "OLDAP-1.1";
      if (code == SPDXLicense.OLDAP_1_2)
        return "OLDAP-1.2";
      if (code == SPDXLicense.OLDAP_1_3)
        return "OLDAP-1.3";
      if (code == SPDXLicense.OLDAP_1_4)
        return "OLDAP-1.4";
      if (code == SPDXLicense.OLDAP_2_0)
        return "OLDAP-2.0";
      if (code == SPDXLicense.OLDAP_2_0_1)
        return "OLDAP-2.0.1";
      if (code == SPDXLicense.OLDAP_2_1)
        return "OLDAP-2.1";
      if (code == SPDXLicense.OLDAP_2_2)
        return "OLDAP-2.2";
      if (code == SPDXLicense.OLDAP_2_2_1)
        return "OLDAP-2.2.1";
      if (code == SPDXLicense.OLDAP_2_2_2)
        return "OLDAP-2.2.2";
      if (code == SPDXLicense.OLDAP_2_3)
        return "OLDAP-2.3";
      if (code == SPDXLicense.OLDAP_2_4)
        return "OLDAP-2.4";
      if (code == SPDXLicense.OLDAP_2_5)
        return "OLDAP-2.5";
      if (code == SPDXLicense.OLDAP_2_6)
        return "OLDAP-2.6";
      if (code == SPDXLicense.OLDAP_2_7)
        return "OLDAP-2.7";
      if (code == SPDXLicense.OLDAP_2_8)
        return "OLDAP-2.8";
      if (code == SPDXLicense.OLFL_1_3)
        return "OLFL-1.3";
      if (code == SPDXLicense.OML)
        return "OML";
      if (code == SPDXLicense.OPENPBS_2_3)
        return "OpenPBS-2.3";
      if (code == SPDXLicense.OPENSSL)
        return "OpenSSL";
      if (code == SPDXLicense.OPL_1_0)
        return "OPL-1.0";
      if (code == SPDXLicense.OPL_UK_3_0)
        return "OPL-UK-3.0";
      if (code == SPDXLicense.OPUBL_1_0)
        return "OPUBL-1.0";
      if (code == SPDXLicense.OSET_PL_2_1)
        return "OSET-PL-2.1";
      if (code == SPDXLicense.OSL_1_0)
        return "OSL-1.0";
      if (code == SPDXLicense.OSL_1_1)
        return "OSL-1.1";
      if (code == SPDXLicense.OSL_2_0)
        return "OSL-2.0";
      if (code == SPDXLicense.OSL_2_1)
        return "OSL-2.1";
      if (code == SPDXLicense.OSL_3_0)
        return "OSL-3.0";
      if (code == SPDXLicense.PARITY_6_0_0)
        return "Parity-6.0.0";
      if (code == SPDXLicense.PARITY_7_0_0)
        return "Parity-7.0.0";
      if (code == SPDXLicense.PDDL_1_0)
        return "PDDL-1.0";
      if (code == SPDXLicense.PHP_3_0)
        return "PHP-3.0";
      if (code == SPDXLicense.PHP_3_01)
        return "PHP-3.01";
      if (code == SPDXLicense.PLEXUS)
        return "Plexus";
      if (code == SPDXLicense.POLYFORM_NONCOMMERCIAL_1_0_0)
        return "PolyForm-Noncommercial-1.0.0";
      if (code == SPDXLicense.POLYFORM_SMALL_BUSINESS_1_0_0)
        return "PolyForm-Small-Business-1.0.0";
      if (code == SPDXLicense.POSTGRESQL)
        return "PostgreSQL";
      if (code == SPDXLicense.PSF_2_0)
        return "PSF-2.0";
      if (code == SPDXLicense.PSFRAG)
        return "psfrag";
      if (code == SPDXLicense.PSUTILS)
        return "psutils";
      if (code == SPDXLicense.PYTHON_2_0)
        return "Python-2.0";
      if (code == SPDXLicense.PYTHON_2_0_1)
        return "Python-2.0.1";
      if (code == SPDXLicense.QHULL)
        return "Qhull";
      if (code == SPDXLicense.QPL_1_0)
        return "QPL-1.0";
      if (code == SPDXLicense.QPL_1_0_INRIA_2004)
        return "QPL-1.0-INRIA-2004";
      if (code == SPDXLicense.RDISC)
        return "Rdisc";
      if (code == SPDXLicense.RHECOS_1_1)
        return "RHeCos-1.1";
      if (code == SPDXLicense.RPL_1_1)
        return "RPL-1.1";
      if (code == SPDXLicense.RPL_1_5)
        return "RPL-1.5";
      if (code == SPDXLicense.RPSL_1_0)
        return "RPSL-1.0";
      if (code == SPDXLicense.RSA_MD)
        return "RSA-MD";
      if (code == SPDXLicense.RSCPL)
        return "RSCPL";
      if (code == SPDXLicense.RUBY)
        return "Ruby";
      if (code == SPDXLicense.SAX_PD)
        return "SAX-PD";
      if (code == SPDXLicense.SAXPATH)
        return "Saxpath";
      if (code == SPDXLicense.SCEA)
        return "SCEA";
      if (code == SPDXLicense.SCHEMEREPORT)
        return "SchemeReport";
      if (code == SPDXLicense.SENDMAIL)
        return "Sendmail";
      if (code == SPDXLicense.SENDMAIL_8_23)
        return "Sendmail-8.23";
      if (code == SPDXLicense.SGI_B_1_0)
        return "SGI-B-1.0";
      if (code == SPDXLicense.SGI_B_1_1)
        return "SGI-B-1.1";
      if (code == SPDXLicense.SGI_B_2_0)
        return "SGI-B-2.0";
      if (code == SPDXLicense.SGP4)
        return "SGP4";
      if (code == SPDXLicense.SHL_0_5)
        return "SHL-0.5";
      if (code == SPDXLicense.SHL_0_51)
        return "SHL-0.51";
      if (code == SPDXLicense.SIMPL_2_0)
        return "SimPL-2.0";
      if (code == SPDXLicense.SISSL)
        return "SISSL";
      if (code == SPDXLicense.SISSL_1_2)
        return "SISSL-1.2";
      if (code == SPDXLicense.SLEEPYCAT)
        return "Sleepycat";
      if (code == SPDXLicense.SMLNJ)
        return "SMLNJ";
      if (code == SPDXLicense.SMPPL)
        return "SMPPL";
      if (code == SPDXLicense.SNIA)
        return "SNIA";
      if (code == SPDXLicense.SNPRINTF)
        return "snprintf";
      if (code == SPDXLicense.SPENCER_86)
        return "Spencer-86";
      if (code == SPDXLicense.SPENCER_94)
        return "Spencer-94";
      if (code == SPDXLicense.SPENCER_99)
        return "Spencer-99";
      if (code == SPDXLicense.SPL_1_0)
        return "SPL-1.0";
      if (code == SPDXLicense.SSH_OPENSSH)
        return "SSH-OpenSSH";
      if (code == SPDXLicense.SSH_SHORT)
        return "SSH-short";
      if (code == SPDXLicense.SSPL_1_0)
        return "SSPL-1.0";
      if (code == SPDXLicense.STANDARDML_NJ)
        return "StandardML-NJ";
      if (code == SPDXLicense.SUGARCRM_1_1_3)
        return "SugarCRM-1.1.3";
      if (code == SPDXLicense.SUNPRO)
        return "SunPro";
      if (code == SPDXLicense.SWL)
        return "SWL";
      if (code == SPDXLicense.SYMLINKS)
        return "Symlinks";
      if (code == SPDXLicense.TAPR_OHL_1_0)
        return "TAPR-OHL-1.0";
      if (code == SPDXLicense.TCL)
        return "TCL";
      if (code == SPDXLicense.TCP_WRAPPERS)
        return "TCP-wrappers";
      if (code == SPDXLicense.TERMREADKEY)
        return "TermReadKey";
      if (code == SPDXLicense.TMATE)
        return "TMate";
      if (code == SPDXLicense.TORQUE_1_1)
        return "TORQUE-1.1";
      if (code == SPDXLicense.TOSL)
        return "TOSL";
      if (code == SPDXLicense.TPDL)
        return "TPDL";
      if (code == SPDXLicense.TPL_1_0)
        return "TPL-1.0";
      if (code == SPDXLicense.TTWL)
        return "TTWL";
      if (code == SPDXLicense.TU_BERLIN_1_0)
        return "TU-Berlin-1.0";
      if (code == SPDXLicense.TU_BERLIN_2_0)
        return "TU-Berlin-2.0";
      if (code == SPDXLicense.UCAR)
        return "UCAR";
      if (code == SPDXLicense.UCL_1_0)
        return "UCL-1.0";
      if (code == SPDXLicense.UNICODE_DFS_2015)
        return "Unicode-DFS-2015";
      if (code == SPDXLicense.UNICODE_DFS_2016)
        return "Unicode-DFS-2016";
      if (code == SPDXLicense.UNICODE_TOU)
        return "Unicode-TOU";
      if (code == SPDXLicense.UNIXCRYPT)
        return "UnixCrypt";
      if (code == SPDXLicense.UNLICENSE)
        return "Unlicense";
      if (code == SPDXLicense.UPL_1_0)
        return "UPL-1.0";
      if (code == SPDXLicense.VIM)
        return "Vim";
      if (code == SPDXLicense.VOSTROM)
        return "VOSTROM";
      if (code == SPDXLicense.VSL_1_0)
        return "VSL-1.0";
      if (code == SPDXLicense.W3C)
        return "W3C";
      if (code == SPDXLicense.W3C_19980720)
        return "W3C-19980720";
      if (code == SPDXLicense.W3C_20150513)
        return "W3C-20150513";
      if (code == SPDXLicense.W3M)
        return "w3m";
      if (code == SPDXLicense.WATCOM_1_0)
        return "Watcom-1.0";
      if (code == SPDXLicense.WIDGET_WORKSHOP)
        return "Widget-Workshop";
      if (code == SPDXLicense.WSUIPA)
        return "Wsuipa";
      if (code == SPDXLicense.WTFPL)
        return "WTFPL";
      if (code == SPDXLicense.WXWINDOWS)
        return "wxWindows";
      if (code == SPDXLicense.X11)
        return "X11";
      if (code == SPDXLicense.X11_DISTRIBUTE_MODIFICATIONS_VARIANT)
        return "X11-distribute-modifications-variant";
      if (code == SPDXLicense.XDEBUG_1_03)
        return "Xdebug-1.03";
      if (code == SPDXLicense.XEROX)
        return "Xerox";
      if (code == SPDXLicense.XFIG)
        return "Xfig";
      if (code == SPDXLicense.XFREE86_1_1)
        return "XFree86-1.1";
      if (code == SPDXLicense.XINETD)
        return "xinetd";
      if (code == SPDXLicense.XLOCK)
        return "xlock";
      if (code == SPDXLicense.XNET)
        return "Xnet";
      if (code == SPDXLicense.XPP)
        return "xpp";
      if (code == SPDXLicense.XSKAT)
        return "XSkat";
      if (code == SPDXLicense.YPL_1_0)
        return "YPL-1.0";
      if (code == SPDXLicense.YPL_1_1)
        return "YPL-1.1";
      if (code == SPDXLicense.ZED)
        return "Zed";
      if (code == SPDXLicense.ZEND_2_0)
        return "Zend-2.0";
      if (code == SPDXLicense.ZIMBRA_1_3)
        return "Zimbra-1.3";
      if (code == SPDXLicense.ZIMBRA_1_4)
        return "Zimbra-1.4";
      if (code == SPDXLicense.ZLIB)
        return "Zlib";
      if (code == SPDXLicense.ZLIB_ACKNOWLEDGEMENT)
        return "zlib-acknowledgement";
      if (code == SPDXLicense.ZPL_1_1)
        return "ZPL-1.1";
      if (code == SPDXLicense.ZPL_2_0)
        return "ZPL-2.0";
      if (code == SPDXLicense.ZPL_2_1)
        return "ZPL-2.1";
      return "?";
    }

    public String toSystem(SPDXLicense code) {
      return code.getSystem();
    }
  }

  public enum GuidePageGeneration {
    /**
     * Page is proper xhtml with no templating. Will be brought across unchanged for
     * standard post-processing.
     */
    HTML,
    /**
     * Page is markdown with templating. Will use the template to create a file that
     * imports the markdown file prior to post-processing.
     */
    MARKDOWN,
    /**
     * Page is xml with templating. Will use the template to create a file that
     * imports the source file and run the nominated XSLT transform (see parameters)
     * if present prior to post-processing.
     */
    XML,
    /**
     * Page will be generated by the publication process - no source to bring
     * across.
     */
    GENERATED,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static GuidePageGeneration fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("html".equals(codeString))
        return HTML;
      if ("markdown".equals(codeString))
        return MARKDOWN;
      if ("xml".equals(codeString))
        return XML;
      if ("generated".equals(codeString))
        return GENERATED;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown GuidePageGeneration code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case HTML:
        return "html";
      case MARKDOWN:
        return "markdown";
      case XML:
        return "xml";
      case GENERATED:
        return "generated";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case HTML:
        return "http://hl7.org/fhir/guide-page-generation";
      case MARKDOWN:
        return "http://hl7.org/fhir/guide-page-generation";
      case XML:
        return "http://hl7.org/fhir/guide-page-generation";
      case GENERATED:
        return "http://hl7.org/fhir/guide-page-generation";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case HTML:
        return "Page is proper xhtml with no templating.  Will be brought across unchanged for standard post-processing.";
      case MARKDOWN:
        return "Page is markdown with templating.  Will use the template to create a file that imports the markdown file prior to post-processing.";
      case XML:
        return "Page is xml with templating.  Will use the template to create a file that imports the source file and run the nominated XSLT transform (see parameters) if present prior to post-processing.";
      case GENERATED:
        return "Page will be generated by the publication process - no source to bring across.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case HTML:
        return "HTML";
      case MARKDOWN:
        return "Markdown";
      case XML:
        return "XML";
      case GENERATED:
        return "Generated";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class GuidePageGenerationEnumFactory implements EnumFactory<GuidePageGeneration> {
    public GuidePageGeneration fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("html".equals(codeString))
        return GuidePageGeneration.HTML;
      if ("markdown".equals(codeString))
        return GuidePageGeneration.MARKDOWN;
      if ("xml".equals(codeString))
        return GuidePageGeneration.XML;
      if ("generated".equals(codeString))
        return GuidePageGeneration.GENERATED;
      throw new IllegalArgumentException("Unknown GuidePageGeneration code '" + codeString + "'");
    }

    public Enumeration<GuidePageGeneration> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<GuidePageGeneration>(this, GuidePageGeneration.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<GuidePageGeneration>(this, GuidePageGeneration.NULL, code);
      if ("html".equals(codeString))
        return new Enumeration<GuidePageGeneration>(this, GuidePageGeneration.HTML, code);
      if ("markdown".equals(codeString))
        return new Enumeration<GuidePageGeneration>(this, GuidePageGeneration.MARKDOWN, code);
      if ("xml".equals(codeString))
        return new Enumeration<GuidePageGeneration>(this, GuidePageGeneration.XML, code);
      if ("generated".equals(codeString))
        return new Enumeration<GuidePageGeneration>(this, GuidePageGeneration.GENERATED, code);
      throw new FHIRException("Unknown GuidePageGeneration code '" + codeString + "'");
    }

    public String toCode(GuidePageGeneration code) {
      if (code == GuidePageGeneration.HTML)
        return "html";
      if (code == GuidePageGeneration.MARKDOWN)
        return "markdown";
      if (code == GuidePageGeneration.XML)
        return "xml";
      if (code == GuidePageGeneration.GENERATED)
        return "generated";
      return "?";
    }

    public String toSystem(GuidePageGeneration code) {
      return code.getSystem();
    }
  }

  public enum GuideParameterCode {
    /**
     * If the value of this string 0..* parameter is one of the metadata fields then
     * all conformance resources will have any specified [Resource].[field]
     * overwritten with the ImplementationGuide.[field], where field is one of:
     * version, date, status, publisher, contact, copyright, experimental,
     * jurisdiction, useContext.
     */
    APPLY,
    /**
     * The value of this string 0..* parameter is a subfolder of the build context's
     * location that is to be scanned to load resources. Scope is (if present) a
     * particular resource type.
     */
    PATHRESOURCE,
    /**
     * The value of this string 0..1 parameter is a subfolder of the build context's
     * location that contains files that are part of the html content processed by
     * the builder.
     */
    PATHPAGES,
    /**
     * The value of this string 0..1 parameter is a subfolder of the build context's
     * location that is used as the terminology cache. If this is not present, the
     * terminology cache is on the local system, not under version control.
     */
    PATHTXCACHE,
    /**
     * The value of this string 0..* parameter is a parameter (name=value) when
     * expanding value sets for this implementation guide. This is particularly used
     * to specify the versions of published terminologies such as SNOMED CT.
     */
    EXPANSIONPARAMETER,
    /**
     * The value of this string 0..1 parameter is either "warning" or "error"
     * (default = "error"). If the value is "warning" then IG build tools allow the
     * IG to be considered successfully build even when there is no internal broken
     * links.
     */
    RULEBROKENLINKS,
    /**
     * The value of this boolean 0..1 parameter specifies whether the IG publisher
     * creates examples in XML format. If not present, the Publication Tool decides
     * whether to generate XML.
     */
    GENERATEXML,
    /**
     * The value of this boolean 0..1 parameter specifies whether the IG publisher
     * creates examples in JSON format. If not present, the Publication Tool decides
     * whether to generate JSON.
     */
    GENERATEJSON,
    /**
     * The value of this boolean 0..1 parameter specifies whether the IG publisher
     * creates examples in Turtle format. If not present, the Publication Tool
     * decides whether to generate Turtle.
     */
    GENERATETURTLE,
    /**
     * The value of this string singleton parameter is the name of the file to use
     * as the builder template for each generated page (see templating).
     */
    HTMLTEMPLATE,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static GuideParameterCode fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("apply".equals(codeString))
        return APPLY;
      if ("path-resource".equals(codeString))
        return PATHRESOURCE;
      if ("path-pages".equals(codeString))
        return PATHPAGES;
      if ("path-tx-cache".equals(codeString))
        return PATHTXCACHE;
      if ("expansion-parameter".equals(codeString))
        return EXPANSIONPARAMETER;
      if ("rule-broken-links".equals(codeString))
        return RULEBROKENLINKS;
      if ("generate-xml".equals(codeString))
        return GENERATEXML;
      if ("generate-json".equals(codeString))
        return GENERATEJSON;
      if ("generate-turtle".equals(codeString))
        return GENERATETURTLE;
      if ("html-template".equals(codeString))
        return HTMLTEMPLATE;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown GuideParameterCode code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case APPLY:
        return "apply";
      case PATHRESOURCE:
        return "path-resource";
      case PATHPAGES:
        return "path-pages";
      case PATHTXCACHE:
        return "path-tx-cache";
      case EXPANSIONPARAMETER:
        return "expansion-parameter";
      case RULEBROKENLINKS:
        return "rule-broken-links";
      case GENERATEXML:
        return "generate-xml";
      case GENERATEJSON:
        return "generate-json";
      case GENERATETURTLE:
        return "generate-turtle";
      case HTMLTEMPLATE:
        return "html-template";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case APPLY:
        return "http://hl7.org/fhir/guide-parameter-code";
      case PATHRESOURCE:
        return "http://hl7.org/fhir/guide-parameter-code";
      case PATHPAGES:
        return "http://hl7.org/fhir/guide-parameter-code";
      case PATHTXCACHE:
        return "http://hl7.org/fhir/guide-parameter-code";
      case EXPANSIONPARAMETER:
        return "http://hl7.org/fhir/guide-parameter-code";
      case RULEBROKENLINKS:
        return "http://hl7.org/fhir/guide-parameter-code";
      case GENERATEXML:
        return "http://hl7.org/fhir/guide-parameter-code";
      case GENERATEJSON:
        return "http://hl7.org/fhir/guide-parameter-code";
      case GENERATETURTLE:
        return "http://hl7.org/fhir/guide-parameter-code";
      case HTMLTEMPLATE:
        return "http://hl7.org/fhir/guide-parameter-code";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case APPLY:
        return "If the value of this string 0..* parameter is one of the metadata fields then all conformance resources will have any specified [Resource].[field] overwritten with the ImplementationGuide.[field], where field is one of: version, date, status, publisher, contact, copyright, experimental, jurisdiction, useContext.";
      case PATHRESOURCE:
        return "The value of this string 0..* parameter is a subfolder of the build context's location that is to be scanned to load resources. Scope is (if present) a particular resource type.";
      case PATHPAGES:
        return "The value of this string 0..1 parameter is a subfolder of the build context's location that contains files that are part of the html content processed by the builder.";
      case PATHTXCACHE:
        return "The value of this string 0..1 parameter is a subfolder of the build context's location that is used as the terminology cache. If this is not present, the terminology cache is on the local system, not under version control.";
      case EXPANSIONPARAMETER:
        return "The value of this string 0..* parameter is a parameter (name=value) when expanding value sets for this implementation guide. This is particularly used to specify the versions of published terminologies such as SNOMED CT.";
      case RULEBROKENLINKS:
        return "The value of this string 0..1 parameter is either \"warning\" or \"error\" (default = \"error\"). If the value is \"warning\" then IG build tools allow the IG to be considered successfully build even when there is no internal broken links.";
      case GENERATEXML:
        return "The value of this boolean 0..1 parameter specifies whether the IG publisher creates examples in XML format. If not present, the Publication Tool decides whether to generate XML.";
      case GENERATEJSON:
        return "The value of this boolean 0..1 parameter specifies whether the IG publisher creates examples in JSON format. If not present, the Publication Tool decides whether to generate JSON.";
      case GENERATETURTLE:
        return "The value of this boolean 0..1 parameter specifies whether the IG publisher creates examples in Turtle format. If not present, the Publication Tool decides whether to generate Turtle.";
      case HTMLTEMPLATE:
        return "The value of this string singleton parameter is the name of the file to use as the builder template for each generated page (see templating).";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case APPLY:
        return "Apply Metadata Value";
      case PATHRESOURCE:
        return "Resource Path";
      case PATHPAGES:
        return "Pages Path";
      case PATHTXCACHE:
        return "Terminology Cache Path";
      case EXPANSIONPARAMETER:
        return "Expansion Profile";
      case RULEBROKENLINKS:
        return "Broken Links Rule";
      case GENERATEXML:
        return "Generate XML";
      case GENERATEJSON:
        return "Generate JSON";
      case GENERATETURTLE:
        return "Generate Turtle";
      case HTMLTEMPLATE:
        return "HTML Template";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class GuideParameterCodeEnumFactory implements EnumFactory<GuideParameterCode> {
    public GuideParameterCode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("apply".equals(codeString))
        return GuideParameterCode.APPLY;
      if ("path-resource".equals(codeString))
        return GuideParameterCode.PATHRESOURCE;
      if ("path-pages".equals(codeString))
        return GuideParameterCode.PATHPAGES;
      if ("path-tx-cache".equals(codeString))
        return GuideParameterCode.PATHTXCACHE;
      if ("expansion-parameter".equals(codeString))
        return GuideParameterCode.EXPANSIONPARAMETER;
      if ("rule-broken-links".equals(codeString))
        return GuideParameterCode.RULEBROKENLINKS;
      if ("generate-xml".equals(codeString))
        return GuideParameterCode.GENERATEXML;
      if ("generate-json".equals(codeString))
        return GuideParameterCode.GENERATEJSON;
      if ("generate-turtle".equals(codeString))
        return GuideParameterCode.GENERATETURTLE;
      if ("html-template".equals(codeString))
        return GuideParameterCode.HTMLTEMPLATE;
      throw new IllegalArgumentException("Unknown GuideParameterCode code '" + codeString + "'");
    }

    public Enumeration<GuideParameterCode> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.NULL, code);
      if ("apply".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.APPLY, code);
      if ("path-resource".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.PATHRESOURCE, code);
      if ("path-pages".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.PATHPAGES, code);
      if ("path-tx-cache".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.PATHTXCACHE, code);
      if ("expansion-parameter".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.EXPANSIONPARAMETER, code);
      if ("rule-broken-links".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.RULEBROKENLINKS, code);
      if ("generate-xml".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.GENERATEXML, code);
      if ("generate-json".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.GENERATEJSON, code);
      if ("generate-turtle".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.GENERATETURTLE, code);
      if ("html-template".equals(codeString))
        return new Enumeration<GuideParameterCode>(this, GuideParameterCode.HTMLTEMPLATE, code);
      throw new FHIRException("Unknown GuideParameterCode code '" + codeString + "'");
    }

    public String toCode(GuideParameterCode code) {
      if (code == GuideParameterCode.APPLY)
        return "apply";
      if (code == GuideParameterCode.PATHRESOURCE)
        return "path-resource";
      if (code == GuideParameterCode.PATHPAGES)
        return "path-pages";
      if (code == GuideParameterCode.PATHTXCACHE)
        return "path-tx-cache";
      if (code == GuideParameterCode.EXPANSIONPARAMETER)
        return "expansion-parameter";
      if (code == GuideParameterCode.RULEBROKENLINKS)
        return "rule-broken-links";
      if (code == GuideParameterCode.GENERATEXML)
        return "generate-xml";
      if (code == GuideParameterCode.GENERATEJSON)
        return "generate-json";
      if (code == GuideParameterCode.GENERATETURTLE)
        return "generate-turtle";
      if (code == GuideParameterCode.HTMLTEMPLATE)
        return "html-template";
      return "?";
    }

    public String toSystem(GuideParameterCode code) {
      return code.getSystem();
    }
  }

  @Block()
  public static class ImplementationGuideDependsOnComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * A canonical reference to the Implementation guide for the dependency.
     */
    @Child(name = "uri", type = { CanonicalType.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Identity of the IG that this depends on", formalDefinition = "A canonical reference to the Implementation guide for the dependency.")
    protected CanonicalType uri;

    /**
     * The NPM package name for the Implementation Guide that this IG depends on.
     */
    @Child(name = "packageId", type = { IdType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "NPM Package name for IG this depends on", formalDefinition = "The NPM package name for the Implementation Guide that this IG depends on.")
    protected IdType packageId;

    /**
     * The version of the IG that is depended on, when the correct version is
     * required to understand the IG correctly.
     */
    @Child(name = "version", type = { StringType.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Version of the IG", formalDefinition = "The version of the IG that is depended on, when the correct version is required to understand the IG correctly.")
    protected StringType version;

    private static final long serialVersionUID = -215808797L;

    /**
     * Constructor
     */
    public ImplementationGuideDependsOnComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDependsOnComponent(CanonicalType uri) {
      super();
      this.uri = uri;
    }

    /**
     * @return {@link #uri} (A canonical reference to the Implementation guide for
     *         the dependency.). This is the underlying object with id, value and
     *         extensions. The accessor "getUri" gives direct access to the value
     */
    public CanonicalType getUriElement() {
      if (this.uri == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDependsOnComponent.uri");
        else if (Configuration.doAutoCreate())
          this.uri = new CanonicalType(); // bb
      return this.uri;
    }

    public boolean hasUriElement() {
      return this.uri != null && !this.uri.isEmpty();
    }

    public boolean hasUri() {
      return this.uri != null && !this.uri.isEmpty();
    }

    /**
     * @param value {@link #uri} (A canonical reference to the Implementation guide
     *              for the dependency.). This is the underlying object with id,
     *              value and extensions. The accessor "getUri" gives direct access
     *              to the value
     */
    public ImplementationGuideDependsOnComponent setUriElement(CanonicalType value) {
      this.uri = value;
      return this;
    }

    /**
     * @return A canonical reference to the Implementation guide for the dependency.
     */
    public String getUri() {
      return this.uri == null ? null : this.uri.getValue();
    }

    /**
     * @param value A canonical reference to the Implementation guide for the
     *              dependency.
     */
    public ImplementationGuideDependsOnComponent setUri(String value) {
      if (this.uri == null)
        this.uri = new CanonicalType();
      this.uri.setValue(value);
      return this;
    }

    /**
     * @return {@link #packageId} (The NPM package name for the Implementation Guide
     *         that this IG depends on.). This is the underlying object with id,
     *         value and extensions. The accessor "getPackageId" gives direct access
     *         to the value
     */
    public IdType getPackageIdElement() {
      if (this.packageId == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDependsOnComponent.packageId");
        else if (Configuration.doAutoCreate())
          this.packageId = new IdType(); // bb
      return this.packageId;
    }

    public boolean hasPackageIdElement() {
      return this.packageId != null && !this.packageId.isEmpty();
    }

    public boolean hasPackageId() {
      return this.packageId != null && !this.packageId.isEmpty();
    }

    /**
     * @param value {@link #packageId} (The NPM package name for the Implementation
     *              Guide that this IG depends on.). This is the underlying object
     *              with id, value and extensions. The accessor "getPackageId" gives
     *              direct access to the value
     */
    public ImplementationGuideDependsOnComponent setPackageIdElement(IdType value) {
      this.packageId = value;
      return this;
    }

    /**
     * @return The NPM package name for the Implementation Guide that this IG
     *         depends on.
     */
    public String getPackageId() {
      return this.packageId == null ? null : this.packageId.getValue();
    }

    /**
     * @param value The NPM package name for the Implementation Guide that this IG
     *              depends on.
     */
    public ImplementationGuideDependsOnComponent setPackageId(String value) {
      if (Utilities.noString(value))
        this.packageId = null;
      else {
        if (this.packageId == null)
          this.packageId = new IdType();
        this.packageId.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #version} (The version of the IG that is depended on, when the
     *         correct version is required to understand the IG correctly.). This is
     *         the underlying object with id, value and extensions. The accessor
     *         "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDependsOnComponent.version");
        else if (Configuration.doAutoCreate())
          this.version = new StringType(); // bb
      return this.version;
    }

    public boolean hasVersionElement() {
      return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() {
      return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The version of the IG that is depended on,
     *              when the correct version is required to understand the IG
     *              correctly.). This is the underlying object with id, value and
     *              extensions. The accessor "getVersion" gives direct access to the
     *              value
     */
    public ImplementationGuideDependsOnComponent setVersionElement(StringType value) {
      this.version = value;
      return this;
    }

    /**
     * @return The version of the IG that is depended on, when the correct version
     *         is required to understand the IG correctly.
     */
    public String getVersion() {
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The version of the IG that is depended on, when the correct
     *              version is required to understand the IG correctly.
     */
    public ImplementationGuideDependsOnComponent setVersion(String value) {
      if (Utilities.noString(value))
        this.version = null;
      else {
        if (this.version == null)
          this.version = new StringType();
        this.version.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("uri", "canonical(ImplementationGuide)",
          "A canonical reference to the Implementation guide for the dependency.", 0, 1, uri));
      children.add(new Property("packageId", "id",
          "The NPM package name for the Implementation Guide that this IG depends on.", 0, 1, packageId));
      children.add(new Property("version", "string",
          "The version of the IG that is depended on, when the correct version is required to understand the IG correctly.",
          0, 1, version));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 116076:
        /* uri */ return new Property("uri", "canonical(ImplementationGuide)",
            "A canonical reference to the Implementation guide for the dependency.", 0, 1, uri);
      case 1802060801:
        /* packageId */ return new Property("packageId", "id",
            "The NPM package name for the Implementation Guide that this IG depends on.", 0, 1, packageId);
      case 351608024:
        /* version */ return new Property("version", "string",
            "The version of the IG that is depended on, when the correct version is required to understand the IG correctly.",
            0, 1, version);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 116076:
        /* uri */ return this.uri == null ? new Base[0] : new Base[] { this.uri }; // CanonicalType
      case 1802060801:
        /* packageId */ return this.packageId == null ? new Base[0] : new Base[] { this.packageId }; // IdType
      case 351608024:
        /* version */ return this.version == null ? new Base[0] : new Base[] { this.version }; // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 116076: // uri
        this.uri = castToCanonical(value); // CanonicalType
        return value;
      case 1802060801: // packageId
        this.packageId = castToId(value); // IdType
        return value;
      case 351608024: // version
        this.version = castToString(value); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("uri")) {
        this.uri = castToCanonical(value); // CanonicalType
      } else if (name.equals("packageId")) {
        this.packageId = castToId(value); // IdType
      } else if (name.equals("version")) {
        this.version = castToString(value); // StringType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("uri")) {
        this.uri = null;
      } else if (name.equals("packageId")) {
        this.packageId = null;
      } else if (name.equals("version")) {
        this.version = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 116076:
        return getUriElement();
      case 1802060801:
        return getPackageIdElement();
      case 351608024:
        return getVersionElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 116076:
        /* uri */ return new String[] { "canonical" };
      case 1802060801:
        /* packageId */ return new String[] { "id" };
      case 351608024:
        /* version */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("uri")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.uri");
      } else if (name.equals("packageId")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.packageId");
      } else if (name.equals("version")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.version");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDependsOnComponent copy() {
      ImplementationGuideDependsOnComponent dst = new ImplementationGuideDependsOnComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDependsOnComponent dst) {
      super.copyValues(dst);
      dst.uri = uri == null ? null : uri.copy();
      dst.packageId = packageId == null ? null : packageId.copy();
      dst.version = version == null ? null : version.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDependsOnComponent))
        return false;
      ImplementationGuideDependsOnComponent o = (ImplementationGuideDependsOnComponent) other_;
      return compareDeep(uri, o.uri, true) && compareDeep(packageId, o.packageId, true)
          && compareDeep(version, o.version, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDependsOnComponent))
        return false;
      ImplementationGuideDependsOnComponent o = (ImplementationGuideDependsOnComponent) other_;
      return compareValues(packageId, o.packageId, true) && compareValues(version, o.version, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(uri, packageId, version);
    }

    public String fhirType() {
      return "ImplementationGuide.dependsOn";

    }

  }

  @Block()
  public static class ImplementationGuideGlobalComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * The type of resource that all instances must conform to.
     */
    @Child(name = "type", type = { CodeType.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Type this profile applies to", formalDefinition = "The type of resource that all instances must conform to.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
    protected CodeType type;

    /**
     * A reference to the profile that all instances must conform to.
     */
    @Child(name = "profile", type = {
        CanonicalType.class }, order = 2, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Profile that all resources must conform to", formalDefinition = "A reference to the profile that all instances must conform to.")
    protected CanonicalType profile;

    private static final long serialVersionUID = 33894666L;

    /**
     * Constructor
     */
    public ImplementationGuideGlobalComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideGlobalComponent(CodeType type, CanonicalType profile) {
      super();
      this.type = type;
      this.profile = profile;
    }

    /**
     * @return {@link #type} (The type of resource that all instances must conform
     *         to.). This is the underlying object with id, value and extensions.
     *         The accessor "getType" gives direct access to the value
     */
    public CodeType getTypeElement() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideGlobalComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeType(); // bb
      return this.type;
    }

    public boolean hasTypeElement() {
      return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of resource that all instances must
     *              conform to.). This is the underlying object with id, value and
     *              extensions. The accessor "getType" gives direct access to the
     *              value
     */
    public ImplementationGuideGlobalComponent setTypeElement(CodeType value) {
      this.type = value;
      return this;
    }

    /**
     * @return The type of resource that all instances must conform to.
     */
    public String getType() {
      return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The type of resource that all instances must conform to.
     */
    public ImplementationGuideGlobalComponent setType(String value) {
      if (this.type == null)
        this.type = new CodeType();
      this.type.setValue(value);
      return this;
    }

    /**
     * @return {@link #profile} (A reference to the profile that all instances must
     *         conform to.). This is the underlying object with id, value and
     *         extensions. The accessor "getProfile" gives direct access to the
     *         value
     */
    public CanonicalType getProfileElement() {
      if (this.profile == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideGlobalComponent.profile");
        else if (Configuration.doAutoCreate())
          this.profile = new CanonicalType(); // bb
      return this.profile;
    }

    public boolean hasProfileElement() {
      return this.profile != null && !this.profile.isEmpty();
    }

    public boolean hasProfile() {
      return this.profile != null && !this.profile.isEmpty();
    }

    /**
     * @param value {@link #profile} (A reference to the profile that all instances
     *              must conform to.). This is the underlying object with id, value
     *              and extensions. The accessor "getProfile" gives direct access to
     *              the value
     */
    public ImplementationGuideGlobalComponent setProfileElement(CanonicalType value) {
      this.profile = value;
      return this;
    }

    /**
     * @return A reference to the profile that all instances must conform to.
     */
    public String getProfile() {
      return this.profile == null ? null : this.profile.getValue();
    }

    /**
     * @param value A reference to the profile that all instances must conform to.
     */
    public ImplementationGuideGlobalComponent setProfile(String value) {
      if (this.profile == null)
        this.profile = new CanonicalType();
      this.profile.setValue(value);
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children
          .add(new Property("type", "code", "The type of resource that all instances must conform to.", 0, 1, type));
      children.add(new Property("profile", "canonical(StructureDefinition)",
          "A reference to the profile that all instances must conform to.", 0, 1, profile));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "code", "The type of resource that all instances must conform to.", 0, 1,
            type);
      case -309425751:
        /* profile */ return new Property("profile", "canonical(StructureDefinition)",
            "A reference to the profile that all instances must conform to.", 0, 1, profile);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeType
      case -309425751:
        /* profile */ return this.profile == null ? new Base[0] : new Base[] { this.profile }; // CanonicalType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3575610: // type
        this.type = castToCode(value); // CodeType
        return value;
      case -309425751: // profile
        this.profile = castToCanonical(value); // CanonicalType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToCode(value); // CodeType
      } else if (name.equals("profile")) {
        this.profile = castToCanonical(value); // CanonicalType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("profile")) {
        this.profile = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getTypeElement();
      case -309425751:
        return getProfileElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "code" };
      case -309425751:
        /* profile */ return new String[] { "canonical" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.type");
      } else if (name.equals("profile")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.profile");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideGlobalComponent copy() {
      ImplementationGuideGlobalComponent dst = new ImplementationGuideGlobalComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideGlobalComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      dst.profile = profile == null ? null : profile.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideGlobalComponent))
        return false;
      ImplementationGuideGlobalComponent o = (ImplementationGuideGlobalComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(profile, o.profile, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideGlobalComponent))
        return false;
      ImplementationGuideGlobalComponent o = (ImplementationGuideGlobalComponent) other_;
      return compareValues(type, o.type, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, profile);
    }

    public String fhirType() {
      return "ImplementationGuide.global";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * A logical group of resources. Logical groups can be used when building pages.
     */
    @Child(name = "grouping", type = {}, order = 1, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Grouping used to present related resources in the IG", formalDefinition = "A logical group of resources. Logical groups can be used when building pages.")
    protected List<ImplementationGuideDefinitionGroupingComponent> grouping;

    /**
     * A resource that is part of the implementation guide. Conformance resources
     * (value set, structure definition, capability statements etc.) are obvious
     * candidates for inclusion, but any kind of resource can be included as an
     * example resource.
     */
    @Child(name = "resource", type = {}, order = 2, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Resource in the implementation guide", formalDefinition = "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.")
    protected List<ImplementationGuideDefinitionResourceComponent> resource;

    /**
     * A page / section in the implementation guide. The root page is the
     * implementation guide home page.
     */
    @Child(name = "page", type = {}, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Page/Section in the Guide", formalDefinition = "A page / section in the implementation guide. The root page is the implementation guide home page.")
    protected ImplementationGuideDefinitionPageComponent page;

    /**
     * Defines how IG is built by tools.
     */
    @Child(name = "parameter", type = {}, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Defines how IG is built by tools", formalDefinition = "Defines how IG is built by tools.")
    protected List<ImplementationGuideDefinitionParameterComponent> parameter;

    /**
     * A template for building resources.
     */
    @Child(name = "template", type = {}, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "A template for building resources", formalDefinition = "A template for building resources.")
    protected List<ImplementationGuideDefinitionTemplateComponent> template;

    private static final long serialVersionUID = 179051968L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionComponent() {
      super();
    }

    /**
     * @return {@link #grouping} (A logical group of resources. Logical groups can
     *         be used when building pages.)
     */
    public List<ImplementationGuideDefinitionGroupingComponent> getGrouping() {
      if (this.grouping == null)
        this.grouping = new ArrayList<ImplementationGuideDefinitionGroupingComponent>();
      return this.grouping;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionComponent setGrouping(
        List<ImplementationGuideDefinitionGroupingComponent> theGrouping) {
      this.grouping = theGrouping;
      return this;
    }

    public boolean hasGrouping() {
      if (this.grouping == null)
        return false;
      for (ImplementationGuideDefinitionGroupingComponent item : this.grouping)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImplementationGuideDefinitionGroupingComponent addGrouping() { // 3
      ImplementationGuideDefinitionGroupingComponent t = new ImplementationGuideDefinitionGroupingComponent();
      if (this.grouping == null)
        this.grouping = new ArrayList<ImplementationGuideDefinitionGroupingComponent>();
      this.grouping.add(t);
      return t;
    }

    public ImplementationGuideDefinitionComponent addGrouping(ImplementationGuideDefinitionGroupingComponent t) { // 3
      if (t == null)
        return this;
      if (this.grouping == null)
        this.grouping = new ArrayList<ImplementationGuideDefinitionGroupingComponent>();
      this.grouping.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #grouping}, creating
     *         it if it does not already exist
     */
    public ImplementationGuideDefinitionGroupingComponent getGroupingFirstRep() {
      if (getGrouping().isEmpty()) {
        addGrouping();
      }
      return getGrouping().get(0);
    }

    /**
     * @return {@link #resource} (A resource that is part of the implementation
     *         guide. Conformance resources (value set, structure definition,
     *         capability statements etc.) are obvious candidates for inclusion, but
     *         any kind of resource can be included as an example resource.)
     */
    public List<ImplementationGuideDefinitionResourceComponent> getResource() {
      if (this.resource == null)
        this.resource = new ArrayList<ImplementationGuideDefinitionResourceComponent>();
      return this.resource;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionComponent setResource(
        List<ImplementationGuideDefinitionResourceComponent> theResource) {
      this.resource = theResource;
      return this;
    }

    public boolean hasResource() {
      if (this.resource == null)
        return false;
      for (ImplementationGuideDefinitionResourceComponent item : this.resource)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImplementationGuideDefinitionResourceComponent addResource() { // 3
      ImplementationGuideDefinitionResourceComponent t = new ImplementationGuideDefinitionResourceComponent();
      if (this.resource == null)
        this.resource = new ArrayList<ImplementationGuideDefinitionResourceComponent>();
      this.resource.add(t);
      return t;
    }

    public ImplementationGuideDefinitionComponent addResource(ImplementationGuideDefinitionResourceComponent t) { // 3
      if (t == null)
        return this;
      if (this.resource == null)
        this.resource = new ArrayList<ImplementationGuideDefinitionResourceComponent>();
      this.resource.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #resource}, creating
     *         it if it does not already exist
     */
    public ImplementationGuideDefinitionResourceComponent getResourceFirstRep() {
      if (getResource().isEmpty()) {
        addResource();
      }
      return getResource().get(0);
    }

    /**
     * @return {@link #page} (A page / section in the implementation guide. The root
     *         page is the implementation guide home page.)
     */
    public ImplementationGuideDefinitionPageComponent getPage() {
      if (this.page == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionComponent.page");
        else if (Configuration.doAutoCreate())
          this.page = new ImplementationGuideDefinitionPageComponent(); // cc
      return this.page;
    }

    public boolean hasPage() {
      return this.page != null && !this.page.isEmpty();
    }

    /**
     * @param value {@link #page} (A page / section in the implementation guide. The
     *              root page is the implementation guide home page.)
     */
    public ImplementationGuideDefinitionComponent setPage(ImplementationGuideDefinitionPageComponent value) {
      this.page = value;
      return this;
    }

    /**
     * @return {@link #parameter} (Defines how IG is built by tools.)
     */
    public List<ImplementationGuideDefinitionParameterComponent> getParameter() {
      if (this.parameter == null)
        this.parameter = new ArrayList<ImplementationGuideDefinitionParameterComponent>();
      return this.parameter;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionComponent setParameter(
        List<ImplementationGuideDefinitionParameterComponent> theParameter) {
      this.parameter = theParameter;
      return this;
    }

    public boolean hasParameter() {
      if (this.parameter == null)
        return false;
      for (ImplementationGuideDefinitionParameterComponent item : this.parameter)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImplementationGuideDefinitionParameterComponent addParameter() { // 3
      ImplementationGuideDefinitionParameterComponent t = new ImplementationGuideDefinitionParameterComponent();
      if (this.parameter == null)
        this.parameter = new ArrayList<ImplementationGuideDefinitionParameterComponent>();
      this.parameter.add(t);
      return t;
    }

    public ImplementationGuideDefinitionComponent addParameter(ImplementationGuideDefinitionParameterComponent t) { // 3
      if (t == null)
        return this;
      if (this.parameter == null)
        this.parameter = new ArrayList<ImplementationGuideDefinitionParameterComponent>();
      this.parameter.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #parameter}, creating
     *         it if it does not already exist
     */
    public ImplementationGuideDefinitionParameterComponent getParameterFirstRep() {
      if (getParameter().isEmpty()) {
        addParameter();
      }
      return getParameter().get(0);
    }

    /**
     * @return {@link #template} (A template for building resources.)
     */
    public List<ImplementationGuideDefinitionTemplateComponent> getTemplate() {
      if (this.template == null)
        this.template = new ArrayList<ImplementationGuideDefinitionTemplateComponent>();
      return this.template;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionComponent setTemplate(
        List<ImplementationGuideDefinitionTemplateComponent> theTemplate) {
      this.template = theTemplate;
      return this;
    }

    public boolean hasTemplate() {
      if (this.template == null)
        return false;
      for (ImplementationGuideDefinitionTemplateComponent item : this.template)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImplementationGuideDefinitionTemplateComponent addTemplate() { // 3
      ImplementationGuideDefinitionTemplateComponent t = new ImplementationGuideDefinitionTemplateComponent();
      if (this.template == null)
        this.template = new ArrayList<ImplementationGuideDefinitionTemplateComponent>();
      this.template.add(t);
      return t;
    }

    public ImplementationGuideDefinitionComponent addTemplate(ImplementationGuideDefinitionTemplateComponent t) { // 3
      if (t == null)
        return this;
      if (this.template == null)
        this.template = new ArrayList<ImplementationGuideDefinitionTemplateComponent>();
      this.template.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #template}, creating
     *         it if it does not already exist
     */
    public ImplementationGuideDefinitionTemplateComponent getTemplateFirstRep() {
      if (getTemplate().isEmpty()) {
        addTemplate();
      }
      return getTemplate().get(0);
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(
          new Property("grouping", "", "A logical group of resources. Logical groups can be used when building pages.",
              0, java.lang.Integer.MAX_VALUE, grouping));
      children.add(new Property("resource", "",
          "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.",
          0, java.lang.Integer.MAX_VALUE, resource));
      children.add(new Property("page", "",
          "A page / section in the implementation guide. The root page is the implementation guide home page.", 0, 1,
          page));
      children.add(new Property("parameter", "", "Defines how IG is built by tools.", 0, java.lang.Integer.MAX_VALUE,
          parameter));
      children.add(
          new Property("template", "", "A template for building resources.", 0, java.lang.Integer.MAX_VALUE, template));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 506371331:
        /* grouping */ return new Property("grouping", "",
            "A logical group of resources. Logical groups can be used when building pages.", 0,
            java.lang.Integer.MAX_VALUE, grouping);
      case -341064690:
        /* resource */ return new Property("resource", "",
            "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.",
            0, java.lang.Integer.MAX_VALUE, resource);
      case 3433103:
        /* page */ return new Property("page", "",
            "A page / section in the implementation guide. The root page is the implementation guide home page.", 0, 1,
            page);
      case 1954460585:
        /* parameter */ return new Property("parameter", "", "Defines how IG is built by tools.", 0,
            java.lang.Integer.MAX_VALUE, parameter);
      case -1321546630:
        /* template */ return new Property("template", "", "A template for building resources.", 0,
            java.lang.Integer.MAX_VALUE, template);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 506371331:
        /* grouping */ return this.grouping == null ? new Base[0]
            : this.grouping.toArray(new Base[this.grouping.size()]); // ImplementationGuideDefinitionGroupingComponent
      case -341064690:
        /* resource */ return this.resource == null ? new Base[0]
            : this.resource.toArray(new Base[this.resource.size()]); // ImplementationGuideDefinitionResourceComponent
      case 3433103:
        /* page */ return this.page == null ? new Base[0] : new Base[] { this.page }; // ImplementationGuideDefinitionPageComponent
      case 1954460585:
        /* parameter */ return this.parameter == null ? new Base[0]
            : this.parameter.toArray(new Base[this.parameter.size()]); // ImplementationGuideDefinitionParameterComponent
      case -1321546630:
        /* template */ return this.template == null ? new Base[0]
            : this.template.toArray(new Base[this.template.size()]); // ImplementationGuideDefinitionTemplateComponent
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 506371331: // grouping
        this.getGrouping().add((ImplementationGuideDefinitionGroupingComponent) value); // ImplementationGuideDefinitionGroupingComponent
        return value;
      case -341064690: // resource
        this.getResource().add((ImplementationGuideDefinitionResourceComponent) value); // ImplementationGuideDefinitionResourceComponent
        return value;
      case 3433103: // page
        this.page = (ImplementationGuideDefinitionPageComponent) value; // ImplementationGuideDefinitionPageComponent
        return value;
      case 1954460585: // parameter
        this.getParameter().add((ImplementationGuideDefinitionParameterComponent) value); // ImplementationGuideDefinitionParameterComponent
        return value;
      case -1321546630: // template
        this.getTemplate().add((ImplementationGuideDefinitionTemplateComponent) value); // ImplementationGuideDefinitionTemplateComponent
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("grouping")) {
        this.getGrouping().add((ImplementationGuideDefinitionGroupingComponent) value);
      } else if (name.equals("resource")) {
        this.getResource().add((ImplementationGuideDefinitionResourceComponent) value);
      } else if (name.equals("page")) {
        this.page = (ImplementationGuideDefinitionPageComponent) value; // ImplementationGuideDefinitionPageComponent
      } else if (name.equals("parameter")) {
        this.getParameter().add((ImplementationGuideDefinitionParameterComponent) value);
      } else if (name.equals("template")) {
        this.getTemplate().add((ImplementationGuideDefinitionTemplateComponent) value);
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("grouping")) {
        this.getGrouping().remove((ImplementationGuideDefinitionGroupingComponent) value);
      } else if (name.equals("resource")) {
        this.getResource().remove((ImplementationGuideDefinitionResourceComponent) value);
      } else if (name.equals("page")) {
        this.page = (ImplementationGuideDefinitionPageComponent) value; // ImplementationGuideDefinitionPageComponent
      } else if (name.equals("parameter")) {
        this.getParameter().remove((ImplementationGuideDefinitionParameterComponent) value);
      } else if (name.equals("template")) {
        this.getTemplate().remove((ImplementationGuideDefinitionTemplateComponent) value);
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 506371331:
        return addGrouping();
      case -341064690:
        return addResource();
      case 3433103:
        return getPage();
      case 1954460585:
        return addParameter();
      case -1321546630:
        return addTemplate();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 506371331:
        /* grouping */ return new String[] {};
      case -341064690:
        /* resource */ return new String[] {};
      case 3433103:
        /* page */ return new String[] {};
      case 1954460585:
        /* parameter */ return new String[] {};
      case -1321546630:
        /* template */ return new String[] {};
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("grouping")) {
        return addGrouping();
      } else if (name.equals("resource")) {
        return addResource();
      } else if (name.equals("page")) {
        this.page = new ImplementationGuideDefinitionPageComponent();
        return this.page;
      } else if (name.equals("parameter")) {
        return addParameter();
      } else if (name.equals("template")) {
        return addTemplate();
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionComponent copy() {
      ImplementationGuideDefinitionComponent dst = new ImplementationGuideDefinitionComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionComponent dst) {
      super.copyValues(dst);
      if (grouping != null) {
        dst.grouping = new ArrayList<ImplementationGuideDefinitionGroupingComponent>();
        for (ImplementationGuideDefinitionGroupingComponent i : grouping)
          dst.grouping.add(i.copy());
      }
      ;
      if (resource != null) {
        dst.resource = new ArrayList<ImplementationGuideDefinitionResourceComponent>();
        for (ImplementationGuideDefinitionResourceComponent i : resource)
          dst.resource.add(i.copy());
      }
      ;
      dst.page = page == null ? null : page.copy();
      if (parameter != null) {
        dst.parameter = new ArrayList<ImplementationGuideDefinitionParameterComponent>();
        for (ImplementationGuideDefinitionParameterComponent i : parameter)
          dst.parameter.add(i.copy());
      }
      ;
      if (template != null) {
        dst.template = new ArrayList<ImplementationGuideDefinitionTemplateComponent>();
        for (ImplementationGuideDefinitionTemplateComponent i : template)
          dst.template.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionComponent))
        return false;
      ImplementationGuideDefinitionComponent o = (ImplementationGuideDefinitionComponent) other_;
      return compareDeep(grouping, o.grouping, true) && compareDeep(resource, o.resource, true)
          && compareDeep(page, o.page, true) && compareDeep(parameter, o.parameter, true)
          && compareDeep(template, o.template, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionComponent))
        return false;
      ImplementationGuideDefinitionComponent o = (ImplementationGuideDefinitionComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(grouping, resource, page, parameter, template);
    }

    public String fhirType() {
      return "ImplementationGuide.definition";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionGroupingComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * The human-readable title to display for the package of resources when
     * rendering the implementation guide.
     */
    @Child(name = "name", type = { StringType.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Descriptive name for the package", formalDefinition = "The human-readable title to display for the package of resources when rendering the implementation guide.")
    protected StringType name;

    /**
     * Human readable text describing the package.
     */
    @Child(name = "description", type = {
        StringType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Human readable text describing the package", formalDefinition = "Human readable text describing the package.")
    protected StringType description;

    private static final long serialVersionUID = -1105523499L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionGroupingComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionGroupingComponent(StringType name) {
      super();
      this.name = name;
    }

    /**
     * @return {@link #name} (The human-readable title to display for the package of
     *         resources when rendering the implementation guide.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getName" gives direct access to the value
     */
    public StringType getNameElement() {
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionGroupingComponent.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() {
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (The human-readable title to display for the
     *              package of resources when rendering the implementation guide.).
     *              This is the underlying object with id, value and extensions. The
     *              accessor "getName" gives direct access to the value
     */
    public ImplementationGuideDefinitionGroupingComponent setNameElement(StringType value) {
      this.name = value;
      return this;
    }

    /**
     * @return The human-readable title to display for the package of resources when
     *         rendering the implementation guide.
     */
    public String getName() {
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The human-readable title to display for the package of resources
     *              when rendering the implementation guide.
     */
    public ImplementationGuideDefinitionGroupingComponent setName(String value) {
      if (this.name == null)
        this.name = new StringType();
      this.name.setValue(value);
      return this;
    }

    /**
     * @return {@link #description} (Human readable text describing the package.).
     *         This is the underlying object with id, value and extensions. The
     *         accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionGroupingComponent.description");
        else if (Configuration.doAutoCreate())
          this.description = new StringType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() {
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Human readable text describing the
     *              package.). This is the underlying object with id, value and
     *              extensions. The accessor "getDescription" gives direct access to
     *              the value
     */
    public ImplementationGuideDefinitionGroupingComponent setDescriptionElement(StringType value) {
      this.description = value;
      return this;
    }

    /**
     * @return Human readable text describing the package.
     */
    public String getDescription() {
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Human readable text describing the package.
     */
    public ImplementationGuideDefinitionGroupingComponent setDescription(String value) {
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new StringType();
        this.description.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("name", "string",
          "The human-readable title to display for the package of resources when rendering the implementation guide.",
          0, 1, name));
      children
          .add(new Property("description", "string", "Human readable text describing the package.", 0, 1, description));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3373707:
        /* name */ return new Property("name", "string",
            "The human-readable title to display for the package of resources when rendering the implementation guide.",
            0, 1, name);
      case -1724546052:
        /* description */ return new Property("description", "string", "Human readable text describing the package.", 0,
            1, description);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
      case -1724546052:
        /* description */ return this.description == null ? new Base[0] : new Base[] { this.description }; // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3373707: // name
        this.name = castToString(value); // StringType
        return value;
      case -1724546052: // description
        this.description = castToString(value); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("name")) {
        this.name = castToString(value); // StringType
      } else if (name.equals("description")) {
        this.description = castToString(value); // StringType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("name")) {
        this.name = null;
      } else if (name.equals("description")) {
        this.description = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3373707:
        return getNameElement();
      case -1724546052:
        return getDescriptionElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return new String[] { "string" };
      case -1724546052:
        /* description */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("name")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.name");
      } else if (name.equals("description")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.description");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionGroupingComponent copy() {
      ImplementationGuideDefinitionGroupingComponent dst = new ImplementationGuideDefinitionGroupingComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionGroupingComponent dst) {
      super.copyValues(dst);
      dst.name = name == null ? null : name.copy();
      dst.description = description == null ? null : description.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionGroupingComponent))
        return false;
      ImplementationGuideDefinitionGroupingComponent o = (ImplementationGuideDefinitionGroupingComponent) other_;
      return compareDeep(name, o.name, true) && compareDeep(description, o.description, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionGroupingComponent))
        return false;
      ImplementationGuideDefinitionGroupingComponent o = (ImplementationGuideDefinitionGroupingComponent) other_;
      return compareValues(name, o.name, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, description);
    }

    public String fhirType() {
      return "ImplementationGuide.definition.grouping";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionResourceComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * Where this resource is found.
     */
    @Child(name = "reference", type = {
        Reference.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Location of the resource", formalDefinition = "Where this resource is found.")
    protected Reference reference;

    /**
     * The actual object that is the target of the reference (Where this resource is
     * found.)
     */
    protected Resource referenceTarget;

    /**
     * Indicates the FHIR Version(s) this artifact is intended to apply to. If no
     * versions are specified, the resource is assumed to apply to all the versions
     * stated in ImplementationGuide.fhirVersion.
     */
    @Child(name = "fhirVersion", type = {
        CodeType.class }, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Versions this applies to (if different to IG)", formalDefinition = "Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/FHIR-version")
    protected List<Enumeration<FHIRVersion>> fhirVersion;

    /**
     * A human assigned name for the resource. All resources SHOULD have a name, but
     * the name may be extracted from the resource (e.g. ValueSet.name).
     */
    @Child(name = "name", type = { StringType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Human Name for the resource", formalDefinition = "A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).")
    protected StringType name;

    /**
     * A description of the reason that a resource has been included in the
     * implementation guide.
     */
    @Child(name = "description", type = {
        StringType.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Reason why included in guide", formalDefinition = "A description of the reason that a resource has been included in the implementation guide.")
    protected StringType description;

    /**
     * If true or a reference, indicates the resource is an example instance. If a
     * reference is present, indicates that the example is an example of the
     * specified profile.
     */
    @Child(name = "example", type = { BooleanType.class,
        CanonicalType.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Is an example/What is this an example of?", formalDefinition = "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.")
    protected Type example;

    /**
     * Reference to the id of the grouping this resource appears in.
     */
    @Child(name = "groupingId", type = { IdType.class }, order = 6, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Grouping this is part of", formalDefinition = "Reference to the id of the grouping this resource appears in.")
    protected IdType groupingId;

    private static final long serialVersionUID = 1840689093L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionResourceComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionResourceComponent(Reference reference) {
      super();
      this.reference = reference;
    }

    /**
     * @return {@link #reference} (Where this resource is found.)
     */
    public Reference getReference() {
      if (this.reference == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionResourceComponent.reference");
        else if (Configuration.doAutoCreate())
          this.reference = new Reference(); // cc
      return this.reference;
    }

    public boolean hasReference() {
      return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (Where this resource is found.)
     */
    public ImplementationGuideDefinitionResourceComponent setReference(Reference value) {
      this.reference = value;
      return this;
    }

    /**
     * @return {@link #reference} The actual object that is the target of the
     *         reference. The reference library doesn't populate this, but you can
     *         use it to hold the resource if you resolve it. (Where this resource
     *         is found.)
     */
    public Resource getReferenceTarget() {
      return this.referenceTarget;
    }

    /**
     * @param value {@link #reference} The actual object that is the target of the
     *              reference. The reference library doesn't use these, but you can
     *              use it to hold the resource if you resolve it. (Where this
     *              resource is found.)
     */
    public ImplementationGuideDefinitionResourceComponent setReferenceTarget(Resource value) {
      this.referenceTarget = value;
      return this;
    }

    /**
     * @return {@link #fhirVersion} (Indicates the FHIR Version(s) this artifact is
     *         intended to apply to. If no versions are specified, the resource is
     *         assumed to apply to all the versions stated in
     *         ImplementationGuide.fhirVersion.)
     */
    public List<Enumeration<FHIRVersion>> getFhirVersion() {
      if (this.fhirVersion == null)
        this.fhirVersion = new ArrayList<Enumeration<FHIRVersion>>();
      return this.fhirVersion;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionResourceComponent setFhirVersion(
        List<Enumeration<FHIRVersion>> theFhirVersion) {
      this.fhirVersion = theFhirVersion;
      return this;
    }

    public boolean hasFhirVersion() {
      if (this.fhirVersion == null)
        return false;
      for (Enumeration<FHIRVersion> item : this.fhirVersion)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #fhirVersion} (Indicates the FHIR Version(s) this artifact is
     *         intended to apply to. If no versions are specified, the resource is
     *         assumed to apply to all the versions stated in
     *         ImplementationGuide.fhirVersion.)
     */
    public Enumeration<FHIRVersion> addFhirVersionElement() {// 2
      Enumeration<FHIRVersion> t = new Enumeration<FHIRVersion>(new FHIRVersionEnumFactory());
      if (this.fhirVersion == null)
        this.fhirVersion = new ArrayList<Enumeration<FHIRVersion>>();
      this.fhirVersion.add(t);
      return t;
    }

    /**
     * @param value {@link #fhirVersion} (Indicates the FHIR Version(s) this
     *              artifact is intended to apply to. If no versions are specified,
     *              the resource is assumed to apply to all the versions stated in
     *              ImplementationGuide.fhirVersion.)
     */
    public ImplementationGuideDefinitionResourceComponent addFhirVersion(FHIRVersion value) { // 1
      Enumeration<FHIRVersion> t = new Enumeration<FHIRVersion>(new FHIRVersionEnumFactory());
      t.setValue(value);
      if (this.fhirVersion == null)
        this.fhirVersion = new ArrayList<Enumeration<FHIRVersion>>();
      this.fhirVersion.add(t);
      return this;
    }

    /**
     * @param value {@link #fhirVersion} (Indicates the FHIR Version(s) this
     *              artifact is intended to apply to. If no versions are specified,
     *              the resource is assumed to apply to all the versions stated in
     *              ImplementationGuide.fhirVersion.)
     */
    public boolean hasFhirVersion(FHIRVersion value) {
      if (this.fhirVersion == null)
        return false;
      for (Enumeration<FHIRVersion> v : this.fhirVersion)
        if (v.getValue().equals(value)) // code
          return true;
      return false;
    }

    /**
     * @return {@link #name} (A human assigned name for the resource. All resources
     *         SHOULD have a name, but the name may be extracted from the resource
     *         (e.g. ValueSet.name).). This is the underlying object with id, value
     *         and extensions. The accessor "getName" gives direct access to the
     *         value
     */
    public StringType getNameElement() {
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionResourceComponent.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() {
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A human assigned name for the resource. All
     *              resources SHOULD have a name, but the name may be extracted from
     *              the resource (e.g. ValueSet.name).). This is the underlying
     *              object with id, value and extensions. The accessor "getName"
     *              gives direct access to the value
     */
    public ImplementationGuideDefinitionResourceComponent setNameElement(StringType value) {
      this.name = value;
      return this;
    }

    /**
     * @return A human assigned name for the resource. All resources SHOULD have a
     *         name, but the name may be extracted from the resource (e.g.
     *         ValueSet.name).
     */
    public String getName() {
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A human assigned name for the resource. All resources SHOULD
     *              have a name, but the name may be extracted from the resource
     *              (e.g. ValueSet.name).
     */
    public ImplementationGuideDefinitionResourceComponent setName(String value) {
      if (Utilities.noString(value))
        this.name = null;
      else {
        if (this.name == null)
          this.name = new StringType();
        this.name.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #description} (A description of the reason that a resource has
     *         been included in the implementation guide.). This is the underlying
     *         object with id, value and extensions. The accessor "getDescription"
     *         gives direct access to the value
     */
    public StringType getDescriptionElement() {
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionResourceComponent.description");
        else if (Configuration.doAutoCreate())
          this.description = new StringType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() {
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A description of the reason that a
     *              resource has been included in the implementation guide.). This
     *              is the underlying object with id, value and extensions. The
     *              accessor "getDescription" gives direct access to the value
     */
    public ImplementationGuideDefinitionResourceComponent setDescriptionElement(StringType value) {
      this.description = value;
      return this;
    }

    /**
     * @return A description of the reason that a resource has been included in the
     *         implementation guide.
     */
    public String getDescription() {
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A description of the reason that a resource has been included in
     *              the implementation guide.
     */
    public ImplementationGuideDefinitionResourceComponent setDescription(String value) {
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new StringType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public Type getExample() {
      return this.example;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public BooleanType getExampleBooleanType() throws FHIRException {
      if (this.example == null)
        this.example = new BooleanType();
      if (!(this.example instanceof BooleanType))
        throw new FHIRException("Type mismatch: the type BooleanType was expected, but "
            + this.example.getClass().getName() + " was encountered");
      return (BooleanType) this.example;
    }

    public boolean hasExampleBooleanType() {
      return this != null && this.example instanceof BooleanType;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public CanonicalType getExampleCanonicalType() throws FHIRException {
      if (this.example == null)
        this.example = new CanonicalType();
      if (!(this.example instanceof CanonicalType))
        throw new FHIRException("Type mismatch: the type CanonicalType was expected, but "
            + this.example.getClass().getName() + " was encountered");
      return (CanonicalType) this.example;
    }

    public boolean hasExampleCanonicalType() {
      return this != null && this.example instanceof CanonicalType;
    }

    public boolean hasExample() {
      return this.example != null && !this.example.isEmpty();
    }

    /**
     * @param value {@link #example} (If true or a reference, indicates the resource
     *              is an example instance. If a reference is present, indicates
     *              that the example is an example of the specified profile.)
     */
    public ImplementationGuideDefinitionResourceComponent setExample(Type value) {
      if (value != null && !(value instanceof BooleanType || value instanceof CanonicalType))
        throw new Error(
            "Not the right type for ImplementationGuide.definition.resource.example[x]: " + value.fhirType());
      this.example = value;
      return this;
    }

    /**
     * @return {@link #groupingId} (Reference to the id of the grouping this
     *         resource appears in.). This is the underlying object with id, value
     *         and extensions. The accessor "getGroupingId" gives direct access to
     *         the value
     */
    public IdType getGroupingIdElement() {
      if (this.groupingId == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionResourceComponent.groupingId");
        else if (Configuration.doAutoCreate())
          this.groupingId = new IdType(); // bb
      return this.groupingId;
    }

    public boolean hasGroupingIdElement() {
      return this.groupingId != null && !this.groupingId.isEmpty();
    }

    public boolean hasGroupingId() {
      return this.groupingId != null && !this.groupingId.isEmpty();
    }

    /**
     * @param value {@link #groupingId} (Reference to the id of the grouping this
     *              resource appears in.). This is the underlying object with id,
     *              value and extensions. The accessor "getGroupingId" gives direct
     *              access to the value
     */
    public ImplementationGuideDefinitionResourceComponent setGroupingIdElement(IdType value) {
      this.groupingId = value;
      return this;
    }

    /**
     * @return Reference to the id of the grouping this resource appears in.
     */
    public String getGroupingId() {
      return this.groupingId == null ? null : this.groupingId.getValue();
    }

    /**
     * @param value Reference to the id of the grouping this resource appears in.
     */
    public ImplementationGuideDefinitionResourceComponent setGroupingId(String value) {
      if (Utilities.noString(value))
        this.groupingId = null;
      else {
        if (this.groupingId == null)
          this.groupingId = new IdType();
        this.groupingId.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("reference", "Reference(Any)", "Where this resource is found.", 0, 1, reference));
      children.add(new Property("fhirVersion", "code",
          "Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.",
          0, java.lang.Integer.MAX_VALUE, fhirVersion));
      children.add(new Property("name", "string",
          "A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).",
          0, 1, name));
      children.add(new Property("description", "string",
          "A description of the reason that a resource has been included in the implementation guide.", 0, 1,
          description));
      children.add(new Property("example[x]", "boolean|canonical(StructureDefinition)",
          "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
          0, 1, example));
      children.add(new Property("groupingId", "id", "Reference to the id of the grouping this resource appears in.", 0,
          1, groupingId));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -925155509:
        /* reference */ return new Property("reference", "Reference(Any)", "Where this resource is found.", 0, 1,
            reference);
      case 461006061:
        /* fhirVersion */ return new Property("fhirVersion", "code",
            "Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.",
            0, java.lang.Integer.MAX_VALUE, fhirVersion);
      case 3373707:
        /* name */ return new Property("name", "string",
            "A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).",
            0, 1, name);
      case -1724546052:
        /* description */ return new Property("description", "string",
            "A description of the reason that a resource has been included in the implementation guide.", 0, 1,
            description);
      case -2002328874:
        /* example[x] */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case -1322970774:
        /* example */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case 159803230:
        /* exampleBoolean */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case 2016979626:
        /* exampleCanonical */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case 1291547006:
        /* groupingId */ return new Property("groupingId", "id",
            "Reference to the id of the grouping this resource appears in.", 0, 1, groupingId);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case -925155509:
        /* reference */ return this.reference == null ? new Base[0] : new Base[] { this.reference }; // Reference
      case 461006061:
        /* fhirVersion */ return this.fhirVersion == null ? new Base[0]
            : this.fhirVersion.toArray(new Base[this.fhirVersion.size()]); // Enumeration<FHIRVersion>
      case 3373707:
        /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
      case -1724546052:
        /* description */ return this.description == null ? new Base[0] : new Base[] { this.description }; // StringType
      case -1322970774:
        /* example */ return this.example == null ? new Base[0] : new Base[] { this.example }; // Type
      case 1291547006:
        /* groupingId */ return this.groupingId == null ? new Base[0] : new Base[] { this.groupingId }; // IdType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case -925155509: // reference
        this.reference = castToReference(value); // Reference
        return value;
      case 461006061: // fhirVersion
        value = new FHIRVersionEnumFactory().fromType(castToCode(value));
        this.getFhirVersion().add((Enumeration) value); // Enumeration<FHIRVersion>
        return value;
      case 3373707: // name
        this.name = castToString(value); // StringType
        return value;
      case -1724546052: // description
        this.description = castToString(value); // StringType
        return value;
      case -1322970774: // example
        this.example = castToType(value); // Type
        return value;
      case 1291547006: // groupingId
        this.groupingId = castToId(value); // IdType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = castToReference(value); // Reference
      } else if (name.equals("fhirVersion")) {
        value = new FHIRVersionEnumFactory().fromType(castToCode(value));
        this.getFhirVersion().add((Enumeration) value);
      } else if (name.equals("name")) {
        this.name = castToString(value); // StringType
      } else if (name.equals("description")) {
        this.description = castToString(value); // StringType
      } else if (name.equals("example[x]")) {
        this.example = castToType(value); // Type
      } else if (name.equals("groupingId")) {
        this.groupingId = castToId(value); // IdType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = null;
      } else if (name.equals("fhirVersion")) {
        this.getFhirVersion().remove((Enumeration) value);
      } else if (name.equals("name")) {
        this.name = null;
      } else if (name.equals("description")) {
        this.description = null;
      } else if (name.equals("example[x]")) {
        this.example = null;
      } else if (name.equals("groupingId")) {
        this.groupingId = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -925155509:
        return getReference();
      case 461006061:
        return addFhirVersionElement();
      case 3373707:
        return getNameElement();
      case -1724546052:
        return getDescriptionElement();
      case -2002328874:
        return getExample();
      case -1322970774:
        return getExample();
      case 1291547006:
        return getGroupingIdElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -925155509:
        /* reference */ return new String[] { "Reference" };
      case 461006061:
        /* fhirVersion */ return new String[] { "code" };
      case 3373707:
        /* name */ return new String[] { "string" };
      case -1724546052:
        /* description */ return new String[] { "string" };
      case -1322970774:
        /* example */ return new String[] { "boolean", "canonical" };
      case 1291547006:
        /* groupingId */ return new String[] { "id" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = new Reference();
        return this.reference;
      } else if (name.equals("fhirVersion")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.fhirVersion");
      } else if (name.equals("name")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.name");
      } else if (name.equals("description")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.description");
      } else if (name.equals("exampleBoolean")) {
        this.example = new BooleanType();
        return this.example;
      } else if (name.equals("exampleCanonical")) {
        this.example = new CanonicalType();
        return this.example;
      } else if (name.equals("groupingId")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.groupingId");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionResourceComponent copy() {
      ImplementationGuideDefinitionResourceComponent dst = new ImplementationGuideDefinitionResourceComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionResourceComponent dst) {
      super.copyValues(dst);
      dst.reference = reference == null ? null : reference.copy();
      if (fhirVersion != null) {
        dst.fhirVersion = new ArrayList<Enumeration<FHIRVersion>>();
        for (Enumeration<FHIRVersion> i : fhirVersion)
          dst.fhirVersion.add(i.copy());
      }
      ;
      dst.name = name == null ? null : name.copy();
      dst.description = description == null ? null : description.copy();
      dst.example = example == null ? null : example.copy();
      dst.groupingId = groupingId == null ? null : groupingId.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionResourceComponent))
        return false;
      ImplementationGuideDefinitionResourceComponent o = (ImplementationGuideDefinitionResourceComponent) other_;
      return compareDeep(reference, o.reference, true) && compareDeep(fhirVersion, o.fhirVersion, true)
          && compareDeep(name, o.name, true) && compareDeep(description, o.description, true)
          && compareDeep(example, o.example, true) && compareDeep(groupingId, o.groupingId, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionResourceComponent))
        return false;
      ImplementationGuideDefinitionResourceComponent o = (ImplementationGuideDefinitionResourceComponent) other_;
      return compareValues(fhirVersion, o.fhirVersion, true) && compareValues(name, o.name, true)
          && compareValues(description, o.description, true) && compareValues(groupingId, o.groupingId, true);
    }

    public boolean isEmpty() {
      return super.isEmpty()
          && ca.uhn.fhir.util.ElementUtil.isEmpty(reference, fhirVersion, name, description, example, groupingId);
    }

    public String fhirType() {
      return "ImplementationGuide.definition.resource";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionPageComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * The source address for the page.
     */
    @Child(name = "name", type = { UrlType.class,
        Binary.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Where to find that page", formalDefinition = "The source address for the page.")
    protected Type name;

    /**
     * A short title used to represent this page in navigational structures such as
     * table of contents, bread crumbs, etc.
     */
    @Child(name = "title", type = { StringType.class }, order = 2, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Short title shown for navigational assistance", formalDefinition = "A short title used to represent this page in navigational structures such as table of contents, bread crumbs, etc.")
    protected StringType title;

    /**
     * A code that indicates how the page is generated.
     */
    @Child(name = "generation", type = {
        CodeType.class }, order = 3, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "html | markdown | xml | generated", formalDefinition = "A code that indicates how the page is generated.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/guide-page-generation")
    protected Enumeration<GuidePageGeneration> generation;

    /**
     * Nested Pages/Sections under this page.
     */
    @Child(name = "page", type = {
        ImplementationGuideDefinitionPageComponent.class }, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Nested Pages / Sections", formalDefinition = "Nested Pages/Sections under this page.")
    protected List<ImplementationGuideDefinitionPageComponent> page;

    private static final long serialVersionUID = -365655658L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionPageComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionPageComponent(Type name, StringType title,
        Enumeration<GuidePageGeneration> generation) {
      super();
      this.name = name;
      this.title = title;
      this.generation = generation;
    }

    /**
     * @return {@link #name} (The source address for the page.)
     */
    public Type getName() {
      return this.name;
    }

    /**
     * @return {@link #name} (The source address for the page.)
     */
    public UrlType getNameUrlType() throws FHIRException {
      if (this.name == null)
        this.name = new UrlType();
      if (!(this.name instanceof UrlType))
        throw new FHIRException(
            "Type mismatch: the type UrlType was expected, but " + this.name.getClass().getName() + " was encountered");
      return (UrlType) this.name;
    }

    public boolean hasNameUrlType() {
      return this != null && this.name instanceof UrlType;
    }

    /**
     * @return {@link #name} (The source address for the page.)
     */
    public Reference getNameReference() throws FHIRException {
      if (this.name == null)
        this.name = new Reference();
      if (!(this.name instanceof Reference))
        throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.name.getClass().getName()
            + " was encountered");
      return (Reference) this.name;
    }

    public boolean hasNameReference() {
      return this != null && this.name instanceof Reference;
    }

    public boolean hasName() {
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (The source address for the page.)
     */
    public ImplementationGuideDefinitionPageComponent setName(Type value) {
      if (value != null && !(value instanceof UrlType || value instanceof Reference))
        throw new Error("Not the right type for ImplementationGuide.definition.page.name[x]: " + value.fhirType());
      this.name = value;
      return this;
    }

    /**
     * @return {@link #title} (A short title used to represent this page in
     *         navigational structures such as table of contents, bread crumbs,
     *         etc.). This is the underlying object with id, value and extensions.
     *         The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() {
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionPageComponent.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() {
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() {
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (A short title used to represent this page in
     *              navigational structures such as table of contents, bread crumbs,
     *              etc.). This is the underlying object with id, value and
     *              extensions. The accessor "getTitle" gives direct access to the
     *              value
     */
    public ImplementationGuideDefinitionPageComponent setTitleElement(StringType value) {
      this.title = value;
      return this;
    }

    /**
     * @return A short title used to represent this page in navigational structures
     *         such as table of contents, bread crumbs, etc.
     */
    public String getTitle() {
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value A short title used to represent this page in navigational
     *              structures such as table of contents, bread crumbs, etc.
     */
    public ImplementationGuideDefinitionPageComponent setTitle(String value) {
      if (this.title == null)
        this.title = new StringType();
      this.title.setValue(value);
      return this;
    }

    /**
     * @return {@link #generation} (A code that indicates how the page is
     *         generated.). This is the underlying object with id, value and
     *         extensions. The accessor "getGeneration" gives direct access to the
     *         value
     */
    public Enumeration<GuidePageGeneration> getGenerationElement() {
      if (this.generation == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionPageComponent.generation");
        else if (Configuration.doAutoCreate())
          this.generation = new Enumeration<GuidePageGeneration>(new GuidePageGenerationEnumFactory()); // bb
      return this.generation;
    }

    public boolean hasGenerationElement() {
      return this.generation != null && !this.generation.isEmpty();
    }

    public boolean hasGeneration() {
      return this.generation != null && !this.generation.isEmpty();
    }

    /**
     * @param value {@link #generation} (A code that indicates how the page is
     *              generated.). This is the underlying object with id, value and
     *              extensions. The accessor "getGeneration" gives direct access to
     *              the value
     */
    public ImplementationGuideDefinitionPageComponent setGenerationElement(Enumeration<GuidePageGeneration> value) {
      this.generation = value;
      return this;
    }

    /**
     * @return A code that indicates how the page is generated.
     */
    public GuidePageGeneration getGeneration() {
      return this.generation == null ? null : this.generation.getValue();
    }

    /**
     * @param value A code that indicates how the page is generated.
     */
    public ImplementationGuideDefinitionPageComponent setGeneration(GuidePageGeneration value) {
      if (this.generation == null)
        this.generation = new Enumeration<GuidePageGeneration>(new GuidePageGenerationEnumFactory());
      this.generation.setValue(value);
      return this;
    }

    /**
     * @return {@link #page} (Nested Pages/Sections under this page.)
     */
    public List<ImplementationGuideDefinitionPageComponent> getPage() {
      if (this.page == null)
        this.page = new ArrayList<ImplementationGuideDefinitionPageComponent>();
      return this.page;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionPageComponent setPage(
        List<ImplementationGuideDefinitionPageComponent> thePage) {
      this.page = thePage;
      return this;
    }

    public boolean hasPage() {
      if (this.page == null)
        return false;
      for (ImplementationGuideDefinitionPageComponent item : this.page)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImplementationGuideDefinitionPageComponent addPage() { // 3
      ImplementationGuideDefinitionPageComponent t = new ImplementationGuideDefinitionPageComponent();
      if (this.page == null)
        this.page = new ArrayList<ImplementationGuideDefinitionPageComponent>();
      this.page.add(t);
      return t;
    }

    public ImplementationGuideDefinitionPageComponent addPage(ImplementationGuideDefinitionPageComponent t) { // 3
      if (t == null)
        return this;
      if (this.page == null)
        this.page = new ArrayList<ImplementationGuideDefinitionPageComponent>();
      this.page.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #page}, creating it if
     *         it does not already exist
     */
    public ImplementationGuideDefinitionPageComponent getPageFirstRep() {
      if (getPage().isEmpty()) {
        addPage();
      }
      return getPage().get(0);
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("name[x]", "url|Reference(Binary)", "The source address for the page.", 0, 1, name));
      children.add(new Property("title", "string",
          "A short title used to represent this page in navigational structures such as table of contents, bread crumbs, etc.",
          0, 1, title));
      children.add(
          new Property("generation", "code", "A code that indicates how the page is generated.", 0, 1, generation));
      children.add(new Property("page", "@ImplementationGuide.definition.page",
          "Nested Pages/Sections under this page.", 0, java.lang.Integer.MAX_VALUE, page));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 1721948693:
        /* name[x] */ return new Property("name[x]", "url|Reference(Binary)", "The source address for the page.", 0, 1,
            name);
      case 3373707:
        /* name */ return new Property("name[x]", "url|Reference(Binary)", "The source address for the page.", 0, 1,
            name);
      case 1721942756:
        /* nameUrl */ return new Property("name[x]", "url|Reference(Binary)", "The source address for the page.", 0, 1,
            name);
      case 1833144576:
        /* nameReference */ return new Property("name[x]", "url|Reference(Binary)", "The source address for the page.",
            0, 1, name);
      case 110371416:
        /* title */ return new Property("title", "string",
            "A short title used to represent this page in navigational structures such as table of contents, bread crumbs, etc.",
            0, 1, title);
      case 305703192:
        /* generation */ return new Property("generation", "code", "A code that indicates how the page is generated.",
            0, 1, generation);
      case 3433103:
        /* page */ return new Property("page", "@ImplementationGuide.definition.page",
            "Nested Pages/Sections under this page.", 0, java.lang.Integer.MAX_VALUE, page);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // Type
      case 110371416:
        /* title */ return this.title == null ? new Base[0] : new Base[] { this.title }; // StringType
      case 305703192:
        /* generation */ return this.generation == null ? new Base[0] : new Base[] { this.generation }; // Enumeration<GuidePageGeneration>
      case 3433103:
        /* page */ return this.page == null ? new Base[0] : this.page.toArray(new Base[this.page.size()]); // ImplementationGuideDefinitionPageComponent
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3373707: // name
        this.name = castToType(value); // Type
        return value;
      case 110371416: // title
        this.title = castToString(value); // StringType
        return value;
      case 305703192: // generation
        value = new GuidePageGenerationEnumFactory().fromType(castToCode(value));
        this.generation = (Enumeration) value; // Enumeration<GuidePageGeneration>
        return value;
      case 3433103: // page
        this.getPage().add((ImplementationGuideDefinitionPageComponent) value); // ImplementationGuideDefinitionPageComponent
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("name[x]")) {
        this.name = castToType(value); // Type
      } else if (name.equals("title")) {
        this.title = castToString(value); // StringType
      } else if (name.equals("generation")) {
        value = new GuidePageGenerationEnumFactory().fromType(castToCode(value));
        this.generation = (Enumeration) value; // Enumeration<GuidePageGeneration>
      } else if (name.equals("page")) {
        this.getPage().add((ImplementationGuideDefinitionPageComponent) value);
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("name[x]")) {
        this.name = null;
      } else if (name.equals("title")) {
        this.title = null;
      } else if (name.equals("generation")) {
        this.generation = null;
      } else if (name.equals("page")) {
        this.getPage().remove((ImplementationGuideDefinitionPageComponent) value);
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1721948693:
        return getName();
      case 3373707:
        return getName();
      case 110371416:
        return getTitleElement();
      case 305703192:
        return getGenerationElement();
      case 3433103:
        return addPage();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return new String[] { "url", "Reference" };
      case 110371416:
        /* title */ return new String[] { "string" };
      case 305703192:
        /* generation */ return new String[] { "code" };
      case 3433103:
        /* page */ return new String[] { "@ImplementationGuide.definition.page" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("nameUrl")) {
        this.name = new UrlType();
        return this.name;
      } else if (name.equals("nameReference")) {
        this.name = new Reference();
        return this.name;
      } else if (name.equals("title")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.title");
      } else if (name.equals("generation")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.generation");
      } else if (name.equals("page")) {
        return addPage();
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionPageComponent copy() {
      ImplementationGuideDefinitionPageComponent dst = new ImplementationGuideDefinitionPageComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionPageComponent dst) {
      super.copyValues(dst);
      dst.name = name == null ? null : name.copy();
      dst.title = title == null ? null : title.copy();
      dst.generation = generation == null ? null : generation.copy();
      if (page != null) {
        dst.page = new ArrayList<ImplementationGuideDefinitionPageComponent>();
        for (ImplementationGuideDefinitionPageComponent i : page)
          dst.page.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionPageComponent))
        return false;
      ImplementationGuideDefinitionPageComponent o = (ImplementationGuideDefinitionPageComponent) other_;
      return compareDeep(name, o.name, true) && compareDeep(title, o.title, true)
          && compareDeep(generation, o.generation, true) && compareDeep(page, o.page, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionPageComponent))
        return false;
      ImplementationGuideDefinitionPageComponent o = (ImplementationGuideDefinitionPageComponent) other_;
      return compareValues(title, o.title, true) && compareValues(generation, o.generation, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, title, generation, page);
    }

    public String fhirType() {
      return "ImplementationGuide.definition.page";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionParameterComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * apply | path-resource | path-pages | path-tx-cache | expansion-parameter |
     * rule-broken-links | generate-xml | generate-json | generate-turtle |
     * html-template.
     */
    @Child(name = "code", type = { StringType.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "apply | path-resource | path-pages | path-tx-cache | expansion-parameter | rule-broken-links | generate-xml | generate-json | generate-turtle | html-template", formalDefinition = "apply | path-resource | path-pages | path-tx-cache | expansion-parameter | rule-broken-links | generate-xml | generate-json | generate-turtle | html-template.")
    protected StringType code;

    /**
     * Value for named type.
     */
    @Child(name = "value", type = { StringType.class }, order = 2, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Value for named type", formalDefinition = "Value for named type.")
    protected StringType value;

    private static final long serialVersionUID = 1188999138L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionParameterComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionParameterComponent(StringType code, StringType value) {
      super();
      this.code = code;
      this.value = value;
    }

    /**
     * @return {@link #code} (apply | path-resource | path-pages | path-tx-cache |
     *         expansion-parameter | rule-broken-links | generate-xml |
     *         generate-json | generate-turtle | html-template.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getCode" gives direct access to the value
     */
    public StringType getCodeElement() {
      if (this.code == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionParameterComponent.code");
        else if (Configuration.doAutoCreate())
          this.code = new StringType(); // bb
      return this.code;
    }

    public boolean hasCodeElement() {
      return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
      return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (apply | path-resource | path-pages |
     *              path-tx-cache | expansion-parameter | rule-broken-links |
     *              generate-xml | generate-json | generate-turtle |
     *              html-template.). This is the underlying object with id, value
     *              and extensions. The accessor "getCode" gives direct access to
     *              the value
     */
    public ImplementationGuideDefinitionParameterComponent setCodeElement(StringType value) {
      this.code = value;
      return this;
    }

    /**
     * @return apply | path-resource | path-pages | path-tx-cache |
     *         expansion-parameter | rule-broken-links | generate-xml |
     *         generate-json | generate-turtle | html-template.
     */
    public String getCode() {
      return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value apply | path-resource | path-pages | path-tx-cache |
     *              expansion-parameter | rule-broken-links | generate-xml |
     *              generate-json | generate-turtle | html-template.
     */
    public ImplementationGuideDefinitionParameterComponent setCode(String value) {
      if (this.code == null)
        this.code = new StringType();
      this.code.setValue(value);
      return this;
    }

    /**
     * @return {@link #value} (Value for named type.). This is the underlying object
     *         with id, value and extensions. The accessor "getValue" gives direct
     *         access to the value
     */
    public StringType getValueElement() {
      if (this.value == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionParameterComponent.value");
        else if (Configuration.doAutoCreate())
          this.value = new StringType(); // bb
      return this.value;
    }

    public boolean hasValueElement() {
      return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
      return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (Value for named type.). This is the underlying
     *              object with id, value and extensions. The accessor "getValue"
     *              gives direct access to the value
     */
    public ImplementationGuideDefinitionParameterComponent setValueElement(StringType value) {
      this.value = value;
      return this;
    }

    /**
     * @return Value for named type.
     */
    public String getValue() {
      return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value Value for named type.
     */
    public ImplementationGuideDefinitionParameterComponent setValue(String value) {
      if (this.value == null)
        this.value = new StringType();
      this.value.setValue(value);
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("code", "string",
          "apply | path-resource | path-pages | path-tx-cache | expansion-parameter | rule-broken-links | generate-xml | generate-json | generate-turtle | html-template.",
          0, 1, code));
      children.add(new Property("value", "string", "Value for named type.", 0, 1, value));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3059181:
        /* code */ return new Property("code", "string",
            "apply | path-resource | path-pages | path-tx-cache | expansion-parameter | rule-broken-links | generate-xml | generate-json | generate-turtle | html-template.",
            0, 1, code);
      case 111972721:
        /* value */ return new Property("value", "string", "Value for named type.", 0, 1, value);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3059181:
        /* code */ return this.code == null ? new Base[0] : new Base[] { this.code }; // StringType
      case 111972721:
        /* value */ return this.value == null ? new Base[0] : new Base[] { this.value }; // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3059181: // code
        this.code = castToString(value); // StringType
        return value;
      case 111972721: // value
        this.value = castToString(value); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("code")) {
        this.code = castToString(value); // StringType
      } else if (name.equals("value")) {
        this.value = castToString(value); // StringType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("code")) {
        this.code = null;
      } else if (name.equals("value")) {
        this.value = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3059181:
        return getCodeElement();
      case 111972721:
        return getValueElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3059181:
        /* code */ return new String[] { "string" };
      case 111972721:
        /* value */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("code")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.code");
      } else if (name.equals("value")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.value");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionParameterComponent copy() {
      ImplementationGuideDefinitionParameterComponent dst = new ImplementationGuideDefinitionParameterComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionParameterComponent dst) {
      super.copyValues(dst);
      dst.code = code == null ? null : code.copy();
      dst.value = value == null ? null : value.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionParameterComponent))
        return false;
      ImplementationGuideDefinitionParameterComponent o = (ImplementationGuideDefinitionParameterComponent) other_;
      return compareDeep(code, o.code, true) && compareDeep(value, o.value, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionParameterComponent))
        return false;
      ImplementationGuideDefinitionParameterComponent o = (ImplementationGuideDefinitionParameterComponent) other_;
      return compareValues(code, o.code, true) && compareValues(value, o.value, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, value);
    }

    public String fhirType() {
      return "ImplementationGuide.definition.parameter";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionTemplateComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * Type of template specified.
     */
    @Child(name = "code", type = { CodeType.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Type of template specified", formalDefinition = "Type of template specified.")
    protected CodeType code;

    /**
     * The source location for the template.
     */
    @Child(name = "source", type = { StringType.class }, order = 2, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "The source location for the template", formalDefinition = "The source location for the template.")
    protected StringType source;

    /**
     * The scope in which the template applies.
     */
    @Child(name = "scope", type = { StringType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "The scope in which the template applies", formalDefinition = "The scope in which the template applies.")
    protected StringType scope;

    private static final long serialVersionUID = 923832457L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionTemplateComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionTemplateComponent(CodeType code, StringType source) {
      super();
      this.code = code;
      this.source = source;
    }

    /**
     * @return {@link #code} (Type of template specified.). This is the underlying
     *         object with id, value and extensions. The accessor "getCode" gives
     *         direct access to the value
     */
    public CodeType getCodeElement() {
      if (this.code == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionTemplateComponent.code");
        else if (Configuration.doAutoCreate())
          this.code = new CodeType(); // bb
      return this.code;
    }

    public boolean hasCodeElement() {
      return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
      return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Type of template specified.). This is the
     *              underlying object with id, value and extensions. The accessor
     *              "getCode" gives direct access to the value
     */
    public ImplementationGuideDefinitionTemplateComponent setCodeElement(CodeType value) {
      this.code = value;
      return this;
    }

    /**
     * @return Type of template specified.
     */
    public String getCode() {
      return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value Type of template specified.
     */
    public ImplementationGuideDefinitionTemplateComponent setCode(String value) {
      if (this.code == null)
        this.code = new CodeType();
      this.code.setValue(value);
      return this;
    }

    /**
     * @return {@link #source} (The source location for the template.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getSource" gives direct access to the value
     */
    public StringType getSourceElement() {
      if (this.source == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionTemplateComponent.source");
        else if (Configuration.doAutoCreate())
          this.source = new StringType(); // bb
      return this.source;
    }

    public boolean hasSourceElement() {
      return this.source != null && !this.source.isEmpty();
    }

    public boolean hasSource() {
      return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (The source location for the template.). This is
     *              the underlying object with id, value and extensions. The
     *              accessor "getSource" gives direct access to the value
     */
    public ImplementationGuideDefinitionTemplateComponent setSourceElement(StringType value) {
      this.source = value;
      return this;
    }

    /**
     * @return The source location for the template.
     */
    public String getSource() {
      return this.source == null ? null : this.source.getValue();
    }

    /**
     * @param value The source location for the template.
     */
    public ImplementationGuideDefinitionTemplateComponent setSource(String value) {
      if (this.source == null)
        this.source = new StringType();
      this.source.setValue(value);
      return this;
    }

    /**
     * @return {@link #scope} (The scope in which the template applies.). This is
     *         the underlying object with id, value and extensions. The accessor
     *         "getScope" gives direct access to the value
     */
    public StringType getScopeElement() {
      if (this.scope == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionTemplateComponent.scope");
        else if (Configuration.doAutoCreate())
          this.scope = new StringType(); // bb
      return this.scope;
    }

    public boolean hasScopeElement() {
      return this.scope != null && !this.scope.isEmpty();
    }

    public boolean hasScope() {
      return this.scope != null && !this.scope.isEmpty();
    }

    /**
     * @param value {@link #scope} (The scope in which the template applies.). This
     *              is the underlying object with id, value and extensions. The
     *              accessor "getScope" gives direct access to the value
     */
    public ImplementationGuideDefinitionTemplateComponent setScopeElement(StringType value) {
      this.scope = value;
      return this;
    }

    /**
     * @return The scope in which the template applies.
     */
    public String getScope() {
      return this.scope == null ? null : this.scope.getValue();
    }

    /**
     * @param value The scope in which the template applies.
     */
    public ImplementationGuideDefinitionTemplateComponent setScope(String value) {
      if (Utilities.noString(value))
        this.scope = null;
      else {
        if (this.scope == null)
          this.scope = new StringType();
        this.scope.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("code", "code", "Type of template specified.", 0, 1, code));
      children.add(new Property("source", "string", "The source location for the template.", 0, 1, source));
      children.add(new Property("scope", "string", "The scope in which the template applies.", 0, 1, scope));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3059181:
        /* code */ return new Property("code", "code", "Type of template specified.", 0, 1, code);
      case -896505829:
        /* source */ return new Property("source", "string", "The source location for the template.", 0, 1, source);
      case 109264468:
        /* scope */ return new Property("scope", "string", "The scope in which the template applies.", 0, 1, scope);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3059181:
        /* code */ return this.code == null ? new Base[0] : new Base[] { this.code }; // CodeType
      case -896505829:
        /* source */ return this.source == null ? new Base[0] : new Base[] { this.source }; // StringType
      case 109264468:
        /* scope */ return this.scope == null ? new Base[0] : new Base[] { this.scope }; // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3059181: // code
        this.code = castToCode(value); // CodeType
        return value;
      case -896505829: // source
        this.source = castToString(value); // StringType
        return value;
      case 109264468: // scope
        this.scope = castToString(value); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("code")) {
        this.code = castToCode(value); // CodeType
      } else if (name.equals("source")) {
        this.source = castToString(value); // StringType
      } else if (name.equals("scope")) {
        this.scope = castToString(value); // StringType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("code")) {
        this.code = null;
      } else if (name.equals("source")) {
        this.source = null;
      } else if (name.equals("scope")) {
        this.scope = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3059181:
        return getCodeElement();
      case -896505829:
        return getSourceElement();
      case 109264468:
        return getScopeElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3059181:
        /* code */ return new String[] { "code" };
      case -896505829:
        /* source */ return new String[] { "string" };
      case 109264468:
        /* scope */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("code")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.code");
      } else if (name.equals("source")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.source");
      } else if (name.equals("scope")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.scope");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionTemplateComponent copy() {
      ImplementationGuideDefinitionTemplateComponent dst = new ImplementationGuideDefinitionTemplateComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionTemplateComponent dst) {
      super.copyValues(dst);
      dst.code = code == null ? null : code.copy();
      dst.source = source == null ? null : source.copy();
      dst.scope = scope == null ? null : scope.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionTemplateComponent))
        return false;
      ImplementationGuideDefinitionTemplateComponent o = (ImplementationGuideDefinitionTemplateComponent) other_;
      return compareDeep(code, o.code, true) && compareDeep(source, o.source, true)
          && compareDeep(scope, o.scope, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionTemplateComponent))
        return false;
      ImplementationGuideDefinitionTemplateComponent o = (ImplementationGuideDefinitionTemplateComponent) other_;
      return compareValues(code, o.code, true) && compareValues(source, o.source, true)
          && compareValues(scope, o.scope, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, source, scope);
    }

    public String fhirType() {
      return "ImplementationGuide.definition.template";

    }

  }

  @Block()
  public static class ImplementationGuideManifestComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * A pointer to official web page, PDF or other rendering of the implementation
     * guide.
     */
    @Child(name = "rendering", type = { UrlType.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Location of rendered implementation guide", formalDefinition = "A pointer to official web page, PDF or other rendering of the implementation guide.")
    protected UrlType rendering;

    /**
     * A resource that is part of the implementation guide. Conformance resources
     * (value set, structure definition, capability statements etc.) are obvious
     * candidates for inclusion, but any kind of resource can be included as an
     * example resource.
     */
    @Child(name = "resource", type = {}, order = 2, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Resource in the implementation guide", formalDefinition = "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.")
    protected List<ManifestResourceComponent> resource;

    /**
     * Information about a page within the IG.
     */
    @Child(name = "page", type = {}, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "HTML page within the parent IG", formalDefinition = "Information about a page within the IG.")
    protected List<ManifestPageComponent> page;

    /**
     * Indicates a relative path to an image that exists within the IG.
     */
    @Child(name = "image", type = {
        StringType.class }, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Image within the IG", formalDefinition = "Indicates a relative path to an image that exists within the IG.")
    protected List<StringType> image;

    /**
     * Indicates the relative path of an additional non-page, non-image file that is
     * part of the IG - e.g. zip, jar and similar files that could be the target of
     * a hyperlink in a derived IG.
     */
    @Child(name = "other", type = {
        StringType.class }, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Additional linkable file in IG", formalDefinition = "Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.")
    protected List<StringType> other;

    private static final long serialVersionUID = 1881327712L;

    /**
     * Constructor
     */
    public ImplementationGuideManifestComponent() {
      super();
    }

    /**
     * @return {@link #rendering} (A pointer to official web page, PDF or other
     *         rendering of the implementation guide.). This is the underlying
     *         object with id, value and extensions. The accessor "getRendering"
     *         gives direct access to the value
     */
    public UrlType getRenderingElement() {
      if (this.rendering == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideManifestComponent.rendering");
        else if (Configuration.doAutoCreate())
          this.rendering = new UrlType(); // bb
      return this.rendering;
    }

    public boolean hasRenderingElement() {
      return this.rendering != null && !this.rendering.isEmpty();
    }

    public boolean hasRendering() {
      return this.rendering != null && !this.rendering.isEmpty();
    }

    /**
     * @param value {@link #rendering} (A pointer to official web page, PDF or other
     *              rendering of the implementation guide.). This is the underlying
     *              object with id, value and extensions. The accessor
     *              "getRendering" gives direct access to the value
     */
    public ImplementationGuideManifestComponent setRenderingElement(UrlType value) {
      this.rendering = value;
      return this;
    }

    /**
     * @return A pointer to official web page, PDF or other rendering of the
     *         implementation guide.
     */
    public String getRendering() {
      return this.rendering == null ? null : this.rendering.getValue();
    }

    /**
     * @param value A pointer to official web page, PDF or other rendering of the
     *              implementation guide.
     */
    public ImplementationGuideManifestComponent setRendering(String value) {
      if (Utilities.noString(value))
        this.rendering = null;
      else {
        if (this.rendering == null)
          this.rendering = new UrlType();
        this.rendering.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #resource} (A resource that is part of the implementation
     *         guide. Conformance resources (value set, structure definition,
     *         capability statements etc.) are obvious candidates for inclusion, but
     *         any kind of resource can be included as an example resource.)
     */
    public List<ManifestResourceComponent> getResource() {
      if (this.resource == null)
        this.resource = new ArrayList<ManifestResourceComponent>();
      return this.resource;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideManifestComponent setResource(List<ManifestResourceComponent> theResource) {
      this.resource = theResource;
      return this;
    }

    public boolean hasResource() {
      if (this.resource == null)
        return false;
      for (ManifestResourceComponent item : this.resource)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ManifestResourceComponent addResource() { // 3
      ManifestResourceComponent t = new ManifestResourceComponent();
      if (this.resource == null)
        this.resource = new ArrayList<ManifestResourceComponent>();
      this.resource.add(t);
      return t;
    }

    public ImplementationGuideManifestComponent addResource(ManifestResourceComponent t) { // 3
      if (t == null)
        return this;
      if (this.resource == null)
        this.resource = new ArrayList<ManifestResourceComponent>();
      this.resource.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #resource}, creating
     *         it if it does not already exist
     */
    public ManifestResourceComponent getResourceFirstRep() {
      if (getResource().isEmpty()) {
        addResource();
      }
      return getResource().get(0);
    }

    /**
     * @return {@link #page} (Information about a page within the IG.)
     */
    public List<ManifestPageComponent> getPage() {
      if (this.page == null)
        this.page = new ArrayList<ManifestPageComponent>();
      return this.page;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideManifestComponent setPage(List<ManifestPageComponent> thePage) {
      this.page = thePage;
      return this;
    }

    public boolean hasPage() {
      if (this.page == null)
        return false;
      for (ManifestPageComponent item : this.page)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ManifestPageComponent addPage() { // 3
      ManifestPageComponent t = new ManifestPageComponent();
      if (this.page == null)
        this.page = new ArrayList<ManifestPageComponent>();
      this.page.add(t);
      return t;
    }

    public ImplementationGuideManifestComponent addPage(ManifestPageComponent t) { // 3
      if (t == null)
        return this;
      if (this.page == null)
        this.page = new ArrayList<ManifestPageComponent>();
      this.page.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #page}, creating it if
     *         it does not already exist
     */
    public ManifestPageComponent getPageFirstRep() {
      if (getPage().isEmpty()) {
        addPage();
      }
      return getPage().get(0);
    }

    /**
     * @return {@link #image} (Indicates a relative path to an image that exists
     *         within the IG.)
     */
    public List<StringType> getImage() {
      if (this.image == null)
        this.image = new ArrayList<StringType>();
      return this.image;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideManifestComponent setImage(List<StringType> theImage) {
      this.image = theImage;
      return this;
    }

    public boolean hasImage() {
      if (this.image == null)
        return false;
      for (StringType item : this.image)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #image} (Indicates a relative path to an image that exists
     *         within the IG.)
     */
    public StringType addImageElement() {// 2
      StringType t = new StringType();
      if (this.image == null)
        this.image = new ArrayList<StringType>();
      this.image.add(t);
      return t;
    }

    /**
     * @param value {@link #image} (Indicates a relative path to an image that
     *              exists within the IG.)
     */
    public ImplementationGuideManifestComponent addImage(String value) { // 1
      StringType t = new StringType();
      t.setValue(value);
      if (this.image == null)
        this.image = new ArrayList<StringType>();
      this.image.add(t);
      return this;
    }

    /**
     * @param value {@link #image} (Indicates a relative path to an image that
     *              exists within the IG.)
     */
    public boolean hasImage(String value) {
      if (this.image == null)
        return false;
      for (StringType v : this.image)
        if (v.getValue().equals(value)) // string
          return true;
      return false;
    }

    /**
     * @return {@link #other} (Indicates the relative path of an additional
     *         non-page, non-image file that is part of the IG - e.g. zip, jar and
     *         similar files that could be the target of a hyperlink in a derived
     *         IG.)
     */
    public List<StringType> getOther() {
      if (this.other == null)
        this.other = new ArrayList<StringType>();
      return this.other;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideManifestComponent setOther(List<StringType> theOther) {
      this.other = theOther;
      return this;
    }

    public boolean hasOther() {
      if (this.other == null)
        return false;
      for (StringType item : this.other)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #other} (Indicates the relative path of an additional
     *         non-page, non-image file that is part of the IG - e.g. zip, jar and
     *         similar files that could be the target of a hyperlink in a derived
     *         IG.)
     */
    public StringType addOtherElement() {// 2
      StringType t = new StringType();
      if (this.other == null)
        this.other = new ArrayList<StringType>();
      this.other.add(t);
      return t;
    }

    /**
     * @param value {@link #other} (Indicates the relative path of an additional
     *              non-page, non-image file that is part of the IG - e.g. zip, jar
     *              and similar files that could be the target of a hyperlink in a
     *              derived IG.)
     */
    public ImplementationGuideManifestComponent addOther(String value) { // 1
      StringType t = new StringType();
      t.setValue(value);
      if (this.other == null)
        this.other = new ArrayList<StringType>();
      this.other.add(t);
      return this;
    }

    /**
     * @param value {@link #other} (Indicates the relative path of an additional
     *              non-page, non-image file that is part of the IG - e.g. zip, jar
     *              and similar files that could be the target of a hyperlink in a
     *              derived IG.)
     */
    public boolean hasOther(String value) {
      if (this.other == null)
        return false;
      for (StringType v : this.other)
        if (v.getValue().equals(value)) // string
          return true;
      return false;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("rendering", "url",
          "A pointer to official web page, PDF or other rendering of the implementation guide.", 0, 1, rendering));
      children.add(new Property("resource", "",
          "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.",
          0, java.lang.Integer.MAX_VALUE, resource));
      children.add(
          new Property("page", "", "Information about a page within the IG.", 0, java.lang.Integer.MAX_VALUE, page));
      children.add(new Property("image", "string", "Indicates a relative path to an image that exists within the IG.",
          0, java.lang.Integer.MAX_VALUE, image));
      children.add(new Property("other", "string",
          "Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.",
          0, java.lang.Integer.MAX_VALUE, other));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 1839654540:
        /* rendering */ return new Property("rendering", "url",
            "A pointer to official web page, PDF or other rendering of the implementation guide.", 0, 1, rendering);
      case -341064690:
        /* resource */ return new Property("resource", "",
            "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.",
            0, java.lang.Integer.MAX_VALUE, resource);
      case 3433103:
        /* page */ return new Property("page", "", "Information about a page within the IG.", 0,
            java.lang.Integer.MAX_VALUE, page);
      case 100313435:
        /* image */ return new Property("image", "string",
            "Indicates a relative path to an image that exists within the IG.", 0, java.lang.Integer.MAX_VALUE, image);
      case 106069776:
        /* other */ return new Property("other", "string",
            "Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.",
            0, java.lang.Integer.MAX_VALUE, other);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 1839654540:
        /* rendering */ return this.rendering == null ? new Base[0] : new Base[] { this.rendering }; // UrlType
      case -341064690:
        /* resource */ return this.resource == null ? new Base[0]
            : this.resource.toArray(new Base[this.resource.size()]); // ManifestResourceComponent
      case 3433103:
        /* page */ return this.page == null ? new Base[0] : this.page.toArray(new Base[this.page.size()]); // ManifestPageComponent
      case 100313435:
        /* image */ return this.image == null ? new Base[0] : this.image.toArray(new Base[this.image.size()]); // StringType
      case 106069776:
        /* other */ return this.other == null ? new Base[0] : this.other.toArray(new Base[this.other.size()]); // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 1839654540: // rendering
        this.rendering = castToUrl(value); // UrlType
        return value;
      case -341064690: // resource
        this.getResource().add((ManifestResourceComponent) value); // ManifestResourceComponent
        return value;
      case 3433103: // page
        this.getPage().add((ManifestPageComponent) value); // ManifestPageComponent
        return value;
      case 100313435: // image
        this.getImage().add(castToString(value)); // StringType
        return value;
      case 106069776: // other
        this.getOther().add(castToString(value)); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("rendering")) {
        this.rendering = castToUrl(value); // UrlType
      } else if (name.equals("resource")) {
        this.getResource().add((ManifestResourceComponent) value);
      } else if (name.equals("page")) {
        this.getPage().add((ManifestPageComponent) value);
      } else if (name.equals("image")) {
        this.getImage().add(castToString(value));
      } else if (name.equals("other")) {
        this.getOther().add(castToString(value));
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("rendering")) {
        this.rendering = null;
      } else if (name.equals("resource")) {
        this.getResource().remove((ManifestResourceComponent) value);
      } else if (name.equals("page")) {
        this.getPage().remove((ManifestPageComponent) value);
      } else if (name.equals("image")) {
        this.getImage().remove(castToString(value));
      } else if (name.equals("other")) {
        this.getOther().remove(castToString(value));
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1839654540:
        return getRenderingElement();
      case -341064690:
        return addResource();
      case 3433103:
        return addPage();
      case 100313435:
        return addImageElement();
      case 106069776:
        return addOtherElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1839654540:
        /* rendering */ return new String[] { "url" };
      case -341064690:
        /* resource */ return new String[] {};
      case 3433103:
        /* page */ return new String[] {};
      case 100313435:
        /* image */ return new String[] { "string" };
      case 106069776:
        /* other */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("rendering")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.rendering");
      } else if (name.equals("resource")) {
        return addResource();
      } else if (name.equals("page")) {
        return addPage();
      } else if (name.equals("image")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.image");
      } else if (name.equals("other")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.other");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideManifestComponent copy() {
      ImplementationGuideManifestComponent dst = new ImplementationGuideManifestComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideManifestComponent dst) {
      super.copyValues(dst);
      dst.rendering = rendering == null ? null : rendering.copy();
      if (resource != null) {
        dst.resource = new ArrayList<ManifestResourceComponent>();
        for (ManifestResourceComponent i : resource)
          dst.resource.add(i.copy());
      }
      ;
      if (page != null) {
        dst.page = new ArrayList<ManifestPageComponent>();
        for (ManifestPageComponent i : page)
          dst.page.add(i.copy());
      }
      ;
      if (image != null) {
        dst.image = new ArrayList<StringType>();
        for (StringType i : image)
          dst.image.add(i.copy());
      }
      ;
      if (other != null) {
        dst.other = new ArrayList<StringType>();
        for (StringType i : other)
          dst.other.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideManifestComponent))
        return false;
      ImplementationGuideManifestComponent o = (ImplementationGuideManifestComponent) other_;
      return compareDeep(rendering, o.rendering, true) && compareDeep(resource, o.resource, true)
          && compareDeep(page, o.page, true) && compareDeep(image, o.image, true) && compareDeep(other, o.other, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideManifestComponent))
        return false;
      ImplementationGuideManifestComponent o = (ImplementationGuideManifestComponent) other_;
      return compareValues(rendering, o.rendering, true) && compareValues(image, o.image, true)
          && compareValues(other, o.other, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(rendering, resource, page, image, other);
    }

    public String fhirType() {
      return "ImplementationGuide.manifest";

    }

  }

  @Block()
  public static class ManifestResourceComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Where this resource is found.
     */
    @Child(name = "reference", type = {
        Reference.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Location of the resource", formalDefinition = "Where this resource is found.")
    protected Reference reference;

    /**
     * The actual object that is the target of the reference (Where this resource is
     * found.)
     */
    protected Resource referenceTarget;

    /**
     * If true or a reference, indicates the resource is an example instance. If a
     * reference is present, indicates that the example is an example of the
     * specified profile.
     */
    @Child(name = "example", type = { BooleanType.class,
        CanonicalType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Is an example/What is this an example of?", formalDefinition = "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.")
    protected Type example;

    /**
     * The relative path for primary page for this resource within the IG.
     */
    @Child(name = "relativePath", type = {
        UrlType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Relative path for page in IG", formalDefinition = "The relative path for primary page for this resource within the IG.")
    protected UrlType relativePath;

    private static final long serialVersionUID = 1150095716L;

    /**
     * Constructor
     */
    public ManifestResourceComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ManifestResourceComponent(Reference reference) {
      super();
      this.reference = reference;
    }

    /**
     * @return {@link #reference} (Where this resource is found.)
     */
    public Reference getReference() {
      if (this.reference == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ManifestResourceComponent.reference");
        else if (Configuration.doAutoCreate())
          this.reference = new Reference(); // cc
      return this.reference;
    }

    public boolean hasReference() {
      return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (Where this resource is found.)
     */
    public ManifestResourceComponent setReference(Reference value) {
      this.reference = value;
      return this;
    }

    /**
     * @return {@link #reference} The actual object that is the target of the
     *         reference. The reference library doesn't populate this, but you can
     *         use it to hold the resource if you resolve it. (Where this resource
     *         is found.)
     */
    public Resource getReferenceTarget() {
      return this.referenceTarget;
    }

    /**
     * @param value {@link #reference} The actual object that is the target of the
     *              reference. The reference library doesn't use these, but you can
     *              use it to hold the resource if you resolve it. (Where this
     *              resource is found.)
     */
    public ManifestResourceComponent setReferenceTarget(Resource value) {
      this.referenceTarget = value;
      return this;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public Type getExample() {
      return this.example;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public BooleanType getExampleBooleanType() throws FHIRException {
      if (this.example == null)
        this.example = new BooleanType();
      if (!(this.example instanceof BooleanType))
        throw new FHIRException("Type mismatch: the type BooleanType was expected, but "
            + this.example.getClass().getName() + " was encountered");
      return (BooleanType) this.example;
    }

    public boolean hasExampleBooleanType() {
      return this != null && this.example instanceof BooleanType;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public CanonicalType getExampleCanonicalType() throws FHIRException {
      if (this.example == null)
        this.example = new CanonicalType();
      if (!(this.example instanceof CanonicalType))
        throw new FHIRException("Type mismatch: the type CanonicalType was expected, but "
            + this.example.getClass().getName() + " was encountered");
      return (CanonicalType) this.example;
    }

    public boolean hasExampleCanonicalType() {
      return this != null && this.example instanceof CanonicalType;
    }

    public boolean hasExample() {
      return this.example != null && !this.example.isEmpty();
    }

    /**
     * @param value {@link #example} (If true or a reference, indicates the resource
     *              is an example instance. If a reference is present, indicates
     *              that the example is an example of the specified profile.)
     */
    public ManifestResourceComponent setExample(Type value) {
      if (value != null && !(value instanceof BooleanType || value instanceof CanonicalType))
        throw new Error("Not the right type for ImplementationGuide.manifest.resource.example[x]: " + value.fhirType());
      this.example = value;
      return this;
    }

    /**
     * @return {@link #relativePath} (The relative path for primary page for this
     *         resource within the IG.). This is the underlying object with id,
     *         value and extensions. The accessor "getRelativePath" gives direct
     *         access to the value
     */
    public UrlType getRelativePathElement() {
      if (this.relativePath == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ManifestResourceComponent.relativePath");
        else if (Configuration.doAutoCreate())
          this.relativePath = new UrlType(); // bb
      return this.relativePath;
    }

    public boolean hasRelativePathElement() {
      return this.relativePath != null && !this.relativePath.isEmpty();
    }

    public boolean hasRelativePath() {
      return this.relativePath != null && !this.relativePath.isEmpty();
    }

    /**
     * @param value {@link #relativePath} (The relative path for primary page for
     *              this resource within the IG.). This is the underlying object
     *              with id, value and extensions. The accessor "getRelativePath"
     *              gives direct access to the value
     */
    public ManifestResourceComponent setRelativePathElement(UrlType value) {
      this.relativePath = value;
      return this;
    }

    /**
     * @return The relative path for primary page for this resource within the IG.
     */
    public String getRelativePath() {
      return this.relativePath == null ? null : this.relativePath.getValue();
    }

    /**
     * @param value The relative path for primary page for this resource within the
     *              IG.
     */
    public ManifestResourceComponent setRelativePath(String value) {
      if (Utilities.noString(value))
        this.relativePath = null;
      else {
        if (this.relativePath == null)
          this.relativePath = new UrlType();
        this.relativePath.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("reference", "Reference(Any)", "Where this resource is found.", 0, 1, reference));
      children.add(new Property("example[x]", "boolean|canonical(StructureDefinition)",
          "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
          0, 1, example));
      children.add(new Property("relativePath", "url",
          "The relative path for primary page for this resource within the IG.", 0, 1, relativePath));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -925155509:
        /* reference */ return new Property("reference", "Reference(Any)", "Where this resource is found.", 0, 1,
            reference);
      case -2002328874:
        /* example[x] */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case -1322970774:
        /* example */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case 159803230:
        /* exampleBoolean */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case 2016979626:
        /* exampleCanonical */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case -70808303:
        /* relativePath */ return new Property("relativePath", "url",
            "The relative path for primary page for this resource within the IG.", 0, 1, relativePath);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case -925155509:
        /* reference */ return this.reference == null ? new Base[0] : new Base[] { this.reference }; // Reference
      case -1322970774:
        /* example */ return this.example == null ? new Base[0] : new Base[] { this.example }; // Type
      case -70808303:
        /* relativePath */ return this.relativePath == null ? new Base[0] : new Base[] { this.relativePath }; // UrlType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case -925155509: // reference
        this.reference = castToReference(value); // Reference
        return value;
      case -1322970774: // example
        this.example = castToType(value); // Type
        return value;
      case -70808303: // relativePath
        this.relativePath = castToUrl(value); // UrlType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = castToReference(value); // Reference
      } else if (name.equals("example[x]")) {
        this.example = castToType(value); // Type
      } else if (name.equals("relativePath")) {
        this.relativePath = castToUrl(value); // UrlType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = null;
      } else if (name.equals("example[x]")) {
        this.example = null;
      } else if (name.equals("relativePath")) {
        this.relativePath = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -925155509:
        return getReference();
      case -2002328874:
        return getExample();
      case -1322970774:
        return getExample();
      case -70808303:
        return getRelativePathElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -925155509:
        /* reference */ return new String[] { "Reference" };
      case -1322970774:
        /* example */ return new String[] { "boolean", "canonical" };
      case -70808303:
        /* relativePath */ return new String[] { "url" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = new Reference();
        return this.reference;
      } else if (name.equals("exampleBoolean")) {
        this.example = new BooleanType();
        return this.example;
      } else if (name.equals("exampleCanonical")) {
        this.example = new CanonicalType();
        return this.example;
      } else if (name.equals("relativePath")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.relativePath");
      } else
        return super.addChild(name);
    }

    public ManifestResourceComponent copy() {
      ManifestResourceComponent dst = new ManifestResourceComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ManifestResourceComponent dst) {
      super.copyValues(dst);
      dst.reference = reference == null ? null : reference.copy();
      dst.example = example == null ? null : example.copy();
      dst.relativePath = relativePath == null ? null : relativePath.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ManifestResourceComponent))
        return false;
      ManifestResourceComponent o = (ManifestResourceComponent) other_;
      return compareDeep(reference, o.reference, true) && compareDeep(example, o.example, true)
          && compareDeep(relativePath, o.relativePath, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ManifestResourceComponent))
        return false;
      ManifestResourceComponent o = (ManifestResourceComponent) other_;
      return compareValues(relativePath, o.relativePath, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(reference, example, relativePath);
    }

    public String fhirType() {
      return "ImplementationGuide.manifest.resource";

    }

  }

  @Block()
  public static class ManifestPageComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Relative path to the page.
     */
    @Child(name = "name", type = { StringType.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "HTML page name", formalDefinition = "Relative path to the page.")
    protected StringType name;

    /**
     * Label for the page intended for human display.
     */
    @Child(name = "title", type = { StringType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Title of the page, for references", formalDefinition = "Label for the page intended for human display.")
    protected StringType title;

    /**
     * The name of an anchor available on the page.
     */
    @Child(name = "anchor", type = {
        StringType.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Anchor available on the page", formalDefinition = "The name of an anchor available on the page.")
    protected List<StringType> anchor;

    private static final long serialVersionUID = 1920576611L;

    /**
     * Constructor
     */
    public ManifestPageComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ManifestPageComponent(StringType name) {
      super();
      this.name = name;
    }

    /**
     * @return {@link #name} (Relative path to the page.). This is the underlying
     *         object with id, value and extensions. The accessor "getName" gives
     *         direct access to the value
     */
    public StringType getNameElement() {
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ManifestPageComponent.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() {
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (Relative path to the page.). This is the
     *              underlying object with id, value and extensions. The accessor
     *              "getName" gives direct access to the value
     */
    public ManifestPageComponent setNameElement(StringType value) {
      this.name = value;
      return this;
    }

    /**
     * @return Relative path to the page.
     */
    public String getName() {
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Relative path to the page.
     */
    public ManifestPageComponent setName(String value) {
      if (this.name == null)
        this.name = new StringType();
      this.name.setValue(value);
      return this;
    }

    /**
     * @return {@link #title} (Label for the page intended for human display.). This
     *         is the underlying object with id, value and extensions. The accessor
     *         "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() {
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ManifestPageComponent.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() {
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() {
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (Label for the page intended for human display.).
     *              This is the underlying object with id, value and extensions. The
     *              accessor "getTitle" gives direct access to the value
     */
    public ManifestPageComponent setTitleElement(StringType value) {
      this.title = value;
      return this;
    }

    /**
     * @return Label for the page intended for human display.
     */
    public String getTitle() {
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value Label for the page intended for human display.
     */
    public ManifestPageComponent setTitle(String value) {
      if (Utilities.noString(value))
        this.title = null;
      else {
        if (this.title == null)
          this.title = new StringType();
        this.title.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #anchor} (The name of an anchor available on the page.)
     */
    public List<StringType> getAnchor() {
      if (this.anchor == null)
        this.anchor = new ArrayList<StringType>();
      return this.anchor;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ManifestPageComponent setAnchor(List<StringType> theAnchor) {
      this.anchor = theAnchor;
      return this;
    }

    public boolean hasAnchor() {
      if (this.anchor == null)
        return false;
      for (StringType item : this.anchor)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #anchor} (The name of an anchor available on the page.)
     */
    public StringType addAnchorElement() {// 2
      StringType t = new StringType();
      if (this.anchor == null)
        this.anchor = new ArrayList<StringType>();
      this.anchor.add(t);
      return t;
    }

    /**
     * @param value {@link #anchor} (The name of an anchor available on the page.)
     */
    public ManifestPageComponent addAnchor(String value) { // 1
      StringType t = new StringType();
      t.setValue(value);
      if (this.anchor == null)
        this.anchor = new ArrayList<StringType>();
      this.anchor.add(t);
      return this;
    }

    /**
     * @param value {@link #anchor} (The name of an anchor available on the page.)
     */
    public boolean hasAnchor(String value) {
      if (this.anchor == null)
        return false;
      for (StringType v : this.anchor)
        if (v.getValue().equals(value)) // string
          return true;
      return false;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("name", "string", "Relative path to the page.", 0, 1, name));
      children.add(new Property("title", "string", "Label for the page intended for human display.", 0, 1, title));
      children.add(new Property("anchor", "string", "The name of an anchor available on the page.", 0,
          java.lang.Integer.MAX_VALUE, anchor));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3373707:
        /* name */ return new Property("name", "string", "Relative path to the page.", 0, 1, name);
      case 110371416:
        /* title */ return new Property("title", "string", "Label for the page intended for human display.", 0, 1,
            title);
      case -1413299531:
        /* anchor */ return new Property("anchor", "string", "The name of an anchor available on the page.", 0,
            java.lang.Integer.MAX_VALUE, anchor);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
      case 110371416:
        /* title */ return this.title == null ? new Base[0] : new Base[] { this.title }; // StringType
      case -1413299531:
        /* anchor */ return this.anchor == null ? new Base[0] : this.anchor.toArray(new Base[this.anchor.size()]); // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3373707: // name
        this.name = castToString(value); // StringType
        return value;
      case 110371416: // title
        this.title = castToString(value); // StringType
        return value;
      case -1413299531: // anchor
        this.getAnchor().add(castToString(value)); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("name")) {
        this.name = castToString(value); // StringType
      } else if (name.equals("title")) {
        this.title = castToString(value); // StringType
      } else if (name.equals("anchor")) {
        this.getAnchor().add(castToString(value));
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("name")) {
        this.name = null;
      } else if (name.equals("title")) {
        this.title = null;
      } else if (name.equals("anchor")) {
        this.getAnchor().remove(castToString(value));
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3373707:
        return getNameElement();
      case 110371416:
        return getTitleElement();
      case -1413299531:
        return addAnchorElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return new String[] { "string" };
      case 110371416:
        /* title */ return new String[] { "string" };
      case -1413299531:
        /* anchor */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("name")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.name");
      } else if (name.equals("title")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.title");
      } else if (name.equals("anchor")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.anchor");
      } else
        return super.addChild(name);
    }

    public ManifestPageComponent copy() {
      ManifestPageComponent dst = new ManifestPageComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ManifestPageComponent dst) {
      super.copyValues(dst);
      dst.name = name == null ? null : name.copy();
      dst.title = title == null ? null : title.copy();
      if (anchor != null) {
        dst.anchor = new ArrayList<StringType>();
        for (StringType i : anchor)
          dst.anchor.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ManifestPageComponent))
        return false;
      ManifestPageComponent o = (ManifestPageComponent) other_;
      return compareDeep(name, o.name, true) && compareDeep(title, o.title, true)
          && compareDeep(anchor, o.anchor, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ManifestPageComponent))
        return false;
      ManifestPageComponent o = (ManifestPageComponent) other_;
      return compareValues(name, o.name, true) && compareValues(title, o.title, true)
          && compareValues(anchor, o.anchor, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, title, anchor);
    }

    public String fhirType() {
      return "ImplementationGuide.manifest.page";

    }

  }

  /**
   * A copyright statement relating to the implementation guide and/or its
   * contents. Copyright statements are generally legal restrictions on the use
   * and publishing of the implementation guide.
   */
  @Child(name = "copyright", type = {
      MarkdownType.class }, order = 0, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Use and/or publishing restrictions", formalDefinition = "A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the implementation guide.")
  protected MarkdownType copyright;

  /**
   * The NPM package name for this Implementation Guide, used in the NPM package
   * distribution, which is the primary mechanism by which FHIR based tooling
   * manages IG dependencies. This value must be globally unique, and should be
   * assigned with care.
   */
  @Child(name = "packageId", type = { IdType.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "NPM Package name for IG", formalDefinition = "The NPM package name for this Implementation Guide, used in the NPM package distribution, which is the primary mechanism by which FHIR based tooling manages IG dependencies. This value must be globally unique, and should be assigned with care.")
  protected IdType packageId;

  /**
   * The license that applies to this Implementation Guide, using an SPDX license
   * code, or 'not-open-source'.
   */
  @Child(name = "license", type = { CodeType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "SPDX license code for this IG (or not-open-source)", formalDefinition = "The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/spdx-license")
  protected Enumeration<SPDXLicense> license;

  /**
   * The version(s) of the FHIR specification that this ImplementationGuide
   * targets - e.g. describes how to use. The value of this element is the formal
   * version of the specification, without the revision number, e.g.
   * [publication].[major].[minor], which is 4.0.1. for this version.
   */
  @Child(name = "fhirVersion", type = {
      CodeType.class }, order = 3, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "FHIR Version(s) this Implementation Guide targets", formalDefinition = "The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/FHIR-version")
  protected List<Enumeration<FHIRVersion>> fhirVersion;

  /**
   * Another implementation guide that this implementation depends on. Typically,
   * an implementation guide uses value sets, profiles etc.defined in other
   * implementation guides.
   */
  @Child(name = "dependsOn", type = {}, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Another Implementation guide this depends on", formalDefinition = "Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.")
  protected List<ImplementationGuideDependsOnComponent> dependsOn;

  /**
   * A set of profiles that all resources covered by this implementation guide
   * must conform to.
   */
  @Child(name = "global", type = {}, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Profiles that apply globally", formalDefinition = "A set of profiles that all resources covered by this implementation guide must conform to.")
  protected List<ImplementationGuideGlobalComponent> global;

  /**
   * The information needed by an IG publisher tool to publish the whole
   * implementation guide.
   */
  @Child(name = "definition", type = {}, order = 6, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Information needed to build the IG", formalDefinition = "The information needed by an IG publisher tool to publish the whole implementation guide.")
  protected ImplementationGuideDefinitionComponent definition;

  /**
   * Information about an assembled implementation guide, created by the
   * publication tooling.
   */
  @Child(name = "manifest", type = {}, order = 7, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Information about an assembled IG", formalDefinition = "Information about an assembled implementation guide, created by the publication tooling.")
  protected ImplementationGuideManifestComponent manifest;

  private static final long serialVersionUID = 415193005L;

  /**
   * Constructor
   */
  public ImplementationGuide() {
    super();
  }

  /**
   * Constructor
   */
  public ImplementationGuide(UriType url, StringType name, Enumeration<PublicationStatus> status, IdType packageId) {
    super();
    this.url = url;
    this.name = name;
    this.status = status;
    this.packageId = packageId;
  }

  /**
   * @return {@link #url} (An absolute URI that is used to identify this
   *         implementation guide when it is referenced in a specification, model,
   *         design or an instance; also called its canonical identifier. This
   *         SHOULD be globally unique and SHOULD be a literal address at which at
   *         which an authoritative instance of this implementation guide is (or
   *         will be) published. This URL can be the target of a canonical
   *         reference. It SHALL remain the same when the implementation guide is
   *         stored on different servers.). This is the underlying object with id,
   *         value and extensions. The accessor "getUrl" gives direct access to
   *         the value
   */
  public UriType getUrlElement() {
    if (this.url == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.url");
      else if (Configuration.doAutoCreate())
        this.url = new UriType(); // bb
    return this.url;
  }

  public boolean hasUrlElement() {
    return this.url != null && !this.url.isEmpty();
  }

  public boolean hasUrl() {
    return this.url != null && !this.url.isEmpty();
  }

  /**
   * @param value {@link #url} (An absolute URI that is used to identify this
   *              implementation guide when it is referenced in a specification,
   *              model, design or an instance; also called its canonical
   *              identifier. This SHOULD be globally unique and SHOULD be a
   *              literal address at which at which an authoritative instance of
   *              this implementation guide is (or will be) published. This URL
   *              can be the target of a canonical reference. It SHALL remain the
   *              same when the implementation guide is stored on different
   *              servers.). This is the underlying object with id, value and
   *              extensions. The accessor "getUrl" gives direct access to the
   *              value
   */
  public ImplementationGuide setUrlElement(UriType value) {
    this.url = value;
    return this;
  }

  /**
   * @return An absolute URI that is used to identify this implementation guide
   *         when it is referenced in a specification, model, design or an
   *         instance; also called its canonical identifier. This SHOULD be
   *         globally unique and SHOULD be a literal address at which at which an
   *         authoritative instance of this implementation guide is (or will be)
   *         published. This URL can be the target of a canonical reference. It
   *         SHALL remain the same when the implementation guide is stored on
   *         different servers.
   */
  public String getUrl() {
    return this.url == null ? null : this.url.getValue();
  }

  /**
   * @param value An absolute URI that is used to identify this implementation
   *              guide when it is referenced in a specification, model, design or
   *              an instance; also called its canonical identifier. This SHOULD
   *              be globally unique and SHOULD be a literal address at which at
   *              which an authoritative instance of this implementation guide is
   *              (or will be) published. This URL can be the target of a
   *              canonical reference. It SHALL remain the same when the
   *              implementation guide is stored on different servers.
   */
  public ImplementationGuide setUrl(String value) {
    if (this.url == null)
      this.url = new UriType();
    this.url.setValue(value);
    return this;
  }

  /**
   * @return {@link #version} (The identifier that is used to identify this
   *         version of the implementation guide when it is referenced in a
   *         specification, model, design or instance. This is an arbitrary value
   *         managed by the implementation guide author and is not expected to be
   *         globally unique. For example, it might be a timestamp (e.g. yyyymmdd)
   *         if a managed version is not available. There is also no expectation
   *         that versions can be placed in a lexicographical sequence.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getVersion" gives direct access to the value
   */
  public StringType getVersionElement() {
    if (this.version == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.version");
      else if (Configuration.doAutoCreate())
        this.version = new StringType(); // bb
    return this.version;
  }

  public boolean hasVersionElement() {
    return this.version != null && !this.version.isEmpty();
  }

  public boolean hasVersion() {
    return this.version != null && !this.version.isEmpty();
  }

  /**
   * @param value {@link #version} (The identifier that is used to identify this
   *              version of the implementation guide when it is referenced in a
   *              specification, model, design or instance. This is an arbitrary
   *              value managed by the implementation guide author and is not
   *              expected to be globally unique. For example, it might be a
   *              timestamp (e.g. yyyymmdd) if a managed version is not available.
   *              There is also no expectation that versions can be placed in a
   *              lexicographical sequence.). This is the underlying object with
   *              id, value and extensions. The accessor "getVersion" gives direct
   *              access to the value
   */
  public ImplementationGuide setVersionElement(StringType value) {
    this.version = value;
    return this;
  }

  /**
   * @return The identifier that is used to identify this version of the
   *         implementation guide when it is referenced in a specification, model,
   *         design or instance. This is an arbitrary value managed by the
   *         implementation guide author and is not expected to be globally
   *         unique. For example, it might be a timestamp (e.g. yyyymmdd) if a
   *         managed version is not available. There is also no expectation that
   *         versions can be placed in a lexicographical sequence.
   */
  public String getVersion() {
    return this.version == null ? null : this.version.getValue();
  }

  /**
   * @param value The identifier that is used to identify this version of the
   *              implementation guide when it is referenced in a specification,
   *              model, design or instance. This is an arbitrary value managed by
   *              the implementation guide author and is not expected to be
   *              globally unique. For example, it might be a timestamp (e.g.
   *              yyyymmdd) if a managed version is not available. There is also
   *              no expectation that versions can be placed in a lexicographical
   *              sequence.
   */
  public ImplementationGuide setVersion(String value) {
    if (Utilities.noString(value))
      this.version = null;
    else {
      if (this.version == null)
        this.version = new StringType();
      this.version.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #name} (A natural language name identifying the implementation
   *         guide. This name should be usable as an identifier for the module by
   *         machine processing applications such as code generation.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getName" gives direct access to the value
   */
  public StringType getNameElement() {
    if (this.name == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.name");
      else if (Configuration.doAutoCreate())
        this.name = new StringType(); // bb
    return this.name;
  }

  public boolean hasNameElement() {
    return this.name != null && !this.name.isEmpty();
  }

  public boolean hasName() {
    return this.name != null && !this.name.isEmpty();
  }

  /**
   * @param value {@link #name} (A natural language name identifying the
   *              implementation guide. This name should be usable as an
   *              identifier for the module by machine processing applications
   *              such as code generation.). This is the underlying object with
   *              id, value and extensions. The accessor "getName" gives direct
   *              access to the value
   */
  public ImplementationGuide setNameElement(StringType value) {
    this.name = value;
    return this;
  }

  /**
   * @return A natural language name identifying the implementation guide. This
   *         name should be usable as an identifier for the module by machine
   *         processing applications such as code generation.
   */
  public String getName() {
    return this.name == null ? null : this.name.getValue();
  }

  /**
   * @param value A natural language name identifying the implementation guide.
   *              This name should be usable as an identifier for the module by
   *              machine processing applications such as code generation.
   */
  public ImplementationGuide setName(String value) {
    if (this.name == null)
      this.name = new StringType();
    this.name.setValue(value);
    return this;
  }

  /**
   * @return {@link #title} (A short, descriptive, user-friendly title for the
   *         implementation guide.). This is the underlying object with id, value
   *         and extensions. The accessor "getTitle" gives direct access to the
   *         value
   */
  public StringType getTitleElement() {
    if (this.title == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.title");
      else if (Configuration.doAutoCreate())
        this.title = new StringType(); // bb
    return this.title;
  }

  public boolean hasTitleElement() {
    return this.title != null && !this.title.isEmpty();
  }

  public boolean hasTitle() {
    return this.title != null && !this.title.isEmpty();
  }

  /**
   * @param value {@link #title} (A short, descriptive, user-friendly title for
   *              the implementation guide.). This is the underlying object with
   *              id, value and extensions. The accessor "getTitle" gives direct
   *              access to the value
   */
  public ImplementationGuide setTitleElement(StringType value) {
    this.title = value;
    return this;
  }

  /**
   * @return A short, descriptive, user-friendly title for the implementation
   *         guide.
   */
  public String getTitle() {
    return this.title == null ? null : this.title.getValue();
  }

  /**
   * @param value A short, descriptive, user-friendly title for the implementation
   *              guide.
   */
  public ImplementationGuide setTitle(String value) {
    if (Utilities.noString(value))
      this.title = null;
    else {
      if (this.title == null)
        this.title = new StringType();
      this.title.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #status} (The status of this implementation guide. Enables
   *         tracking the life-cycle of the content.). This is the underlying
   *         object with id, value and extensions. The accessor "getStatus" gives
   *         direct access to the value
   */
  public Enumeration<PublicationStatus> getStatusElement() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.status");
      else if (Configuration.doAutoCreate())
        this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory()); // bb
    return this.status;
  }

  public boolean hasStatusElement() {
    return this.status != null && !this.status.isEmpty();
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (The status of this implementation guide.
   *              Enables tracking the life-cycle of the content.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getStatus" gives direct access to the value
   */
  public ImplementationGuide setStatusElement(Enumeration<PublicationStatus> value) {
    this.status = value;
    return this;
  }

  /**
   * @return The status of this implementation guide. Enables tracking the
   *         life-cycle of the content.
   */
  public PublicationStatus getStatus() {
    return this.status == null ? null : this.status.getValue();
  }

  /**
   * @param value The status of this implementation guide. Enables tracking the
   *              life-cycle of the content.
   */
  public ImplementationGuide setStatus(PublicationStatus value) {
    if (this.status == null)
      this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory());
    this.status.setValue(value);
    return this;
  }

  /**
   * @return {@link #experimental} (A Boolean value to indicate that this
   *         implementation guide is authored for testing purposes (or
   *         education/evaluation/marketing) and is not intended to be used for
   *         genuine usage.). This is the underlying object with id, value and
   *         extensions. The accessor "getExperimental" gives direct access to the
   *         value
   */
  public BooleanType getExperimentalElement() {
    if (this.experimental == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.experimental");
      else if (Configuration.doAutoCreate())
        this.experimental = new BooleanType(); // bb
    return this.experimental;
  }

  public boolean hasExperimentalElement() {
    return this.experimental != null && !this.experimental.isEmpty();
  }

  public boolean hasExperimental() {
    return this.experimental != null && !this.experimental.isEmpty();
  }

  /**
   * @param value {@link #experimental} (A Boolean value to indicate that this
   *              implementation guide is authored for testing purposes (or
   *              education/evaluation/marketing) and is not intended to be used
   *              for genuine usage.). This is the underlying object with id,
   *              value and extensions. The accessor "getExperimental" gives
   *              direct access to the value
   */
  public ImplementationGuide setExperimentalElement(BooleanType value) {
    this.experimental = value;
    return this;
  }

  /**
   * @return A Boolean value to indicate that this implementation guide is
   *         authored for testing purposes (or education/evaluation/marketing) and
   *         is not intended to be used for genuine usage.
   */
  public boolean getExperimental() {
    return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
  }

  /**
   * @param value A Boolean value to indicate that this implementation guide is
   *              authored for testing purposes (or
   *              education/evaluation/marketing) and is not intended to be used
   *              for genuine usage.
   */
  public ImplementationGuide setExperimental(boolean value) {
    if (this.experimental == null)
      this.experimental = new BooleanType();
    this.experimental.setValue(value);
    return this;
  }

  /**
   * @return {@link #date} (The date (and optionally time) when the implementation
   *         guide was published. The date must change when the business version
   *         changes and it must change if the status code changes. In addition,
   *         it should change when the substantive content of the implementation
   *         guide changes.). This is the underlying object with id, value and
   *         extensions. The accessor "getDate" gives direct access to the value
   */
  public DateTimeType getDateElement() {
    if (this.date == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.date");
      else if (Configuration.doAutoCreate())
        this.date = new DateTimeType(); // bb
    return this.date;
  }

  public boolean hasDateElement() {
    return this.date != null && !this.date.isEmpty();
  }

  public boolean hasDate() {
    return this.date != null && !this.date.isEmpty();
  }

  /**
   * @param value {@link #date} (The date (and optionally time) when the
   *              implementation guide was published. The date must change when
   *              the business version changes and it must change if the status
   *              code changes. In addition, it should change when the substantive
   *              content of the implementation guide changes.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getDate" gives direct access to the value
   */
  public ImplementationGuide setDateElement(DateTimeType value) {
    this.date = value;
    return this;
  }

  /**
   * @return The date (and optionally time) when the implementation guide was
   *         published. The date must change when the business version changes and
   *         it must change if the status code changes. In addition, it should
   *         change when the substantive content of the implementation guide
   *         changes.
   */
  public Date getDate() {
    return this.date == null ? null : this.date.getValue();
  }

  /**
   * @param value The date (and optionally time) when the implementation guide was
   *              published. The date must change when the business version
   *              changes and it must change if the status code changes. In
   *              addition, it should change when the substantive content of the
   *              implementation guide changes.
   */
  public ImplementationGuide setDate(Date value) {
    if (value == null)
      this.date = null;
    else {
      if (this.date == null)
        this.date = new DateTimeType();
      this.date.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #publisher} (The name of the organization or individual that
   *         published the implementation guide.). This is the underlying object
   *         with id, value and extensions. The accessor "getPublisher" gives
   *         direct access to the value
   */
  public StringType getPublisherElement() {
    if (this.publisher == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.publisher");
      else if (Configuration.doAutoCreate())
        this.publisher = new StringType(); // bb
    return this.publisher;
  }

  public boolean hasPublisherElement() {
    return this.publisher != null && !this.publisher.isEmpty();
  }

  public boolean hasPublisher() {
    return this.publisher != null && !this.publisher.isEmpty();
  }

  /**
   * @param value {@link #publisher} (The name of the organization or individual
   *              that published the implementation guide.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getPublisher" gives direct access to the value
   */
  public ImplementationGuide setPublisherElement(StringType value) {
    this.publisher = value;
    return this;
  }

  /**
   * @return The name of the organization or individual that published the
   *         implementation guide.
   */
  public String getPublisher() {
    return this.publisher == null ? null : this.publisher.getValue();
  }

  /**
   * @param value The name of the organization or individual that published the
   *              implementation guide.
   */
  public ImplementationGuide setPublisher(String value) {
    if (Utilities.noString(value))
      this.publisher = null;
    else {
      if (this.publisher == null)
        this.publisher = new StringType();
      this.publisher.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #contact} (Contact details to assist a user in finding and
   *         communicating with the publisher.)
   */
  public List<ContactDetail> getContact() {
    if (this.contact == null)
      this.contact = new ArrayList<ContactDetail>();
    return this.contact;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setContact(List<ContactDetail> theContact) {
    this.contact = theContact;
    return this;
  }

  public boolean hasContact() {
    if (this.contact == null)
      return false;
    for (ContactDetail item : this.contact)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ContactDetail addContact() { // 3
    ContactDetail t = new ContactDetail();
    if (this.contact == null)
      this.contact = new ArrayList<ContactDetail>();
    this.contact.add(t);
    return t;
  }

  public ImplementationGuide addContact(ContactDetail t) { // 3
    if (t == null)
      return this;
    if (this.contact == null)
      this.contact = new ArrayList<ContactDetail>();
    this.contact.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #contact}, creating it
   *         if it does not already exist
   */
  public ContactDetail getContactFirstRep() {
    if (getContact().isEmpty()) {
      addContact();
    }
    return getContact().get(0);
  }

  /**
   * @return {@link #description} (A free text natural language description of the
   *         implementation guide from a consumer's perspective.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getDescription" gives direct access to the value
   */
  public MarkdownType getDescriptionElement() {
    if (this.description == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.description");
      else if (Configuration.doAutoCreate())
        this.description = new MarkdownType(); // bb
    return this.description;
  }

  public boolean hasDescriptionElement() {
    return this.description != null && !this.description.isEmpty();
  }

  public boolean hasDescription() {
    return this.description != null && !this.description.isEmpty();
  }

  /**
   * @param value {@link #description} (A free text natural language description
   *              of the implementation guide from a consumer's perspective.).
   *              This is the underlying object with id, value and extensions. The
   *              accessor "getDescription" gives direct access to the value
   */
  public ImplementationGuide setDescriptionElement(MarkdownType value) {
    this.description = value;
    return this;
  }

  /**
   * @return A free text natural language description of the implementation guide
   *         from a consumer's perspective.
   */
  public String getDescription() {
    return this.description == null ? null : this.description.getValue();
  }

  /**
   * @param value A free text natural language description of the implementation
   *              guide from a consumer's perspective.
   */
  public ImplementationGuide setDescription(String value) {
    if (value == null)
      this.description = null;
    else {
      if (this.description == null)
        this.description = new MarkdownType();
      this.description.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #useContext} (The content was developed with a focus and
   *         intent of supporting the contexts that are listed. These contexts may
   *         be general categories (gender, age, ...) or may be references to
   *         specific programs (insurance plans, studies, ...) and may be used to
   *         assist with indexing and searching for appropriate implementation
   *         guide instances.)
   */
  public List<UsageContext> getUseContext() {
    if (this.useContext == null)
      this.useContext = new ArrayList<UsageContext>();
    return this.useContext;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setUseContext(List<UsageContext> theUseContext) {
    this.useContext = theUseContext;
    return this;
  }

  public boolean hasUseContext() {
    if (this.useContext == null)
      return false;
    for (UsageContext item : this.useContext)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public UsageContext addUseContext() { // 3
    UsageContext t = new UsageContext();
    if (this.useContext == null)
      this.useContext = new ArrayList<UsageContext>();
    this.useContext.add(t);
    return t;
  }

  public ImplementationGuide addUseContext(UsageContext t) { // 3
    if (t == null)
      return this;
    if (this.useContext == null)
      this.useContext = new ArrayList<UsageContext>();
    this.useContext.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #useContext}, creating
   *         it if it does not already exist
   */
  public UsageContext getUseContextFirstRep() {
    if (getUseContext().isEmpty()) {
      addUseContext();
    }
    return getUseContext().get(0);
  }

  /**
   * @return {@link #jurisdiction} (A legal or geographic region in which the
   *         implementation guide is intended to be used.)
   */
  public List<CodeableConcept> getJurisdiction() {
    if (this.jurisdiction == null)
      this.jurisdiction = new ArrayList<CodeableConcept>();
    return this.jurisdiction;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setJurisdiction(List<CodeableConcept> theJurisdiction) {
    this.jurisdiction = theJurisdiction;
    return this;
  }

  public boolean hasJurisdiction() {
    if (this.jurisdiction == null)
      return false;
    for (CodeableConcept item : this.jurisdiction)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addJurisdiction() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.jurisdiction == null)
      this.jurisdiction = new ArrayList<CodeableConcept>();
    this.jurisdiction.add(t);
    return t;
  }

  public ImplementationGuide addJurisdiction(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.jurisdiction == null)
      this.jurisdiction = new ArrayList<CodeableConcept>();
    this.jurisdiction.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #jurisdiction},
   *         creating it if it does not already exist
   */
  public CodeableConcept getJurisdictionFirstRep() {
    if (getJurisdiction().isEmpty()) {
      addJurisdiction();
    }
    return getJurisdiction().get(0);
  }

  /**
   * @return {@link #copyright} (A copyright statement relating to the
   *         implementation guide and/or its contents. Copyright statements are
   *         generally legal restrictions on the use and publishing of the
   *         implementation guide.). This is the underlying object with id, value
   *         and extensions. The accessor "getCopyright" gives direct access to
   *         the value
   */
  public MarkdownType getCopyrightElement() {
    if (this.copyright == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.copyright");
      else if (Configuration.doAutoCreate())
        this.copyright = new MarkdownType(); // bb
    return this.copyright;
  }

  public boolean hasCopyrightElement() {
    return this.copyright != null && !this.copyright.isEmpty();
  }

  public boolean hasCopyright() {
    return this.copyright != null && !this.copyright.isEmpty();
  }

  /**
   * @param value {@link #copyright} (A copyright statement relating to the
   *              implementation guide and/or its contents. Copyright statements
   *              are generally legal restrictions on the use and publishing of
   *              the implementation guide.). This is the underlying object with
   *              id, value and extensions. The accessor "getCopyright" gives
   *              direct access to the value
   */
  public ImplementationGuide setCopyrightElement(MarkdownType value) {
    this.copyright = value;
    return this;
  }

  /**
   * @return A copyright statement relating to the implementation guide and/or its
   *         contents. Copyright statements are generally legal restrictions on
   *         the use and publishing of the implementation guide.
   */
  public String getCopyright() {
    return this.copyright == null ? null : this.copyright.getValue();
  }

  /**
   * @param value A copyright statement relating to the implementation guide
   *              and/or its contents. Copyright statements are generally legal
   *              restrictions on the use and publishing of the implementation
   *              guide.
   */
  public ImplementationGuide setCopyright(String value) {
    if (value == null)
      this.copyright = null;
    else {
      if (this.copyright == null)
        this.copyright = new MarkdownType();
      this.copyright.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #packageId} (The NPM package name for this Implementation
   *         Guide, used in the NPM package distribution, which is the primary
   *         mechanism by which FHIR based tooling manages IG dependencies. This
   *         value must be globally unique, and should be assigned with care.).
   *         This is the underlying object with id, value and extensions. The
   *         accessor "getPackageId" gives direct access to the value
   */
  public IdType getPackageIdElement() {
    if (this.packageId == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.packageId");
      else if (Configuration.doAutoCreate())
        this.packageId = new IdType(); // bb
    return this.packageId;
  }

  public boolean hasPackageIdElement() {
    return this.packageId != null && !this.packageId.isEmpty();
  }

  public boolean hasPackageId() {
    return this.packageId != null && !this.packageId.isEmpty();
  }

  /**
   * @param value {@link #packageId} (The NPM package name for this Implementation
   *              Guide, used in the NPM package distribution, which is the
   *              primary mechanism by which FHIR based tooling manages IG
   *              dependencies. This value must be globally unique, and should be
   *              assigned with care.). This is the underlying object with id,
   *              value and extensions. The accessor "getPackageId" gives direct
   *              access to the value
   */
  public ImplementationGuide setPackageIdElement(IdType value) {
    this.packageId = value;
    return this;
  }

  /**
   * @return The NPM package name for this Implementation Guide, used in the NPM
   *         package distribution, which is the primary mechanism by which FHIR
   *         based tooling manages IG dependencies. This value must be globally
   *         unique, and should be assigned with care.
   */
  public String getPackageId() {
    return this.packageId == null ? null : this.packageId.getValue();
  }

  /**
   * @param value The NPM package name for this Implementation Guide, used in the
   *              NPM package distribution, which is the primary mechanism by
   *              which FHIR based tooling manages IG dependencies. This value
   *              must be globally unique, and should be assigned with care.
   */
  public ImplementationGuide setPackageId(String value) {
    if (this.packageId == null)
      this.packageId = new IdType();
    this.packageId.setValue(value);
    return this;
  }

  /**
   * @return {@link #license} (The license that applies to this Implementation
   *         Guide, using an SPDX license code, or 'not-open-source'.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getLicense" gives direct access to the value
   */
  public Enumeration<SPDXLicense> getLicenseElement() {
    if (this.license == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.license");
      else if (Configuration.doAutoCreate())
        this.license = new Enumeration<SPDXLicense>(new SPDXLicenseEnumFactory()); // bb
    return this.license;
  }

  public boolean hasLicenseElement() {
    return this.license != null && !this.license.isEmpty();
  }

  public boolean hasLicense() {
    return this.license != null && !this.license.isEmpty();
  }

  /**
   * @param value {@link #license} (The license that applies to this
   *              Implementation Guide, using an SPDX license code, or
   *              'not-open-source'.). This is the underlying object with id,
   *              value and extensions. The accessor "getLicense" gives direct
   *              access to the value
   */
  public ImplementationGuide setLicenseElement(Enumeration<SPDXLicense> value) {
    this.license = value;
    return this;
  }

  /**
   * @return The license that applies to this Implementation Guide, using an SPDX
   *         license code, or 'not-open-source'.
   */
  public SPDXLicense getLicense() {
    return this.license == null ? null : this.license.getValue();
  }

  /**
   * @param value The license that applies to this Implementation Guide, using an
   *              SPDX license code, or 'not-open-source'.
   */
  public ImplementationGuide setLicense(SPDXLicense value) {
    if (value == null)
      this.license = null;
    else {
      if (this.license == null)
        this.license = new Enumeration<SPDXLicense>(new SPDXLicenseEnumFactory());
      this.license.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #fhirVersion} (The version(s) of the FHIR specification that
   *         this ImplementationGuide targets - e.g. describes how to use. The
   *         value of this element is the formal version of the specification,
   *         without the revision number, e.g. [publication].[major].[minor],
   *         which is 4.0.1. for this version.)
   */
  public List<Enumeration<FHIRVersion>> getFhirVersion() {
    if (this.fhirVersion == null)
      this.fhirVersion = new ArrayList<Enumeration<FHIRVersion>>();
    return this.fhirVersion;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setFhirVersion(List<Enumeration<FHIRVersion>> theFhirVersion) {
    this.fhirVersion = theFhirVersion;
    return this;
  }

  public boolean hasFhirVersion() {
    if (this.fhirVersion == null)
      return false;
    for (Enumeration<FHIRVersion> item : this.fhirVersion)
      if (!item.isEmpty())
        return true;
    return false;
  }

  /**
   * @return {@link #fhirVersion} (The version(s) of the FHIR specification that
   *         this ImplementationGuide targets - e.g. describes how to use. The
   *         value of this element is the formal version of the specification,
   *         without the revision number, e.g. [publication].[major].[minor],
   *         which is 4.0.1. for this version.)
   */
  public Enumeration<FHIRVersion> addFhirVersionElement() {// 2
    Enumeration<FHIRVersion> t = new Enumeration<FHIRVersion>(new FHIRVersionEnumFactory());
    if (this.fhirVersion == null)
      this.fhirVersion = new ArrayList<Enumeration<FHIRVersion>>();
    this.fhirVersion.add(t);
    return t;
  }

  /**
   * @param value {@link #fhirVersion} (The version(s) of the FHIR specification
   *              that this ImplementationGuide targets - e.g. describes how to
   *              use. The value of this element is the formal version of the
   *              specification, without the revision number, e.g.
   *              [publication].[major].[minor], which is 4.0.1. for this
   *              version.)
   */
  public ImplementationGuide addFhirVersion(FHIRVersion value) { // 1
    Enumeration<FHIRVersion> t = new Enumeration<FHIRVersion>(new FHIRVersionEnumFactory());
    t.setValue(value);
    if (this.fhirVersion == null)
      this.fhirVersion = new ArrayList<Enumeration<FHIRVersion>>();
    this.fhirVersion.add(t);
    return this;
  }

  /**
   * @param value {@link #fhirVersion} (The version(s) of the FHIR specification
   *              that this ImplementationGuide targets - e.g. describes how to
   *              use. The value of this element is the formal version of the
   *              specification, without the revision number, e.g.
   *              [publication].[major].[minor], which is 4.0.1. for this
   *              version.)
   */
  public boolean hasFhirVersion(FHIRVersion value) {
    if (this.fhirVersion == null)
      return false;
    for (Enumeration<FHIRVersion> v : this.fhirVersion)
      if (v.getValue().equals(value)) // code
        return true;
    return false;
  }

  /**
   * @return {@link #dependsOn} (Another implementation guide that this
   *         implementation depends on. Typically, an implementation guide uses
   *         value sets, profiles etc.defined in other implementation guides.)
   */
  public List<ImplementationGuideDependsOnComponent> getDependsOn() {
    if (this.dependsOn == null)
      this.dependsOn = new ArrayList<ImplementationGuideDependsOnComponent>();
    return this.dependsOn;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setDependsOn(List<ImplementationGuideDependsOnComponent> theDependsOn) {
    this.dependsOn = theDependsOn;
    return this;
  }

  public boolean hasDependsOn() {
    if (this.dependsOn == null)
      return false;
    for (ImplementationGuideDependsOnComponent item : this.dependsOn)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ImplementationGuideDependsOnComponent addDependsOn() { // 3
    ImplementationGuideDependsOnComponent t = new ImplementationGuideDependsOnComponent();
    if (this.dependsOn == null)
      this.dependsOn = new ArrayList<ImplementationGuideDependsOnComponent>();
    this.dependsOn.add(t);
    return t;
  }

  public ImplementationGuide addDependsOn(ImplementationGuideDependsOnComponent t) { // 3
    if (t == null)
      return this;
    if (this.dependsOn == null)
      this.dependsOn = new ArrayList<ImplementationGuideDependsOnComponent>();
    this.dependsOn.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #dependsOn}, creating
   *         it if it does not already exist
   */
  public ImplementationGuideDependsOnComponent getDependsOnFirstRep() {
    if (getDependsOn().isEmpty()) {
      addDependsOn();
    }
    return getDependsOn().get(0);
  }

  /**
   * @return {@link #global} (A set of profiles that all resources covered by this
   *         implementation guide must conform to.)
   */
  public List<ImplementationGuideGlobalComponent> getGlobal() {
    if (this.global == null)
      this.global = new ArrayList<ImplementationGuideGlobalComponent>();
    return this.global;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setGlobal(List<ImplementationGuideGlobalComponent> theGlobal) {
    this.global = theGlobal;
    return this;
  }

  public boolean hasGlobal() {
    if (this.global == null)
      return false;
    for (ImplementationGuideGlobalComponent item : this.global)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ImplementationGuideGlobalComponent addGlobal() { // 3
    ImplementationGuideGlobalComponent t = new ImplementationGuideGlobalComponent();
    if (this.global == null)
      this.global = new ArrayList<ImplementationGuideGlobalComponent>();
    this.global.add(t);
    return t;
  }

  public ImplementationGuide addGlobal(ImplementationGuideGlobalComponent t) { // 3
    if (t == null)
      return this;
    if (this.global == null)
      this.global = new ArrayList<ImplementationGuideGlobalComponent>();
    this.global.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #global}, creating it
   *         if it does not already exist
   */
  public ImplementationGuideGlobalComponent getGlobalFirstRep() {
    if (getGlobal().isEmpty()) {
      addGlobal();
    }
    return getGlobal().get(0);
  }

  /**
   * @return {@link #definition} (The information needed by an IG publisher tool
   *         to publish the whole implementation guide.)
   */
  public ImplementationGuideDefinitionComponent getDefinition() {
    if (this.definition == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.definition");
      else if (Configuration.doAutoCreate())
        this.definition = new ImplementationGuideDefinitionComponent(); // cc
    return this.definition;
  }

  public boolean hasDefinition() {
    return this.definition != null && !this.definition.isEmpty();
  }

  /**
   * @param value {@link #definition} (The information needed by an IG publisher
   *              tool to publish the whole implementation guide.)
   */
  public ImplementationGuide setDefinition(ImplementationGuideDefinitionComponent value) {
    this.definition = value;
    return this;
  }

  /**
   * @return {@link #manifest} (Information about an assembled implementation
   *         guide, created by the publication tooling.)
   */
  public ImplementationGuideManifestComponent getManifest() {
    if (this.manifest == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.manifest");
      else if (Configuration.doAutoCreate())
        this.manifest = new ImplementationGuideManifestComponent(); // cc
    return this.manifest;
  }

  public boolean hasManifest() {
    return this.manifest != null && !this.manifest.isEmpty();
  }

  /**
   * @param value {@link #manifest} (Information about an assembled implementation
   *              guide, created by the publication tooling.)
   */
  public ImplementationGuide setManifest(ImplementationGuideManifestComponent value) {
    this.manifest = value;
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("url", "uri",
        "An absolute URI that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this implementation guide is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the implementation guide is stored on different servers.",
        0, 1, url));
    children.add(new Property("version", "string",
        "The identifier that is used to identify this version of the implementation guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the implementation guide author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.",
        0, 1, version));
    children.add(new Property("name", "string",
        "A natural language name identifying the implementation guide. This name should be usable as an identifier for the module by machine processing applications such as code generation.",
        0, 1, name));
    children.add(new Property("title", "string",
        "A short, descriptive, user-friendly title for the implementation guide.", 0, 1, title));
    children.add(new Property("status", "code",
        "The status of this implementation guide. Enables tracking the life-cycle of the content.", 0, 1, status));
    children.add(new Property("experimental", "boolean",
        "A Boolean value to indicate that this implementation guide is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.",
        0, 1, experimental));
    children.add(new Property("date", "dateTime",
        "The date  (and optionally time) when the implementation guide was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.",
        0, 1, date));
    children.add(new Property("publisher", "string",
        "The name of the organization or individual that published the implementation guide.", 0, 1, publisher));
    children.add(new Property("contact", "ContactDetail",
        "Contact details to assist a user in finding and communicating with the publisher.", 0,
        java.lang.Integer.MAX_VALUE, contact));
    children.add(new Property("description", "markdown",
        "A free text natural language description of the implementation guide from a consumer's perspective.", 0, 1,
        description));
    children.add(new Property("useContext", "UsageContext",
        "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate implementation guide instances.",
        0, java.lang.Integer.MAX_VALUE, useContext));
    children.add(new Property("jurisdiction", "CodeableConcept",
        "A legal or geographic region in which the implementation guide is intended to be used.", 0,
        java.lang.Integer.MAX_VALUE, jurisdiction));
    children.add(new Property("copyright", "markdown",
        "A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the implementation guide.",
        0, 1, copyright));
    children.add(new Property("packageId", "id",
        "The NPM package name for this Implementation Guide, used in the NPM package distribution, which is the primary mechanism by which FHIR based tooling manages IG dependencies. This value must be globally unique, and should be assigned with care.",
        0, 1, packageId));
    children.add(new Property("license", "code",
        "The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.", 0,
        1, license));
    children.add(new Property("fhirVersion", "code",
        "The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.",
        0, java.lang.Integer.MAX_VALUE, fhirVersion));
    children.add(new Property("dependsOn", "",
        "Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.",
        0, java.lang.Integer.MAX_VALUE, dependsOn));
    children.add(new Property("global", "",
        "A set of profiles that all resources covered by this implementation guide must conform to.", 0,
        java.lang.Integer.MAX_VALUE, global));
    children.add(new Property("definition", "",
        "The information needed by an IG publisher tool to publish the whole implementation guide.", 0, 1, definition));
    children.add(new Property("manifest", "",
        "Information about an assembled implementation guide, created by the publication tooling.", 0, 1, manifest));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case 116079:
      /* url */ return new Property("url", "uri",
          "An absolute URI that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this implementation guide is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the implementation guide is stored on different servers.",
          0, 1, url);
    case 351608024:
      /* version */ return new Property("version", "string",
          "The identifier that is used to identify this version of the implementation guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the implementation guide author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.",
          0, 1, version);
    case 3373707:
      /* name */ return new Property("name", "string",
          "A natural language name identifying the implementation guide. This name should be usable as an identifier for the module by machine processing applications such as code generation.",
          0, 1, name);
    case 110371416:
      /* title */ return new Property("title", "string",
          "A short, descriptive, user-friendly title for the implementation guide.", 0, 1, title);
    case -892481550:
      /* status */ return new Property("status", "code",
          "The status of this implementation guide. Enables tracking the life-cycle of the content.", 0, 1, status);
    case -404562712:
      /* experimental */ return new Property("experimental", "boolean",
          "A Boolean value to indicate that this implementation guide is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.",
          0, 1, experimental);
    case 3076014:
      /* date */ return new Property("date", "dateTime",
          "The date  (and optionally time) when the implementation guide was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.",
          0, 1, date);
    case 1447404028:
      /* publisher */ return new Property("publisher", "string",
          "The name of the organization or individual that published the implementation guide.", 0, 1, publisher);
    case 951526432:
      /* contact */ return new Property("contact", "ContactDetail",
          "Contact details to assist a user in finding and communicating with the publisher.", 0,
          java.lang.Integer.MAX_VALUE, contact);
    case -1724546052:
      /* description */ return new Property("description", "markdown",
          "A free text natural language description of the implementation guide from a consumer's perspective.", 0, 1,
          description);
    case -669707736:
      /* useContext */ return new Property("useContext", "UsageContext",
          "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate implementation guide instances.",
          0, java.lang.Integer.MAX_VALUE, useContext);
    case -507075711:
      /* jurisdiction */ return new Property("jurisdiction", "CodeableConcept",
          "A legal or geographic region in which the implementation guide is intended to be used.", 0,
          java.lang.Integer.MAX_VALUE, jurisdiction);
    case 1522889671:
      /* copyright */ return new Property("copyright", "markdown",
          "A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the implementation guide.",
          0, 1, copyright);
    case 1802060801:
      /* packageId */ return new Property("packageId", "id",
          "The NPM package name for this Implementation Guide, used in the NPM package distribution, which is the primary mechanism by which FHIR based tooling manages IG dependencies. This value must be globally unique, and should be assigned with care.",
          0, 1, packageId);
    case 166757441:
      /* license */ return new Property("license", "code",
          "The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.", 0,
          1, license);
    case 461006061:
      /* fhirVersion */ return new Property("fhirVersion", "code",
          "The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.",
          0, java.lang.Integer.MAX_VALUE, fhirVersion);
    case -1109214266:
      /* dependsOn */ return new Property("dependsOn", "",
          "Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.",
          0, java.lang.Integer.MAX_VALUE, dependsOn);
    case -1243020381:
      /* global */ return new Property("global", "",
          "A set of profiles that all resources covered by this implementation guide must conform to.", 0,
          java.lang.Integer.MAX_VALUE, global);
    case -1014418093:
      /* definition */ return new Property("definition", "",
          "The information needed by an IG publisher tool to publish the whole implementation guide.", 0, 1,
          definition);
    case 130625071:
      /* manifest */ return new Property("manifest", "",
          "Information about an assembled implementation guide, created by the publication tooling.", 0, 1, manifest);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case 116079:
      /* url */ return this.url == null ? new Base[0] : new Base[] { this.url }; // UriType
    case 351608024:
      /* version */ return this.version == null ? new Base[0] : new Base[] { this.version }; // StringType
    case 3373707:
      /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
    case 110371416:
      /* title */ return this.title == null ? new Base[0] : new Base[] { this.title }; // StringType
    case -892481550:
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // Enumeration<PublicationStatus>
    case -404562712:
      /* experimental */ return this.experimental == null ? new Base[0] : new Base[] { this.experimental }; // BooleanType
    case 3076014:
      /* date */ return this.date == null ? new Base[0] : new Base[] { this.date }; // DateTimeType
    case 1447404028:
      /* publisher */ return this.publisher == null ? new Base[0] : new Base[] { this.publisher }; // StringType
    case 951526432:
      /* contact */ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // ContactDetail
    case -1724546052:
      /* description */ return this.description == null ? new Base[0] : new Base[] { this.description }; // MarkdownType
    case -669707736:
      /* useContext */ return this.useContext == null ? new Base[0]
          : this.useContext.toArray(new Base[this.useContext.size()]); // UsageContext
    case -507075711:
      /* jurisdiction */ return this.jurisdiction == null ? new Base[0]
          : this.jurisdiction.toArray(new Base[this.jurisdiction.size()]); // CodeableConcept
    case 1522889671:
      /* copyright */ return this.copyright == null ? new Base[0] : new Base[] { this.copyright }; // MarkdownType
    case 1802060801:
      /* packageId */ return this.packageId == null ? new Base[0] : new Base[] { this.packageId }; // IdType
    case 166757441:
      /* license */ return this.license == null ? new Base[0] : new Base[] { this.license }; // Enumeration<SPDXLicense>
    case 461006061:
      /* fhirVersion */ return this.fhirVersion == null ? new Base[0]
          : this.fhirVersion.toArray(new Base[this.fhirVersion.size()]); // Enumeration<FHIRVersion>
    case -1109214266:
      /* dependsOn */ return this.dependsOn == null ? new Base[0]
          : this.dependsOn.toArray(new Base[this.dependsOn.size()]); // ImplementationGuideDependsOnComponent
    case -1243020381:
      /* global */ return this.global == null ? new Base[0] : this.global.toArray(new Base[this.global.size()]); // ImplementationGuideGlobalComponent
    case -1014418093:
      /* definition */ return this.definition == null ? new Base[0] : new Base[] { this.definition }; // ImplementationGuideDefinitionComponent
    case 130625071:
      /* manifest */ return this.manifest == null ? new Base[0] : new Base[] { this.manifest }; // ImplementationGuideManifestComponent
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case 116079: // url
      this.url = castToUri(value); // UriType
      return value;
    case 351608024: // version
      this.version = castToString(value); // StringType
      return value;
    case 3373707: // name
      this.name = castToString(value); // StringType
      return value;
    case 110371416: // title
      this.title = castToString(value); // StringType
      return value;
    case -892481550: // status
      value = new PublicationStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<PublicationStatus>
      return value;
    case -404562712: // experimental
      this.experimental = castToBoolean(value); // BooleanType
      return value;
    case 3076014: // date
      this.date = castToDateTime(value); // DateTimeType
      return value;
    case 1447404028: // publisher
      this.publisher = castToString(value); // StringType
      return value;
    case 951526432: // contact
      this.getContact().add(castToContactDetail(value)); // ContactDetail
      return value;
    case -1724546052: // description
      this.description = castToMarkdown(value); // MarkdownType
      return value;
    case -669707736: // useContext
      this.getUseContext().add(castToUsageContext(value)); // UsageContext
      return value;
    case -507075711: // jurisdiction
      this.getJurisdiction().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case 1522889671: // copyright
      this.copyright = castToMarkdown(value); // MarkdownType
      return value;
    case 1802060801: // packageId
      this.packageId = castToId(value); // IdType
      return value;
    case 166757441: // license
      value = new SPDXLicenseEnumFactory().fromType(castToCode(value));
      this.license = (Enumeration) value; // Enumeration<SPDXLicense>
      return value;
    case 461006061: // fhirVersion
      value = new FHIRVersionEnumFactory().fromType(castToCode(value));
      this.getFhirVersion().add((Enumeration) value); // Enumeration<FHIRVersion>
      return value;
    case -1109214266: // dependsOn
      this.getDependsOn().add((ImplementationGuideDependsOnComponent) value); // ImplementationGuideDependsOnComponent
      return value;
    case -1243020381: // global
      this.getGlobal().add((ImplementationGuideGlobalComponent) value); // ImplementationGuideGlobalComponent
      return value;
    case -1014418093: // definition
      this.definition = (ImplementationGuideDefinitionComponent) value; // ImplementationGuideDefinitionComponent
      return value;
    case 130625071: // manifest
      this.manifest = (ImplementationGuideManifestComponent) value; // ImplementationGuideManifestComponent
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("url")) {
      this.url = castToUri(value); // UriType
    } else if (name.equals("version")) {
      this.version = castToString(value); // StringType
    } else if (name.equals("name")) {
      this.name = castToString(value); // StringType
    } else if (name.equals("title")) {
      this.title = castToString(value); // StringType
    } else if (name.equals("status")) {
      value = new PublicationStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<PublicationStatus>
    } else if (name.equals("experimental")) {
      this.experimental = castToBoolean(value); // BooleanType
    } else if (name.equals("date")) {
      this.date = castToDateTime(value); // DateTimeType
    } else if (name.equals("publisher")) {
      this.publisher = castToString(value); // StringType
    } else if (name.equals("contact")) {
      this.getContact().add(castToContactDetail(value));
    } else if (name.equals("description")) {
      this.description = castToMarkdown(value); // MarkdownType
    } else if (name.equals("useContext")) {
      this.getUseContext().add(castToUsageContext(value));
    } else if (name.equals("jurisdiction")) {
      this.getJurisdiction().add(castToCodeableConcept(value));
    } else if (name.equals("copyright")) {
      this.copyright = castToMarkdown(value); // MarkdownType
    } else if (name.equals("packageId")) {
      this.packageId = castToId(value); // IdType
    } else if (name.equals("license")) {
      value = new SPDXLicenseEnumFactory().fromType(castToCode(value));
      this.license = (Enumeration) value; // Enumeration<SPDXLicense>
    } else if (name.equals("fhirVersion")) {
      value = new FHIRVersionEnumFactory().fromType(castToCode(value));
      this.getFhirVersion().add((Enumeration) value);
    } else if (name.equals("dependsOn")) {
      this.getDependsOn().add((ImplementationGuideDependsOnComponent) value);
    } else if (name.equals("global")) {
      this.getGlobal().add((ImplementationGuideGlobalComponent) value);
    } else if (name.equals("definition")) {
      this.definition = (ImplementationGuideDefinitionComponent) value; // ImplementationGuideDefinitionComponent
    } else if (name.equals("manifest")) {
      this.manifest = (ImplementationGuideManifestComponent) value; // ImplementationGuideManifestComponent
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("url")) {
      this.url = null;
    } else if (name.equals("version")) {
      this.version = null;
    } else if (name.equals("name")) {
      this.name = null;
    } else if (name.equals("title")) {
      this.title = null;
    } else if (name.equals("status")) {
      this.status = null;
    } else if (name.equals("experimental")) {
      this.experimental = null;
    } else if (name.equals("date")) {
      this.date = null;
    } else if (name.equals("publisher")) {
      this.publisher = null;
    } else if (name.equals("contact")) {
      this.getContact().remove(castToContactDetail(value));
    } else if (name.equals("description")) {
      this.description = null;
    } else if (name.equals("useContext")) {
      this.getUseContext().remove(castToUsageContext(value));
    } else if (name.equals("jurisdiction")) {
      this.getJurisdiction().remove(castToCodeableConcept(value));
    } else if (name.equals("copyright")) {
      this.copyright = null;
    } else if (name.equals("packageId")) {
      this.packageId = null;
    } else if (name.equals("license")) {
      this.license = null;
    } else if (name.equals("fhirVersion")) {
      this.getFhirVersion().remove((Enumeration) value);
    } else if (name.equals("dependsOn")) {
      this.getDependsOn().remove((ImplementationGuideDependsOnComponent) value);
    } else if (name.equals("global")) {
      this.getGlobal().remove((ImplementationGuideGlobalComponent) value);
    } else if (name.equals("definition")) {
      this.definition = null;
    } else if (name.equals("manifest")) {
      this.manifest = (ImplementationGuideManifestComponent) value; // ImplementationGuideManifestComponent
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 116079:
      return getUrlElement();
    case 351608024:
      return getVersionElement();
    case 3373707:
      return getNameElement();
    case 110371416:
      return getTitleElement();
    case -892481550:
      return getStatusElement();
    case -404562712:
      return getExperimentalElement();
    case 3076014:
      return getDateElement();
    case 1447404028:
      return getPublisherElement();
    case 951526432:
      return addContact();
    case -1724546052:
      return getDescriptionElement();
    case -669707736:
      return addUseContext();
    case -507075711:
      return addJurisdiction();
    case 1522889671:
      return getCopyrightElement();
    case 1802060801:
      return getPackageIdElement();
    case 166757441:
      return getLicenseElement();
    case 461006061:
      return addFhirVersionElement();
    case -1109214266:
      return addDependsOn();
    case -1243020381:
      return addGlobal();
    case -1014418093:
      return getDefinition();
    case 130625071:
      return getManifest();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 116079:
      /* url */ return new String[] { "uri" };
    case 351608024:
      /* version */ return new String[] { "string" };
    case 3373707:
      /* name */ return new String[] { "string" };
    case 110371416:
      /* title */ return new String[] { "string" };
    case -892481550:
      /* status */ return new String[] { "code" };
    case -404562712:
      /* experimental */ return new String[] { "boolean" };
    case 3076014:
      /* date */ return new String[] { "dateTime" };
    case 1447404028:
      /* publisher */ return new String[] { "string" };
    case 951526432:
      /* contact */ return new String[] { "ContactDetail" };
    case -1724546052:
      /* description */ return new String[] { "markdown" };
    case -669707736:
      /* useContext */ return new String[] { "UsageContext" };
    case -507075711:
      /* jurisdiction */ return new String[] { "CodeableConcept" };
    case 1522889671:
      /* copyright */ return new String[] { "markdown" };
    case 1802060801:
      /* packageId */ return new String[] { "id" };
    case 166757441:
      /* license */ return new String[] { "code" };
    case 461006061:
      /* fhirVersion */ return new String[] { "code" };
    case -1109214266:
      /* dependsOn */ return new String[] {};
    case -1243020381:
      /* global */ return new String[] {};
    case -1014418093:
      /* definition */ return new String[] {};
    case 130625071:
      /* manifest */ return new String[] {};
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("url")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.url");
    } else if (name.equals("version")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.version");
    } else if (name.equals("name")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.name");
    } else if (name.equals("title")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.title");
    } else if (name.equals("status")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.status");
    } else if (name.equals("experimental")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.experimental");
    } else if (name.equals("date")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.date");
    } else if (name.equals("publisher")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.publisher");
    } else if (name.equals("contact")) {
      return addContact();
    } else if (name.equals("description")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.description");
    } else if (name.equals("useContext")) {
      return addUseContext();
    } else if (name.equals("jurisdiction")) {
      return addJurisdiction();
    } else if (name.equals("copyright")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.copyright");
    } else if (name.equals("packageId")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.packageId");
    } else if (name.equals("license")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.license");
    } else if (name.equals("fhirVersion")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.fhirVersion");
    } else if (name.equals("dependsOn")) {
      return addDependsOn();
    } else if (name.equals("global")) {
      return addGlobal();
    } else if (name.equals("definition")) {
      this.definition = new ImplementationGuideDefinitionComponent();
      return this.definition;
    } else if (name.equals("manifest")) {
      this.manifest = new ImplementationGuideManifestComponent();
      return this.manifest;
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "ImplementationGuide";

  }

  public ImplementationGuide copy() {
    ImplementationGuide dst = new ImplementationGuide();
    copyValues(dst);
    return dst;
  }

  public void copyValues(ImplementationGuide dst) {
    super.copyValues(dst);
    dst.url = url == null ? null : url.copy();
    dst.version = version == null ? null : version.copy();
    dst.name = name == null ? null : name.copy();
    dst.title = title == null ? null : title.copy();
    dst.status = status == null ? null : status.copy();
    dst.experimental = experimental == null ? null : experimental.copy();
    dst.date = date == null ? null : date.copy();
    dst.publisher = publisher == null ? null : publisher.copy();
    if (contact != null) {
      dst.contact = new ArrayList<ContactDetail>();
      for (ContactDetail i : contact)
        dst.contact.add(i.copy());
    }
    ;
    dst.description = description == null ? null : description.copy();
    if (useContext != null) {
      dst.useContext = new ArrayList<UsageContext>();
      for (UsageContext i : useContext)
        dst.useContext.add(i.copy());
    }
    ;
    if (jurisdiction != null) {
      dst.jurisdiction = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : jurisdiction)
        dst.jurisdiction.add(i.copy());
    }
    ;
    dst.copyright = copyright == null ? null : copyright.copy();
    dst.packageId = packageId == null ? null : packageId.copy();
    dst.license = license == null ? null : license.copy();
    if (fhirVersion != null) {
      dst.fhirVersion = new ArrayList<Enumeration<FHIRVersion>>();
      for (Enumeration<FHIRVersion> i : fhirVersion)
        dst.fhirVersion.add(i.copy());
    }
    ;
    if (dependsOn != null) {
      dst.dependsOn = new ArrayList<ImplementationGuideDependsOnComponent>();
      for (ImplementationGuideDependsOnComponent i : dependsOn)
        dst.dependsOn.add(i.copy());
    }
    ;
    if (global != null) {
      dst.global = new ArrayList<ImplementationGuideGlobalComponent>();
      for (ImplementationGuideGlobalComponent i : global)
        dst.global.add(i.copy());
    }
    ;
    dst.definition = definition == null ? null : definition.copy();
    dst.manifest = manifest == null ? null : manifest.copy();
  }

  protected ImplementationGuide typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof ImplementationGuide))
      return false;
    ImplementationGuide o = (ImplementationGuide) other_;
    return compareDeep(copyright, o.copyright, true) && compareDeep(packageId, o.packageId, true)
        && compareDeep(license, o.license, true) && compareDeep(fhirVersion, o.fhirVersion, true)
        && compareDeep(dependsOn, o.dependsOn, true) && compareDeep(global, o.global, true)
        && compareDeep(definition, o.definition, true) && compareDeep(manifest, o.manifest, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof ImplementationGuide))
      return false;
    ImplementationGuide o = (ImplementationGuide) other_;
    return compareValues(copyright, o.copyright, true) && compareValues(packageId, o.packageId, true)
        && compareValues(license, o.license, true) && compareValues(fhirVersion, o.fhirVersion, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(copyright, packageId, license, fhirVersion,
        dependsOn, global, definition, manifest);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.ImplementationGuide;
  }

  /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>The implementation guide publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ImplementationGuide.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "date", path = "ImplementationGuide.date", description = "The implementation guide publication date", type = "date")
  public static final String SP_DATE = "date";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>The implementation guide publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ImplementationGuide.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_DATE);

  /**
   * Search parameter: <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the implementation
   * guide</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-type-value", path = "ImplementationGuide.useContext", description = "A use context type and value assigned to the implementation guide", type = "composite", compositeOf = {
      "context-type", "context" })
  public static final String SP_CONTEXT_TYPE_VALUE = "context-type-value";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the implementation
   * guide</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam> CONTEXT_TYPE_VALUE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam>(
      SP_CONTEXT_TYPE_VALUE);

  /**
   * Search parameter: <b>resource</b>
   * <p>
   * Description: <b>Location of the resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.definition.resource.reference</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "resource", path = "ImplementationGuide.definition.resource.reference", description = "Location of the resource", type = "reference")
  public static final String SP_RESOURCE = "resource";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>resource</b>
   * <p>
   * Description: <b>Location of the resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.definition.resource.reference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam RESOURCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_RESOURCE);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ImplementationGuide:resource</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_RESOURCE = new ca.uhn.fhir.model.api.Include(
      "ImplementationGuide:resource").toLocked();

  /**
   * Search parameter: <b>jurisdiction</b>
   * <p>
   * Description: <b>Intended jurisdiction for the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.jurisdiction</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "jurisdiction", path = "ImplementationGuide.jurisdiction", description = "Intended jurisdiction for the implementation guide", type = "token")
  public static final String SP_JURISDICTION = "jurisdiction";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>jurisdiction</b>
   * <p>
   * Description: <b>Intended jurisdiction for the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.jurisdiction</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam JURISDICTION = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_JURISDICTION);

  /**
   * Search parameter: <b>description</b>
   * <p>
   * Description: <b>The description of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "description", path = "ImplementationGuide.description", description = "The description of the implementation guide", type = "string")
  public static final String SP_DESCRIPTION = "description";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>description</b>
   * <p>
   * Description: <b>The description of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_DESCRIPTION);

  /**
   * Search parameter: <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the implementation
   * guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.useContext.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-type", path = "ImplementationGuide.useContext.code", description = "A type of use context assigned to the implementation guide", type = "token")
  public static final String SP_CONTEXT_TYPE = "context-type";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the implementation
   * guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.useContext.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CONTEXT_TYPE);

  /**
   * Search parameter: <b>experimental</b>
   * <p>
   * Description: <b>For testing purposes, not real usage</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.experimental</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "experimental", path = "ImplementationGuide.experimental", description = "For testing purposes, not real usage", type = "token")
  public static final String SP_EXPERIMENTAL = "experimental";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>experimental</b>
   * <p>
   * Description: <b>For testing purposes, not real usage</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.experimental</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam EXPERIMENTAL = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_EXPERIMENTAL);

  /**
   * Search parameter: <b>global</b>
   * <p>
   * Description: <b>Profile that all resources must conform to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.global.profile</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "global", path = "ImplementationGuide.global.profile", description = "Profile that all resources must conform to", type = "reference", target = {
      StructureDefinition.class })
  public static final String SP_GLOBAL = "global";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>global</b>
   * <p>
   * Description: <b>Profile that all resources must conform to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.global.profile</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam GLOBAL = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_GLOBAL);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ImplementationGuide:global</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_GLOBAL = new ca.uhn.fhir.model.api.Include(
      "ImplementationGuide:global").toLocked();

  /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "title", path = "ImplementationGuide.title", description = "The human-friendly name of the implementation guide", type = "string")
  public static final String SP_TITLE = "title";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_TITLE);

  /**
   * Search parameter: <b>version</b>
   * <p>
   * Description: <b>The business version of the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.version</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "version", path = "ImplementationGuide.version", description = "The business version of the implementation guide", type = "token")
  public static final String SP_VERSION = "version";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>version</b>
   * <p>
   * Description: <b>The business version of the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.version</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VERSION = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_VERSION);

  /**
   * Search parameter: <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the implementation guide</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>ImplementationGuide.url</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "url", path = "ImplementationGuide.url", description = "The uri that identifies the implementation guide", type = "uri")
  public static final String SP_URL = "url";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the implementation guide</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>ImplementationGuide.url</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam URL = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_URL);

  /**
   * Search parameter: <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the
   * implementation guide</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>ImplementationGuide.useContext.valueQuantity,
   * ImplementationGuide.useContext.valueRange</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-quantity", path = "(ImplementationGuide.useContext.value as Quantity) | (ImplementationGuide.useContext.value as Range)", description = "A quantity- or range-valued use context assigned to the implementation guide", type = "quantity")
  public static final String SP_CONTEXT_QUANTITY = "context-quantity";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the
   * implementation guide</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>ImplementationGuide.useContext.valueQuantity,
   * ImplementationGuide.useContext.valueRange</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.QuantityClientParam CONTEXT_QUANTITY = new ca.uhn.fhir.rest.gclient.QuantityClientParam(
      SP_CONTEXT_QUANTITY);

  /**
   * Search parameter: <b>depends-on</b>
   * <p>
   * Description: <b>Identity of the IG that this depends on</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.dependsOn.uri</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "depends-on", path = "ImplementationGuide.dependsOn.uri", description = "Identity of the IG that this depends on", type = "reference", target = {
      ImplementationGuide.class })
  public static final String SP_DEPENDS_ON = "depends-on";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>depends-on</b>
   * <p>
   * Description: <b>Identity of the IG that this depends on</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.dependsOn.uri</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DEPENDS_ON = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_DEPENDS_ON);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ImplementationGuide:depends-on</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DEPENDS_ON = new ca.uhn.fhir.model.api.Include(
      "ImplementationGuide:depends-on").toLocked();

  /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the implementation
   * guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "name", path = "ImplementationGuide.name", description = "Computationally friendly name of the implementation guide", type = "string")
  public static final String SP_NAME = "name";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the implementation
   * guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_NAME);

  /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context", path = "(ImplementationGuide.useContext.value as CodeableConcept)", description = "A use context assigned to the implementation guide", type = "token")
  public static final String SP_CONTEXT = "context";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CONTEXT);

  /**
   * Search parameter: <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.publisher</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "publisher", path = "ImplementationGuide.publisher", description = "Name of the publisher of the implementation guide", type = "string")
  public static final String SP_PUBLISHER = "publisher";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.publisher</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam PUBLISHER = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_PUBLISHER);

  /**
   * Search parameter: <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value
   * assigned to the implementation guide</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-type-quantity", path = "ImplementationGuide.useContext", description = "A use context type and quantity- or range-based value assigned to the implementation guide", type = "composite", compositeOf = {
      "context-type", "context-quantity" })
  public static final String SP_CONTEXT_TYPE_QUANTITY = "context-type-quantity";
  /**
   * <b>Fluent Client</b> search parameter constant for
   * <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value
   * assigned to the implementation guide</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam> CONTEXT_TYPE_QUANTITY = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam>(
      SP_CONTEXT_TYPE_QUANTITY);

  /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The current status of the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "status", path = "ImplementationGuide.status", description = "The current status of the implementation guide", type = "token")
  public static final String SP_STATUS = "status";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The current status of the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_STATUS);

}
