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

@SuppressWarnings("all") public class skip_non_imports_2_0 extends Strategy 
{ 
  public static skip_non_imports_2_0 instance = new skip_non_imports_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4225, Strategy v_4225)
  { 
    context.push("skip_non_imports_2_0");
    Fail25494:
    { 
      IStrategoTerm term10062 = term;
      Success10052:
      { 
        Fail25495:
        { 
          term = parsetree_2_0.instance.invoke(context, term, u_4225, _Id.instance);
          if(term == null)
            break Fail25495;
          if(true)
            break Success10052;
        }
        term = term10062;
        IStrategoTerm term10063 = term;
        Success10053:
        { 
          Fail25496:
          { 
            lifted9042 lifted90420 = new lifted9042();
            lifted90420.v_4225 = v_4225;
            term = appl_2_0.instance.invoke(context, term, lifted90420, v_4225);
            if(term == null)
              break Fail25496;
            if(true)
              break Success10053;
          }
          term = appl_2_0.instance.invoke(context, term10063, v_4225, u_4225);
          if(term == null)
            break Fail25494;
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