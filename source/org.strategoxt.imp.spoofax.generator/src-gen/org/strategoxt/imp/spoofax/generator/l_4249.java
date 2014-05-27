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

@SuppressWarnings("all") final class l_4249 extends Strategy 
{ 
  Strategy l_4249;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28855:
    { 
      IStrategoTerm term10203 = term;
      Success11387:
      { 
        Fail28856:
        { 
          IStrategoTerm i_4249 = null;
          lifted9199 lifted91990 = new lifted9199();
          lifted91990.l_4249 = l_4249;
          term = appl_2_0.instance.invoke(context, term, _Id.instance, lifted91990);
          if(term == null)
            break Fail28856;
          if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)term).getConstructor())
            break Fail28856;
          i_4249 = term.getSubterm(1);
          term = concat_0_0.instance.invoke(context, i_4249);
          if(term == null)
            break Fail28856;
          if(true)
            break Success11387;
        }
        term = term10203;
        IStrategoTerm term10204 = term;
        Success11388:
        { 
          Fail28857:
          { 
            IStrategoTerm j_4249 = null;
            if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consflatlex_2 != ((IStrategoAppl)term).getConstructor())
              break Fail28857;
            j_4249 = term.getSubterm(1);
            term = explode_string_0_0.instance.invoke(context, j_4249);
            if(term == null)
              break Fail28857;
            if(true)
              break Success11388;
          }
          term = term10204;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constNil7);
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}