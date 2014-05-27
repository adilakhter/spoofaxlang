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

@SuppressWarnings("all") public class verified_start_symbol_0_0 extends Strategy 
{ 
  public static verified_start_symbol_0_0 instance = new verified_start_symbol_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("verified_start_symbol_0_0");
    Fail26280:
    { 
      IStrategoTerm term10632 = term;
      Success10546:
      { 
        Fail26281:
        { 
          IStrategoTerm f_4324 = null;
          term = $Start$Symbol_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26281;
          f_4324 = term;
          term = bagof_$Productions_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26281;
          IStrategoTerm term10633 = term;
          Success10547:
          { 
            Fail26282:
            { 
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail26282;
              { 
                if(true)
                  break Fail26281;
                if(true)
                  break Success10547;
              }
            }
            term = term10633;
          }
          term = f_4324;
          if(true)
            break Success10546;
        }
        term = term10632;
        IStrategoTerm h_4324 = null;
        Success10548:
        { 
          Fail26283:
          { 
            term = $Start$Symbol_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26283;
            if(true)
              break Success10548;
          }
          term = generator.constNone0;
        }
        h_4324 = term;
        term = get_sdf_main_module_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26280;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7479, termFactory.makeListCons(term, (IStrategoList)generator.constCons4926));
        term = fatal_err_0_1.instance.invoke(context, h_4324, term);
        if(term == null)
          break Fail26280;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}