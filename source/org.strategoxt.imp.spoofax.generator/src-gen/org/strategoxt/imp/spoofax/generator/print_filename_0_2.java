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

@SuppressWarnings("all") public class print_filename_0_2 extends Strategy 
{ 
  public static print_filename_0_2 instance = new print_filename_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_4256, IStrategoTerm ref_k_4256)
  { 
    TermReference j_4256 = new TermReference(ref_j_4256);
    TermReference k_4256 = new TermReference(ref_k_4256);
    context.push("print_filename_0_2");
    Fail25745:
    { 
      IStrategoTerm term10229 = term;
      Success10177:
      { 
        Fail25746:
        { 
          IStrategoTerm l_4256 = null;
          l_4256 = term;
          if(j_4256.value == null)
            break Fail25746;
          term = j_4256.value;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail25746;
          term = l_4256;
          { 
            lifted9217 lifted92170 = new lifted9217();
            lifted92170.k_4256 = k_4256;
            term = verbose_msg_2_0.instance.invoke(context, term, lifted9216.instance, lifted92170);
            if(term == null)
              break Fail25745;
            if(true)
              break Success10177;
          }
        }
        term = term10229;
        lifted9219 lifted92190 = new lifted9219();
        lifted92190.j_4256 = j_4256;
        lifted92190.k_4256 = k_4256;
        term = verbose_msg_2_0.instance.invoke(context, term, lifted9218.instance, lifted92190);
        if(term == null)
          break Fail25745;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}