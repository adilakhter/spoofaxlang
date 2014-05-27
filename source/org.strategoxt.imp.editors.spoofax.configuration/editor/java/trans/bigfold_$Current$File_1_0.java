package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigfold_$Current$File_1_0 extends Strategy 
{ 
  public static bigfold_$Current$File_1_0 instance = new bigfold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_17582)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CurrentFile_1_0");
    Fail87793:
    { 
      IStrategoTerm t_17582 = null;
      IStrategoTerm v_17582 = null;
      v_17582 = term;
      Success47304:
      { 
        Fail87794:
        { 
          IStrategoTerm w_17582 = null;
          IStrategoTerm y_17582 = null;
          IStrategoTerm z_17582 = null;
          y_17582 = term;
          w_17582 = trans.const17872;
          z_17582 = y_17582;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, z_17582, w_17582, trans.constCons8528);
          if(term == null)
            break Fail87794;
          if(true)
            break Success47304;
        }
        term = trans.constNil14;
      }
      t_17582 = term;
      term = v_17582;
      term = termFactory.makeTuple(t_17582, term);
      term = s_17582.invoke(context, term, lifted24779.instance);
      if(term == null)
        break Fail87793;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}