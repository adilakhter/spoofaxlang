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

@SuppressWarnings("all") public class rename_sort_0_1 extends Strategy 
{ 
  public static rename_sort_0_1 instance = new rename_sort_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_4541)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("rename_sort_0_1");
    Fail25808:
    { 
      IStrategoTerm term10250 = term;
      IStrategoConstructor cons345 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10195:
      { 
        if(cons345 == SpoofaxGenerator._consSort_1)
        { 
          Fail25809:
          { 
            IStrategoTerm n_4263 = null;
            n_4263 = term.getSubterm(0);
            term = termFactory.makeTuple(n_4263, generator.const7120, j_4541);
            term = conc_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25809;
            term = termFactory.makeAppl(SpoofaxGenerator._consSort_1, new IStrategoTerm[]{term});
            if(true)
              break Success10195;
          }
          term = term10250;
        }
        if(cons345 == SpoofaxGenerator._consListSort_1)
        { 
          IStrategoTerm j_4263 = null;
          j_4263 = term.getSubterm(0);
          term = termFactory.makeTuple(j_4263, generator.const7120, j_4541);
          term = conc_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25808;
          term = termFactory.makeAppl(SpoofaxGenerator._consListSort_1, new IStrategoTerm[]{term});
        }
        else
        { 
          break Fail25808;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}