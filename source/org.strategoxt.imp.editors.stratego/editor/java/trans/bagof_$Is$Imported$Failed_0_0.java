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

@SuppressWarnings("all") public class bagof_$Is$Imported$Failed_0_0 extends Strategy 
{ 
  public static bagof_$Is$Imported$Failed_0_0 instance = new bagof_$Is$Imported$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsImportedFailed_0_0");
    Fail22205:
    { 
      TermReference u_4326 = new TermReference();
      TermReference v_4326 = new TermReference();
      if(v_4326.value == null)
        v_4326.value = term;
      else
        if(v_4326.value != term && !v_4326.value.match(term))
          break Fail22205;
      if(u_4326.value == null)
        u_4326.value = term;
      else
        if(u_4326.value != term && !u_4326.value.match(term))
          break Fail22205;
      Success11964:
      { 
        Fail22206:
        { 
          IStrategoTerm z_4326 = null;
          z_4326 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_4326, trans.const4366, v_4326.value);
          if(term == null)
            break Fail22206;
          if(true)
            break Success11964;
        }
        term = trans.constNil3;
      }
      lifted6802 lifted68020 = new lifted6802();
      lifted68020.u_4326 = u_4326;
      lifted68020.v_4326 = v_4326;
      term = filter_1_0.instance.invoke(context, term, lifted68020);
      if(term == null)
        break Fail22205;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}