package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9194 extends Strategy 
{ 
  TermReference b_4249;

  TermReference c_4249;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28859:
    { 
      IStrategoTerm e_4249 = null;
      if(b_4249.value == null)
        break Fail28859;
      term = write_to_0_0.instance.invoke(context, b_4249.value);
      if(term == null)
        break Fail28859;
      term = xtc_pp_sdf2_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28859;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFILE_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28859;
      e_4249 = term.getSubterm(0);
      term = read_text_file_0_0.instance.invoke(context, e_4249);
      if(term == null)
        break Fail28859;
      term = trim_chars_1_0.instance.invoke(context, term, lifted9195.instance);
      if(term == null)
        break Fail28859;
      term = string_as_chars_1_0.instance.invoke(context, term, lifted9196.instance);
      if(term == null)
        break Fail28859;
      if(c_4249.value == null)
        c_4249.value = term;
      else
        if(c_4249.value != term && !c_4249.value.match(term))
          break Fail28859;
      if(true)
        return term;
    }
    return null;
  }
}