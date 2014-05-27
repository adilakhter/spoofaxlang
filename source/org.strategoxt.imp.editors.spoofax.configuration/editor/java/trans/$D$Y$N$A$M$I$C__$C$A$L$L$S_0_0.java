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

@SuppressWarnings("all") public class $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0 extends Strategy 
{ 
  public static $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0 instance = new $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("DYNAMIC__CALLS_0_0");
    Fail87756:
    { 
      IStrategoTerm term47318 = term;
      Success47295:
      { 
        Fail87757:
        { 
          IStrategoTerm b_17577 = null;
          b_17577 = term;
          term = undefine_get_config_reference_0_1.instance.invoke(context, b_17577, trans.const17853);
          if(term == null)
            break Fail87757;
          if(true)
            break Success47295;
        }
        term = term47318;
        IStrategoTerm term47319 = term;
        Success47296:
        { 
          Fail87758:
          { 
            IStrategoTerm z_17576 = null;
            z_17576 = term;
            term = undefine_$Current$File_0_1.instance.invoke(context, z_17576, trans.const17853);
            if(term == null)
              break Fail87758;
            if(true)
              break Success47296;
          }
          term = term47319;
          IStrategoTerm x_17576 = null;
          x_17576 = term;
          term = undefine_$Is$Imported_0_1.instance.invoke(context, x_17576, trans.const17853);
          if(term == null)
            break Fail87756;
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