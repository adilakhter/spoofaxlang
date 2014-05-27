package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class innermost_scope_$Current$File_1_0 extends Strategy 
{ 
  public static innermost_scope_$Current$File_1_0 instance = new innermost_scope_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4279)
  { 
    context.push("innermost_scope_CurrentFile_1_0");
    Fail21925:
    { 
      IStrategoTerm t_4279 = null;
      t_4279 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, t_4279, r_4279, trans.const4263);
      if(term == null)
        break Fail21925;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}