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

@SuppressWarnings("all") public class get_nonterm_of_0_0 extends Strategy 
{ 
  public static get_nonterm_of_0_0 instance = new get_nonterm_of_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_nonterm_of_0_0");
    Fail25634:
    { 
      IStrategoTerm o_4244 = null;
      o_4244 = term;
      term = is_nonterm_generator_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25634;
      IStrategoTerm term10150 = term;
      Success10116:
      { 
        Fail25635:
        { 
          term = termFactory.makeTuple(generator.const7100, o_4244);
          term = table_get_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25635;
          if(true)
            break Success10116;
        }
        term = term10150;
        IStrategoTerm term10151 = term;
        Success10117:
        { 
          Fail25636:
          { 
            term = termFactory.makeTuple(generator.const7100, termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{o_4244}));
            term = table_get_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25636;
            if(true)
              break Success10117;
          }
          term = term10151;
          IStrategoTerm term10152 = term;
          Success10118:
          { 
            Fail25637:
            { 
              IStrategoTerm s_4244 = null;
              term = o_4244;
              if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)term).getConstructor())
                break Fail25637;
              s_4244 = term.getSubterm(0);
              term = termFactory.makeTuple(generator.const7100, s_4244);
              term = table_get_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25637;
              if(true)
                break Success10118;
            }
            term = term10152;
            IStrategoTerm p_4244 = null;
            term = sdf_symbol_to_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25634;
            p_4244 = term;
            term = termFactory.makeTuple(generator.const7100, o_4244, term);
            term = table_put_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25634;
            term = p_4244;
          }
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