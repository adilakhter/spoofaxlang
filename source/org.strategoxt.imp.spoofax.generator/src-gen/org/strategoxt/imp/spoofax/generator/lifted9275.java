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

@SuppressWarnings("all") final class lifted9275 extends Strategy 
{ 
  TermReference w_4270;

  Strategy z_4270;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28779:
    { 
      IStrategoTerm term10287 = term;
      Success11369:
      { 
        Fail28780:
        { 
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28780;
          term = construct_list_fragments_1_1.instance.invoke(context, term, z_4270, w_4270.value);
          if(term == null)
            break Fail28780;
          term = map_1_0.instance.invoke(context, term, lifted9276.instance);
          if(term == null)
            break Fail28780;
          if(true)
            break Success11369;
        }
        term = term10287;
        IStrategoTerm term10288 = term;
        Success11370:
        { 
          Fail28781:
          { 
            term = is_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28781;
            { 
              if(true)
                break Fail28779;
              if(true)
                break Success11370;
            }
          }
          term = term10288;
        }
        term = construct_text_1_1.instance.invoke(context, term, z_4270, w_4270.value);
        if(term == null)
          break Fail28779;
        term = trim_chars_1_0.instance.invoke(context, term, is_whitespace_char_0_0.instance);
        if(term == null)
          break Fail28779;
      }
      if(true)
        return term;
    }
    return null;
  }
}