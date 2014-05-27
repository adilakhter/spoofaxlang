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
    Fail22948:
    { 
      IStrategoTerm term12231 = term;
      Success12208:
      { 
        Fail22949:
        { 
          IStrategoTerm e_4633 = null;
          e_4633 = term;
          term = undefine_get_config_reference_0_1.instance.invoke(context, e_4633, trans.const4466);
          if(term == null)
            break Fail22949;
          if(true)
            break Success12208;
        }
        term = term12231;
        IStrategoTerm term12232 = term;
        Success12209:
        { 
          Fail22950:
          { 
            IStrategoTerm c_4633 = null;
            c_4633 = term;
            term = undefine_$Current$File_0_1.instance.invoke(context, c_4633, trans.const4466);
            if(term == null)
              break Fail22950;
            if(true)
              break Success12209;
          }
          term = term12232;
          IStrategoTerm a_4633 = null;
          a_4633 = term;
          term = undefine_$Is$Imported_0_1.instance.invoke(context, a_4633, trans.const4466);
          if(term == null)
            break Fail22948;
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